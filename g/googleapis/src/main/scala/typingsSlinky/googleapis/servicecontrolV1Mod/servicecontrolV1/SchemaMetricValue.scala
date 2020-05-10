package typingsSlinky.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a single metric value.
  */
@js.native
trait SchemaMetricValue extends js.Object {
  /**
    * A boolean value.
    */
  var boolValue: js.UndefOr[Boolean] = js.native
  /**
    * A distribution value.
    */
  var distributionValue: js.UndefOr[SchemaDistribution] = js.native
  /**
    * A double precision floating point value.
    */
  var doubleValue: js.UndefOr[Double] = js.native
  /**
    * The end of the time period over which this metric value&#39;s measurement
    * applies.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * A signed 64-bit integer value.
    */
  var int64Value: js.UndefOr[String] = js.native
  /**
    * The labels describing the metric value. See comments on
    * google.api.servicecontrol.v1.Operation.labels for the overriding
    * relationship.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * A money value.
    */
  var moneyValue: js.UndefOr[SchemaMoney] = js.native
  /**
    * The start of the time period over which this metric value&#39;s
    * measurement applies. The time period has different semantics for
    * different metric types (cumulative, delta, and gauge). See the metric
    * definition documentation in the service configuration for details.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * A text string value.
    */
  var stringValue: js.UndefOr[String] = js.native
}

object SchemaMetricValue {
  @scala.inline
  def apply(): SchemaMetricValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetricValue]
  }
  @scala.inline
  implicit class SchemaMetricValueOps[Self <: SchemaMetricValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoolValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoolValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDistributionValue(value: SchemaDistribution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distributionValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistributionValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distributionValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDoubleValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoubleValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleValue")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(js.undefined)
        ret
    }
    @scala.inline
    def withInt64Value(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("int64Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInt64Value: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("int64Value")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withMoneyValue(value: SchemaMoney): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moneyValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoneyValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moneyValue")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStringValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStringValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringValue")(js.undefined)
        ret
    }
  }
  
}

