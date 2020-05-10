package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allergy or Intolerance (generally: Risk of adverse reaction to a substance)
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait AllergyIntolerance extends DomainResource {
  /**
    * Contains extended information for property 'assertedDate'.
    */
  var _assertedDate: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'category'.
    */
  var _category: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'clinicalStatus'.
    */
  var _clinicalStatus: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'criticality'.
    */
  var _criticality: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'lastOccurrence'.
    */
  var _lastOccurrence: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'onsetDateTime'.
    */
  var _onsetDateTime: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'onsetString'.
    */
  var _onsetString: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'verificationStatus'.
    */
  var _verificationStatus: js.UndefOr[Element] = js.native
  /**
    * Date record was believed accurate
    */
  var assertedDate: js.UndefOr[dateTime] = js.native
  /**
    * Source of the information about the allergy
    */
  var asserter: js.UndefOr[Reference] = js.native
  /**
    * food | medication | environment | biologic
    */
  var category: js.UndefOr[js.Array[code]] = js.native
  /**
    * active | inactive | resolved
    */
  var clinicalStatus: js.UndefOr[code] = js.native
  /**
    * Code that identifies the allergy or intolerance
    */
  var code: js.UndefOr[CodeableConcept] = js.native
  /**
    * low | high | unable-to-assess
    */
  var criticality: js.UndefOr[code] = js.native
  /**
    * External ids for this item
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * Date(/time) of last known occurrence of a reaction
    */
  var lastOccurrence: js.UndefOr[dateTime] = js.native
  /**
    * Additional text not captured in other fields
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  /**
    * When allergy or intolerance was identified
    */
  var onsetAge: js.UndefOr[Age] = js.native
  /**
    * When allergy or intolerance was identified
    */
  var onsetDateTime: js.UndefOr[dateTime] = js.native
  /**
    * When allergy or intolerance was identified
    */
  var onsetPeriod: js.UndefOr[Period] = js.native
  /**
    * When allergy or intolerance was identified
    */
  var onsetRange: js.UndefOr[Range] = js.native
  /**
    * When allergy or intolerance was identified
    */
  var onsetString: js.UndefOr[String] = js.native
  /**
    * Who the sensitivity is for
    */
  var patient: Reference = js.native
  /**
    * Adverse Reaction Events linked to exposure to substance
    */
  var reaction: js.UndefOr[js.Array[AllergyIntoleranceReaction]] = js.native
  /**
    * Who recorded the sensitivity
    */
  var recorder: js.UndefOr[Reference] = js.native
  /**
    * allergy | intolerance - Underlying mechanism (if known)
    */
  var `type`: js.UndefOr[code] = js.native
  /**
    * unconfirmed | confirmed | refuted | entered-in-error
    */
  var verificationStatus: code = js.native
}

object AllergyIntolerance {
  @scala.inline
  def apply(patient: Reference, verificationStatus: code): AllergyIntolerance = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], verificationStatus = verificationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllergyIntolerance]
  }
  @scala.inline
  implicit class AllergyIntoleranceOps[Self <: AllergyIntolerance] (val x: Self) extends AnyVal {
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
    def withVerificationStatus(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verificationStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_assertedDate(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_assertedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_assertedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_assertedDate")(js.undefined)
        ret
    }
    @scala.inline
    def with_category(value: js.Array[Element]): Self = {
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
    def with_clinicalStatus(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_clinicalStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_clinicalStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_clinicalStatus")(js.undefined)
        ret
    }
    @scala.inline
    def with_criticality(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_criticality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_criticality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_criticality")(js.undefined)
        ret
    }
    @scala.inline
    def with_lastOccurrence(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_lastOccurrence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_lastOccurrence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_lastOccurrence")(js.undefined)
        ret
    }
    @scala.inline
    def with_onsetDateTime(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_onsetDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_onsetDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_onsetDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def with_onsetString(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_onsetString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_onsetString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_onsetString")(js.undefined)
        ret
    }
    @scala.inline
    def with_type(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_type")(js.undefined)
        ret
    }
    @scala.inline
    def with_verificationStatus(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_verificationStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_verificationStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_verificationStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withAssertedDate(value: dateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assertedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssertedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assertedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withAsserter(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asserter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsserter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asserter")(js.undefined)
        ret
    }
    @scala.inline
    def withCategory(value: js.Array[code]): Self = {
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
    def withClinicalStatus(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clinicalStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClinicalStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clinicalStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withCode(value: CodeableConcept): Self = {
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
    def withCriticality(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("criticality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCriticality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("criticality")(js.undefined)
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
    def withLastOccurrence(value: dateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastOccurrence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastOccurrence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastOccurrence")(js.undefined)
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
    def withOnsetAge(value: Age): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsetAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnsetAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsetAge")(js.undefined)
        ret
    }
    @scala.inline
    def withOnsetDateTime(value: dateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsetDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnsetDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsetDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withOnsetPeriod(value: Period): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsetPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnsetPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsetPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withOnsetRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsetRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnsetRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsetRange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnsetString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsetString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnsetString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsetString")(js.undefined)
        ret
    }
    @scala.inline
    def withReaction(value: js.Array[AllergyIntoleranceReaction]): Self = {
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
    def withType(value: code): Self = {
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

