package typingsSlinky.atPulumiAws.atPulumiAwsMod

import typingsSlinky.atPulumiAws.autoscalingAttachmentMod.AttachmentArgs
import typingsSlinky.atPulumiAws.autoscalingAttachmentMod.AttachmentState
import typingsSlinky.atPulumiAws.autoscalingGetGroupMod.GetGroupArgs
import typingsSlinky.atPulumiAws.autoscalingGetGroupMod.GetGroupResult
import typingsSlinky.atPulumiAws.autoscalingGroupMod.GroupArgs
import typingsSlinky.atPulumiAws.autoscalingGroupMod.GroupState
import typingsSlinky.atPulumiAws.autoscalingLifecycleHookMod.LifecycleHookArgs
import typingsSlinky.atPulumiAws.autoscalingLifecycleHookMod.LifecycleHookState
import typingsSlinky.atPulumiAws.autoscalingMetricsMod.Metric
import typingsSlinky.atPulumiAws.autoscalingMetricsMod.MetricsGranularity
import typingsSlinky.atPulumiAws.autoscalingNotificationMod.NotificationArgs
import typingsSlinky.atPulumiAws.autoscalingNotificationMod.NotificationState
import typingsSlinky.atPulumiAws.autoscalingNotificationTypeMod.NotificationType
import typingsSlinky.atPulumiAws.autoscalingPolicyMod.PolicyArgs
import typingsSlinky.atPulumiAws.autoscalingPolicyMod.PolicyState
import typingsSlinky.atPulumiAws.autoscalingScheduleMod.ScheduleArgs
import typingsSlinky.atPulumiAws.autoscalingScheduleMod.ScheduleState
import typingsSlinky.atPulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "autoscaling")
@js.native
object autoscaling extends js.Object {
  @js.native
  class Attachment protected ()
    extends typingsSlinky.atPulumiAws.autoscalingMod.Attachment {
    /**
      * Create a Attachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AttachmentArgs) = this()
    def this(name: String, args: AttachmentArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Group protected ()
    extends typingsSlinky.atPulumiAws.autoscalingMod.Group {
    /**
      * Create a Group resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: GroupArgs) = this()
    def this(name: String, args: GroupArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class LifecycleHook protected ()
    extends typingsSlinky.atPulumiAws.autoscalingMod.LifecycleHook {
    /**
      * Create a LifecycleHook resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LifecycleHookArgs) = this()
    def this(name: String, args: LifecycleHookArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Notification protected ()
    extends typingsSlinky.atPulumiAws.autoscalingMod.Notification {
    /**
      * Create a Notification resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: NotificationArgs) = this()
    def this(name: String, args: NotificationArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Policy protected ()
    extends typingsSlinky.atPulumiAws.autoscalingMod.Policy {
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
  
  @js.native
  class Schedule protected ()
    extends typingsSlinky.atPulumiAws.autoscalingMod.Schedule {
    /**
      * Create a Schedule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ScheduleArgs) = this()
    def this(name: String, args: ScheduleArgs, opts: CustomResourceOptions) = this()
  }
  
  var GroupDesiredCapacityMetric: Metric = js.native
  var GroupInServiceInstancesMetric: Metric = js.native
  var GroupMaxSizeMetric: Metric = js.native
  var GroupMinSizeMetric: Metric = js.native
  var GroupPendingInstances: Metric = js.native
  var GroupStandbyInstances: Metric = js.native
  var GroupTerminatingInstances: Metric = js.native
  var GroupTotalInstances: Metric = js.native
  var InstanceLaunchErrorNotification: NotificationType = js.native
  var InstanceLaunchNotification: NotificationType = js.native
  var InstanceTerminateErrorNotification: NotificationType = js.native
  var InstanceTerminateNotification: NotificationType = js.native
  var OneMinuteMetricsGranularity: MetricsGranularity = js.native
  var TestNotification: NotificationType = js.native
  def getGroup(args: GetGroupArgs): js.Promise[GetGroupResult] with GetGroupResult = js.native
  def getGroup(args: GetGroupArgs, opts: InvokeOptions): js.Promise[GetGroupResult] with GetGroupResult = js.native
  /* static members */
  @js.native
  object Attachment extends js.Object {
    /**
      * Get an existing Attachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.autoscalingAttachmentMod.Attachment = js.native
    def get(name: String, id: Input[ID], state: AttachmentState): typingsSlinky.atPulumiAws.autoscalingAttachmentMod.Attachment = js.native
    def get(name: String, id: Input[ID], state: AttachmentState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.autoscalingAttachmentMod.Attachment = js.native
    /**
      * Returns true if the given object is an instance of Attachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/autoscaling/attachment.Attachment */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Group extends js.Object {
    /**
      * Get an existing Group resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.autoscalingGroupMod.Group = js.native
    def get(name: String, id: Input[ID], state: GroupState): typingsSlinky.atPulumiAws.autoscalingGroupMod.Group = js.native
    def get(name: String, id: Input[ID], state: GroupState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.autoscalingGroupMod.Group = js.native
    /**
      * Returns true if the given object is an instance of Group.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/autoscaling/group.Group */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object LifecycleHook extends js.Object {
    /**
      * Get an existing LifecycleHook resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.autoscalingLifecycleHookMod.LifecycleHook = js.native
    def get(name: String, id: Input[ID], state: LifecycleHookState): typingsSlinky.atPulumiAws.autoscalingLifecycleHookMod.LifecycleHook = js.native
    def get(name: String, id: Input[ID], state: LifecycleHookState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.autoscalingLifecycleHookMod.LifecycleHook = js.native
    /**
      * Returns true if the given object is an instance of LifecycleHook.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/autoscaling/lifecycleHook.LifecycleHook */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Notification extends js.Object {
    /**
      * Get an existing Notification resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.autoscalingNotificationMod.Notification = js.native
    def get(name: String, id: Input[ID], state: NotificationState): typingsSlinky.atPulumiAws.autoscalingNotificationMod.Notification = js.native
    def get(name: String, id: Input[ID], state: NotificationState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.autoscalingNotificationMod.Notification = js.native
    /**
      * Returns true if the given object is an instance of Notification.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/autoscaling/notification.Notification */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Policy extends js.Object {
    /**
      * Get an existing Policy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.autoscalingPolicyMod.Policy = js.native
    def get(name: String, id: Input[ID], state: PolicyState): typingsSlinky.atPulumiAws.autoscalingPolicyMod.Policy = js.native
    def get(name: String, id: Input[ID], state: PolicyState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.autoscalingPolicyMod.Policy = js.native
    /**
      * Returns true if the given object is an instance of Policy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/autoscaling/policy.Policy */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Schedule extends js.Object {
    /**
      * Get an existing Schedule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.autoscalingScheduleMod.Schedule = js.native
    def get(name: String, id: Input[ID], state: ScheduleState): typingsSlinky.atPulumiAws.autoscalingScheduleMod.Schedule = js.native
    def get(name: String, id: Input[ID], state: ScheduleState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.autoscalingScheduleMod.Schedule = js.native
    /**
      * Returns true if the given object is an instance of Schedule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/autoscaling/schedule.Schedule */ Boolean = js.native
  }
  
}

