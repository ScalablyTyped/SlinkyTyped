package typingsSlinky.pulumiKubernetes.inputMod.autoscaling.v2beta1

import typingsSlinky.pulumiPulumi.outputMod.Input
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
  var conditions: Input[js.Array[Input[HorizontalPodAutoscalerCondition]]] = js.native
  /**
    * currentMetrics is the last read state of the metrics used by this autoscaler.
    */
  var currentMetrics: js.UndefOr[Input[js.Array[Input[MetricStatus]]]] = js.native
  /**
    * currentReplicas is current number of replicas of pods managed by this autoscaler, as last
    * seen by the autoscaler.
    */
  var currentReplicas: Input[Double] = js.native
  /**
    * desiredReplicas is the desired number of replicas of pods managed by this autoscaler, as
    * last calculated by the autoscaler.
    */
  var desiredReplicas: Input[Double] = js.native
  /**
    * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods, used
    * by the autoscaler to control how often the number of pods is changed.
    */
  var lastScaleTime: js.UndefOr[Input[String]] = js.native
  /**
    * observedGeneration is the most recent generation observed by this autoscaler.
    */
  var observedGeneration: js.UndefOr[Input[Double]] = js.native
}

object HorizontalPodAutoscalerStatus {
  @scala.inline
  def apply(
    conditions: Input[js.Array[Input[HorizontalPodAutoscalerCondition]]],
    currentReplicas: Input[Double],
    desiredReplicas: Input[Double]
  ): HorizontalPodAutoscalerStatus = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any], currentReplicas = currentReplicas.asInstanceOf[js.Any], desiredReplicas = desiredReplicas.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalPodAutoscalerStatus]
  }
  @scala.inline
  implicit class HorizontalPodAutoscalerStatusOps[Self <: HorizontalPodAutoscalerStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConditions(value: Input[js.Array[Input[HorizontalPodAutoscalerCondition]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentReplicas(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentReplicas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDesiredReplicas(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredReplicas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentMetrics(value: Input[js.Array[Input[MetricStatus]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentMetrics")(js.undefined)
        ret
    }
    @scala.inline
    def withLastScaleTime(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastScaleTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastScaleTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastScaleTime")(js.undefined)
        ret
    }
    @scala.inline
    def withObservedGeneration(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observedGeneration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObservedGeneration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observedGeneration")(js.undefined)
        ret
    }
  }
  
}

