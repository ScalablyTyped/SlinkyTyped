package typingsSlinky.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A contiguous set of days: startDate, startDate + 1 day, ..., endDate. The
  * start and end dates are specified in
  * [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) date format `YYYY-MM-DD`.
  */
@js.native
trait SchemaDateRange extends js.Object {
  /**
    * The end date for the query in the format `YYYY-MM-DD`.
    */
  var endDate: js.UndefOr[String] = js.native
  /**
    * The start date for the query in the format `YYYY-MM-DD`.
    */
  var startDate: js.UndefOr[String] = js.native
}

object SchemaDateRange {
  @scala.inline
  def apply(): SchemaDateRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDateRange]
  }
  @scala.inline
  implicit class SchemaDateRangeOps[Self <: SchemaDateRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndDate(value: String): Self = {
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
    def withStartDate(value: String): Self = {
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

