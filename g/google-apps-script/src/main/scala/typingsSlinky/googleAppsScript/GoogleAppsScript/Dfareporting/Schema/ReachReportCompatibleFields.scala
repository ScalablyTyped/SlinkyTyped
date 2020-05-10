package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReachReportCompatibleFields extends js.Object {
  var dimensionFilters: js.UndefOr[js.Array[Dimension]] = js.native
  var dimensions: js.UndefOr[js.Array[Dimension]] = js.native
  var kind: js.UndefOr[String] = js.native
  var metrics: js.UndefOr[js.Array[Metric]] = js.native
  var pivotedActivityMetrics: js.UndefOr[js.Array[Metric]] = js.native
  var reachByFrequencyMetrics: js.UndefOr[js.Array[Metric]] = js.native
}

object ReachReportCompatibleFields {
  @scala.inline
  def apply(): ReachReportCompatibleFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReachReportCompatibleFields]
  }
  @scala.inline
  implicit class ReachReportCompatibleFieldsOps[Self <: ReachReportCompatibleFields] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDimensionFilters(value: js.Array[Dimension]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensionFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withDimensions(value: js.Array[Dimension]): Self = {
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
    def withMetrics(value: js.Array[Metric]): Self = {
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
    @scala.inline
    def withPivotedActivityMetrics(value: js.Array[Metric]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotedActivityMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPivotedActivityMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotedActivityMetrics")(js.undefined)
        ret
    }
    @scala.inline
    def withReachByFrequencyMetrics(value: js.Array[Metric]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reachByFrequencyMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReachByFrequencyMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reachByFrequencyMetrics")(js.undefined)
        ret
    }
  }
  
}

