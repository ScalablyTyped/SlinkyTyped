package typingsSlinky.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelativeDateRange extends js.Object {
  /**
    * The number of days in the requested date range. E.g. for a range spanning
    * today, 1. For a range spanning the last 7 days, 7.
    */
  var durationDays: js.UndefOr[Double] = js.native
  /**
    * The end date of the filter set, specified as the number of days before
    * today. E.g. for a range where the last date is today, 0.
    */
  var offsetDays: js.UndefOr[Double] = js.native
}

object RelativeDateRange {
  @scala.inline
  def apply(): RelativeDateRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelativeDateRange]
  }
  @scala.inline
  implicit class RelativeDateRangeOps[Self <: RelativeDateRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDurationDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationDays")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetDays")(js.undefined)
        ret
    }
  }
  
}

