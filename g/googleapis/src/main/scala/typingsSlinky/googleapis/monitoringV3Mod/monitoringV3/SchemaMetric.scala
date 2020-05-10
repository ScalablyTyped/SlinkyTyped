package typingsSlinky.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A specific metric, identified by specifying values for all of the labels of
  * a MetricDescriptor.
  */
@js.native
trait SchemaMetric extends js.Object {
  /**
    * The set of label values that uniquely identify this metric. All labels
    * listed in the MetricDescriptor must be assigned values.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * An existing metric type, see google.api.MetricDescriptor. For example,
    * custom.googleapis.com/invoice/paid/amount.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaMetric {
  @scala.inline
  def apply(): SchemaMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetric]
  }
  @scala.inline
  implicit class SchemaMetricOps[Self <: SchemaMetric] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

