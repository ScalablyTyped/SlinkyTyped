package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.workspaces.IpGroupRule
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ipGroupMod {
  
  @JSImport("@pulumi/aws/workspaces/ipGroup", "IpGroup")
  @js.native
  class IpGroup protected () extends CustomResource {
    /**
      * Create a IpGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: IpGroupArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: IpGroupArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The description.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The name of the IP group.
      */
    val name: Output_[String] = js.native
    
    /**
      * One or more pairs specifying the IP group rule (in CIDR format) from which web requests originate.
      */
    val rules: Output_[js.UndefOr[js.Array[IpGroupRule]]] = js.native
    
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object IpGroup {
    
    /**
      * Get an existing IpGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/workspaces/ipGroup", "IpGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): IpGroup = js.native
    @JSImport("@pulumi/aws/workspaces/ipGroup", "IpGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): IpGroup = js.native
    @JSImport("@pulumi/aws/workspaces/ipGroup", "IpGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: IpGroupState): IpGroup = js.native
    @JSImport("@pulumi/aws/workspaces/ipGroup", "IpGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: IpGroupState, opts: CustomResourceOptions): IpGroup = js.native
    
    /**
      * Returns true if the given object is an instance of IpGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/workspaces/ipGroup", "IpGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/workspaces/ipGroup.IpGroup */ Boolean = js.native
  }
  
  @js.native
  trait IpGroupArgs extends StObject {
    
    /**
      * The description.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the IP group.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * One or more pairs specifying the IP group rule (in CIDR format) from which web requests originate.
      */
    val rules: js.UndefOr[Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.workspaces.IpGroupRule]]]] = js.native
    
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object IpGroupArgs {
    
    @scala.inline
    def apply(): IpGroupArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IpGroupArgs]
    }
    
    @scala.inline
    implicit class IpGroupArgsMutableBuilder[Self <: IpGroupArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRules(value: Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.workspaces.IpGroupRule]]]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      @scala.inline
      def setRulesVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.workspaces.IpGroupRule]*): Self = StObject.set(x, "rules", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait IpGroupState extends StObject {
    
    /**
      * The description.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the IP group.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * One or more pairs specifying the IP group rule (in CIDR format) from which web requests originate.
      */
    val rules: js.UndefOr[Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.workspaces.IpGroupRule]]]] = js.native
    
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object IpGroupState {
    
    @scala.inline
    def apply(): IpGroupState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IpGroupState]
    }
    
    @scala.inline
    implicit class IpGroupStateMutableBuilder[Self <: IpGroupState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRules(value: Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.workspaces.IpGroupRule]]]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      @scala.inline
      def setRulesVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.workspaces.IpGroupRule]*): Self = StObject.set(x, "rules", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
