package typingsSlinky.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The data part of the report.
  */
@js.native
trait SchemaReportData extends js.Object {
  /**
    * The last time the data in the report was refreshed. All the hits received
    * before this timestamp are included in the calculation of the report.
    */
  var dataLastRefreshed: js.UndefOr[String] = js.native
  /**
    * Indicates if response to this request is golden or not. Data is golden
    * when the exact same request will not produce any new results if asked at
    * a later point in time.
    */
  var isDataGolden: js.UndefOr[Boolean] = js.native
  /**
    * Minimum and maximum values seen over all matching rows. These are both
    * empty when `hideValueRanges` in the request is false, or when rowCount is
    * zero.
    */
  var maximums: js.UndefOr[js.Array[SchemaDateRangeValues]] = js.native
  /**
    * Minimum and maximum values seen over all matching rows. These are both
    * empty when `hideValueRanges` in the request is false, or when rowCount is
    * zero.
    */
  var minimums: js.UndefOr[js.Array[SchemaDateRangeValues]] = js.native
  /**
    * Total number of matching rows for this query.
    */
  var rowCount: js.UndefOr[Double] = js.native
  /**
    * There&#39;s one ReportRow for every unique combination of dimensions.
    */
  var rows: js.UndefOr[js.Array[SchemaReportRow]] = js.native
  /**
    * If the results are
    * [sampled](https://support.google.com/analytics/answer/2637192), this
    * returns the total number of samples read, one entry per date range. If
    * the results are not sampled this field will not be defined. See
    * [developer guide](/analytics/devguides/reporting/core/v4/basics#sampling)
    * for details.
    */
  var samplesReadCounts: js.UndefOr[js.Array[String]] = js.native
  /**
    * If the results are
    * [sampled](https://support.google.com/analytics/answer/2637192), this
    * returns the total number of samples present, one entry per date range. If
    * the results are not sampled this field will not be defined. See
    * [developer guide](/analytics/devguides/reporting/core/v4/basics#sampling)
    * for details.
    */
  var samplingSpaceSizes: js.UndefOr[js.Array[String]] = js.native
  /**
    * For each requested date range, for the set of all rows that match the
    * query, every requested value format gets a total. The total for a value
    * format is computed by first totaling the metrics mentioned in the value
    * format and then evaluating the value format as a scalar expression. E.g.,
    * The &quot;totals&quot; for `3 / (ga:sessions + 2)` we compute `3 / ((sum
    * of all relevant ga:sessions) + 2)`. Totals are computed before
    * pagination.
    */
  var totals: js.UndefOr[js.Array[SchemaDateRangeValues]] = js.native
}

object SchemaReportData {
  @scala.inline
  def apply(): SchemaReportData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportData]
  }
  @scala.inline
  implicit class SchemaReportDataOps[Self <: SchemaReportData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataLastRefreshed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLastRefreshed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataLastRefreshed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLastRefreshed")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDataGolden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDataGolden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDataGolden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDataGolden")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximums(value: js.Array[SchemaDateRangeValues]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximums")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximums: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximums")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimums(value: js.Array[SchemaDateRangeValues]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimums")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimums: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimums")(js.undefined)
        ret
    }
    @scala.inline
    def withRowCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCount")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: js.Array[SchemaReportRow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
    @scala.inline
    def withSamplesReadCounts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samplesReadCounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSamplesReadCounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samplesReadCounts")(js.undefined)
        ret
    }
    @scala.inline
    def withSamplingSpaceSizes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samplingSpaceSizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSamplingSpaceSizes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samplingSpaceSizes")(js.undefined)
        ret
    }
    @scala.inline
    def withTotals(value: js.Array[SchemaDateRangeValues]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totals")(js.undefined)
        ret
    }
  }
  
}

