package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * How the medication is/was taken or should be taken
  */
@js.native
trait Dosage extends Element {
  /**
    * Contains extended information for property 'asNeededBoolean'.
    */
  var _asNeededBoolean: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'patientInstruction'.
    */
  var _patientInstruction: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'sequence'.
    */
  var _sequence: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'text'.
    */
  var _text: js.UndefOr[Element] = js.native
  /**
    * Supplemental instruction - e.g. "with meals"
    */
  var additionalInstruction: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Take "as needed" (for x)
    */
  var asNeededBoolean: js.UndefOr[Boolean] = js.native
  /**
    * Take "as needed" (for x)
    */
  var asNeededCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  /**
    * Amount of medication per dose
    */
  var doseQuantity: js.UndefOr[Quantity] = js.native
  /**
    * Amount of medication per dose
    */
  var doseRange: js.UndefOr[Range] = js.native
  /**
    * Upper limit on medication per administration
    */
  var maxDosePerAdministration: js.UndefOr[Quantity] = js.native
  /**
    * Upper limit on medication per lifetime of the patient
    */
  var maxDosePerLifetime: js.UndefOr[Quantity] = js.native
  /**
    * Upper limit on medication per unit of time
    */
  var maxDosePerPeriod: js.UndefOr[Ratio] = js.native
  /**
    * Technique for administering medication
    */
  var method: js.UndefOr[CodeableConcept] = js.native
  /**
    * Patient or consumer oriented instructions
    */
  var patientInstruction: js.UndefOr[String] = js.native
  /**
    * Amount of medication per unit of time
    */
  var rateQuantity: js.UndefOr[Quantity] = js.native
  /**
    * Amount of medication per unit of time
    */
  var rateRange: js.UndefOr[Range] = js.native
  /**
    * Amount of medication per unit of time
    */
  var rateRatio: js.UndefOr[Ratio] = js.native
  /**
    * How drug should enter body
    */
  var route: js.UndefOr[CodeableConcept] = js.native
  /**
    * The order of the dosage instructions
    */
  var sequence: js.UndefOr[integer] = js.native
  /**
    * Body site to administer to
    */
  var site: js.UndefOr[CodeableConcept] = js.native
  /**
    * Free text dosage instructions e.g. SIG
    */
  var text: js.UndefOr[String] = js.native
  /**
    * When medication should be administered
    */
  var timing: js.UndefOr[Timing] = js.native
}

object Dosage {
  @scala.inline
  def apply(): Dosage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dosage]
  }
  @scala.inline
  implicit class DosageOps[Self <: Dosage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_asNeededBoolean(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_asNeededBoolean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_asNeededBoolean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_asNeededBoolean")(js.undefined)
        ret
    }
    @scala.inline
    def with_patientInstruction(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_patientInstruction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_patientInstruction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_patientInstruction")(js.undefined)
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
    def with_text(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_text: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_text")(js.undefined)
        ret
    }
    @scala.inline
    def withAdditionalInstruction(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalInstruction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalInstruction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalInstruction")(js.undefined)
        ret
    }
    @scala.inline
    def withAsNeededBoolean(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asNeededBoolean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsNeededBoolean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asNeededBoolean")(js.undefined)
        ret
    }
    @scala.inline
    def withAsNeededCodeableConcept(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asNeededCodeableConcept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsNeededCodeableConcept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asNeededCodeableConcept")(js.undefined)
        ret
    }
    @scala.inline
    def withDoseQuantity(value: Quantity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doseQuantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoseQuantity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doseQuantity")(js.undefined)
        ret
    }
    @scala.inline
    def withDoseRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doseRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoseRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doseRange")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDosePerAdministration(value: Quantity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDosePerAdministration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDosePerAdministration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDosePerAdministration")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDosePerLifetime(value: Quantity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDosePerLifetime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDosePerLifetime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDosePerLifetime")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDosePerPeriod(value: Ratio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDosePerPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDosePerPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDosePerPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withPatientInstruction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patientInstruction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPatientInstruction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patientInstruction")(js.undefined)
        ret
    }
    @scala.inline
    def withRateQuantity(value: Quantity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rateQuantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRateQuantity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rateQuantity")(js.undefined)
        ret
    }
    @scala.inline
    def withRateRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rateRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRateRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rateRange")(js.undefined)
        ret
    }
    @scala.inline
    def withRateRatio(value: Ratio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rateRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRateRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rateRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withRoute(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("route")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("route")(js.undefined)
        ret
    }
    @scala.inline
    def withSequence(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSequence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequence")(js.undefined)
        ret
    }
    @scala.inline
    def withSite(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("site")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("site")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTiming(value: Timing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTiming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timing")(js.undefined)
        ret
    }
  }
  
}

