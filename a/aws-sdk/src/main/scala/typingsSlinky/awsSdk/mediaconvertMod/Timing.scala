package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Timing extends js.Object {
  /**
    * The time, in Unix epoch format, that the transcoding job finished
    */
  var FinishTime: js.UndefOr[js.Date] = js.native
  /**
    * The time, in Unix epoch format, that transcoding for the job began.
    */
  var StartTime: js.UndefOr[js.Date] = js.native
  /**
    * The time, in Unix epoch format, that you submitted the job.
    */
  var SubmitTime: js.UndefOr[js.Date] = js.native
}

object Timing {
  @scala.inline
  def apply(): Timing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Timing]
  }
  @scala.inline
  implicit class TimingOps[Self <: Timing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFinishTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FinishTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinishTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FinishTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmitTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubmitTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmitTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubmitTime")(js.undefined)
        ret
    }
  }
  
}

