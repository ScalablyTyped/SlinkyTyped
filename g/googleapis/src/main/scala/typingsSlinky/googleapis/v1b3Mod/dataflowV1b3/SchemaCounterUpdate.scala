package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An update to a Counter sent from a worker.
  */
@js.native
trait SchemaCounterUpdate extends js.Object {
  /**
    * Boolean value for And, Or.
    */
  var boolean: js.UndefOr[Boolean] = js.native
  /**
    * True if this counter is reported as the total cumulative aggregate value
    * accumulated since the worker started working on this WorkItem. By default
    * this is false, indicating that this counter is reported as a delta.
    */
  var cumulative: js.UndefOr[Boolean] = js.native
  /**
    * Distribution data
    */
  var distribution: js.UndefOr[SchemaDistributionUpdate] = js.native
  /**
    * Floating point value for Sum, Max, Min.
    */
  var floatingPoint: js.UndefOr[Double] = js.native
  /**
    * List of floating point numbers, for Set.
    */
  var floatingPointList: js.UndefOr[SchemaFloatingPointList] = js.native
  /**
    * Floating point mean aggregation value for Mean.
    */
  var floatingPointMean: js.UndefOr[SchemaFloatingPointMean] = js.native
  /**
    * Integer value for Sum, Max, Min.
    */
  var integer: js.UndefOr[SchemaSplitInt64] = js.native
  /**
    * Gauge data
    */
  var integerGauge: js.UndefOr[SchemaIntegerGauge] = js.native
  /**
    * List of integers, for Set.
    */
  var integerList: js.UndefOr[SchemaIntegerList] = js.native
  /**
    * Integer mean aggregation value for Mean.
    */
  var integerMean: js.UndefOr[SchemaIntegerMean] = js.native
  /**
    * Value for internally-defined counters used by the Dataflow service.
    */
  var internal: js.UndefOr[js.Any] = js.native
  /**
    * Counter name and aggregation type.
    */
  var nameAndKind: js.UndefOr[SchemaNameAndKind] = js.native
  /**
    * The service-generated short identifier for this counter. The short_id
    * -&gt; (name, metadata) mapping is constant for the lifetime of a job.
    */
  var shortId: js.UndefOr[String] = js.native
  /**
    * List of strings, for Set.
    */
  var stringList: js.UndefOr[SchemaStringList] = js.native
  /**
    * Counter structured name and metadata.
    */
  var structuredNameAndMetadata: js.UndefOr[SchemaCounterStructuredNameAndMetadata] = js.native
}

object SchemaCounterUpdate {
  @scala.inline
  def apply(): SchemaCounterUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCounterUpdate]
  }
  @scala.inline
  implicit class SchemaCounterUpdateOps[Self <: SchemaCounterUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoolean(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoolean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolean")(js.undefined)
        ret
    }
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
    def withDistribution(value: SchemaDistributionUpdate): Self = {
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
    def withFloatingPoint(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatingPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloatingPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatingPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withFloatingPointList(value: SchemaFloatingPointList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatingPointList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloatingPointList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatingPointList")(js.undefined)
        ret
    }
    @scala.inline
    def withFloatingPointMean(value: SchemaFloatingPointMean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatingPointMean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloatingPointMean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatingPointMean")(js.undefined)
        ret
    }
    @scala.inline
    def withInteger(value: SchemaSplitInt64): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integer")(js.undefined)
        ret
    }
    @scala.inline
    def withIntegerGauge(value: SchemaIntegerGauge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integerGauge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntegerGauge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integerGauge")(js.undefined)
        ret
    }
    @scala.inline
    def withIntegerList(value: SchemaIntegerList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integerList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntegerList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integerList")(js.undefined)
        ret
    }
    @scala.inline
    def withIntegerMean(value: SchemaIntegerMean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integerMean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntegerMean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integerMean")(js.undefined)
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
    def withNameAndKind(value: SchemaNameAndKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameAndKind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameAndKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameAndKind")(js.undefined)
        ret
    }
    @scala.inline
    def withShortId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortId")(js.undefined)
        ret
    }
    @scala.inline
    def withStringList(value: SchemaStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStringList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringList")(js.undefined)
        ret
    }
    @scala.inline
    def withStructuredNameAndMetadata(value: SchemaCounterStructuredNameAndMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structuredNameAndMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStructuredNameAndMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structuredNameAndMetadata")(js.undefined)
        ret
    }
  }
  
}

