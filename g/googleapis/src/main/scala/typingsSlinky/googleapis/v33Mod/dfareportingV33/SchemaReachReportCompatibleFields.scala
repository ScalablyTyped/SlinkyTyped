package typingsSlinky.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents fields that are compatible to be selected for a report of type
  * &quot;REACH&quot;.
  */
@js.native
trait SchemaReachReportCompatibleFields extends js.Object {
  /**
    * Dimensions which are compatible to be selected in the
    * &quot;dimensionFilters&quot; section of the report.
    */
  var dimensionFilters: js.UndefOr[js.Array[SchemaDimension]] = js.native
  /**
    * Dimensions which are compatible to be selected in the
    * &quot;dimensions&quot; section of the report.
    */
  var dimensions: js.UndefOr[js.Array[SchemaDimension]] = js.native
  /**
    * The kind of resource this is, in this case
    * dfareporting#reachReportCompatibleFields.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Metrics which are compatible to be selected in the
    * &quot;metricNames&quot; section of the report.
    */
  var metrics: js.UndefOr[js.Array[SchemaMetric]] = js.native
  /**
    * Metrics which are compatible to be selected as activity metrics to pivot
    * on in the &quot;activities&quot; section of the report.
    */
  var pivotedActivityMetrics: js.UndefOr[js.Array[SchemaMetric]] = js.native
  /**
    * Metrics which are compatible to be selected in the
    * &quot;reachByFrequencyMetricNames&quot; section of the report.
    */
  var reachByFrequencyMetrics: js.UndefOr[js.Array[SchemaMetric]] = js.native
}

object SchemaReachReportCompatibleFields {
  @scala.inline
  def apply(): SchemaReachReportCompatibleFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReachReportCompatibleFields]
  }
  @scala.inline
  implicit class SchemaReachReportCompatibleFieldsOps[Self <: SchemaReachReportCompatibleFields] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withDimensions(value: js.Array[SchemaDimension]): Self = {
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
    def withPivotedActivityMetrics(value: js.Array[SchemaMetric]): Self = {
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
    def withReachByFrequencyMetrics(value: js.Array[SchemaMetric]): Self = {
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

