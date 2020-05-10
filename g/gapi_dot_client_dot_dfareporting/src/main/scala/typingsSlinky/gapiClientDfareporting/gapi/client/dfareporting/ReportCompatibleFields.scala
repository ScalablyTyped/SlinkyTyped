package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportCompatibleFields extends js.Object {
  /** Dimensions which are compatible to be selected in the "dimensionFilters" section of the report. */
  var dimensionFilters: js.UndefOr[js.Array[Dimension]] = js.native
  /** Dimensions which are compatible to be selected in the "dimensions" section of the report. */
  var dimensions: js.UndefOr[js.Array[Dimension]] = js.native
  /** The kind of resource this is, in this case dfareporting#reportCompatibleFields. */
  var kind: js.UndefOr[String] = js.native
  /** Metrics which are compatible to be selected in the "metricNames" section of the report. */
  var metrics: js.UndefOr[js.Array[Metric]] = js.native
  /** Metrics which are compatible to be selected as activity metrics to pivot on in the "activities" section of the report. */
  var pivotedActivityMetrics: js.UndefOr[js.Array[Metric]] = js.native
}

object ReportCompatibleFields {
  @scala.inline
  def apply(): ReportCompatibleFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportCompatibleFields]
  }
  @scala.inline
  implicit class ReportCompatibleFieldsOps[Self <: ReportCompatibleFields] (val x: Self) extends AnyVal {
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
  }
  
}

