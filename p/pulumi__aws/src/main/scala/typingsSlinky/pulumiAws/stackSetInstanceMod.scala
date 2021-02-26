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

object stackSetInstanceMod {
  
  @JSImport("@pulumi/aws/cloudformation/stackSetInstance", "StackSetInstance")
  @js.native
  class StackSetInstance protected () extends CustomResource {
    /**
      * Create a StackSetInstance resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: StackSetInstanceArgs) = this()
    def this(name: String, args: StackSetInstanceArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Target AWS Account ID to create a Stack based on the StackSet. Defaults to current account.
      */
    val accountId: Output_[String] = js.native
    
    /**
      * Key-value map of input parameters to override from the StackSet for this Instance.
      */
    val parameterOverrides: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Target AWS Region to create a Stack based on the StackSet. Defaults to current region.
      */
    val region: Output_[String] = js.native
    
    /**
      * During resource destroy, remove Instance from StackSet while keeping the Stack and its associated resources. Must be enabled in the state _before_ destroy operation to take effect. You cannot reassociate a retained Stack or add an existing, saved Stack to a new StackSet. Defaults to `false`.
      */
    val retainStack: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Stack identifier
      */
    val stackId: Output_[String] = js.native
    
    /**
      * Name of the StackSet.
      */
    val stackSetName: Output_[String] = js.native
  }
  /* static members */
  object StackSetInstance {
    
    /**
      * Get an existing StackSetInstance resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cloudformation/stackSetInstance", "StackSetInstance.get")
    @js.native
    def get(name: String, id: Input[ID]): StackSetInstance = js.native
    @JSImport("@pulumi/aws/cloudformation/stackSetInstance", "StackSetInstance.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): StackSetInstance = js.native
    @JSImport("@pulumi/aws/cloudformation/stackSetInstance", "StackSetInstance.get")
    @js.native
    def get(name: String, id: Input[ID], state: StackSetInstanceState): StackSetInstance = js.native
    @JSImport("@pulumi/aws/cloudformation/stackSetInstance", "StackSetInstance.get")
    @js.native
    def get(name: String, id: Input[ID], state: StackSetInstanceState, opts: CustomResourceOptions): StackSetInstance = js.native
    
    /**
      * Returns true if the given object is an instance of StackSetInstance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cloudformation/stackSetInstance", "StackSetInstance.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudformation/stackSetInstance.StackSetInstance */ Boolean = js.native
  }
  
  @js.native
  trait StackSetInstanceArgs extends StObject {
    
    /**
      * Target AWS Account ID to create a Stack based on the StackSet. Defaults to current account.
      */
    val accountId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of input parameters to override from the StackSet for this Instance.
      */
    val parameterOverrides: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * Target AWS Region to create a Stack based on the StackSet. Defaults to current region.
      */
    val region: js.UndefOr[Input[String]] = js.native
    
    /**
      * During resource destroy, remove Instance from StackSet while keeping the Stack and its associated resources. Must be enabled in the state _before_ destroy operation to take effect. You cannot reassociate a retained Stack or add an existing, saved Stack to a new StackSet. Defaults to `false`.
      */
    val retainStack: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Name of the StackSet.
      */
    val stackSetName: Input[String] = js.native
  }
  object StackSetInstanceArgs {
    
    @scala.inline
    def apply(stackSetName: Input[String]): StackSetInstanceArgs = {
      val __obj = js.Dynamic.literal(stackSetName = stackSetName.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackSetInstanceArgs]
    }
    
    @scala.inline
    implicit class StackSetInstanceArgsMutableBuilder[Self <: StackSetInstanceArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccountId(value: Input[String]): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
      
      @scala.inline
      def setParameterOverrides(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "parameterOverrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParameterOverridesUndefined: Self = StObject.set(x, "parameterOverrides", js.undefined)
      
      @scala.inline
      def setRegion(value: Input[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      @scala.inline
      def setRetainStack(value: Input[Boolean]): Self = StObject.set(x, "retainStack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetainStackUndefined: Self = StObject.set(x, "retainStack", js.undefined)
      
      @scala.inline
      def setStackSetName(value: Input[String]): Self = StObject.set(x, "stackSetName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StackSetInstanceState extends StObject {
    
    /**
      * Target AWS Account ID to create a Stack based on the StackSet. Defaults to current account.
      */
    val accountId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of input parameters to override from the StackSet for this Instance.
      */
    val parameterOverrides: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * Target AWS Region to create a Stack based on the StackSet. Defaults to current region.
      */
    val region: js.UndefOr[Input[String]] = js.native
    
    /**
      * During resource destroy, remove Instance from StackSet while keeping the Stack and its associated resources. Must be enabled in the state _before_ destroy operation to take effect. You cannot reassociate a retained Stack or add an existing, saved Stack to a new StackSet. Defaults to `false`.
      */
    val retainStack: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Stack identifier
      */
    val stackId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Name of the StackSet.
      */
    val stackSetName: js.UndefOr[Input[String]] = js.native
  }
  object StackSetInstanceState {
    
    @scala.inline
    def apply(): StackSetInstanceState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StackSetInstanceState]
    }
    
    @scala.inline
    implicit class StackSetInstanceStateMutableBuilder[Self <: StackSetInstanceState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccountId(value: Input[String]): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
      
      @scala.inline
      def setParameterOverrides(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "parameterOverrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParameterOverridesUndefined: Self = StObject.set(x, "parameterOverrides", js.undefined)
      
      @scala.inline
      def setRegion(value: Input[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      @scala.inline
      def setRetainStack(value: Input[Boolean]): Self = StObject.set(x, "retainStack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetainStackUndefined: Self = StObject.set(x, "retainStack", js.undefined)
      
      @scala.inline
      def setStackId(value: Input[String]): Self = StObject.set(x, "stackId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackIdUndefined: Self = StObject.set(x, "stackId", js.undefined)
      
      @scala.inline
      def setStackSetName(value: Input[String]): Self = StObject.set(x, "stackSetName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackSetNameUndefined: Self = StObject.set(x, "stackSetName", js.undefined)
    }
  }
}
