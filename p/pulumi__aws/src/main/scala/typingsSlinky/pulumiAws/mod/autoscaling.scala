package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.attachmentMod.AttachmentArgs
import typingsSlinky.pulumiAws.attachmentMod.AttachmentState
import typingsSlinky.pulumiAws.autoscalingPolicyMod.PolicyArgs
import typingsSlinky.pulumiAws.autoscalingPolicyMod.PolicyState
import typingsSlinky.pulumiAws.enumsAutoscalingMod.Metric
import typingsSlinky.pulumiAws.enumsAutoscalingMod.MetricsGranularity
import typingsSlinky.pulumiAws.enumsAutoscalingMod.NotificationType
import typingsSlinky.pulumiAws.getGroupMod.GetGroupArgs
import typingsSlinky.pulumiAws.getGroupMod.GetGroupResult
import typingsSlinky.pulumiAws.groupMod.GroupArgs
import typingsSlinky.pulumiAws.groupMod.GroupState
import typingsSlinky.pulumiAws.lifecycleHookMod.LifecycleHookArgs
import typingsSlinky.pulumiAws.lifecycleHookMod.LifecycleHookState
import typingsSlinky.pulumiAws.notificationMod.NotificationArgs
import typingsSlinky.pulumiAws.notificationMod.NotificationState
import typingsSlinky.pulumiAws.pulumiAwsStrings.`1Minute`
import typingsSlinky.pulumiAws.pulumiAwsStrings.autoscalingColonEC2_INSTANCE_LAUNCH
import typingsSlinky.pulumiAws.pulumiAwsStrings.autoscalingColonEC2_INSTANCE_LAUNCH_ERROR
import typingsSlinky.pulumiAws.pulumiAwsStrings.autoscalingColonEC2_INSTANCE_TERMINATE
import typingsSlinky.pulumiAws.pulumiAwsStrings.autoscalingColonEC2_INSTANCE_TERMINATE_ERROR
import typingsSlinky.pulumiAws.pulumiAwsStrings.autoscalingColonTEST_NOTIFICATION
import typingsSlinky.pulumiAws.scheduleMod.ScheduleArgs
import typingsSlinky.pulumiAws.scheduleMod.ScheduleState
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autoscaling {
  
  @JSImport("@pulumi/aws", "autoscaling")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws", "autoscaling.Attachment")
  @js.native
  class Attachment protected ()
    extends typingsSlinky.pulumiAws.autoscalingMod.Attachment {
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
  /* static members */
  object Attachment {
    
    /**
      * Get an existing Attachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "autoscaling.Attachment.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.attachmentMod.Attachment = js.native
    @JSImport("@pulumi/aws", "autoscaling.Attachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.attachmentMod.Attachment = js.native
    @JSImport("@pulumi/aws", "autoscaling.Attachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: AttachmentState): typingsSlinky.pulumiAws.attachmentMod.Attachment = js.native
    @JSImport("@pulumi/aws", "autoscaling.Attachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: AttachmentState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.attachmentMod.Attachment = js.native
    
    /**
      * Returns true if the given object is an instance of Attachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "autoscaling.Attachment.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/autoscaling/attachment.Attachment */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "autoscaling.Group")
  @js.native
  class Group protected ()
    extends typingsSlinky.pulumiAws.autoscalingMod.Group {
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
  /* static members */
  object Group {
    
    /**
      * Get an existing Group resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "autoscaling.Group.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.groupMod.Group = js.native
    @JSImport("@pulumi/aws", "autoscaling.Group.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.groupMod.Group = js.native
    @JSImport("@pulumi/aws", "autoscaling.Group.get")
    @js.native
    def get(name: String, id: Input[ID], state: GroupState): typingsSlinky.pulumiAws.groupMod.Group = js.native
    @JSImport("@pulumi/aws", "autoscaling.Group.get")
    @js.native
    def get(name: String, id: Input[ID], state: GroupState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.groupMod.Group = js.native
    
    /**
      * Returns true if the given object is an instance of Group.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "autoscaling.Group.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/autoscaling/group.Group */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "autoscaling.GroupDesiredCapacityMetric")
  @js.native
  def GroupDesiredCapacityMetric: Metric = js.native
  @scala.inline
  def GroupDesiredCapacityMetric_=(x: Metric): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GroupDesiredCapacityMetric")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "autoscaling.GroupInServiceInstancesMetric")
  @js.native
  def GroupInServiceInstancesMetric: Metric = js.native
  @scala.inline
  def GroupInServiceInstancesMetric_=(x: Metric): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GroupInServiceInstancesMetric")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "autoscaling.GroupMaxSizeMetric")
  @js.native
  def GroupMaxSizeMetric: Metric = js.native
  @scala.inline
  def GroupMaxSizeMetric_=(x: Metric): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GroupMaxSizeMetric")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "autoscaling.GroupMinSizeMetric")
  @js.native
  def GroupMinSizeMetric: Metric = js.native
  @scala.inline
  def GroupMinSizeMetric_=(x: Metric): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GroupMinSizeMetric")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "autoscaling.GroupPendingInstances")
  @js.native
  def GroupPendingInstances: Metric = js.native
  @scala.inline
  def GroupPendingInstances_=(x: Metric): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GroupPendingInstances")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "autoscaling.GroupStandbyInstances")
  @js.native
  def GroupStandbyInstances: Metric = js.native
  @scala.inline
  def GroupStandbyInstances_=(x: Metric): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GroupStandbyInstances")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "autoscaling.GroupTerminatingInstances")
  @js.native
  def GroupTerminatingInstances: Metric = js.native
  @scala.inline
  def GroupTerminatingInstances_=(x: Metric): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GroupTerminatingInstances")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "autoscaling.GroupTotalInstances")
  @js.native
  def GroupTotalInstances: Metric = js.native
  @scala.inline
  def GroupTotalInstances_=(x: Metric): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GroupTotalInstances")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "autoscaling.InstanceLaunchErrorNotification")
  @js.native
  def InstanceLaunchErrorNotification: NotificationType = js.native
  @scala.inline
  def InstanceLaunchErrorNotification_=(x: NotificationType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InstanceLaunchErrorNotification")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "autoscaling.InstanceLaunchNotification")
  @js.native
  def InstanceLaunchNotification: NotificationType = js.native
  @scala.inline
  def InstanceLaunchNotification_=(x: NotificationType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InstanceLaunchNotification")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "autoscaling.InstanceTerminateErrorNotification")
  @js.native
  def InstanceTerminateErrorNotification: NotificationType = js.native
  @scala.inline
  def InstanceTerminateErrorNotification_=(x: NotificationType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InstanceTerminateErrorNotification")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "autoscaling.InstanceTerminateNotification")
  @js.native
  def InstanceTerminateNotification: NotificationType = js.native
  @scala.inline
  def InstanceTerminateNotification_=(x: NotificationType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InstanceTerminateNotification")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "autoscaling.LifecycleHook")
  @js.native
  class LifecycleHook protected ()
    extends typingsSlinky.pulumiAws.autoscalingMod.LifecycleHook {
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
  /* static members */
  object LifecycleHook {
    
    /**
      * Get an existing LifecycleHook resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "autoscaling.LifecycleHook.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.lifecycleHookMod.LifecycleHook = js.native
    @JSImport("@pulumi/aws", "autoscaling.LifecycleHook.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.lifecycleHookMod.LifecycleHook = js.native
    @JSImport("@pulumi/aws", "autoscaling.LifecycleHook.get")
    @js.native
    def get(name: String, id: Input[ID], state: LifecycleHookState): typingsSlinky.pulumiAws.lifecycleHookMod.LifecycleHook = js.native
    @JSImport("@pulumi/aws", "autoscaling.LifecycleHook.get")
    @js.native
    def get(name: String, id: Input[ID], state: LifecycleHookState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.lifecycleHookMod.LifecycleHook = js.native
    
    /**
      * Returns true if the given object is an instance of LifecycleHook.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "autoscaling.LifecycleHook.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/autoscaling/lifecycleHook.LifecycleHook */ Boolean = js.native
  }
  
  object Metric {
    
    @JSImport("@pulumi/aws", "autoscaling.Metric.GroupDesiredCapacity")
    @js.native
    val GroupDesiredCapacity: typingsSlinky.pulumiAws.pulumiAwsStrings.GroupDesiredCapacity = js.native
    
    @JSImport("@pulumi/aws", "autoscaling.Metric.GroupInServiceCapacity")
    @js.native
    val GroupInServiceCapacity: typingsSlinky.pulumiAws.pulumiAwsStrings.GroupInServiceCapacity = js.native
    
    @JSImport("@pulumi/aws", "autoscaling.Metric.GroupInServiceInstances")
    @js.native
    val GroupInServiceInstances: typingsSlinky.pulumiAws.pulumiAwsStrings.GroupInServiceInstances = js.native
    
    @JSImport("@pulumi/aws", "autoscaling.Metric.GroupMaxSize")
    @js.native
    val GroupMaxSize: typingsSlinky.pulumiAws.pulumiAwsStrings.GroupMaxSize = js.native
    
    @JSImport("@pulumi/aws", "autoscaling.Metric.GroupMinSize")
    @js.native
    val GroupMinSize: typingsSlinky.pulumiAws.pulumiAwsStrings.GroupMinSize = js.native
    
    @JSImport("@pulumi/aws", "autoscaling.Metric.GroupPendingCapacity")
    @js.native
    val GroupPendingCapacity: typingsSlinky.pulumiAws.pulumiAwsStrings.GroupPendingCapacity = js.native
    
    @JSImport("@pulumi/aws", "autoscaling.Metric.GroupPendingInstances")
    @js.native
    val GroupPendingInstances: typingsSlinky.pulumiAws.pulumiAwsStrings.GroupPendingInstances = js.native
    
    @JSImport("@pulumi/aws", "autoscaling.Metric.GroupStandbyCapacity")
    @js.native
    val GroupStandbyCapacity: typingsSlinky.pulumiAws.pulumiAwsStrings.GroupStandbyCapacity = js.native
    
    @JSImport("@pulumi/aws", "autoscaling.Metric.GroupStandbyInstances")
    @js.native
    val GroupStandbyInstances: typingsSlinky.pulumiAws.pulumiAwsStrings.GroupStandbyInstances = js.native
    
    @JSImport("@pulumi/aws", "autoscaling.Metric.GroupTerminatingCapacity")
    @js.native
    val GroupTerminatingCapacity: typingsSlinky.pulumiAws.pulumiAwsStrings.GroupTerminatingCapacity = js.native
    
    @JSImport("@pulumi/aws", "autoscaling.Metric.GroupTerminatingInstances")
    @js.native
    val GroupTerminatingInstances: typingsSlinky.pulumiAws.pulumiAwsStrings.GroupTerminatingInstances = js.native
    
    @JSImport("@pulumi/aws", "autoscaling.Metric.GroupTotalCapacity")
    @js.native
    val GroupTotalCapacity: typingsSlinky.pulumiAws.pulumiAwsStrings.GroupTotalCapacity = js.native
    
    @JSImport("@pulumi/aws", "autoscaling.Metric.GroupTotalInstances")
    @js.native
    val GroupTotalInstances: typingsSlinky.pulumiAws.pulumiAwsStrings.GroupTotalInstances = js.native
  }
  
  object MetricsGranularity {
    
    @JSImport("@pulumi/aws", "autoscaling.MetricsGranularity.OneMinute")
    @js.native
    val OneMinute: `1Minute` = js.native
  }
  
  @JSImport("@pulumi/aws", "autoscaling.Notification")
  @js.native
  class Notification protected ()
    extends typingsSlinky.pulumiAws.autoscalingMod.Notification {
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
  /* static members */
  object Notification {
    
    /**
      * Get an existing Notification resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "autoscaling.Notification.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.notificationMod.Notification = js.native
    @JSImport("@pulumi/aws", "autoscaling.Notification.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.notificationMod.Notification = js.native
    @JSImport("@pulumi/aws", "autoscaling.Notification.get")
    @js.native
    def get(name: String, id: Input[ID], state: NotificationState): typingsSlinky.pulumiAws.notificationMod.Notification = js.native
    @JSImport("@pulumi/aws", "autoscaling.Notification.get")
    @js.native
    def get(name: String, id: Input[ID], state: NotificationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.notificationMod.Notification = js.native
    
    /**
      * Returns true if the given object is an instance of Notification.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "autoscaling.Notification.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/autoscaling/notification.Notification */ Boolean = js.native
  }
  
  object NotificationType {
    
    @JSImport("@pulumi/aws", "autoscaling.NotificationType.InstanceLaunch")
    @js.native
    val InstanceLaunch: autoscalingColonEC2_INSTANCE_LAUNCH = js.native
    
    @JSImport("@pulumi/aws", "autoscaling.NotificationType.InstanceLaunchError")
    @js.native
    val InstanceLaunchError: autoscalingColonEC2_INSTANCE_LAUNCH_ERROR = js.native
    
    @JSImport("@pulumi/aws", "autoscaling.NotificationType.InstanceTerminate")
    @js.native
    val InstanceTerminate: autoscalingColonEC2_INSTANCE_TERMINATE = js.native
    
    @JSImport("@pulumi/aws", "autoscaling.NotificationType.InstanceTerminateError")
    @js.native
    val InstanceTerminateError: autoscalingColonEC2_INSTANCE_TERMINATE_ERROR = js.native
    
    @JSImport("@pulumi/aws", "autoscaling.NotificationType.TestNotification")
    @js.native
    val TestNotification: autoscalingColonTEST_NOTIFICATION = js.native
  }
  
  @JSImport("@pulumi/aws", "autoscaling.OneMinuteMetricsGranularity")
  @js.native
  def OneMinuteMetricsGranularity: MetricsGranularity = js.native
  @scala.inline
  def OneMinuteMetricsGranularity_=(x: MetricsGranularity): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OneMinuteMetricsGranularity")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "autoscaling.Policy")
  @js.native
  class Policy protected ()
    extends typingsSlinky.pulumiAws.autoscalingMod.Policy {
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
    @JSImport("@pulumi/aws", "autoscaling.Policy.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.autoscalingPolicyMod.Policy = js.native
    @JSImport("@pulumi/aws", "autoscaling.Policy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.autoscalingPolicyMod.Policy = js.native
    @JSImport("@pulumi/aws", "autoscaling.Policy.get")
    @js.native
    def get(name: String, id: Input[ID], state: PolicyState): typingsSlinky.pulumiAws.autoscalingPolicyMod.Policy = js.native
    @JSImport("@pulumi/aws", "autoscaling.Policy.get")
    @js.native
    def get(name: String, id: Input[ID], state: PolicyState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.autoscalingPolicyMod.Policy = js.native
    
    /**
      * Returns true if the given object is an instance of Policy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "autoscaling.Policy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/autoscaling/policy.Policy */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "autoscaling.Schedule")
  @js.native
  class Schedule protected ()
    extends typingsSlinky.pulumiAws.autoscalingMod.Schedule {
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
  /* static members */
  object Schedule {
    
    /**
      * Get an existing Schedule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "autoscaling.Schedule.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.scheduleMod.Schedule = js.native
    @JSImport("@pulumi/aws", "autoscaling.Schedule.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.scheduleMod.Schedule = js.native
    @JSImport("@pulumi/aws", "autoscaling.Schedule.get")
    @js.native
    def get(name: String, id: Input[ID], state: ScheduleState): typingsSlinky.pulumiAws.scheduleMod.Schedule = js.native
    @JSImport("@pulumi/aws", "autoscaling.Schedule.get")
    @js.native
    def get(name: String, id: Input[ID], state: ScheduleState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.scheduleMod.Schedule = js.native
    
    /**
      * Returns true if the given object is an instance of Schedule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "autoscaling.Schedule.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/autoscaling/schedule.Schedule */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "autoscaling.TestNotification")
  @js.native
  def TestNotification: NotificationType = js.native
  @scala.inline
  def TestNotification_=(x: NotificationType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TestNotification")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "autoscaling.getGroup")
  @js.native
  def getGroup(args: GetGroupArgs): js.Promise[GetGroupResult] = js.native
  @JSImport("@pulumi/aws", "autoscaling.getGroup")
  @js.native
  def getGroup(args: GetGroupArgs, opts: InvokeOptions): js.Promise[GetGroupResult] = js.native
}
