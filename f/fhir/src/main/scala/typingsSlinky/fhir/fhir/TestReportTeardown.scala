package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The results of running the series of required clean up steps
  */
@js.native
trait TestReportTeardown extends BackboneElement {
  /**
    * One or more teardown operations performed
    */
  var action: js.Array[TestReportTeardownAction] = js.native
}

object TestReportTeardown {
  @scala.inline
  def apply(action: js.Array[TestReportTeardownAction]): TestReportTeardown = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestReportTeardown]
  }
  @scala.inline
  implicit class TestReportTeardownOps[Self <: TestReportTeardown] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: js.Array[TestReportTeardownAction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

