package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about patient's relatives, relevant for patient
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait FamilyMemberHistory extends DomainResource {
  /**
    * Contains extended information for property 'ageString'.
    */
  var _ageString: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'bornDate'.
    */
  var _bornDate: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'bornString'.
    */
  var _bornString: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'deceasedBoolean'.
    */
  var _deceasedBoolean: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'deceasedDate'.
    */
  var _deceasedDate: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'deceasedString'.
    */
  var _deceasedString: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'estimatedAge'.
    */
  var _estimatedAge: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'gender'.
    */
  var _gender: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'notDone'.
    */
  var _notDone: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * (approximate) age
    */
  var ageAge: js.UndefOr[Age] = js.native
  /**
    * (approximate) age
    */
  var ageRange: js.UndefOr[Range] = js.native
  /**
    * (approximate) age
    */
  var ageString: js.UndefOr[String] = js.native
  /**
    * (approximate) date of birth
    */
  var bornDate: js.UndefOr[date] = js.native
  /**
    * (approximate) date of birth
    */
  var bornPeriod: js.UndefOr[Period] = js.native
  /**
    * (approximate) date of birth
    */
  var bornString: js.UndefOr[String] = js.native
  /**
    * Condition that the related person had
    */
  var condition: js.UndefOr[js.Array[FamilyMemberHistoryCondition]] = js.native
  /**
    * When history was captured/updated
    */
  var date: js.UndefOr[dateTime] = js.native
  /**
    * Dead? How old/when?
    */
  var deceasedAge: js.UndefOr[Age] = js.native
  /**
    * Dead? How old/when?
    */
  var deceasedBoolean: js.UndefOr[Boolean] = js.native
  /**
    * Dead? How old/when?
    */
  var deceasedDate: js.UndefOr[date] = js.native
  /**
    * Dead? How old/when?
    */
  var deceasedRange: js.UndefOr[Range] = js.native
  /**
    * Dead? How old/when?
    */
  var deceasedString: js.UndefOr[String] = js.native
  /**
    * Instantiates protocol or definition
    */
  var definition: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Age is estimated?
    */
  var estimatedAge: js.UndefOr[Boolean] = js.native
  /**
    * male | female | other | unknown
    */
  var gender: js.UndefOr[code] = js.native
  /**
    * External Id(s) for this record
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * The family member described
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The taking of a family member's history did not occur
    */
  var notDone: js.UndefOr[Boolean] = js.native
  /**
    * subject-unknown | withheld | unable-to-obtain | deferred
    */
  var notDoneReason: js.UndefOr[CodeableConcept] = js.native
  /**
    * General note about related person
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  /**
    * Patient history is about
    */
  var patient: Reference = js.native
  /**
    * Why was family member history performed?
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Why was family member history performed?
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Relationship to the subject
    */
  var relationship: CodeableConcept = js.native
  /**
    * partial | completed | entered-in-error | health-unknown
    */
  var status: code = js.native
}

object FamilyMemberHistory {
  @scala.inline
  def apply(patient: Reference, relationship: CodeableConcept, status: code): FamilyMemberHistory = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], relationship = relationship.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[FamilyMemberHistory]
  }
  @scala.inline
  implicit class FamilyMemberHistoryOps[Self <: FamilyMemberHistory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPatient(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelationship(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationship")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_ageString(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_ageString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_ageString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_ageString")(js.undefined)
        ret
    }
    @scala.inline
    def with_bornDate(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_bornDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_bornDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_bornDate")(js.undefined)
        ret
    }
    @scala.inline
    def with_bornString(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_bornString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_bornString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_bornString")(js.undefined)
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
    def with_deceasedBoolean(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_deceasedBoolean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_deceasedBoolean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_deceasedBoolean")(js.undefined)
        ret
    }
    @scala.inline
    def with_deceasedDate(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_deceasedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_deceasedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_deceasedDate")(js.undefined)
        ret
    }
    @scala.inline
    def with_deceasedString(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_deceasedString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_deceasedString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_deceasedString")(js.undefined)
        ret
    }
    @scala.inline
    def with_estimatedAge(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_estimatedAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_estimatedAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_estimatedAge")(js.undefined)
        ret
    }
    @scala.inline
    def with_gender(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_gender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_gender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_gender")(js.undefined)
        ret
    }
    @scala.inline
    def with_name(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_name")(js.undefined)
        ret
    }
    @scala.inline
    def with_notDone(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_notDone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_notDone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_notDone")(js.undefined)
        ret
    }
    @scala.inline
    def with_status(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_status: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_status")(js.undefined)
        ret
    }
    @scala.inline
    def withAgeAge(value: Age): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ageAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgeAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ageAge")(js.undefined)
        ret
    }
    @scala.inline
    def withAgeRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ageRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgeRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ageRange")(js.undefined)
        ret
    }
    @scala.inline
    def withAgeString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ageString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgeString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ageString")(js.undefined)
        ret
    }
    @scala.inline
    def withBornDate(value: date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bornDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBornDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bornDate")(js.undefined)
        ret
    }
    @scala.inline
    def withBornPeriod(value: Period): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bornPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBornPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bornPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withBornString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bornString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBornString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bornString")(js.undefined)
        ret
    }
    @scala.inline
    def withCondition(value: js.Array[FamilyMemberHistoryCondition]): Self = {
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
    def withDeceasedAge(value: Age): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deceasedAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeceasedAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deceasedAge")(js.undefined)
        ret
    }
    @scala.inline
    def withDeceasedBoolean(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deceasedBoolean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeceasedBoolean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deceasedBoolean")(js.undefined)
        ret
    }
    @scala.inline
    def withDeceasedDate(value: date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deceasedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeceasedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deceasedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDeceasedRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deceasedRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeceasedRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deceasedRange")(js.undefined)
        ret
    }
    @scala.inline
    def withDeceasedString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deceasedString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeceasedString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deceasedString")(js.undefined)
        ret
    }
    @scala.inline
    def withDefinition(value: js.Array[Reference]): Self = {
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
    def withEstimatedAge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedAge")(js.undefined)
        ret
    }
    @scala.inline
    def withGender(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gender")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentifier(value: js.Array[Identifier]): Self = {
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNotDone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notDone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotDone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notDone")(js.undefined)
        ret
    }
    @scala.inline
    def withNotDoneReason(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notDoneReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotDoneReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notDoneReason")(js.undefined)
        ret
    }
    @scala.inline
    def withNote(value: js.Array[Annotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(js.undefined)
        ret
    }
    @scala.inline
    def withReasonCode(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReasonCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonCode")(js.undefined)
        ret
    }
    @scala.inline
    def withReasonReference(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReasonReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonReference")(js.undefined)
        ret
    }
  }
  
}

