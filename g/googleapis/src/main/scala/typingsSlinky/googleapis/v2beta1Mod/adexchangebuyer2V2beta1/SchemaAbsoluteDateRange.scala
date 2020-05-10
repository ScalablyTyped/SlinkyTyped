package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An absolute date range, specified by its start date and end date. The
  * supported range of dates begins 30 days before today and ends today.
  * Validity checked upon filter set creation. If a filter set with an absolute
  * date range is run at a later date more than 30 days after start_date, it
  * will fail.
  */
@js.native
trait SchemaAbsoluteDateRange extends js.Object {
  /**
    * The end date of the range (inclusive). Must be within the 30 days leading
    * up to current date, and must be equal to or after start_date.
    */
  var endDate: js.UndefOr[SchemaDate] = js.native
  /**
    * The start date of the range (inclusive). Must be within the 30 days
    * leading up to current date, and must be equal to or before end_date.
    */
  var startDate: js.UndefOr[SchemaDate] = js.native
}

object SchemaAbsoluteDateRange {
  @scala.inline
  def apply(): SchemaAbsoluteDateRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAbsoluteDateRange]
  }
  @scala.inline
  implicit class SchemaAbsoluteDateRangeOps[Self <: SchemaAbsoluteDateRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndDate(value: SchemaDate): Self = {
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
    def withStartDate(value: SchemaDate): Self = {
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

