package typingsSlinky.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimestampRange extends js.Object {
  /**
    * The minimum value of the timestamp range.
    */
  var beginDate: js.UndefOr[js.Date] = js.native
  /**
    * The maximum value of the timestamp range.
    */
  var endDate: js.UndefOr[js.Date] = js.native
}

object TimestampRange {
  @scala.inline
  def apply(): TimestampRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimestampRange]
  }
  @scala.inline
  implicit class TimestampRangeOps[Self <: TimestampRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeginDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeginDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginDate")(js.undefined)
        ret
    }
    @scala.inline
    def withEndDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(js.undefined)
        ret
    }
  }
  
}

