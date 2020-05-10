package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTriggerRequest extends js.Object {
  /**
    * The actions initiated by this trigger when it fires.
    */
  var Actions: ActionList = js.native
  /**
    * A description of the new trigger.
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  /**
    * The name of the trigger.
    */
  var Name: NameString = js.native
  /**
    * A predicate to specify when the new trigger should fire. This field is required when the trigger type is CONDITIONAL.
    */
  var Predicate: js.UndefOr[typingsSlinky.awsSdk.glueMod.Predicate] = js.native
  /**
    * A cron expression used to specify the schedule (see Time-Based Schedules for Jobs and Crawlers. For example, to run something every day at 12:15 UTC, you would specify: cron(15 12 * * ? *). This field is required when the trigger type is SCHEDULED.
    */
  var Schedule: js.UndefOr[GenericString] = js.native
  /**
    * Set to true to start SCHEDULED and CONDITIONAL triggers when created. True is not supported for ON_DEMAND triggers.
    */
  var StartOnCreation: js.UndefOr[BooleanValue] = js.native
  /**
    * The tags to use with this trigger. You may use tags to limit access to the trigger. For more information about tags in AWS Glue, see AWS Tags in AWS Glue in the developer guide. 
    */
  var Tags: js.UndefOr[TagsMap] = js.native
  /**
    * The type of the new trigger.
    */
  var Type: TriggerType = js.native
  /**
    * The name of the workflow associated with the trigger.
    */
  var WorkflowName: js.UndefOr[NameString] = js.native
}

object CreateTriggerRequest {
  @scala.inline
  def apply(Actions: ActionList, Name: NameString, Type: TriggerType): CreateTriggerRequest = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTriggerRequest]
  }
  @scala.inline
  implicit class CreateTriggerRequestOps[Self <: CreateTriggerRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: ActionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: TriggerType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: DescriptionString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withPredicate(value: Predicate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Predicate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPredicate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Predicate")(js.undefined)
        ret
    }
    @scala.inline
    def withSchedule(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Schedule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchedule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Schedule")(js.undefined)
        ret
    }
    @scala.inline
    def withStartOnCreation(value: BooleanValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartOnCreation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartOnCreation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartOnCreation")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagsMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkflowName(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkflowName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkflowName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkflowName")(js.undefined)
        ret
    }
  }
  
}

