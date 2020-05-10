package typingsSlinky.awsSdk.kinesisvideoarchivedmediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimestampRange extends js.Object {
  /**
    * The ending timestamp in the range of timestamps for which to return fragments.
    */
  var EndTimestamp: js.Date = js.native
  /**
    * The starting timestamp in the range of timestamps for which to return fragments.
    */
  var StartTimestamp: js.Date = js.native
}

object TimestampRange {
  @scala.inline
  def apply(EndTimestamp: js.Date, StartTimestamp: js.Date): TimestampRange = {
    val __obj = js.Dynamic.literal(EndTimestamp = EndTimestamp.asInstanceOf[js.Any], StartTimestamp = StartTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimestampRange]
  }
  @scala.inline
  implicit class TimestampRangeOps[Self <: TimestampRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

