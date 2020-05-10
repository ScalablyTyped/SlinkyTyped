package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Diagnostic report - a combination of request information, atomic results, images, interpretation, as well as formatted reports
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait DiagnosticReport extends DomainResource {
  /**
    * Contains extended information for property 'conclusion'.
    */
  var _conclusion: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'effectiveDateTime'.
    */
  var _effectiveDateTime: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'issued'.
    */
  var _issued: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * What was requested
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Service category
    */
  var category: js.UndefOr[CodeableConcept] = js.native
  /**
    * Name/Code for this diagnostic report
    */
  var code: CodeableConcept = js.native
  /**
    * Codes for the conclusion
    */
  var codedDiagnosis: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Clinical Interpretation of test results
    */
  var conclusion: js.UndefOr[String] = js.native
  /**
    * Health care event when test ordered
    */
  var context: js.UndefOr[Reference] = js.native
  /**
    * Clinically relevant time/time-period for report
    */
  var effectiveDateTime: js.UndefOr[dateTime] = js.native
  /**
    * Clinically relevant time/time-period for report
    */
  var effectivePeriod: js.UndefOr[Period] = js.native
  /**
    * Business identifier for report
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * Key images associated with this report
    */
  var image: js.UndefOr[js.Array[DiagnosticReportImage]] = js.native
  /**
    * Reference to full details of imaging associated with the diagnostic report
    */
  var imagingStudy: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * DateTime this version was released
    */
  var issued: js.UndefOr[instant] = js.native
  /**
    * Participants in producing the report
    */
  var performer: js.UndefOr[js.Array[DiagnosticReportPerformer]] = js.native
  /**
    * Entire report as issued
    */
  var presentedForm: js.UndefOr[js.Array[Attachment]] = js.native
  /**
    * Observations - simple, or complex nested groups
    */
  var result: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Specimens this report is based on
    */
  var specimen: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * registered | partial | preliminary | final +
    */
  var status: code = js.native
  /**
    * The subject of the report - usually, but not always, the patient
    */
  var subject: js.UndefOr[Reference] = js.native
}

object DiagnosticReport {
  @scala.inline
  def apply(code: CodeableConcept, status: code): DiagnosticReport = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticReport]
  }
  @scala.inline
  implicit class DiagnosticReportOps[Self <: DiagnosticReport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_conclusion(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_conclusion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_conclusion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_conclusion")(js.undefined)
        ret
    }
    @scala.inline
    def with_effectiveDateTime(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_effectiveDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_effectiveDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_effectiveDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def with_issued(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_issued")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_issued: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_issued")(js.undefined)
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
    def withBasedOn(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basedOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasedOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basedOn")(js.undefined)
        ret
    }
    @scala.inline
    def withCategory(value: CodeableConcept): Self = {
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
    def withCodedDiagnosis(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codedDiagnosis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodedDiagnosis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codedDiagnosis")(js.undefined)
        ret
    }
    @scala.inline
    def withConclusion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conclusion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConclusion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conclusion")(js.undefined)
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
    def withEffectiveDateTime(value: dateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectiveDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffectiveDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectiveDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withEffectivePeriod(value: Period): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectivePeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffectivePeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectivePeriod")(js.undefined)
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
    def withImage(value: js.Array[DiagnosticReportImage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withImagingStudy(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagingStudy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImagingStudy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagingStudy")(js.undefined)
        ret
    }
    @scala.inline
    def withIssued(value: instant): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issued")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssued: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issued")(js.undefined)
        ret
    }
    @scala.inline
    def withPerformer(value: js.Array[DiagnosticReportPerformer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerformer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performer")(js.undefined)
        ret
    }
    @scala.inline
    def withPresentedForm(value: js.Array[Attachment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presentedForm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPresentedForm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presentedForm")(js.undefined)
        ret
    }
    @scala.inline
    def withResult(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(js.undefined)
        ret
    }
    @scala.inline
    def withSpecimen(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specimen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecimen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specimen")(js.undefined)
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
  }
  
}

