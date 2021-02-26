package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.policyMod.PolicyArgs
import typingsSlinky.pulumiAws.policyMod.PolicyState
import typingsSlinky.pulumiAws.scheduledActionMod.ScheduledActionArgs
import typingsSlinky.pulumiAws.scheduledActionMod.ScheduledActionState
import typingsSlinky.pulumiAws.targetMod.TargetArgs
import typingsSlinky.pulumiAws.targetMod.TargetState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appautoscaling {
  
  @JSImport("@pulumi/aws", "appautoscaling.Policy")
  @js.native
  class Policy protected ()
    extends typingsSlinky.pulumiAws.appautoscalingMod.Policy {
    /**
      * Create a Policy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PolicyArgs) = this()
    def this(name: String, args: PolicyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Policy {
    
    /**
      * Get an existing Policy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "appautoscaling.Policy.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.policyMod.Policy = js.native
    @JSImport("@pulumi/aws", "appautoscaling.Policy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.policyMod.Policy = js.native
    @JSImport("@pulumi/aws", "appautoscaling.Policy.get")
    @js.native
    def get(name: String, id: Input[ID], state: PolicyState): typingsSlinky.pulumiAws.policyMod.Policy = js.native
    @JSImport("@pulumi/aws", "appautoscaling.Policy.get")
    @js.native
    def get(name: String, id: Input[ID], state: PolicyState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.policyMod.Policy = js.native
    
    /**
      * Returns true if the given object is an instance of Policy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "appautoscaling.Policy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appautoscaling/policy.Policy */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "appautoscaling.ScheduledAction")
  @js.native
  class ScheduledAction protected ()
    extends typingsSlinky.pulumiAws.appautoscalingMod.ScheduledAction {
    /**
      * Create a ScheduledAction resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ScheduledActionArgs) = this()
    def this(name: String, args: ScheduledActionArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ScheduledAction {
    
    /**
      * Get an existing ScheduledAction resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "appautoscaling.ScheduledAction.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.scheduledActionMod.ScheduledAction = js.native
    @JSImport("@pulumi/aws", "appautoscaling.ScheduledAction.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.scheduledActionMod.ScheduledAction = js.native
    @JSImport("@pulumi/aws", "appautoscaling.ScheduledAction.get")
    @js.native
    def get(name: String, id: Input[ID], state: ScheduledActionState): typingsSlinky.pulumiAws.scheduledActionMod.ScheduledAction = js.native
    @JSImport("@pulumi/aws", "appautoscaling.ScheduledAction.get")
    @js.native
    def get(name: String, id: Input[ID], state: ScheduledActionState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.scheduledActionMod.ScheduledAction = js.native
    
    /**
      * Returns true if the given object is an instance of ScheduledAction.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "appautoscaling.ScheduledAction.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appautoscaling/scheduledAction.ScheduledAction */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "appautoscaling.Target")
  @js.native
  class Target protected ()
    extends typingsSlinky.pulumiAws.appautoscalingMod.Target {
    /**
      * Create a Target resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: TargetArgs) = this()
    def this(name: String, args: TargetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Target {
    
    /**
      * Get an existing Target resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "appautoscaling.Target.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.targetMod.Target = js.native
    @JSImport("@pulumi/aws", "appautoscaling.Target.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.targetMod.Target = js.native
    @JSImport("@pulumi/aws", "appautoscaling.Target.get")
    @js.native
    def get(name: String, id: Input[ID], state: TargetState): typingsSlinky.pulumiAws.targetMod.Target = js.native
    @JSImport("@pulumi/aws", "appautoscaling.Target.get")
    @js.native
    def get(name: String, id: Input[ID], state: TargetState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.targetMod.Target = js.native
    
    /**
      * Returns true if the given object is an instance of Target.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "appautoscaling.Target.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appautoscaling/target.Target */ Boolean = js.native
  }
}
