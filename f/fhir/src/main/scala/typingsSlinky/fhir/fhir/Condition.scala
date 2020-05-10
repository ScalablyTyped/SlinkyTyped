package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Detailed information about conditions, problems or diagnoses
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait Condition extends DomainResource {
  /**
    * Contains extended information for property 'abatementBoolean'.
    */
  var _abatementBoolean: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'abatementDateTime'.
    */
  var _abatementDateTime: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'abatementString'.
    */
  var _abatementString: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'assertedDate'.
    */
  var _assertedDate: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'clinicalStatus'.
    */
  var _clinicalStatus: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'onsetDateTime'.
    */
  var _onsetDateTime: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'onsetString'.
    */
  var _onsetString: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'verificationStatus'.
    */
  var _verificationStatus: js.UndefOr[Element] = js.native
  /**
    * If/when in resolution/remission
    */
  var abatementAge: js.UndefOr[Age] = js.native
  /**
    * If/when in resolution/remission
    */
  var abatementBoolean: js.UndefOr[Boolean] = js.native
  /**
    * If/when in resolution/remission
    */
  var abatementDateTime: js.UndefOr[dateTime] = js.native
  /**
    * If/when in resolution/remission
    */
  var abatementPeriod: js.UndefOr[Period] = js.native
  /**
    * If/when in resolution/remission
    */
  var abatementRange: js.UndefOr[Range] = js.native
  /**
    * If/when in resolution/remission
    */
  var abatementString: js.UndefOr[String] = js.native
  /**
    * Date record was believed accurate
    */
  var assertedDate: js.UndefOr[dateTime] = js.native
  /**
    * Person who asserts this condition
    */
  var asserter: js.UndefOr[Reference] = js.native
  /**
    * Anatomical location, if relevant
    */
  var bodySite: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * problem-list-item | encounter-diagnosis
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * active | recurrence | inactive | remission | resolved
    */
  var clinicalStatus: js.UndefOr[code] = js.native
  /**
    * Identification of the condition, problem or diagnosis
    */
  var code: js.UndefOr[CodeableConcept] = js.native
  /**
    * Encounter or episode when condition first asserted
    */
  var context: js.UndefOr[Reference] = js.native
  /**
    * Supporting evidence
    */
  var evidence: js.UndefOr[js.Array[ConditionEvidence]] = js.native
  /**
    * External Ids for this condition
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * Additional information about the Condition
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  /**
    * Estimated or actual date,  date-time, or age
    */
  var onsetAge: js.UndefOr[Age] = js.native
  /**
    * Estimated or actual date,  date-time, or age
    */
  var onsetDateTime: js.UndefOr[dateTime] = js.native
  /**
    * Estimated or actual date,  date-time, or age
    */
  var onsetPeriod: js.UndefOr[Period] = js.native
  /**
    * Estimated or actual date,  date-time, or age
    */
  var onsetRange: js.UndefOr[Range] = js.native
  /**
    * Estimated or actual date,  date-time, or age
    */
  var onsetString: js.UndefOr[String] = js.native
  /**
    * Subjective severity of condition
    */
  var severity: js.UndefOr[CodeableConcept] = js.native
  /**
    * Stage/grade, usually assessed formally
    */
  var stage: js.UndefOr[ConditionStage] = js.native
  /**
    * Who has the condition?
    */
  var subject: Reference = js.native
  /**
    * provisional | differential | confirmed | refuted | entered-in-error | unknown
    */
  var verificationStatus: js.UndefOr[code] = js.native
}

object Condition {
  @scala.inline
  def apply(subject: Reference): Condition = {
    val __obj = js.Dynamic.literal(subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Condition]
  }
  @scala.inline
  implicit class ConditionOps[Self <: Condition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubject(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_abatementBoolean(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_abatementBoolean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_abatementBoolean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_abatementBoolean")(js.undefined)
        ret
    }
    @scala.inline
    def with_abatementDateTime(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_abatementDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_abatementDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_abatementDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def with_abatementString(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_abatementString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_abatementString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_abatementString")(js.undefined)
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
    def withAbatementAge(value: Age): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abatementAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbatementAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abatementAge")(js.undefined)
        ret
    }
    @scala.inline
    def withAbatementBoolean(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abatementBoolean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbatementBoolean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abatementBoolean")(js.undefined)
        ret
    }
    @scala.inline
    def withAbatementDateTime(value: dateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abatementDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbatementDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abatementDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withAbatementPeriod(value: Period): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abatementPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbatementPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abatementPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withAbatementRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abatementRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbatementRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abatementRange")(js.undefined)
        ret
    }
    @scala.inline
    def withAbatementString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abatementString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbatementString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abatementString")(js.undefined)
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
    def withBodySite(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodySite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodySite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodySite")(js.undefined)
        ret
    }
    @scala.inline
    def withCategory(value: js.Array[CodeableConcept]): Self = {
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
    def withContext(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withEvidence(value: js.Array[ConditionEvidence]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvidence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evidence")(js.undefined)
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
    def withSeverity(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("severity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeverity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("severity")(js.undefined)
        ret
    }
    @scala.inline
    def withStage(value: ConditionStage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stage")(js.undefined)
        ret
    }
    @scala.inline
    def withVerificationStatus(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verificationStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerificationStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verificationStatus")(js.undefined)
        ret
    }
  }
  
}

