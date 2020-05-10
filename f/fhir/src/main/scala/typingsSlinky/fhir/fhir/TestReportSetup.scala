package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The results of the series of required setup operations before the tests were executed
  */
@js.native
trait TestReportSetup extends BackboneElement {
  /**
    * A setup operation or assert that was executed
    */
  var action: js.Array[TestReportSetupAction] = js.native
}

object TestReportSetup {
  @scala.inline
  def apply(action: js.Array[TestReportSetupAction]): TestReportSetup = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestReportSetup]
  }
  @scala.inline
  implicit class TestReportSetupOps[Self <: TestReportSetup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: js.Array[TestReportSetupAction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

