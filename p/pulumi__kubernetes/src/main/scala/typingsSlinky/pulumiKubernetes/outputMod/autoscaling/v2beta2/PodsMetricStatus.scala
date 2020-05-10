package typingsSlinky.pulumiKubernetes.outputMod.autoscaling.v2beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PodsMetricStatus indicates the current value of a metric describing each pod in the current
  * scale target (for example, transactions-processed-per-second).
  */
@js.native
trait PodsMetricStatus extends js.Object {
  /**
    * current contains the current value for the given metric
    */
  val current: MetricValueStatus = js.native
  /**
    * metric identifies the target metric by name and selector
    */
  val metric: MetricIdentifier = js.native
}

object PodsMetricStatus {
  @scala.inline
  def apply(current: MetricValueStatus, metric: MetricIdentifier): PodsMetricStatus = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], metric = metric.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodsMetricStatus]
  }
  @scala.inline
  implicit class PodsMetricStatusOps[Self <: PodsMetricStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrent(value: MetricValueStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetric(value: MetricIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metric")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

