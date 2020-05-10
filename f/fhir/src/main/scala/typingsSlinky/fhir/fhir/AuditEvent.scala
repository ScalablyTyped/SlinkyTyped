package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Event record kept for security purposes
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait AuditEvent extends DomainResource {
  /**
    * Contains extended information for property 'action'.
    */
  var _action: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'outcome'.
    */
  var _outcome: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'outcomeDesc'.
    */
  var _outcomeDesc: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'recorded'.
    */
  var _recorded: js.UndefOr[Element] = js.native
  /**
    * Type of action performed during the event
    */
  var action: js.UndefOr[code] = js.native
  /**
    * Actor involved in the event
    */
  var agent: js.Array[AuditEventAgent] = js.native
  /**
    * Data or objects used
    */
  var entity: js.UndefOr[js.Array[AuditEventEntity]] = js.native
  /**
    * Whether the event succeeded or failed
    */
  var outcome: js.UndefOr[code] = js.native
  /**
    * Description of the event outcome
    */
  var outcomeDesc: js.UndefOr[String] = js.native
  /**
    * The purposeOfUse of the event
    */
  var purposeOfEvent: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Time when the event occurred on source
    */
  var recorded: instant = js.native
  /**
    * Audit Event Reporter
    */
  var source: AuditEventSource = js.native
  /**
    * More specific type/id for the event
    */
  var subtype: js.UndefOr[js.Array[Coding]] = js.native
  /**
    * Type/identifier of event
    */
  var `type`: Coding = js.native
}

object AuditEvent {
  @scala.inline
  def apply(agent: js.Array[AuditEventAgent], recorded: instant, source: AuditEventSource, `type`: Coding): AuditEvent = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], recorded = recorded.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditEvent]
  }
  @scala.inline
  implicit class AuditEventOps[Self <: AuditEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgent(value: js.Array[AuditEventAgent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecorded(value: instant): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recorded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: AuditEventSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Coding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_action(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_action: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_action")(js.undefined)
        ret
    }
    @scala.inline
    def with_outcome(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_outcome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_outcome: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_outcome")(js.undefined)
        ret
    }
    @scala.inline
    def with_outcomeDesc(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_outcomeDesc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_outcomeDesc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_outcomeDesc")(js.undefined)
        ret
    }
    @scala.inline
    def with_recorded(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_recorded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_recorded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_recorded")(js.undefined)
        ret
    }
    @scala.inline
    def withAction(value: code): Self = {
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
    def withEntity(value: js.Array[AuditEventEntity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entity")(js.undefined)
        ret
    }
    @scala.inline
    def withOutcome(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outcome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutcome: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outcome")(js.undefined)
        ret
    }
    @scala.inline
    def withOutcomeDesc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outcomeDesc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutcomeDesc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outcomeDesc")(js.undefined)
        ret
    }
    @scala.inline
    def withPurposeOfEvent(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purposeOfEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPurposeOfEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purposeOfEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtype(value: js.Array[Coding]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtype")(js.undefined)
        ret
    }
  }
  
}

