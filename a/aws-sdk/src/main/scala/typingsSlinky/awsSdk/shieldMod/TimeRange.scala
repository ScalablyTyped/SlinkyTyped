package typingsSlinky.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeRange extends js.Object {
  /**
    * The start time, in Unix time in seconds. For more information see timestamp.
    */
  var FromInclusive: js.UndefOr[js.Date] = js.native
  /**
    * The end time, in Unix time in seconds. For more information see timestamp.
    */
  var ToExclusive: js.UndefOr[js.Date] = js.native
}

object TimeRange {
  @scala.inline
  def apply(): TimeRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeRange]
  }
  @scala.inline
  implicit class TimeRangeOps[Self <: TimeRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromInclusive(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FromInclusive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromInclusive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FromInclusive")(js.undefined)
        ret
    }
    @scala.inline
    def withToExclusive(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ToExclusive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToExclusive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ToExclusive")(js.undefined)
        ret
    }
  }
  
}

