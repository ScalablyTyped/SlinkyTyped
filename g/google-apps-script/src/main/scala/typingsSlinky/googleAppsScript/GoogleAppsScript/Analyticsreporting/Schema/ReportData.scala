package typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportData extends js.Object {
  var dataLastRefreshed: js.UndefOr[String] = js.native
  var isDataGolden: js.UndefOr[Boolean] = js.native
  var maximums: js.UndefOr[js.Array[DateRangeValues]] = js.native
  var minimums: js.UndefOr[js.Array[DateRangeValues]] = js.native
  var rowCount: js.UndefOr[Double] = js.native
  var rows: js.UndefOr[js.Array[ReportRow]] = js.native
  var samplesReadCounts: js.UndefOr[js.Array[String]] = js.native
  var samplingSpaceSizes: js.UndefOr[js.Array[String]] = js.native
  var totals: js.UndefOr[js.Array[DateRangeValues]] = js.native
}

object ReportData {
  @scala.inline
  def apply(): ReportData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportData]
  }
  @scala.inline
  implicit class ReportDataOps[Self <: ReportData] (val x: Self) extends AnyVal {
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
    def withMaximums(value: js.Array[DateRangeValues]): Self = {
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
    def withMinimums(value: js.Array[DateRangeValues]): Self = {
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
    def withRows(value: js.Array[ReportRow]): Self = {
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
    def withTotals(value: js.Array[DateRangeValues]): Self = {
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

