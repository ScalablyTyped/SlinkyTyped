package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of Diagnosis
  */
@js.native
trait ExplanationOfBenefitDiagnosis extends BackboneElement {
  /**
    * Contains extended information for property 'sequence'.
    */
  var _sequence: js.UndefOr[Element] = js.native
  /**
    * Patient's diagnosis
    */
  var diagnosisCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  /**
    * Patient's diagnosis
    */
  var diagnosisReference: js.UndefOr[Reference] = js.native
  /**
    * Package billing code
    */
  var packageCode: js.UndefOr[CodeableConcept] = js.native
  /**
    * Number to covey order of diagnosis
    */
  var sequence: positiveInt = js.native
  /**
    * Timing or nature of the diagnosis
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.native
}

object ExplanationOfBenefitDiagnosis {
  @scala.inline
  def apply(sequence: positiveInt): ExplanationOfBenefitDiagnosis = {
    val __obj = js.Dynamic.literal(sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplanationOfBenefitDiagnosis]
  }
  @scala.inline
  implicit class ExplanationOfBenefitDiagnosisOps[Self <: ExplanationOfBenefitDiagnosis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSequence(value: positiveInt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_sequence(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_sequence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_sequence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_sequence")(js.undefined)
        ret
    }
    @scala.inline
    def withDiagnosisCodeableConcept(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagnosisCodeableConcept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiagnosisCodeableConcept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagnosisCodeableConcept")(js.undefined)
        ret
    }
    @scala.inline
    def withDiagnosisReference(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagnosisReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiagnosisReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagnosisReference")(js.undefined)
        ret
    }
    @scala.inline
    def withPackageCode(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackageCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageCode")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: js.Array[CodeableConcept]): Self = {
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

