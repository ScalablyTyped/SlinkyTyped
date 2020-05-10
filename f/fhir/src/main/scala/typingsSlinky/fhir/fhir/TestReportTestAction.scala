package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A test operation or assert that was performed
  */
@js.native
trait TestReportTestAction extends BackboneElement {
  /**
    * The assertion performed
    */
  var assert: js.UndefOr[TestReportSetupActionAssert] = js.native
  /**
    * The operation performed
    */
  var operation: js.UndefOr[TestReportSetupActionOperation] = js.native
}

object TestReportTestAction {
  @scala.inline
  def apply(): TestReportTestAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestReportTestAction]
  }
  @scala.inline
  implicit class TestReportTestActionOps[Self <: TestReportTestAction] (val x: Self) extends AnyVal {
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

