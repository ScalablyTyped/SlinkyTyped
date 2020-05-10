package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Exceptions, special considerations, the condition, situation, prior or concurrent issues
  */
@js.native
trait ExplanationOfBenefitInformation extends BackboneElement {
  /**
    * Contains extended information for property 'sequence'.
    */
  var _sequence: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'timingDate'.
    */
  var _timingDate: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueString'.
    */
  var _valueString: js.UndefOr[Element] = js.native
  /**
    * General class of information
    */
  var category: CodeableConcept = js.native
  /**
    * Type of information
    */
  var code: js.UndefOr[CodeableConcept] = js.native
  /**
    * Reason associated with the information
    */
  var reason: js.UndefOr[Coding] = js.native
  /**
    * Information instance identifier
    */
  var sequence: positiveInt = js.native
  /**
    * When it occurred
    */
  var timingDate: js.UndefOr[date] = js.native
  /**
    * When it occurred
    */
  var timingPeriod: js.UndefOr[Period] = js.native
  /**
    * Additional Data or supporting information
    */
  var valueAttachment: js.UndefOr[Attachment] = js.native
  /**
    * Additional Data or supporting information
    */
  var valueQuantity: js.UndefOr[Quantity] = js.native
  /**
    * Additional Data or supporting information
    */
  var valueReference: js.UndefOr[Reference] = js.native
  /**
    * Additional Data or supporting information
    */
  var valueString: js.UndefOr[String] = js.native
}

object ExplanationOfBenefitInformation {
  @scala.inline
  def apply(category: CodeableConcept, sequence: positiveInt): ExplanationOfBenefitInformation = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplanationOfBenefitInformation]
  }
  @scala.inline
  implicit class ExplanationOfBenefitInformationOps[Self <: ExplanationOfBenefitInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategory(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
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
    def with_timingDate(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_timingDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_timingDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_timingDate")(js.undefined)
        ret
    }
    @scala.inline
    def with_valueString(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_valueString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueString")(js.undefined)
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
    def withReason(value: Coding): Self = {
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
    def withTimingDate(value: date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timingDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimingDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timingDate")(js.undefined)
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
    def withValueAttachment(value: Attachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueAttachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueAttachment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueAttachment")(js.undefined)
        ret
    }
    @scala.inline
    def withValueQuantity(value: Quantity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueQuantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueQuantity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueQuantity")(js.undefined)
        ret
    }
    @scala.inline
    def withValueReference(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueReference")(js.undefined)
        ret
    }
    @scala.inline
    def withValueString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueString")(js.undefined)
        ret
    }
  }
  
}

