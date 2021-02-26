package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.glue.TriggerAction
import typingsSlinky.pulumiAws.outputMod.glue.TriggerPredicate
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object glueTriggerMod {
  
  @JSImport("@pulumi/aws/glue/trigger", "Trigger")
  @js.native
  class Trigger protected () extends CustomResource {
    /**
      * Create a Trigger resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: TriggerArgs) = this()
    def this(name: String, args: TriggerArgs, opts: CustomResourceOptions) = this()
    
    /**
      * List of actions initiated by this trigger when it fires. Defined below.
      */
    val actions: Output_[js.Array[TriggerAction]] = js.native
    
    /**
      * Amazon Resource Name (ARN) of Glue Trigger
      */
    val arn: Output_[String] = js.native
    
    /**
      * A description of the new trigger.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Start the trigger. Defaults to `true`. Not valid to disable for `ON_DEMAND` type.
      */
    val enabled: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The name of the trigger.
      */
    val name: Output_[String] = js.native
    
    /**
      * A predicate to specify when the new trigger should fire. Required when trigger type is `CONDITIONAL`. Defined below.
      */
    val predicate: Output_[js.UndefOr[TriggerPredicate]] = js.native
    
    /**
      * A cron expression used to specify the schedule. [Time-Based Schedules for Jobs and Crawlers](https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html)
      */
    val schedule: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The type of trigger. Valid values are `CONDITIONAL`, `ON_DEMAND`, and `SCHEDULED`.
      */
    val `type`: Output_[String] = js.native
    
    /**
      * A workflow to which the trigger should be associated to. Every workflow graph (DAG) needs a starting trigger (`ON_DEMAND` or `SCHEDULED` type) and can contain multiple additional `CONDITIONAL` triggers.
      */
    val workflowName: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object Trigger {
    
    /**
      * Get an existing Trigger resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/glue/trigger", "Trigger.get")
    @js.native
    def get(name: String, id: Input[ID]): Trigger = js.native
    @JSImport("@pulumi/aws/glue/trigger", "Trigger.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Trigger = js.native
    @JSImport("@pulumi/aws/glue/trigger", "Trigger.get")
    @js.native
    def get(name: String, id: Input[ID], state: TriggerState): Trigger = js.native
    @JSImport("@pulumi/aws/glue/trigger", "Trigger.get")
    @js.native
    def get(name: String, id: Input[ID], state: TriggerState, opts: CustomResourceOptions): Trigger = js.native
    
    /**
      * Returns true if the given object is an instance of Trigger.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/glue/trigger", "Trigger.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/trigger.Trigger */ Boolean = js.native
  }
  
  @js.native
  trait TriggerArgs extends StObject {
    
    /**
      * List of actions initiated by this trigger when it fires. Defined below.
      */
    val actions: Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.glue.TriggerAction]]] = js.native
    
    /**
      * A description of the new trigger.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * Start the trigger. Defaults to `true`. Not valid to disable for `ON_DEMAND` type.
      */
    val enabled: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The name of the trigger.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * A predicate to specify when the new trigger should fire. Required when trigger type is `CONDITIONAL`. Defined below.
      */
    val predicate: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.glue.TriggerPredicate]] = js.native
    
    /**
      * A cron expression used to specify the schedule. [Time-Based Schedules for Jobs and Crawlers](https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html)
      */
    val schedule: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The type of trigger. Valid values are `CONDITIONAL`, `ON_DEMAND`, and `SCHEDULED`.
      */
    val `type`: Input[String] = js.native
    
    /**
      * A workflow to which the trigger should be associated to. Every workflow graph (DAG) needs a starting trigger (`ON_DEMAND` or `SCHEDULED` type) and can contain multiple additional `CONDITIONAL` triggers.
      */
    val workflowName: js.UndefOr[Input[String]] = js.native
  }
  object TriggerArgs {
    
    @scala.inline
    def apply(
      actions: Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.glue.TriggerAction]]],
      `type`: Input[String]
    ): TriggerArgs = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TriggerArgs]
    }
    
    @scala.inline
    implicit class TriggerArgsMutableBuilder[Self <: TriggerArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.glue.TriggerAction]]]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.glue.TriggerAction]*): Self = StObject.set(x, "actions", js.Array(value :_*))
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPredicate(value: Input[typingsSlinky.pulumiAws.inputMod.glue.TriggerPredicate]): Self = StObject.set(x, "predicate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPredicateUndefined: Self = StObject.set(x, "predicate", js.undefined)
      
      @scala.inline
      def setSchedule(value: Input[String]): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkflowName(value: Input[String]): Self = StObject.set(x, "workflowName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkflowNameUndefined: Self = StObject.set(x, "workflowName", js.undefined)
    }
  }
  
  @js.native
  trait TriggerState extends StObject {
    
    /**
      * List of actions initiated by this trigger when it fires. Defined below.
      */
    val actions: js.UndefOr[Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.glue.TriggerAction]]]] = js.native
    
    /**
      * Amazon Resource Name (ARN) of Glue Trigger
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * A description of the new trigger.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * Start the trigger. Defaults to `true`. Not valid to disable for `ON_DEMAND` type.
      */
    val enabled: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The name of the trigger.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * A predicate to specify when the new trigger should fire. Required when trigger type is `CONDITIONAL`. Defined below.
      */
    val predicate: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.glue.TriggerPredicate]] = js.native
    
    /**
      * A cron expression used to specify the schedule. [Time-Based Schedules for Jobs and Crawlers](https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html)
      */
    val schedule: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The type of trigger. Valid values are `CONDITIONAL`, `ON_DEMAND`, and `SCHEDULED`.
      */
    val `type`: js.UndefOr[Input[String]] = js.native
    
    /**
      * A workflow to which the trigger should be associated to. Every workflow graph (DAG) needs a starting trigger (`ON_DEMAND` or `SCHEDULED` type) and can contain multiple additional `CONDITIONAL` triggers.
      */
    val workflowName: js.UndefOr[Input[String]] = js.native
  }
  object TriggerState {
    
    @scala.inline
    def apply(): TriggerState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TriggerState]
    }
    
    @scala.inline
    implicit class TriggerStateMutableBuilder[Self <: TriggerState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.glue.TriggerAction]]]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      @scala.inline
      def setActionsVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.glue.TriggerAction]*): Self = StObject.set(x, "actions", js.Array(value :_*))
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPredicate(value: Input[typingsSlinky.pulumiAws.inputMod.glue.TriggerPredicate]): Self = StObject.set(x, "predicate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPredicateUndefined: Self = StObject.set(x, "predicate", js.undefined)
      
      @scala.inline
      def setSchedule(value: Input[String]): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setWorkflowName(value: Input[String]): Self = StObject.set(x, "workflowName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkflowNameUndefined: Self = StObject.set(x, "workflowName", js.undefined)
    }
  }
}
