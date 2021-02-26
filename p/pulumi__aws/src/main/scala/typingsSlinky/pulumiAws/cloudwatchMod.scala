package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.dashboardMod.DashboardArgs
import typingsSlinky.pulumiAws.dashboardMod.DashboardState
import typingsSlinky.pulumiAws.eventBusMod.EventBusArgs
import typingsSlinky.pulumiAws.eventBusMod.EventBusState
import typingsSlinky.pulumiAws.eventPermissionMod.EventPermissionArgs
import typingsSlinky.pulumiAws.eventPermissionMod.EventPermissionState
import typingsSlinky.pulumiAws.eventRuleMixinsMod.EventRuleEventHandler
import typingsSlinky.pulumiAws.eventRuleMixinsMod.EventRuleEventSubscriptionArgs
import typingsSlinky.pulumiAws.eventRuleMod.EventRuleArgs
import typingsSlinky.pulumiAws.eventRuleMod.EventRuleState
import typingsSlinky.pulumiAws.eventTargetMod.EventTargetArgs
import typingsSlinky.pulumiAws.eventTargetMod.EventTargetState
import typingsSlinky.pulumiAws.getLogGroupMod.GetLogGroupArgs
import typingsSlinky.pulumiAws.getLogGroupMod.GetLogGroupResult
import typingsSlinky.pulumiAws.lambdaMixinsMod.Callback
import typingsSlinky.pulumiAws.logDestinationMod.LogDestinationArgs
import typingsSlinky.pulumiAws.logDestinationMod.LogDestinationState
import typingsSlinky.pulumiAws.logDestinationPolicyMod.LogDestinationPolicyArgs
import typingsSlinky.pulumiAws.logDestinationPolicyMod.LogDestinationPolicyState
import typingsSlinky.pulumiAws.logGroupMixinsMod.DecodedLogGroupEvent
import typingsSlinky.pulumiAws.logGroupMixinsMod.LogGroupEventHandler
import typingsSlinky.pulumiAws.logGroupMixinsMod.LogGroupEventSubscriptionArgs
import typingsSlinky.pulumiAws.logGroupMod.LogGroupArgs
import typingsSlinky.pulumiAws.logGroupMod.LogGroupState
import typingsSlinky.pulumiAws.logMetricFilterMod.LogMetricFilterArgs
import typingsSlinky.pulumiAws.logMetricFilterMod.LogMetricFilterState
import typingsSlinky.pulumiAws.logResourcePolicyMod.LogResourcePolicyArgs
import typingsSlinky.pulumiAws.logResourcePolicyMod.LogResourcePolicyState
import typingsSlinky.pulumiAws.logStreamMod.LogStreamArgs
import typingsSlinky.pulumiAws.logStreamMod.LogStreamState
import typingsSlinky.pulumiAws.logSubscriptionFilterMod.LogSubscriptionFilterArgs
import typingsSlinky.pulumiAws.logSubscriptionFilterMod.LogSubscriptionFilterState
import typingsSlinky.pulumiAws.metricAlarmMod.MetricAlarmArgs
import typingsSlinky.pulumiAws.metricAlarmMod.MetricAlarmState
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.ComponentResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudwatchMod {
  
  @JSImport("@pulumi/aws/cloudwatch", "Dashboard")
  @js.native
  class Dashboard protected ()
    extends typingsSlinky.pulumiAws.dashboardMod.Dashboard {
    /**
      * Create a Dashboard resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DashboardArgs) = this()
    def this(name: String, args: DashboardArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Dashboard {
    
    /**
      * Get an existing Dashboard resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cloudwatch", "Dashboard.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.dashboardMod.Dashboard = js.native
    @JSImport("@pulumi/aws/cloudwatch", "Dashboard.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.dashboardMod.Dashboard = js.native
    @JSImport("@pulumi/aws/cloudwatch", "Dashboard.get")
    @js.native
    def get(name: String, id: Input[ID], state: DashboardState): typingsSlinky.pulumiAws.dashboardMod.Dashboard = js.native
    @JSImport("@pulumi/aws/cloudwatch", "Dashboard.get")
    @js.native
    def get(name: String, id: Input[ID], state: DashboardState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.dashboardMod.Dashboard = js.native
    
    /**
      * Returns true if the given object is an instance of Dashboard.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cloudwatch", "Dashboard.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/dashboard.Dashboard */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/cloudwatch", "EventBus")
  @js.native
  class EventBus protected ()
    extends typingsSlinky.pulumiAws.eventBusMod.EventBus {
    /**
      * Create a EventBus resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: EventBusArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: EventBusArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object EventBus {
    
    /**
      * Get an existing EventBus resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cloudwatch", "EventBus.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.eventBusMod.EventBus = js.native
    @JSImport("@pulumi/aws/cloudwatch", "EventBus.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.eventBusMod.EventBus = js.native
    @JSImport("@pulumi/aws/cloudwatch", "EventBus.get")
    @js.native
    def get(name: String, id: Input[ID], state: EventBusState): typingsSlinky.pulumiAws.eventBusMod.EventBus = js.native
    @JSImport("@pulumi/aws/cloudwatch", "EventBus.get")
    @js.native
    def get(name: String, id: Input[ID], state: EventBusState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.eventBusMod.EventBus = js.native
    
    /**
      * Returns true if the given object is an instance of EventBus.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cloudwatch", "EventBus.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/eventBus.EventBus */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/cloudwatch", "EventPermission")
  @js.native
  class EventPermission protected ()
    extends typingsSlinky.pulumiAws.eventPermissionMod.EventPermission {
    /**
      * Create a EventPermission resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EventPermissionArgs) = this()
    def this(name: String, args: EventPermissionArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object EventPermission {
    
    /**
      * Get an existing EventPermission resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cloudwatch", "EventPermission.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.eventPermissionMod.EventPermission = js.native
    @JSImport("@pulumi/aws/cloudwatch", "EventPermission.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.eventPermissionMod.EventPermission = js.native
    @JSImport("@pulumi/aws/cloudwatch", "EventPermission.get")
    @js.native
    def get(name: String, id: Input[ID], state: EventPermissionState): typingsSlinky.pulumiAws.eventPermissionMod.EventPermission = js.native
    @JSImport("@pulumi/aws/cloudwatch", "EventPermission.get")
    @js.native
    def get(name: String, id: Input[ID], state: EventPermissionState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.eventPermissionMod.EventPermission = js.native
    
    /**
      * Returns true if the given object is an instance of EventPermission.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cloudwatch", "EventPermission.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/eventPermission.EventPermission */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/cloudwatch", "EventRule")
  @js.native
  class EventRule protected ()
    extends typingsSlinky.pulumiAws.eventRuleMod.EventRule {
    /**
      * Create a EventRule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: EventRuleArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: EventRuleArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object EventRule {
    
    /**
      * Get an existing EventRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cloudwatch", "EventRule.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.eventRuleMod.EventRule = js.native
    @JSImport("@pulumi/aws/cloudwatch", "EventRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.eventRuleMod.EventRule = js.native
    @JSImport("@pulumi/aws/cloudwatch", "EventRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: EventRuleState): typingsSlinky.pulumiAws.eventRuleMod.EventRule = js.native
    @JSImport("@pulumi/aws/cloudwatch", "EventRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: EventRuleState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.eventRuleMod.EventRule = js.native
    
    /**
      * Returns true if the given object is an instance of EventRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cloudwatch", "EventRule.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/eventRule.EventRule */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/cloudwatch", "EventRuleEventSubscription")
  @js.native
  class EventRuleEventSubscription protected ()
    extends typingsSlinky.pulumiAws.eventRuleMixinsMod.EventRuleEventSubscription {
    def this(name: String, eventRuleOrSchedule: String, handler: EventRuleEventHandler) = this()
    def this(
      name: String,
      eventRuleOrSchedule: typingsSlinky.pulumiAws.eventRuleMod.EventRule,
      handler: EventRuleEventHandler
    ) = this()
    def this(
      name: String,
      eventRuleOrSchedule: String,
      handler: EventRuleEventHandler,
      args: EventRuleEventSubscriptionArgs
    ) = this()
    def this(
      name: String,
      eventRuleOrSchedule: typingsSlinky.pulumiAws.eventRuleMod.EventRule,
      handler: EventRuleEventHandler,
      args: EventRuleEventSubscriptionArgs
    ) = this()
    def this(
      name: String,
      eventRuleOrSchedule: String,
      handler: EventRuleEventHandler,
      args: js.UndefOr[scala.Nothing],
      opts: ComponentResourceOptions
    ) = this()
    def this(
      name: String,
      eventRuleOrSchedule: String,
      handler: EventRuleEventHandler,
      args: EventRuleEventSubscriptionArgs,
      opts: ComponentResourceOptions
    ) = this()
    def this(
      name: String,
      eventRuleOrSchedule: typingsSlinky.pulumiAws.eventRuleMod.EventRule,
      handler: EventRuleEventHandler,
      args: js.UndefOr[scala.Nothing],
      opts: ComponentResourceOptions
    ) = this()
    def this(
      name: String,
      eventRuleOrSchedule: typingsSlinky.pulumiAws.eventRuleMod.EventRule,
      handler: EventRuleEventHandler,
      args: EventRuleEventSubscriptionArgs,
      opts: ComponentResourceOptions
    ) = this()
  }
  
  @JSImport("@pulumi/aws/cloudwatch", "EventTarget")
  @js.native
  class EventTarget protected ()
    extends typingsSlinky.pulumiAws.eventTargetMod.EventTarget {
    /**
      * Create a EventTarget resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EventTargetArgs) = this()
    def this(name: String, args: EventTargetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object EventTarget {
    
    /**
      * Get an existing EventTarget resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cloudwatch", "EventTarget.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.eventTargetMod.EventTarget = js.native
    @JSImport("@pulumi/aws/cloudwatch", "EventTarget.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.eventTargetMod.EventTarget = js.native
    @JSImport("@pulumi/aws/cloudwatch", "EventTarget.get")
    @js.native
    def get(name: String, id: Input[ID], state: EventTargetState): typingsSlinky.pulumiAws.eventTargetMod.EventTarget = js.native
    @JSImport("@pulumi/aws/cloudwatch", "EventTarget.get")
    @js.native
    def get(name: String, id: Input[ID], state: EventTargetState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.eventTargetMod.EventTarget = js.native
    
    /**
      * Returns true if the given object is an instance of EventTarget.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cloudwatch", "EventTarget.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/eventTarget.EventTarget */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/cloudwatch", "LogDestination")
  @js.native
  class LogDestination protected ()
    extends typingsSlinky.pulumiAws.logDestinationMod.LogDestination {
    /**
      * Create a LogDestination resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LogDestinationArgs) = this()
    def this(name: String, args: LogDestinationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object LogDestination {
    
    /**
      * Get an existing LogDestination resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cloudwatch", "LogDestination.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.logDestinationMod.LogDestination = js.native
    @JSImport("@pulumi/aws/cloudwatch", "LogDestination.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.logDestinationMod.LogDestination = js.native
    @JSImport("@pulumi/aws/cloudwatch", "LogDestination.get")
    @js.native
    def get(name: String, id: Input[ID], state: LogDestinationState): typingsSlinky.pulumiAws.logDestinationMod.LogDestination = js.native
    @JSImport("@pulumi/aws/cloudwatch", "LogDestination.get")
    @js.native
    def get(name: String, id: Input[ID], state: LogDestinationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.logDestinationMod.LogDestination = js.native
    
    /**
      * Returns true if the given object is an instance of LogDestination.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cloudwatch", "LogDestination.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/logDestination.LogDestination */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/cloudwatch", "LogDestinationPolicy")
  @js.native
  class LogDestinationPolicy protected ()
    extends typingsSlinky.pulumiAws.logDestinationPolicyMod.LogDestinationPolicy {
    /**
      * Create a LogDestinationPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LogDestinationPolicyArgs) = this()
    def this(name: String, args: LogDestinationPolicyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object LogDestinationPolicy {
    
    /**
      * Get an existing LogDestinationPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cloudwatch", "LogDestinationPolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.logDestinationPolicyMod.LogDestinationPolicy = js.native
    @JSImport("@pulumi/aws/cloudwatch", "LogDestinationPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.logDestinationPolicyMod.LogDestinationPolicy = js.native
    @JSImport("@pulumi/aws/cloudwatch", "LogDestinationPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: LogDestinationPolicyState): typingsSlinky.pulumiAws.logDestinationPolicyMod.LogDestinationPolicy = js.native
    @JSImport("@pulumi/aws/cloudwatch", "LogDestinationPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: LogDestinationPolicyState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.logDestinationPolicyMod.LogDestinationPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of LogDestinationPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cloudwatch", "LogDestinationPolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/logDestinationPolicy.LogDestinationPolicy */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/cloudwatch", "LogGroup")
  @js.native
  class LogGroup protected ()
    extends typingsSlinky.pulumiAws.logGroupMod.LogGroup {
    /**
      * Create a LogGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: LogGroupArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: LogGroupArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object LogGroup {
    
    /**
      * Get an existing LogGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cloudwatch", "LogGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.logGroupMod.LogGroup = js.native
    @JSImport("@pulumi/aws/cloudwatch", "LogGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.logGroupMod.LogGroup = js.native
    @JSImport("@pulumi/aws/cloudwatch", "LogGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: LogGroupState): typingsSlinky.pulumiAws.logGroupMod.LogGroup = js.native
    @JSImport("@pulumi/aws/cloudwatch", "LogGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: LogGroupState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.logGroupMod.LogGroup = js.native
    
    /**
      * Returns true if the given object is an instance of LogGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cloudwatch", "LogGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/logGroup.LogGroup */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/cloudwatch", "LogGroupEventSubscription")
  @js.native
  class LogGroupEventSubscription protected ()
    extends typingsSlinky.pulumiAws.logGroupMixinsMod.LogGroupEventSubscription {
    def this(
      name: String,
      logGroup: typingsSlinky.pulumiAws.logGroupMod.LogGroup,
      handler: LogGroupEventHandler
    ) = this()
    def this(
      name: String,
      logGroup: typingsSlinky.pulumiAws.logGroupMod.LogGroup,
      handler: LogGroupEventHandler,
      args: LogGroupEventSubscriptionArgs
    ) = this()
    def this(
      name: String,
      logGroup: typingsSlinky.pulumiAws.logGroupMod.LogGroup,
      handler: LogGroupEventHandler,
      args: js.UndefOr[scala.Nothing],
      opts: ComponentResourceOptions
    ) = this()
    def this(
      name: String,
      logGroup: typingsSlinky.pulumiAws.logGroupMod.LogGroup,
      handler: LogGroupEventHandler,
      args: LogGroupEventSubscriptionArgs,
      opts: ComponentResourceOptions
    ) = this()
  }
  
  @JSImport("@pulumi/aws/cloudwatch", "LogMetricFilter")
  @js.native
  class LogMetricFilter protected ()
    extends typingsSlinky.pulumiAws.logMetricFilterMod.LogMetricFilter {
    /**
      * Create a LogMetricFilter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LogMetricFilterArgs) = this()
    def this(name: String, args: LogMetricFilterArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object LogMetricFilter {
    
    /**
      * Get an existing LogMetricFilter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cloudwatch", "LogMetricFilter.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.logMetricFilterMod.LogMetricFilter = js.native
    @JSImport("@pulumi/aws/cloudwatch", "LogMetricFilter.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.logMetricFilterMod.LogMetricFilter = js.native
    @JSImport("@pulumi/aws/cloudwatch", "LogMetricFilter.get")
    @js.native
    def get(name: String, id: Input[ID], state: LogMetricFilterState): typingsSlinky.pulumiAws.logMetricFilterMod.LogMetricFilter = js.native
    @JSImport("@pulumi/aws/cloudwatch", "LogMetricFilter.get")
    @js.native
    def get(name: String, id: Input[ID], state: LogMetricFilterState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.logMetricFilterMod.LogMetricFilter = js.native
    
    /**
      * Returns true if the given object is an instance of LogMetricFilter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cloudwatch", "LogMetricFilter.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/logMetricFilter.LogMetricFilter */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/cloudwatch", "LogResourcePolicy")
  @js.native
  class LogResourcePolicy protected ()
    extends typingsSlinky.pulumiAws.logResourcePolicyMod.LogResourcePolicy {
    /**
      * Create a LogResourcePolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LogResourcePolicyArgs) = this()
    def this(name: String, args: LogResourcePolicyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object LogResourcePolicy {
    
    /**
      * Get an existing LogResourcePolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cloudwatch", "LogResourcePolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.logResourcePolicyMod.LogResourcePolicy = js.native
    @JSImport("@pulumi/aws/cloudwatch", "LogResourcePolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.logResourcePolicyMod.LogResourcePolicy = js.native
    @JSImport("@pulumi/aws/cloudwatch", "LogResourcePolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: LogResourcePolicyState): typingsSlinky.pulumiAws.logResourcePolicyMod.LogResourcePolicy = js.native
    @JSImport("@pulumi/aws/cloudwatch", "LogResourcePolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: LogResourcePolicyState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.logResourcePolicyMod.LogResourcePolicy = js.native
    
    /**
      * Returns true if the given object is an instance of LogResourcePolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cloudwatch", "LogResourcePolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/logResourcePolicy.LogResourcePolicy */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/cloudwatch", "LogStream")
  @js.native
  class LogStream protected ()
    extends typingsSlinky.pulumiAws.logStreamMod.LogStream {
    /**
      * Create a LogStream resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LogStreamArgs) = this()
    def this(name: String, args: LogStreamArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object LogStream {
    
    /**
      * Get an existing LogStream resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cloudwatch", "LogStream.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.logStreamMod.LogStream = js.native
    @JSImport("@pulumi/aws/cloudwatch", "LogStream.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.logStreamMod.LogStream = js.native
    @JSImport("@pulumi/aws/cloudwatch", "LogStream.get")
    @js.native
    def get(name: String, id: Input[ID], state: LogStreamState): typingsSlinky.pulumiAws.logStreamMod.LogStream = js.native
    @JSImport("@pulumi/aws/cloudwatch", "LogStream.get")
    @js.native
    def get(name: String, id: Input[ID], state: LogStreamState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.logStreamMod.LogStream = js.native
    
    /**
      * Returns true if the given object is an instance of LogStream.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cloudwatch", "LogStream.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/logStream.LogStream */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/cloudwatch", "LogSubscriptionFilter")
  @js.native
  class LogSubscriptionFilter protected ()
    extends typingsSlinky.pulumiAws.logSubscriptionFilterMod.LogSubscriptionFilter {
    /**
      * Create a LogSubscriptionFilter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LogSubscriptionFilterArgs) = this()
    def this(name: String, args: LogSubscriptionFilterArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object LogSubscriptionFilter {
    
    /**
      * Get an existing LogSubscriptionFilter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cloudwatch", "LogSubscriptionFilter.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.logSubscriptionFilterMod.LogSubscriptionFilter = js.native
    @JSImport("@pulumi/aws/cloudwatch", "LogSubscriptionFilter.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.logSubscriptionFilterMod.LogSubscriptionFilter = js.native
    @JSImport("@pulumi/aws/cloudwatch", "LogSubscriptionFilter.get")
    @js.native
    def get(name: String, id: Input[ID], state: LogSubscriptionFilterState): typingsSlinky.pulumiAws.logSubscriptionFilterMod.LogSubscriptionFilter = js.native
    @JSImport("@pulumi/aws/cloudwatch", "LogSubscriptionFilter.get")
    @js.native
    def get(name: String, id: Input[ID], state: LogSubscriptionFilterState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.logSubscriptionFilterMod.LogSubscriptionFilter = js.native
    
    /**
      * Returns true if the given object is an instance of LogSubscriptionFilter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cloudwatch", "LogSubscriptionFilter.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/logSubscriptionFilter.LogSubscriptionFilter */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/cloudwatch", "MetricAlarm")
  @js.native
  class MetricAlarm protected ()
    extends typingsSlinky.pulumiAws.metricAlarmMod.MetricAlarm {
    /**
      * Create a MetricAlarm resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: MetricAlarmArgs) = this()
    def this(name: String, args: MetricAlarmArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object MetricAlarm {
    
    /**
      * Get an existing MetricAlarm resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cloudwatch", "MetricAlarm.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.metricAlarmMod.MetricAlarm = js.native
    @JSImport("@pulumi/aws/cloudwatch", "MetricAlarm.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.metricAlarmMod.MetricAlarm = js.native
    @JSImport("@pulumi/aws/cloudwatch", "MetricAlarm.get")
    @js.native
    def get(name: String, id: Input[ID], state: MetricAlarmState): typingsSlinky.pulumiAws.metricAlarmMod.MetricAlarm = js.native
    @JSImport("@pulumi/aws/cloudwatch", "MetricAlarm.get")
    @js.native
    def get(name: String, id: Input[ID], state: MetricAlarmState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.metricAlarmMod.MetricAlarm = js.native
    
    /**
      * Returns true if the given object is an instance of MetricAlarm.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cloudwatch", "MetricAlarm.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/metricAlarm.MetricAlarm */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/cloudwatch", "getLogGroup")
  @js.native
  def getLogGroup(args: GetLogGroupArgs): js.Promise[GetLogGroupResult] = js.native
  @JSImport("@pulumi/aws/cloudwatch", "getLogGroup")
  @js.native
  def getLogGroup(args: GetLogGroupArgs, opts: InvokeOptions): js.Promise[GetLogGroupResult] = js.native
  
  @JSImport("@pulumi/aws/cloudwatch", "onSchedule")
  @js.native
  def onSchedule(name: String, schedule: String, handler: EventRuleEventHandler): typingsSlinky.pulumiAws.eventRuleMixinsMod.EventRuleEventSubscription = js.native
  @JSImport("@pulumi/aws/cloudwatch", "onSchedule")
  @js.native
  def onSchedule(
    name: String,
    schedule: String,
    handler: EventRuleEventHandler,
    args: js.UndefOr[scala.Nothing],
    opts: ComponentResourceOptions
  ): typingsSlinky.pulumiAws.eventRuleMixinsMod.EventRuleEventSubscription = js.native
  @JSImport("@pulumi/aws/cloudwatch", "onSchedule")
  @js.native
  def onSchedule(
    name: String,
    schedule: String,
    handler: EventRuleEventHandler,
    args: EventRuleEventSubscriptionArgs
  ): typingsSlinky.pulumiAws.eventRuleMixinsMod.EventRuleEventSubscription = js.native
  @JSImport("@pulumi/aws/cloudwatch", "onSchedule")
  @js.native
  def onSchedule(
    name: String,
    schedule: String,
    handler: EventRuleEventHandler,
    args: EventRuleEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ): typingsSlinky.pulumiAws.eventRuleMixinsMod.EventRuleEventSubscription = js.native
  
  /* augmented module */
  object pulumiAwsCloudwatchEventRuleAugmentingMod {
    
    @js.native
    trait EventRule extends StObject {
      
      /**
        * Creates a new subscription to events fired from this EventRule to the handler provided, along
        * with options to control the behavior of the subscription.
        */
      def onEvent(name: String, handler: EventRuleEventHandler): typingsSlinky.pulumiAws.eventRuleMixinsMod.EventRuleEventSubscription = js.native
      def onEvent(
        name: String,
        handler: EventRuleEventHandler,
        args: js.UndefOr[scala.Nothing],
        opts: ComponentResourceOptions
      ): typingsSlinky.pulumiAws.eventRuleMixinsMod.EventRuleEventSubscription = js.native
      def onEvent(name: String, handler: EventRuleEventHandler, args: EventRuleEventSubscriptionArgs): typingsSlinky.pulumiAws.eventRuleMixinsMod.EventRuleEventSubscription = js.native
      def onEvent(
        name: String,
        handler: EventRuleEventHandler,
        args: EventRuleEventSubscriptionArgs,
        opts: ComponentResourceOptions
      ): typingsSlinky.pulumiAws.eventRuleMixinsMod.EventRuleEventSubscription = js.native
    }
  }
  
  /* augmented module */
  object pulumiAwsCloudwatchLogGroupAugmentingMod {
    
    @js.native
    trait LogGroup extends StObject {
      
      /**
        * Creates a new subscription to events fired from this LogGroup to the callback provided,
        * along with options to control the behavior of the subscription.
        *
        * The events will be provided in their decoded form.  Because this event hookup needs to
        * execute code to convert the raw messages, it can only be passed an [EntryPoint] callback,
        * not a [lambda.Function] instance.
        */
      def onDecodedEvent(name: String, callback: Callback[DecodedLogGroupEvent, Unit]): typingsSlinky.pulumiAws.logGroupMixinsMod.LogGroupEventSubscription = js.native
      def onDecodedEvent(
        name: String,
        callback: Callback[DecodedLogGroupEvent, Unit],
        args: js.UndefOr[scala.Nothing],
        opts: ComponentResourceOptions
      ): typingsSlinky.pulumiAws.logGroupMixinsMod.LogGroupEventSubscription = js.native
      def onDecodedEvent(name: String, callback: Callback[DecodedLogGroupEvent, Unit], args: LogGroupEventSubscriptionArgs): typingsSlinky.pulumiAws.logGroupMixinsMod.LogGroupEventSubscription = js.native
      def onDecodedEvent(
        name: String,
        callback: Callback[DecodedLogGroupEvent, Unit],
        args: LogGroupEventSubscriptionArgs,
        opts: ComponentResourceOptions
      ): typingsSlinky.pulumiAws.logGroupMixinsMod.LogGroupEventSubscription = js.native
      
      /**
        * Creates a new subscription to events fired from this LogGroup to the handler provided,
        * along with options to control the behavior of the subscription.
        *
        * The events will be produced in raw (gzipped + base64 encoded) form.
        */
      def onEvent(name: String, handler: LogGroupEventHandler): typingsSlinky.pulumiAws.logGroupMixinsMod.LogGroupEventSubscription = js.native
      def onEvent(
        name: String,
        handler: LogGroupEventHandler,
        args: js.UndefOr[scala.Nothing],
        opts: ComponentResourceOptions
      ): typingsSlinky.pulumiAws.logGroupMixinsMod.LogGroupEventSubscription = js.native
      def onEvent(name: String, handler: LogGroupEventHandler, args: LogGroupEventSubscriptionArgs): typingsSlinky.pulumiAws.logGroupMixinsMod.LogGroupEventSubscription = js.native
      def onEvent(
        name: String,
        handler: LogGroupEventHandler,
        args: LogGroupEventSubscriptionArgs,
        opts: ComponentResourceOptions
      ): typingsSlinky.pulumiAws.logGroupMixinsMod.LogGroupEventSubscription = js.native
    }
  }
}
