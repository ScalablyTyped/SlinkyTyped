package typingsSlinky.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbsoluteDateRange extends js.Object {
  /**
    * The end date of the range (inclusive).
    * Must be within the 30 days leading up to current date, and must be equal to
    * or after start_date.
    */
  var endDate: js.UndefOr[Date] = js.native
  /**
    * The start date of the range (inclusive).
    * Must be within the 30 days leading up to current date, and must be equal to
    * or before end_date.
    */
  var startDate: js.UndefOr[Date] = js.native
}

object AbsoluteDateRange {
  @scala.inline
  def apply(): AbsoluteDateRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbsoluteDateRange]
  }
  @scala.inline
  implicit class AbsoluteDateRangeOps[Self <: AbsoluteDateRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndDate(value: Date): Self = {
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
    @scala.inline
    def withStartDate(value: Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(js.undefined)
        ret
    }
  }
  
}

