package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A setup operation or assert that was executed
  */
@js.native
trait TestReportSetupAction extends BackboneElement {
  /**
    * The assertion to perform
    */
  var assert: js.UndefOr[TestReportSetupActionAssert] = js.native
  /**
    * The operation to perform
    */
  var operation: js.UndefOr[TestReportSetupActionOperation] = js.native
}

object TestReportSetupAction {
  @scala.inline
  def apply(): TestReportSetupAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestReportSetupAction]
  }
  @scala.inline
  implicit class TestReportSetupActionOps[Self <: TestReportSetupAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssert(value: TestReportSetupActionAssert): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assert")(js.undefined)
        ret
    }
    @scala.inline
    def withOperation(value: TestReportSetupActionOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(js.undefined)
        ret
    }
  }
  
}

