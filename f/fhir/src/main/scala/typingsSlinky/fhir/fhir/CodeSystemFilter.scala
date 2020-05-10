package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Filter that can be used in a value set
  */
@js.native
trait CodeSystemFilter extends BackboneElement {
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'operator'.
    */
  var _operator: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'value'.
    */
  var _value: js.UndefOr[Element] = js.native
  /**
    * Code that identifies the filter
    */
  var code: typingsSlinky.fhir.fhir.code = js.native
  /**
    * How or why the filter is used
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Operators that can be used with filter
    */
  var operator: js.Array[code] = js.native
  /**
    * What to use for the value
    */
  var value: String = js.native
}

object CodeSystemFilter {
  @scala.inline
  def apply(code: code, operator: js.Array[code], value: String): CodeSystemFilter = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeSystemFilter]
  }
  @scala.inline
  implicit class CodeSystemFilterOps[Self <: CodeSystemFilter] (val x: Self) extends AnyVal {
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
    def withOperator(value: js.Array[code]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
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
    def with_description(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_description: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_description")(js.undefined)
        ret
    }
    @scala.inline
    def with_operator(value: js.Array[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_operator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_operator")(js.undefined)
        ret
    }
    @scala.inline
    def with_value(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_value: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_value")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
  }
  
}

