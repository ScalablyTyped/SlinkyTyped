package typingsSlinky.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents fields that are compatible to be selected for a report of type
  * &quot;CROSS_DIMENSION_REACH&quot;.
  */
@js.native
trait SchemaCrossDimensionReachReportCompatibleFields extends js.Object {
  /**
    * Dimensions which are compatible to be selected in the
    * &quot;breakdown&quot; section of the report.
    */
  var breakdown: js.UndefOr[js.Array[SchemaDimension]] = js.native
  /**
    * Dimensions which are compatible to be selected in the
    * &quot;dimensionFilters&quot; section of the report.
    */
  var dimensionFilters: js.UndefOr[js.Array[SchemaDimension]] = js.native
  /**
    * The kind of resource this is, in this case
    * dfareporting#crossDimensionReachReportCompatibleFields.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Metrics which are compatible to be selected in the
    * &quot;metricNames&quot; section of the report.
    */
  var metrics: js.UndefOr[js.Array[SchemaMetric]] = js.native
  /**
    * Metrics which are compatible to be selected in the
    * &quot;overlapMetricNames&quot; section of the report.
    */
  var overlapMetrics: js.UndefOr[js.Array[SchemaMetric]] = js.native
}

object SchemaCrossDimensionReachReportCompatibleFields {
  @scala.inline
  def apply(): SchemaCrossDimensionReachReportCompatibleFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCrossDimensionReachReportCompatibleFields]
  }
  @scala.inline
  implicit class SchemaCrossDimensionReachReportCompatibleFieldsOps[Self <: SchemaCrossDimensionReachReportCompatibleFields] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBreakdown(value: js.Array[SchemaDimension]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreakdown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakdown")(js.undefined)
        ret
    }
    @scala.inline
    def withDimensionFilters(value: js.Array[SchemaDimension]): Self = {
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
    def withMetrics(value: js.Array[SchemaMetric]): Self = {
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
    def withOverlapMetrics(value: js.Array[SchemaMetric]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlapMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlapMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlapMetrics")(js.undefined)
        ret
    }
  }
  
}

