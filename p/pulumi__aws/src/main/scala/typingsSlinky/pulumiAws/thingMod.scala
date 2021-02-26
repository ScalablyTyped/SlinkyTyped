package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object thingMod {
  
  @JSImport("@pulumi/aws/iot/thing", "Thing")
  @js.native
  class Thing protected () extends CustomResource {
    /**
      * Create a Thing resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ThingArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ThingArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the thing.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Map of attributes of the thing.
      */
    val attributes: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The default client ID.
      */
    val defaultClientId: Output_[String] = js.native
    
    /**
      * The name of the thing.
      */
    val name: Output_[String] = js.native
    
    /**
      * The thing type name.
      */
    val thingTypeName: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The current version of the thing record in the registry.
      */
    val version: Output_[Double] = js.native
  }
  /* static members */
  object Thing {
    
    /**
      * Get an existing Thing resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/iot/thing", "Thing.get")
    @js.native
    def get(name: String, id: Input[ID]): Thing = js.native
    @JSImport("@pulumi/aws/iot/thing", "Thing.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Thing = js.native
    @JSImport("@pulumi/aws/iot/thing", "Thing.get")
    @js.native
    def get(name: String, id: Input[ID], state: ThingState): Thing = js.native
    @JSImport("@pulumi/aws/iot/thing", "Thing.get")
    @js.native
    def get(name: String, id: Input[ID], state: ThingState, opts: CustomResourceOptions): Thing = js.native
    
    /**
      * Returns true if the given object is an instance of Thing.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/iot/thing", "Thing.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/thing.Thing */ Boolean = js.native
  }
  
  @js.native
  trait ThingArgs extends StObject {
    
    /**
      * Map of attributes of the thing.
      */
    val attributes: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The name of the thing.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The thing type name.
      */
    val thingTypeName: js.UndefOr[Input[String]] = js.native
  }
  object ThingArgs {
    
    @scala.inline
    def apply(): ThingArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThingArgs]
    }
    
    @scala.inline
    implicit class ThingArgsMutableBuilder[Self <: ThingArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setThingTypeName(value: Input[String]): Self = StObject.set(x, "thingTypeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThingTypeNameUndefined: Self = StObject.set(x, "thingTypeName", js.undefined)
    }
  }
  
  @js.native
  trait ThingState extends StObject {
    
    /**
      * The ARN of the thing.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Map of attributes of the thing.
      */
    val attributes: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The default client ID.
      */
    val defaultClientId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the thing.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The thing type name.
      */
    val thingTypeName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The current version of the thing record in the registry.
      */
    val version: js.UndefOr[Input[Double]] = js.native
  }
  object ThingState {
    
    @scala.inline
    def apply(): ThingState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThingState]
    }
    
    @scala.inline
    implicit class ThingStateMutableBuilder[Self <: ThingState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setAttributes(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setDefaultClientId(value: Input[String]): Self = StObject.set(x, "defaultClientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultClientIdUndefined: Self = StObject.set(x, "defaultClientId", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setThingTypeName(value: Input[String]): Self = StObject.set(x, "thingTypeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThingTypeNameUndefined: Self = StObject.set(x, "thingTypeName", js.undefined)
      
      @scala.inline
      def setVersion(value: Input[Double]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
