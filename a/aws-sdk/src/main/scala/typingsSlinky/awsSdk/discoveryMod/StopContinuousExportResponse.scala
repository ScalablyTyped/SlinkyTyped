package typingsSlinky.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopContinuousExportResponse extends js.Object {
  /**
    * Timestamp that represents when this continuous export started collecting data.
    */
  var startTime: js.UndefOr[js.Date] = js.native
  /**
    * Timestamp that represents when this continuous export was stopped.
    */
  var stopTime: js.UndefOr[js.Date] = js.native
}

object StopContinuousExportResponse {
  @scala.inline
  def apply(): StopContinuousExportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopContinuousExportResponse]
  }
  @scala.inline
  implicit class StopContinuousExportResponseOps[Self <: StopContinuousExportResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStopTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopTime")(js.undefined)
        ret
    }
  }
  
}

