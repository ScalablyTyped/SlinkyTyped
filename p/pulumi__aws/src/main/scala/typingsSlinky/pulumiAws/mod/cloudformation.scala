package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.getExportMod.GetExportArgs
import typingsSlinky.pulumiAws.getExportMod.GetExportResult
import typingsSlinky.pulumiAws.getStackMod.GetStackArgs
import typingsSlinky.pulumiAws.getStackMod.GetStackResult
import typingsSlinky.pulumiAws.stackMod.StackArgs
import typingsSlinky.pulumiAws.stackMod.StackState
import typingsSlinky.pulumiAws.stackSetInstanceMod.StackSetInstanceArgs
import typingsSlinky.pulumiAws.stackSetInstanceMod.StackSetInstanceState
import typingsSlinky.pulumiAws.stackSetMod.StackSetArgs
import typingsSlinky.pulumiAws.stackSetMod.StackSetState
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "cloudformation")
@js.native
object cloudformation extends js.Object {
  
  def getExport(args: GetExportArgs): js.Promise[GetExportResult] = js.native
  def getExport(args: GetExportArgs, opts: InvokeOptions): js.Promise[GetExportResult] = js.native
  
  def getStack(args: GetStackArgs): js.Promise[GetStackResult] = js.native
  def getStack(args: GetStackArgs, opts: InvokeOptions): js.Promise[GetStackResult] = js.native
  
  @js.native
  class Stack protected ()
    extends typingsSlinky.pulumiAws.cloudformationMod.Stack {
    /**
      * Create a Stack resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: StackArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: StackArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object Stack extends js.Object {
    
    /**
      * Get an existing Stack resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.stackMod.Stack = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.stackMod.Stack = js.native
    def get(name: String, id: Input[ID], state: StackState): typingsSlinky.pulumiAws.stackMod.Stack = js.native
    def get(name: String, id: Input[ID], state: StackState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.stackMod.Stack = js.native
    
    /**
      * Returns true if the given object is an instance of Stack.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudformation/stack.Stack */ Boolean = js.native
  }
  
  @js.native
  class StackSet protected ()
    extends typingsSlinky.pulumiAws.cloudformationMod.StackSet {
    /**
      * Create a StackSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: StackSetArgs) = this()
    def this(name: String, args: StackSetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object StackSet extends js.Object {
    
    /**
      * Get an existing StackSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.stackSetMod.StackSet = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.stackSetMod.StackSet = js.native
    def get(name: String, id: Input[ID], state: StackSetState): typingsSlinky.pulumiAws.stackSetMod.StackSet = js.native
    def get(name: String, id: Input[ID], state: StackSetState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.stackSetMod.StackSet = js.native
    
    /**
      * Returns true if the given object is an instance of StackSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudformation/stackSet.StackSet */ Boolean = js.native
  }
  
  @js.native
  class StackSetInstance protected ()
    extends typingsSlinky.pulumiAws.cloudformationMod.StackSetInstance {
    /**
      * Create a StackSetInstance resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: StackSetInstanceArgs) = this()
    def this(name: String, args: StackSetInstanceArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object StackSetInstance extends js.Object {
    
    /**
      * Get an existing StackSetInstance resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.stackSetInstanceMod.StackSetInstance = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.stackSetInstanceMod.StackSetInstance = js.native
    def get(name: String, id: Input[ID], state: StackSetInstanceState): typingsSlinky.pulumiAws.stackSetInstanceMod.StackSetInstance = js.native
    def get(name: String, id: Input[ID], state: StackSetInstanceState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.stackSetInstanceMod.StackSetInstance = js.native
    
    /**
      * Returns true if the given object is an instance of StackSetInstance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudformation/stackSetInstance.StackSetInstance */ Boolean = js.native
  }
}
