package typingsSlinky.awsIotDeviceSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait jobStatus extends js.Object {
  var status: String = js.native
  var statusDetails: typingsSlinky.awsIotDeviceSdk.mod.statusDetails = js.native
}

object jobStatus {
  @scala.inline
  def apply(status: String, statusDetails: statusDetails): jobStatus = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], statusDetails = statusDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[jobStatus]
  }
  @scala.inline
  implicit class jobStatusOps[Self <: jobStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusDetails(value: statusDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusDetails")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

