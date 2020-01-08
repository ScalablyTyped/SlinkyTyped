package typingsSlinky.atPulumiAws.atPulumiAwsMod

import typingsSlinky.atPulumiAws.cloudformationGetExportMod.GetExportArgs
import typingsSlinky.atPulumiAws.cloudformationGetExportMod.GetExportResult
import typingsSlinky.atPulumiAws.cloudformationGetStackMod.GetStackArgs
import typingsSlinky.atPulumiAws.cloudformationGetStackMod.GetStackResult
import typingsSlinky.atPulumiAws.cloudformationStackMod.StackArgs
import typingsSlinky.atPulumiAws.cloudformationStackMod.StackState
import typingsSlinky.atPulumiAws.cloudformationStackSetInstanceMod.StackSetInstanceArgs
import typingsSlinky.atPulumiAws.cloudformationStackSetInstanceMod.StackSetInstanceState
import typingsSlinky.atPulumiAws.cloudformationStackSetMod.StackSetArgs
import typingsSlinky.atPulumiAws.cloudformationStackSetMod.StackSetState
import typingsSlinky.atPulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "cloudformation")
@js.native
object cloudformation extends js.Object {
  @js.native
  class Stack protected ()
    extends typingsSlinky.atPulumiAws.cloudformationMod.Stack {
    /**
      * Create a Stack resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: StackArgs) = this()
    def this(name: String, args: StackArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class StackSet protected ()
    extends typingsSlinky.atPulumiAws.cloudformationMod.StackSet {
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
  
  @js.native
  class StackSetInstance protected ()
    extends typingsSlinky.atPulumiAws.cloudformationMod.StackSetInstance {
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
  
  def getExport(args: GetExportArgs): js.Promise[GetExportResult] with GetExportResult = js.native
  def getExport(args: GetExportArgs, opts: InvokeOptions): js.Promise[GetExportResult] with GetExportResult = js.native
  def getStack(args: GetStackArgs): js.Promise[GetStackResult] with GetStackResult = js.native
  def getStack(args: GetStackArgs, opts: InvokeOptions): js.Promise[GetStackResult] with GetStackResult = js.native
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
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.cloudformationStackMod.Stack = js.native
    def get(name: String, id: Input[ID], state: StackState): typingsSlinky.atPulumiAws.cloudformationStackMod.Stack = js.native
    def get(name: String, id: Input[ID], state: StackState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.cloudformationStackMod.Stack = js.native
    /**
      * Returns true if the given object is an instance of Stack.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudformation/stack.Stack */ Boolean = js.native
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
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.cloudformationStackSetMod.StackSet = js.native
    def get(name: String, id: Input[ID], state: StackSetState): typingsSlinky.atPulumiAws.cloudformationStackSetMod.StackSet = js.native
    def get(name: String, id: Input[ID], state: StackSetState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.cloudformationStackSetMod.StackSet = js.native
    /**
      * Returns true if the given object is an instance of StackSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudformation/stackSet.StackSet */ Boolean = js.native
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
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.cloudformationStackSetInstanceMod.StackSetInstance = js.native
    def get(name: String, id: Input[ID], state: StackSetInstanceState): typingsSlinky.atPulumiAws.cloudformationStackSetInstanceMod.StackSetInstance = js.native
    def get(name: String, id: Input[ID], state: StackSetInstanceState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.cloudformationStackSetInstanceMod.StackSetInstance = js.native
    /**
      * Returns true if the given object is an instance of StackSetInstance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudformation/stackSetInstance.StackSetInstance */ Boolean = js.native
  }
  
}

