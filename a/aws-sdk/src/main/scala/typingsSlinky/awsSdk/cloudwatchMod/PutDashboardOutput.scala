package typingsSlinky.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutDashboardOutput extends js.Object {
  /**
    * If the input for PutDashboard was correct and the dashboard was successfully created or modified, this result is empty. If this result includes only warning messages, then the input was valid enough for the dashboard to be created or modified, but some elements of the dashboard may not render. If this result includes error messages, the input was not valid and the operation failed.
    */
  var DashboardValidationMessages: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.DashboardValidationMessages] = js.native
}

object PutDashboardOutput {
  @scala.inline
  def apply(): PutDashboardOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutDashboardOutput]
  }
  @scala.inline
  implicit class PutDashboardOutputOps[Self <: PutDashboardOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDashboardValidationMessages(value: DashboardValidationMessages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DashboardValidationMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDashboardValidationMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DashboardValidationMessages")(js.undefined)
        ret
    }
  }
  
}

