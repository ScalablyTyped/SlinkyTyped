package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricData extends js.Object {
  /**
    * The name of the metric.
    */
  var MetricName: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.MetricName] = js.native
  /**
    * The date and time that the algorithm emitted the metric.
    */
  var Timestamp: js.UndefOr[js.Date] = js.native
  /**
    * The value of the metric.
    */
  var Value: js.UndefOr[Float] = js.native
}

object MetricData {
  @scala.inline
  def apply(MetricName: MetricName = null, Timestamp: js.Date = null, Value: js.UndefOr[Float] = js.undefined): MetricData = {
    val __obj = js.Dynamic.literal()
    if (MetricName != null) __obj.updateDynamic("MetricName")(MetricName.asInstanceOf[js.Any])
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp.asInstanceOf[js.Any])
    if (!js.isUndefined(Value)) __obj.updateDynamic("Value")(Value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricData]
  }
}

