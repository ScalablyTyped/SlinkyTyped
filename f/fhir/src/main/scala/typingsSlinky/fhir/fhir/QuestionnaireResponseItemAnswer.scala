package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response(s) to the question
  */
@js.native
trait QuestionnaireResponseItemAnswer extends BackboneElement {
  /**
    * Contains extended information for property 'valueBoolean'.
    */
  var _valueBoolean: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueDate'.
    */
  var _valueDate: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueDateTime'.
    */
  var _valueDateTime: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueDecimal'.
    */
  var _valueDecimal: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueInteger'.
    */
  var _valueInteger: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueString'.
    */
  var _valueString: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueTime'.
    */
  var _valueTime: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueUri'.
    */
  var _valueUri: js.UndefOr[Element] = js.native
  /**
    * Nested groups and questions
    */
  var item: js.UndefOr[js.Array[QuestionnaireResponseItem]] = js.native
  /**
    * Single-valued answer to the question
    */
  var valueAttachment: js.UndefOr[Attachment] = js.native
  /**
    * Single-valued answer to the question
    */
  var valueBoolean: js.UndefOr[Boolean] = js.native
  /**
    * Single-valued answer to the question
    */
  var valueCoding: js.UndefOr[Coding] = js.native
  /**
    * Single-valued answer to the question
    */
  var valueDate: js.UndefOr[date] = js.native
  /**
    * Single-valued answer to the question
    */
  var valueDateTime: js.UndefOr[dateTime] = js.native
  /**
    * Single-valued answer to the question
    */
  var valueDecimal: js.UndefOr[decimal] = js.native
  /**
    * Single-valued answer to the question
    */
  var valueInteger: js.UndefOr[integer] = js.native
  /**
    * Single-valued answer to the question
    */
  var valueQuantity: js.UndefOr[Quantity] = js.native
  /**
    * Single-valued answer to the question
    */
  var valueReference: js.UndefOr[Reference] = js.native
  /**
    * Single-valued answer to the question
    */
  var valueString: js.UndefOr[String] = js.native
  /**
    * Single-valued answer to the question
    */
  var valueTime: js.UndefOr[time] = js.native
  /**
    * Single-valued answer to the question
    */
  var valueUri: js.UndefOr[uri] = js.native
}

object QuestionnaireResponseItemAnswer {
  @scala.inline
  def apply(): QuestionnaireResponseItemAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuestionnaireResponseItemAnswer]
  }
  @scala.inline
  implicit class QuestionnaireResponseItemAnswerOps[Self <: QuestionnaireResponseItemAnswer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_valueBoolean(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueBoolean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_valueBoolean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueBoolean")(js.undefined)
        ret
    }
    @scala.inline
    def with_valueDate(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_valueDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueDate")(js.undefined)
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
    def with_valueDecimal(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueDecimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_valueDecimal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueDecimal")(js.undefined)
        ret
    }
    @scala.inline
    def with_valueInteger(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueInteger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_valueInteger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueInteger")(js.undefined)
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
    def with_valueUri(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_valueUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueUri")(js.undefined)
        ret
    }
    @scala.inline
    def withItem(value: js.Array[QuestionnaireResponseItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(js.undefined)
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
    def withValueBoolean(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueBoolean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueBoolean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueBoolean")(js.undefined)
        ret
    }
    @scala.inline
    def withValueCoding(value: Coding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueCoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueCoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueCoding")(js.undefined)
        ret
    }
    @scala.inline
    def withValueDate(value: date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueDate")(js.undefined)
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
    def withValueDecimal(value: decimal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueDecimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueDecimal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueDecimal")(js.undefined)
        ret
    }
    @scala.inline
    def withValueInteger(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueInteger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueInteger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueInteger")(js.undefined)
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
    @scala.inline
    def withValueUri(value: uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueUri")(js.undefined)
        ret
    }
  }
  
}

