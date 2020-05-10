package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the state of a metric.
  */
@js.native
trait SchemaMetricUpdate extends js.Object {
  /**
    * True if this metric is reported as the total cumulative aggregate value
    * accumulated since the worker started working on this WorkItem. By default
    * this is false, indicating that this metric is reported as a delta that is
    * not associated with any WorkItem.
    */
  var cumulative: js.UndefOr[Boolean] = js.native
  /**
    * A struct value describing properties of a distribution of numeric values.
    */
  var distribution: js.UndefOr[js.Any] = js.native
  /**
    * A struct value describing properties of a Gauge. Metrics of gauge type
    * show the value of a metric across time, and is aggregated based on the
    * newest value.
    */
  var gauge: js.UndefOr[js.Any] = js.native
  /**
    * Worker-computed aggregate value for internal use by the Dataflow service.
    */
  var internal: js.UndefOr[js.Any] = js.native
  /**
    * Metric aggregation kind.  The possible metric aggregation kinds are
    * &quot;Sum&quot;, &quot;Max&quot;, &quot;Min&quot;, &quot;Mean&quot;,
    * &quot;Set&quot;, &quot;And&quot;, &quot;Or&quot;, and
    * &quot;Distribution&quot;. The specified aggregation kind is
    * case-insensitive.  If omitted, this is not an aggregated value but
    * instead a single metric sample value.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Worker-computed aggregate value for the &quot;Mean&quot; aggregation
    * kind. This holds the count of the aggregated values and is used in
    * combination with mean_sum above to obtain the actual mean aggregate
    * value. The only possible value type is Long.
    */
  var meanCount: js.UndefOr[js.Any] = js.native
  /**
    * Worker-computed aggregate value for the &quot;Mean&quot; aggregation
    * kind. This holds the sum of the aggregated values and is used in
    * combination with mean_count below to obtain the actual mean aggregate
    * value. The only possible value types are Long and Double.
    */
  var meanSum: js.UndefOr[js.Any] = js.native
  /**
    * Name of the metric.
    */
  var name: js.UndefOr[SchemaMetricStructuredName] = js.native
  /**
    * Worker-computed aggregate value for aggregation kinds &quot;Sum&quot;,
    * &quot;Max&quot;, &quot;Min&quot;, &quot;And&quot;, and &quot;Or&quot;.
    * The possible value types are Long, Double, and Boolean.
    */
  var scalar: js.UndefOr[js.Any] = js.native
  /**
    * Worker-computed aggregate value for the &quot;Set&quot; aggregation kind.
    * The only possible value type is a list of Values whose type can be Long,
    * Double, or String, according to the metric&#39;s type.  All Values in the
    * list must be of the same type.
    */
  var set: js.UndefOr[js.Any] = js.native
  /**
    * Timestamp associated with the metric value. Optional when workers are
    * reporting work progress; it will be filled in responses from the metrics
    * API.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object SchemaMetricUpdate {
  @scala.inline
  def apply(): SchemaMetricUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetricUpdate]
  }
  @scala.inline
  implicit class SchemaMetricUpdateOps[Self <: SchemaMetricUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCumulative(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cumulative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCumulative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cumulative")(js.undefined)
        ret
    }
    @scala.inline
    def withDistribution(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distribution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistribution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distribution")(js.undefined)
        ret
    }
    @scala.inline
    def withGauge(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gauge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGauge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gauge")(js.undefined)
        ret
    }
    @scala.inline
    def withInternal(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInternal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internal")(js.undefined)
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
    def withMeanCount(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meanCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeanCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meanCount")(js.undefined)
        ret
    }
    @scala.inline
    def withMeanSum(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meanSum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeanSum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meanSum")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: SchemaMetricStructuredName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withScalar(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScalar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalar")(js.undefined)
        ret
    }
    @scala.inline
    def withSet(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(js.undefined)
        ret
    }
  }
  
}

