package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Each operation can have one or more header elements
  */
@js.native
trait TestScriptSetupActionOperationRequestHeader extends BackboneElement {
  /**
    * Contains extended information for property 'field'.
    */
  var _field: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'value'.
    */
  var _value: js.UndefOr[Element] = js.native
  /**
    * HTTP header field name
    */
  var field: String = js.native
  /**
    * HTTP headerfield value
    */
  var value: String = js.native
}

object TestScriptSetupActionOperationRequestHeader {
  @scala.inline
  def apply(field: String, value: String): TestScriptSetupActionOperationRequestHeader = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptSetupActionOperationRequestHeader]
  }
  @scala.inline
  implicit class TestScriptSetupActionOperationRequestHeaderOps[Self <: TestScriptSetupActionOperationRequestHeader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_field(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_field: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_field")(js.undefined)
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
  }
  
}

