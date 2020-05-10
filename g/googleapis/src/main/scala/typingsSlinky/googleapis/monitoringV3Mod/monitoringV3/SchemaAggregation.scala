package typingsSlinky.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes how to combine multiple time series to provide different views of
  * the data. Aggregation consists of an alignment step on individual time
  * series (alignment_period and per_series_aligner) followed by an optional
  * reduction step of the data across the aligned time series
  * (cross_series_reducer and group_by_fields). For more details, see
  * Aggregation.
  */
@js.native
trait SchemaAggregation extends js.Object {
  /**
    * The alignment period for per-time series alignment. If present,
    * alignmentPeriod must be at least 60 seconds. After per-time series
    * alignment, each time series will contain data points only on the period
    * boundaries. If perSeriesAligner is not specified or equals ALIGN_NONE,
    * then this field is ignored. If perSeriesAligner is specified and does not
    * equal ALIGN_NONE, then this field must be defined; otherwise an error is
    * returned.
    */
  var alignmentPeriod: js.UndefOr[String] = js.native
  /**
    * The approach to be used to combine time series. Not all reducer functions
    * may be applied to all time series, depending on the metric type and the
    * value type of the original time series. Reduction may change the metric
    * type of value type of the time series.Time series data must be aligned in
    * order to perform cross-time series reduction. If crossSeriesReducer is
    * specified, then perSeriesAligner must be specified and not equal
    * ALIGN_NONE and alignmentPeriod must be specified; otherwise, an error is
    * returned.
    */
  var crossSeriesReducer: js.UndefOr[String] = js.native
  /**
    * The set of fields to preserve when crossSeriesReducer is specified. The
    * groupByFields determine how the time series are partitioned into subsets
    * prior to applying the aggregation function. Each subset contains time
    * series that have the same value for each of the grouping fields. Each
    * individual time series is a member of exactly one subset. The
    * crossSeriesReducer is applied to each subset of time series. It is not
    * possible to reduce across different resource types, so this field
    * implicitly contains resource.type. Fields not specified in groupByFields
    * are aggregated away. If groupByFields is not specified and all the time
    * series have the same resource type, then the time series are aggregated
    * into a single output time series. If crossSeriesReducer is not defined,
    * this field is ignored.
    */
  var groupByFields: js.UndefOr[js.Array[String]] = js.native
  /**
    * The approach to be used to align individual time series. Not all
    * alignment functions may be applied to all time series, depending on the
    * metric type and value type of the original time series. Alignment may
    * change the metric type or the value type of the time series.Time series
    * data must be aligned in order to perform cross-time series reduction. If
    * crossSeriesReducer is specified, then perSeriesAligner must be specified
    * and not equal ALIGN_NONE and alignmentPeriod must be specified;
    * otherwise, an error is returned.
    */
  var perSeriesAligner: js.UndefOr[String] = js.native
}

object SchemaAggregation {
  @scala.inline
  def apply(): SchemaAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAggregation]
  }
  @scala.inline
  implicit class SchemaAggregationOps[Self <: SchemaAggregation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignmentPeriod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignmentPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignmentPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignmentPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withCrossSeriesReducer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossSeriesReducer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossSeriesReducer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossSeriesReducer")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupByFields(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupByFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupByFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupByFields")(js.undefined)
        ret
    }
    @scala.inline
    def withPerSeriesAligner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perSeriesAligner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerSeriesAligner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perSeriesAligner")(js.undefined)
        ret
    }
  }
  
}

