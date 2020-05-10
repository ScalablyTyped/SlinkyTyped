package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlotDateTimeRangeRequest extends js.Object {
  /**
    * The earliest date and time, in UTC, for the Scheduled Instance to start.
    */
  var EarliestTime: js.Date = js.native
  /**
    * The latest date and time, in UTC, for the Scheduled Instance to start. This value must be later than or equal to the earliest date and at most three months in the future.
    */
  var LatestTime: js.Date = js.native
}

object SlotDateTimeRangeRequest {
  @scala.inline
  def apply(EarliestTime: js.Date, LatestTime: js.Date): SlotDateTimeRangeRequest = {
    val __obj = js.Dynamic.literal(EarliestTime = EarliestTime.asInstanceOf[js.Any], LatestTime = LatestTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotDateTimeRangeRequest]
  }
  @scala.inline
  implicit class SlotDateTimeRangeRequestOps[Self <: SlotDateTimeRangeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEarliestTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EarliestTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatestTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatestTime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

