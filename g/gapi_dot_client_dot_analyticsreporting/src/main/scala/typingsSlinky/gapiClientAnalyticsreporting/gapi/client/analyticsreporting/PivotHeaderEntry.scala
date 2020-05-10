package typingsSlinky.gapiClientAnalyticsreporting.gapi.client.analyticsreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotHeaderEntry extends js.Object {
  /** The name of the dimensions in the pivot response. */
  var dimensionNames: js.UndefOr[js.Array[String]] = js.native
  /** The values for the dimensions in the pivot. */
  var dimensionValues: js.UndefOr[js.Array[String]] = js.native
  /** The metric header for the metric in the pivot. */
  var metric: js.UndefOr[MetricHeaderEntry] = js.native
}

object PivotHeaderEntry {
  @scala.inline
  def apply(): PivotHeaderEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotHeaderEntry]
  }
  @scala.inline
  implicit class PivotHeaderEntryOps[Self <: PivotHeaderEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDimensionNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensionNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionNames")(js.undefined)
        ret
    }
    @scala.inline
    def withDimensionValues(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensionValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionValues")(js.undefined)
        ret
    }
    @scala.inline
    def withMetric(value: MetricHeaderEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metric")(js.undefined)
        ret
    }
  }
  
}

