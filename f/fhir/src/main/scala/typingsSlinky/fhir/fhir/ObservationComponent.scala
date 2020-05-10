package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Component results
  */
@js.native
trait ObservationComponent extends BackboneElement {
  /**
    * Contains extended information for property 'valueDateTime'.
    */
  var _valueDateTime: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueString'.
    */
  var _valueString: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueTime'.
    */
  var _valueTime: js.UndefOr[Element] = js.native
  /**
    * Type of component observation (code / type)
    */
  var code: CodeableConcept = js.native
  /**
    * Why the component result is missing
    */
  var dataAbsentReason: js.UndefOr[CodeableConcept] = js.native
  /**
    * High, low, normal, etc.
    */
  var interpretation: js.UndefOr[CodeableConcept] = js.native
  /**
    * Provides guide for interpretation of component result
    */
  var referenceRange: js.UndefOr[js.Array[ObservationReferenceRange]] = js.native
  /**
    * Actual component result
    */
  var valueAttachment: js.UndefOr[Attachment] = js.native
  /**
    * Actual component result
    */
  var valueCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  /**
    * Actual component result
    */
  var valueDateTime: js.UndefOr[dateTime] = js.native
  /**
    * Actual component result
    */
  var valuePeriod: js.UndefOr[Period] = js.native
  /**
    * Actual component result
    */
  var valueQuantity: js.UndefOr[Quantity] = js.native
  /**
    * Actual component result
    */
  var valueRange: js.UndefOr[Range] = js.native
  /**
    * Actual component result
    */
  var valueRatio: js.UndefOr[Ratio] = js.native
  /**
    * Actual component result
    */
  var valueSampledData: js.UndefOr[SampledData] = js.native
  /**
    * Actual component result
    */
  var valueString: js.UndefOr[String] = js.native
  /**
    * Actual component result
    */
  var valueTime: js.UndefOr[time] = js.native
}

object ObservationComponent {
  @scala.inline
  def apply(code: CodeableConcept): ObservationComponent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObservationComponent]
  }
  @scala.inline
  implicit class ObservationComponentOps[Self <: ObservationComponent] (val x: Self) extends AnyVal {
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
    def with_valueDateTime(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_valueDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueDateTime")(js.undefined)
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
    def with_valueTime(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_valueTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDataAbsentReason(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataAbsentReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataAbsentReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataAbsentReason")(js.undefined)
        ret
    }
    @scala.inline
    def withInterpretation(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpretation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterpretation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpretation")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceRange(value: js.Array[ObservationReferenceRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceRange")(js.undefined)
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
    def withValueCodeableConcept(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueCodeableConcept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueCodeableConcept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueCodeableConcept")(js.undefined)
        ret
    }
    @scala.inline
    def withValueDateTime(value: dateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withValuePeriod(value: Period): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valuePeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValuePeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valuePeriod")(js.undefined)
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
    def withValueRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueRange")(js.undefined)
        ret
    }
    @scala.inline
    def withValueRatio(value: Ratio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withValueSampledData(value: SampledData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueSampledData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueSampledData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueSampledData")(js.undefined)
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
    @scala.inline
    def withValueTime(value: time): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueTime")(js.undefined)
        ret
    }
  }
  
}

