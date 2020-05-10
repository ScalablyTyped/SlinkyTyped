package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Medical care, research study or other healthcare event causing physical injury
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait AdverseEvent extends DomainResource {
  /**
    * Contains extended information for property 'category'.
    */
  var _category: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  /**
    * AE | PAE
    * An adverse event is an event that caused harm to a patient,  an adverse reaction is a something that is a subject-specific event that is a result of an exposure to a medication, food, device or environmental substance, a potential adverse event is something that occurred and that could have caused harm to a patient but did not
    */
  var category: js.UndefOr[code] = js.native
  /**
    * When the event occurred
    */
  var date: js.UndefOr[dateTime] = js.native
  /**
    * Description of the adverse event
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Who  was involved in the adverse event or the potential adverse event
    */
  var eventParticipant: js.UndefOr[Reference] = js.native
  /**
    * Business identifier for the event
    */
  var identifier: js.UndefOr[Identifier] = js.native
  /**
    * Location where adverse event occurred
    */
  var location: js.UndefOr[Reference] = js.native
  /**
    * resolved | recovering | ongoing | resolvedWithSequelae | fatal | unknown
    */
  var outcome: js.UndefOr[CodeableConcept] = js.native
  /**
    * Adverse Reaction Events linked to exposure to substance
    */
  var reaction: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Who recorded the adverse event
    */
  var recorder: js.UndefOr[Reference] = js.native
  /**
    * AdverseEvent.referenceDocument
    */
  var referenceDocument: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Mild | Moderate | Severe
    */
  var seriousness: js.UndefOr[CodeableConcept] = js.native
  /**
    * AdverseEvent.study
    */
  var study: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Subject or group impacted by event
    */
  var subject: js.UndefOr[Reference] = js.native
  /**
    * AdverseEvent.subjectMedicalHistory
    */
  var subjectMedicalHistory: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * The suspected agent causing the adverse event
    */
  var suspectEntity: js.UndefOr[js.Array[AdverseEventSuspectEntity]] = js.native
  /**
    * actual | potential
    */
  var `type`: js.UndefOr[CodeableConcept] = js.native
}

object AdverseEvent {
  @scala.inline
  def apply(): AdverseEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdverseEvent]
  }
  @scala.inline
  implicit class AdverseEventOps[Self <: AdverseEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_category(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_category: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_category")(js.undefined)
        ret
    }
    @scala.inline
    def with_date(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_date: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_date")(js.undefined)
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
    def withCategory(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(js.undefined)
        ret
    }
    @scala.inline
    def withDate(value: dateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.undefined)
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
    def withEventParticipant(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventParticipant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventParticipant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventParticipant")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentifier(value: Identifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withOutcome(value: CodeableConcept): Self = {
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
    def withReaction(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReaction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reaction")(js.undefined)
        ret
    }
    @scala.inline
    def withRecorder(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recorder")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceDocument(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceDocument")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriousness(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriousness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeriousness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriousness")(js.undefined)
        ret
    }
    @scala.inline
    def withStudy(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("study")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStudy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("study")(js.undefined)
        ret
    }
    @scala.inline
    def withSubject(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(js.undefined)
        ret
    }
    @scala.inline
    def withSubjectMedicalHistory(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subjectMedicalHistory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubjectMedicalHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subjectMedicalHistory")(js.undefined)
        ret
    }
    @scala.inline
    def withSuspectEntity(value: js.Array[AdverseEventSuspectEntity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspectEntity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuspectEntity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspectEntity")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: CodeableConcept): Self = {
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

