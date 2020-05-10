package typingsSlinky.pulumiKubernetes.inputMod.autoscaling.v2beta2

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HorizontalPodAutoscalerSpec describes the desired functionality of the
  * HorizontalPodAutoscaler.
  */
@js.native
trait HorizontalPodAutoscalerSpec extends js.Object {
  /**
    * maxReplicas is the upper limit for the number of replicas to which the autoscaler can scale
    * up. It cannot be less that minReplicas.
    */
  var maxReplicas: Input[Double] = js.native
  /**
    * metrics contains the specifications for which to use to calculate the desired replica count
    * (the maximum replica count across all metrics will be used).  The desired replica count is
    * calculated multiplying the ratio between the target value and the current value by the
    * current number of pods.  Ergo, metrics used must decrease as the pod count is increased,
    * and vice-versa.  See the individual metric source types for more information about how each
    * type of metric must respond. If not set, the default metric will be set to 80% average CPU
    * utilization.
    */
  var metrics: js.UndefOr[Input[js.Array[Input[MetricSpec]]]] = js.native
  /**
    * minReplicas is the lower limit for the number of replicas to which the autoscaler can scale
    * down.  It defaults to 1 pod.  minReplicas is allowed to be 0 if the alpha feature gate
    * HPAScaleToZero is enabled and at least one Object or External metric is configured.
    * Scaling is active as long as at least one metric value is available.
    */
  var minReplicas: js.UndefOr[Input[Double]] = js.native
  /**
    * scaleTargetRef points to the target resource to scale, and is used to the pods for which
    * metrics should be collected, as well as to actually change the replica count.
    */
  var scaleTargetRef: Input[CrossVersionObjectReference] = js.native
}

object HorizontalPodAutoscalerSpec {
  @scala.inline
  def apply(maxReplicas: Input[Double], scaleTargetRef: Input[CrossVersionObjectReference]): HorizontalPodAutoscalerSpec = {
    val __obj = js.Dynamic.literal(maxReplicas = maxReplicas.asInstanceOf[js.Any], scaleTargetRef = scaleTargetRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalPodAutoscalerSpec]
  }
  @scala.inline
  implicit class HorizontalPodAutoscalerSpecOps[Self <: HorizontalPodAutoscalerSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxReplicas(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxReplicas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaleTargetRef(value: Input[CrossVersionObjectReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleTargetRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetrics(value: Input[js.Array[Input[MetricSpec]]]): Self = {
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
    def withMinReplicas(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minReplicas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinReplicas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minReplicas")(js.undefined)
        ret
    }
  }
  
}

