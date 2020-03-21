package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.activityMod.ActivityArgs
import typingsSlinky.pulumiAws.activityMod.ActivityState
import typingsSlinky.pulumiAws.stateMachineMod.StateMachineArgs
import typingsSlinky.pulumiAws.stateMachineMod.StateMachineState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "sfn")
@js.native
object sfn extends js.Object {
  @js.native
  class Activity protected ()
    extends typingsSlinky.pulumiAws.sfnMod.Activity {
    /**
      * Create a Activity resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ActivityArgs) = this()
    def this(name: String, args: ActivityArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class StateMachine protected ()
    extends typingsSlinky.pulumiAws.sfnMod.StateMachine {
    /**
      * Create a StateMachine resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: StateMachineArgs) = this()
    def this(name: String, args: StateMachineArgs, opts: CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object Activity extends js.Object {
    /**
      * Get an existing Activity resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.activityMod.Activity = js.native
    def get(name: String, id: Input[ID], state: ActivityState): typingsSlinky.pulumiAws.activityMod.Activity = js.native
    def get(name: String, id: Input[ID], state: ActivityState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.activityMod.Activity = js.native
    /**
      * Returns true if the given object is an instance of Activity.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sfn/activity.Activity */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object StateMachine extends js.Object {
    /**
      * Get an existing StateMachine resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.stateMachineMod.StateMachine = js.native
    def get(name: String, id: Input[ID], state: StateMachineState): typingsSlinky.pulumiAws.stateMachineMod.StateMachine = js.native
    def get(name: String, id: Input[ID], state: StateMachineState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.stateMachineMod.StateMachine = js.native
    /**
      * Returns true if the given object is an instance of StateMachine.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sfn/stateMachine.StateMachine */ Boolean = js.native
  }
  
}

