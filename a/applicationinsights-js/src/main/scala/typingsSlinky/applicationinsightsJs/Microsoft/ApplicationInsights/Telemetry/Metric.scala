package typingsSlinky.applicationinsightsJs.Microsoft.ApplicationInsights.Telemetry

import typingsSlinky.applicationinsightsJs.AI.DataPoint
import typingsSlinky.applicationinsightsJs.Microsoft.ApplicationInsights.ISerializable
import typingsSlinky.applicationinsightsJs.anon.Metrics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Metric extends ISerializable {
  @JSName("aiDataContract")
  var aiDataContract_Metric: Metrics = js.native
  var metrics: js.Array[DataPoint] = js.native
  var properties: js.Any = js.native
  var ver: Double = js.native
}

object Metric {
  @scala.inline
  def apply(aiDataContract: Metrics, metrics: js.Array[DataPoint], properties: js.Any, ver: Double): Metric = {
    val __obj = js.Dynamic.literal(aiDataContract = aiDataContract.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metric]
  }
  @scala.inline
  implicit class MetricOps[Self <: Metric] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAiDataContract(value: Metrics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aiDataContract")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetrics(value: js.Array[DataPoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ver")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

