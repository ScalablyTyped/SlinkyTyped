package typingsSlinky.pulumiKubernetes.outputMod.autoscaling.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HorizontalPodAutoscalerStatus describes the current status of a horizontal pod autoscaler.
  */
@js.native
trait HorizontalPodAutoscalerStatus extends js.Object {
  /**
    * conditions is the set of conditions required for this autoscaler to scale its target, and
    * indicates whether or not those conditions are met.
    */
  val conditions: js.Array[HorizontalPodAutoscalerCondition] = js.native
  /**
    * currentMetrics is the last read state of the metrics used by this autoscaler.
    */
  val currentMetrics: js.Array[MetricStatus] = js.native
  /**
    * currentReplicas is current number of replicas of pods managed by this autoscaler, as last
    * seen by the autoscaler.
    */
  val currentReplicas: Double = js.native
  /**
    * desiredReplicas is the desired number of replicas of pods managed by this autoscaler, as
    * last calculated by the autoscaler.
    */
  val desiredReplicas: Double = js.native
  /**
    * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods, used
    * by the autoscaler to control how often the number of pods is changed.
    */
  val lastScaleTime: String = js.native
  /**
    * observedGeneration is the most recent generation observed by this autoscaler.
    */
  val observedGeneration: Double = js.native
}

object HorizontalPodAutoscalerStatus {
  @scala.inline
  def apply(
    conditions: js.Array[HorizontalPodAutoscalerCondition],
    currentMetrics: js.Array[MetricStatus],
    currentReplicas: Double,
    desiredReplicas: Double,
    lastScaleTime: String,
    observedGeneration: Double
  ): HorizontalPodAutoscalerStatus = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any], currentMetrics = currentMetrics.asInstanceOf[js.Any], currentReplicas = currentReplicas.asInstanceOf[js.Any], desiredReplicas = desiredReplicas.asInstanceOf[js.Any], lastScaleTime = lastScaleTime.asInstanceOf[js.Any], observedGeneration = observedGeneration.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalPodAutoscalerStatus]
  }
  @scala.inline
  implicit class HorizontalPodAutoscalerStatusOps[Self <: HorizontalPodAutoscalerStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConditions(value: js.Array[HorizontalPodAutoscalerCondition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentMetrics(value: js.Array[MetricStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentReplicas(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentReplicas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDesiredReplicas(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredReplicas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastScaleTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastScaleTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObservedGeneration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observedGeneration")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

