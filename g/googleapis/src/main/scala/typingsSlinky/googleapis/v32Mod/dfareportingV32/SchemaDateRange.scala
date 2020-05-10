package typingsSlinky.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a date range.
  */
@js.native
trait SchemaDateRange extends js.Object {
  /**
    * The end date of the date range, inclusive. A string of the format:
    * &quot;yyyy-MM-dd&quot;.
    */
  var endDate: js.UndefOr[String] = js.native
  /**
    * The kind of resource this is, in this case dfareporting#dateRange.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The date range relative to the date of when the report is run.
    */
  var relativeDateRange: js.UndefOr[String] = js.native
  /**
    * The start date of the date range, inclusive. A string of the format:
    * &quot;yyyy-MM-dd&quot;.
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
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withRelativeDateRange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeDateRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelativeDateRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeDateRange")(js.undefined)
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

