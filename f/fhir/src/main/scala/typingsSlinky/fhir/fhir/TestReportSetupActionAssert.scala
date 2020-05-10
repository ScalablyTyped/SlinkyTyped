package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The assertion to perform
  */
@js.native
trait TestReportSetupActionAssert extends BackboneElement {
  /**
    * Contains extended information for property 'detail'.
    */
  var _detail: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'message'.
    */
  var _message: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'result'.
    */
  var _result: js.UndefOr[Element] = js.native
  /**
    * A link to further details on the result
    */
  var detail: js.UndefOr[String] = js.native
  /**
    * A message associated with the result
    */
  var message: js.UndefOr[markdown] = js.native
  /**
    * pass | skip | fail | warning | error
    */
  var result: code = js.native
}

object TestReportSetupActionAssert {
  @scala.inline
  def apply(result: code): TestReportSetupActionAssert = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestReportSetupActionAssert]
  }
  @scala.inline
  implicit class TestReportSetupActionAssertOps[Self <: TestReportSetupActionAssert] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResult(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_detail(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_detail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_detail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_detail")(js.undefined)
        ret
    }
    @scala.inline
    def with_message(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_message: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_message")(js.undefined)
        ret
    }
    @scala.inline
    def with_result(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_result: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_result")(js.undefined)
        ret
    }
    @scala.inline
    def withDetail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detail")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: markdown): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
  }
  
}

