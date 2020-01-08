package typingsSlinky.atPulumiAws

import typingsSlinky.atPulumiAws.sfnActivityMod.ActivityArgs
import typingsSlinky.atPulumiAws.sfnActivityMod.ActivityState
import typingsSlinky.atPulumiAws.sfnStateMachineMod.StateMachineArgs
import typingsSlinky.atPulumiAws.sfnStateMachineMod.StateMachineState
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/sfn", JSImport.Namespace)
@js.native
object sfnMod extends js.Object {
  @js.native
  class Activity protected ()
    extends typingsSlinky.atPulumiAws.sfnActivityMod.Activity {
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
    extends typingsSlinky.atPulumiAws.sfnStateMachineMod.StateMachine {
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
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.sfnActivityMod.Activity = js.native
    def get(name: String, id: Input[ID], state: ActivityState): typingsSlinky.atPulumiAws.sfnActivityMod.Activity = js.native
    def get(name: String, id: Input[ID], state: ActivityState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.sfnActivityMod.Activity = js.native
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
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.sfnStateMachineMod.StateMachine = js.native
    def get(name: String, id: Input[ID], state: StateMachineState): typingsSlinky.atPulumiAws.sfnStateMachineMod.StateMachine = js.native
    def get(name: String, id: Input[ID], state: StateMachineState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.sfnStateMachineMod.StateMachine = js.native
    /**
      * Returns true if the given object is an instance of StateMachine.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sfn/stateMachine.StateMachine */ Boolean = js.native
  }
  
}

