package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.gamelift.AliasRoutingStrategy
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aliasMod {
  
  @JSImport("@pulumi/aws/gamelift/alias", "Alias")
  @js.native
  class Alias protected () extends CustomResource {
    /**
      * Create a Alias resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AliasArgs) = this()
    def this(name: String, args: AliasArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Alias ARN.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Description of the alias.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Name of the alias.
      */
    val name: Output_[String] = js.native
    
    /**
      * Specifies the fleet and/or routing type to use for the alias.
      */
    val routingStrategy: Output_[AliasRoutingStrategy] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object Alias {
    
    /**
      * Get an existing Alias resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/gamelift/alias", "Alias.get")
    @js.native
    def get(name: String, id: Input[ID]): Alias = js.native
    @JSImport("@pulumi/aws/gamelift/alias", "Alias.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Alias = js.native
    @JSImport("@pulumi/aws/gamelift/alias", "Alias.get")
    @js.native
    def get(name: String, id: Input[ID], state: AliasState): Alias = js.native
    @JSImport("@pulumi/aws/gamelift/alias", "Alias.get")
    @js.native
    def get(name: String, id: Input[ID], state: AliasState, opts: CustomResourceOptions): Alias = js.native
    
    /**
      * Returns true if the given object is an instance of Alias.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/gamelift/alias", "Alias.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/gamelift/alias.Alias */ Boolean = js.native
  }
  
  @js.native
  trait AliasArgs extends StObject {
    
    /**
      * Description of the alias.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * Name of the alias.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specifies the fleet and/or routing type to use for the alias.
      */
    val routingStrategy: Input[typingsSlinky.pulumiAws.inputMod.gamelift.AliasRoutingStrategy] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object AliasArgs {
    
    @scala.inline
    def apply(routingStrategy: Input[typingsSlinky.pulumiAws.inputMod.gamelift.AliasRoutingStrategy]): AliasArgs = {
      val __obj = js.Dynamic.literal(routingStrategy = routingStrategy.asInstanceOf[js.Any])
      __obj.asInstanceOf[AliasArgs]
    }
    
    @scala.inline
    implicit class AliasArgsMutableBuilder[Self <: AliasArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRoutingStrategy(value: Input[typingsSlinky.pulumiAws.inputMod.gamelift.AliasRoutingStrategy]): Self = StObject.set(x, "routingStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait AliasState extends StObject {
    
    /**
      * Alias ARN.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Description of the alias.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * Name of the alias.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specifies the fleet and/or routing type to use for the alias.
      */
    val routingStrategy: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.gamelift.AliasRoutingStrategy]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object AliasState {
    
    @scala.inline
    def apply(): AliasState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AliasState]
    }
    
    @scala.inline
    implicit class AliasStateMutableBuilder[Self <: AliasState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRoutingStrategy(value: Input[typingsSlinky.pulumiAws.inputMod.gamelift.AliasRoutingStrategy]): Self = StObject.set(x, "routingStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutingStrategyUndefined: Self = StObject.set(x, "routingStrategy", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
