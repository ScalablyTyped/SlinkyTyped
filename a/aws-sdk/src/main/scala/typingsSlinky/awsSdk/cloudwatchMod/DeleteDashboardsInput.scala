package typingsSlinky.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDashboardsInput extends js.Object {
  /**
    * The dashboards to be deleted. This parameter is required.
    */
  var DashboardNames: typingsSlinky.awsSdk.cloudwatchMod.DashboardNames = js.native
}

object DeleteDashboardsInput {
  @scala.inline
  def apply(DashboardNames: DashboardNames): DeleteDashboardsInput = {
    val __obj = js.Dynamic.literal(DashboardNames = DashboardNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDashboardsInput]
  }
  @scala.inline
  implicit class DeleteDashboardsInputOps[Self <: DeleteDashboardsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDashboardNames(value: DashboardNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DashboardNames")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

