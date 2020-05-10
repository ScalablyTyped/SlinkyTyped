package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistogramChartSpec extends js.Object {
  var bucketSize: js.UndefOr[Double] = js.native
  var legendPosition: js.UndefOr[String] = js.native
  var outlierPercentile: js.UndefOr[Double] = js.native
  var series: js.UndefOr[js.Array[HistogramSeries]] = js.native
  var showItemDividers: js.UndefOr[Boolean] = js.native
}

object HistogramChartSpec {
  @scala.inline
  def apply(): HistogramChartSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistogramChartSpec]
  }
  @scala.inline
  implicit class HistogramChartSpecOps[Self <: HistogramChartSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucketSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucketSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketSize")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withOutlierPercentile(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlierPercentile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutlierPercentile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlierPercentile")(js.undefined)
        ret
    }
    @scala.inline
    def withSeries(value: js.Array[HistogramSeries]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(js.undefined)
        ret
    }
    @scala.inline
    def withShowItemDividers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showItemDividers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowItemDividers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showItemDividers")(js.undefined)
        ret
    }
  }
  
}

