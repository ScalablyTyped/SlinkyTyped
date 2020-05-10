package typingsSlinky.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecutionTimeFilter extends js.Object {
  /**
    * Specifies the latest start or close date and time to return.
    */
  var latestDate: js.UndefOr[js.Date] = js.native
  /**
    * Specifies the oldest start or close date and time to return.
    */
  var oldestDate: js.Date = js.native
}

object ExecutionTimeFilter {
  @scala.inline
  def apply(oldestDate: js.Date): ExecutionTimeFilter = {
    val __obj = js.Dynamic.literal(oldestDate = oldestDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionTimeFilter]
  }
  @scala.inline
  implicit class ExecutionTimeFilterOps[Self <: ExecutionTimeFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOldestDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldestDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatestDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatestDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestDate")(js.undefined)
        ret
    }
  }
  
}

