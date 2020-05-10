package typingsSlinky.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilteringStats extends js.Object {
  /**
    * The day during which the data was collected.
    * The data is collected from 00:00:00 to 23:59:59 PT.
    * During switches from PST to PDT and back, the day may
    * contain 23 or 25 hours of data instead of the usual 24.
    */
  var date: js.UndefOr[Date] = js.native
  /** The set of filtering reasons for this date. */
  var reasons: js.UndefOr[js.Array[Reason]] = js.native
}

object FilteringStats {
  @scala.inline
  def apply(): FilteringStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilteringStats]
  }
  @scala.inline
  implicit class FilteringStatsOps[Self <: FilteringStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.undefined)
        ret
    }
    @scala.inline
    def withReasons(value: js.Array[Reason]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReasons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasons")(js.undefined)
        ret
    }
  }
  
}

