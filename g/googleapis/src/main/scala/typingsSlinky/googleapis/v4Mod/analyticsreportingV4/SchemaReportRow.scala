package typingsSlinky.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A row in the report.
  */
@js.native
trait SchemaReportRow extends js.Object {
  /**
    * List of requested dimensions.
    */
  var dimensions: js.UndefOr[js.Array[String]] = js.native
  /**
    * List of metrics for each requested DateRange.
    */
  var metrics: js.UndefOr[js.Array[SchemaDateRangeValues]] = js.native
}

object SchemaReportRow {
  @scala.inline
  def apply(): SchemaReportRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportRow]
  }
  @scala.inline
  implicit class SchemaReportRowOps[Self <: SchemaReportRow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDimensions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withMetrics(value: js.Array[SchemaDateRangeValues]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metrics")(js.undefined)
        ret
    }
  }
  
}

