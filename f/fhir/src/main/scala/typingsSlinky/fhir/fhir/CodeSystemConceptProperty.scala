package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Property value for the concept
  */
@js.native
trait CodeSystemConceptProperty extends BackboneElement {
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueBoolean'.
    */
  var _valueBoolean: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueCode'.
    */
  var _valueCode: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueDateTime'.
    */
  var _valueDateTime: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueInteger'.
    */
  var _valueInteger: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueString'.
    */
  var _valueString: js.UndefOr[Element] = js.native
  /**
    * Reference to CodeSystem.property.code
    */
  var code: typingsSlinky.fhir.fhir.code = js.native
  /**
    * Value of the property for this concept
    */
  var valueBoolean: js.UndefOr[Boolean] = js.native
  /**
    * Value of the property for this concept
    */
  var valueCode: js.UndefOr[code] = js.native
  /**
    * Value of the property for this concept
    */
  var valueCoding: js.UndefOr[Coding] = js.native
  /**
    * Value of the property for this concept
    */
  var valueDateTime: js.UndefOr[dateTime] = js.native
  /**
    * Value of the property for this concept
    */
  var valueInteger: js.UndefOr[integer] = js.native
  /**
    * Value of the property for this concept
    */
  var valueString: js.UndefOr[String] = js.native
}

object CodeSystemConceptProperty {
  @scala.inline
  def apply(code: code): CodeSystemConceptProperty = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeSystemConceptProperty]
  }
  @scala.inline
  implicit class CodeSystemConceptPropertyOps[Self <: CodeSystemConceptProperty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_code(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_code: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_code")(js.undefined)
        ret
    }
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
    def with_valueCode(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_valueCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueCode")(js.undefined)
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
    def withValueCode(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueCode")(js.undefined)
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

