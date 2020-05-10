package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parameter that controlled the expansion process
  */
@js.native
trait ValueSetExpansionParameter extends BackboneElement {
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueBoolean'.
    */
  var _valueBoolean: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueCode'.
    */
  var _valueCode: js.UndefOr[Element] = js.native
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
    * Contains extended information for property 'valueUri'.
    */
  var _valueUri: js.UndefOr[Element] = js.native
  /**
    * Name as assigned by the server
    */
  var name: String = js.native
  /**
    * Value of the named parameter
    */
  var valueBoolean: js.UndefOr[Boolean] = js.native
  /**
    * Value of the named parameter
    */
  var valueCode: js.UndefOr[code] = js.native
  /**
    * Value of the named parameter
    */
  var valueDecimal: js.UndefOr[decimal] = js.native
  /**
    * Value of the named parameter
    */
  var valueInteger: js.UndefOr[integer] = js.native
  /**
    * Value of the named parameter
    */
  var valueString: js.UndefOr[String] = js.native
  /**
    * Value of the named parameter
    */
  var valueUri: js.UndefOr[uri] = js.native
}

object ValueSetExpansionParameter {
  @scala.inline
  def apply(name: String): ValueSetExpansionParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueSetExpansionParameter]
  }
  @scala.inline
  implicit class ValueSetExpansionParameterOps[Self <: ValueSetExpansionParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
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

