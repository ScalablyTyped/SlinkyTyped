package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Action defined by the plan
  */
@js.native
trait PlanDefinitionAction extends BackboneElement {
  /**
    * Contains extended information for property 'cardinalityBehavior'.
    */
  var _cardinalityBehavior: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'goalId'.
    */
  var _goalId: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'groupingBehavior'.
    */
  var _groupingBehavior: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'label'.
    */
  var _label: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'precheckBehavior'.
    */
  var _precheckBehavior: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'requiredBehavior'.
    */
  var _requiredBehavior: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'selectionBehavior'.
    */
  var _selectionBehavior: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'textEquivalent'.
    */
  var _textEquivalent: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'timingDateTime'.
    */
  var _timingDateTime: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.native
  /**
    * A sub-action
    */
  var action: js.UndefOr[js.Array[PlanDefinitionAction]] = js.native
  /**
    * single | multiple
    */
  var cardinalityBehavior: js.UndefOr[code] = js.native
  /**
    * Code representing the meaning of the action or sub-actions
    */
  var code: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Whether or not the action is applicable
    */
  var condition: js.UndefOr[js.Array[PlanDefinitionActionCondition]] = js.native
  /**
    * Description of the activity to be performed
    */
  var definition: js.UndefOr[Reference] = js.native
  /**
    * Short description of the action
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Supporting documentation for the intended performer of the action
    */
  var documentation: js.UndefOr[js.Array[RelatedArtifact]] = js.native
  /**
    * Dynamic aspects of the definition
    */
  var dynamicValue: js.UndefOr[js.Array[PlanDefinitionActionDynamicValue]] = js.native
  /**
    * What goals this action supports
    */
  var goalId: js.UndefOr[js.Array[id]] = js.native
  /**
    * visual-group | logical-group | sentence-group
    */
  var groupingBehavior: js.UndefOr[code] = js.native
  /**
    * Input data requirements
    */
  var input: js.UndefOr[js.Array[DataRequirement]] = js.native
  /**
    * User-visible label for the action (e.g. 1. or A.)
    */
  var label: js.UndefOr[String] = js.native
  /**
    * Output data definition
    */
  var output: js.UndefOr[js.Array[DataRequirement]] = js.native
  /**
    * Who should participate in the action
    */
  var participant: js.UndefOr[js.Array[PlanDefinitionActionParticipant]] = js.native
  /**
    * yes | no
    */
  var precheckBehavior: js.UndefOr[code] = js.native
  /**
    * Why the action should be performed
    */
  var reason: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Relationship to another action
    */
  var relatedAction: js.UndefOr[js.Array[PlanDefinitionActionRelatedAction]] = js.native
  /**
    * must | could | must-unless-documented
    */
  var requiredBehavior: js.UndefOr[code] = js.native
  /**
    * any | all | all-or-none | exactly-one | at-most-one | one-or-more
    */
  var selectionBehavior: js.UndefOr[code] = js.native
  /**
    * Static text equivalent of the action, used if the dynamic aspects cannot be interpreted by the receiving system
    */
  var textEquivalent: js.UndefOr[String] = js.native
  /**
    * When the action should take place
    */
  var timingDateTime: js.UndefOr[dateTime] = js.native
  /**
    * When the action should take place
    */
  var timingDuration: js.UndefOr[Duration] = js.native
  /**
    * When the action should take place
    */
  var timingPeriod: js.UndefOr[Period] = js.native
  /**
    * When the action should take place
    */
  var timingRange: js.UndefOr[Range] = js.native
  /**
    * When the action should take place
    */
  var timingTiming: js.UndefOr[Timing] = js.native
  /**
    * User-visible title
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Transform to apply the template
    */
  var transform: js.UndefOr[Reference] = js.native
  /**
    * When the action should be triggered
    */
  var triggerDefinition: js.UndefOr[js.Array[TriggerDefinition]] = js.native
  /**
    * create | update | remove | fire-event
    */
  var `type`: js.UndefOr[Coding] = js.native
}

object PlanDefinitionAction {
  @scala.inline
  def apply(): PlanDefinitionAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlanDefinitionAction]
  }
  @scala.inline
  implicit class PlanDefinitionActionOps[Self <: PlanDefinitionAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_cardinalityBehavior(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_cardinalityBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_cardinalityBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_cardinalityBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def with_description(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_description: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_description")(js.undefined)
        ret
    }
    @scala.inline
    def with_goalId(value: js.Array[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_goalId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_goalId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_goalId")(js.undefined)
        ret
    }
    @scala.inline
    def with_groupingBehavior(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_groupingBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_groupingBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_groupingBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def with_label(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_label: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_label")(js.undefined)
        ret
    }
    @scala.inline
    def with_precheckBehavior(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_precheckBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_precheckBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_precheckBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def with_requiredBehavior(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_requiredBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_requiredBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_requiredBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def with_selectionBehavior(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_selectionBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_selectionBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_selectionBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def with_textEquivalent(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_textEquivalent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_textEquivalent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_textEquivalent")(js.undefined)
        ret
    }
    @scala.inline
    def with_timingDateTime(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_timingDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_timingDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_timingDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def with_title(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_title: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_title")(js.undefined)
        ret
    }
    @scala.inline
    def withAction(value: js.Array[PlanDefinitionAction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withCardinalityBehavior(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardinalityBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCardinalityBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardinalityBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withCode(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.undefined)
        ret
    }
    @scala.inline
    def withCondition(value: js.Array[PlanDefinitionActionCondition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(js.undefined)
        ret
    }
    @scala.inline
    def withDefinition(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefinition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definition")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentation(value: js.Array[RelatedArtifact]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentation")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamicValue(value: js.Array[PlanDefinitionActionDynamicValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamicValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicValue")(js.undefined)
        ret
    }
    @scala.inline
    def withGoalId(value: js.Array[id]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goalId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoalId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goalId")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupingBehavior(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupingBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupingBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupingBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withInput(value: js.Array[DataRequirement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withOutput(value: js.Array[DataRequirement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(js.undefined)
        ret
    }
    @scala.inline
    def withParticipant(value: js.Array[PlanDefinitionActionParticipant]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("participant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParticipant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("participant")(js.undefined)
        ret
    }
    @scala.inline
    def withPrecheckBehavior(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precheckBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrecheckBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precheckBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withReason(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(js.undefined)
        ret
    }
    @scala.inline
    def withRelatedAction(value: js.Array[PlanDefinitionActionRelatedAction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelatedAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedAction")(js.undefined)
        ret
    }
    @scala.inline
    def withRequiredBehavior(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequiredBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionBehavior(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withTextEquivalent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textEquivalent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextEquivalent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textEquivalent")(js.undefined)
        ret
    }
    @scala.inline
    def withTimingDateTime(value: dateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timingDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimingDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timingDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTimingDuration(value: Duration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timingDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimingDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timingDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withTimingPeriod(value: Period): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timingPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimingPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timingPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withTimingRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timingRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimingRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timingRange")(js.undefined)
        ret
    }
    @scala.inline
    def withTimingTiming(value: Timing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timingTiming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimingTiming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timingTiming")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerDefinition(value: js.Array[TriggerDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerDefinition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerDefinition")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: Coding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

