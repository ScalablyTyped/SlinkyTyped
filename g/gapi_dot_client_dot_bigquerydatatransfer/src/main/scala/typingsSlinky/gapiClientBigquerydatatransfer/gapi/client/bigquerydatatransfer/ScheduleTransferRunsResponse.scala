package typingsSlinky.gapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduleTransferRunsResponse extends js.Object {
  /** The transfer runs that were scheduled. */
  var runs: js.UndefOr[js.Array[TransferRun]] = js.native
}

object ScheduleTransferRunsResponse {
  @scala.inline
  def apply(): ScheduleTransferRunsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleTransferRunsResponse]
  }
  @scala.inline
  implicit class ScheduleTransferRunsResponseOps[Self <: ScheduleTransferRunsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRuns(value: js.Array[TransferRun]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runs")(js.undefined)
        ret
    }
  }
  
}

