package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.activityMod.ActivityArgs
import typingsSlinky.pulumiAws.activityMod.ActivityState
import typingsSlinky.pulumiAws.getActivityMod.GetActivityArgs
import typingsSlinky.pulumiAws.getActivityMod.GetActivityResult
import typingsSlinky.pulumiAws.getStateMachineMod.GetStateMachineArgs
import typingsSlinky.pulumiAws.getStateMachineMod.GetStateMachineResult
import typingsSlinky.pulumiAws.stateMachineMod.StateMachineArgs
import typingsSlinky.pulumiAws.stateMachineMod.StateMachineState
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sfnMod {
  
  @JSImport("@pulumi/aws/sfn", "Activity")
  @js.native
  class Activity protected ()
    extends typingsSlinky.pulumiAws.activityMod.Activity {
    /**
      * Create a Activity resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ActivityArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ActivityArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Activity {
    
    /**
      * Get an existing Activity resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/sfn", "Activity.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.activityMod.Activity = js.native
    @JSImport("@pulumi/aws/sfn", "Activity.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.activityMod.Activity = js.native
    @JSImport("@pulumi/aws/sfn", "Activity.get")
    @js.native
    def get(name: String, id: Input[ID], state: ActivityState): typingsSlinky.pulumiAws.activityMod.Activity = js.native
    @JSImport("@pulumi/aws/sfn", "Activity.get")
    @js.native
    def get(name: String, id: Input[ID], state: ActivityState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.activityMod.Activity = js.native
    
    /**
      * Returns true if the given object is an instance of Activity.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/sfn", "Activity.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sfn/activity.Activity */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/sfn", "StateMachine")
  @js.native
  class StateMachine protected ()
    extends typingsSlinky.pulumiAws.stateMachineMod.StateMachine {
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
  object StateMachine {
    
    /**
      * Get an existing StateMachine resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/sfn", "StateMachine.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.stateMachineMod.StateMachine = js.native
    @JSImport("@pulumi/aws/sfn", "StateMachine.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.stateMachineMod.StateMachine = js.native
    @JSImport("@pulumi/aws/sfn", "StateMachine.get")
    @js.native
    def get(name: String, id: Input[ID], state: StateMachineState): typingsSlinky.pulumiAws.stateMachineMod.StateMachine = js.native
    @JSImport("@pulumi/aws/sfn", "StateMachine.get")
    @js.native
    def get(name: String, id: Input[ID], state: StateMachineState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.stateMachineMod.StateMachine = js.native
    
    /**
      * Returns true if the given object is an instance of StateMachine.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/sfn", "StateMachine.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sfn/stateMachine.StateMachine */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/sfn", "getActivity")
  @js.native
  def getActivity(): js.Promise[GetActivityResult] = js.native
  @JSImport("@pulumi/aws/sfn", "getActivity")
  @js.native
  def getActivity(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetActivityResult] = js.native
  @JSImport("@pulumi/aws/sfn", "getActivity")
  @js.native
  def getActivity(args: GetActivityArgs): js.Promise[GetActivityResult] = js.native
  @JSImport("@pulumi/aws/sfn", "getActivity")
  @js.native
  def getActivity(args: GetActivityArgs, opts: InvokeOptions): js.Promise[GetActivityResult] = js.native
  
  @JSImport("@pulumi/aws/sfn", "getStateMachine")
  @js.native
  def getStateMachine(args: GetStateMachineArgs): js.Promise[GetStateMachineResult] = js.native
  @JSImport("@pulumi/aws/sfn", "getStateMachine")
  @js.native
  def getStateMachine(args: GetStateMachineArgs, opts: InvokeOptions): js.Promise[GetStateMachineResult] = js.native
}
