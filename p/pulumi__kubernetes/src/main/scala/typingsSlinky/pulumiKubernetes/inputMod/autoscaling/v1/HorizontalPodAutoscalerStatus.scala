package typingsSlinky.pulumiKubernetes.inputMod.autoscaling.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * current status of a horizontal pod autoscaler
  */
@js.native
trait HorizontalPodAutoscalerStatus extends js.Object {
  /**
    * current average CPU utilization over all pods, represented as a percentage of requested
    * CPU, e.g. 70 means that an average pod is using now 70% of its requested CPU.
    */
  var currentCPUUtilizationPercentage: js.UndefOr[Input[Double]] = js.native
  /**
    * current number of replicas of pods managed by this autoscaler.
    */
  var currentReplicas: Input[Double] = js.native
  /**
    * desired number of replicas of pods managed by this autoscaler.
    */
  var desiredReplicas: Input[Double] = js.native
  /**
    * last time the HorizontalPodAutoscaler scaled the number of pods; used by the autoscaler to
    * control how often the number of pods is changed.
    */
  var lastScaleTime: js.UndefOr[Input[String]] = js.native
  /**
    * most recent generation observed by this autoscaler.
    */
  var observedGeneration: js.UndefOr[Input[Double]] = js.native
}

object HorizontalPodAutoscalerStatus {
  @scala.inline
  def apply(currentReplicas: Input[Double], desiredReplicas: Input[Double]): HorizontalPodAutoscalerStatus = {
    val __obj = js.Dynamic.literal(currentReplicas = currentReplicas.asInstanceOf[js.Any], desiredReplicas = desiredReplicas.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalPodAutoscalerStatus]
  }
  @scala.inline
  implicit class HorizontalPodAutoscalerStatusOps[Self <: HorizontalPodAutoscalerStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withCurrentCPUUtilizationPercentage(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentCPUUtilizationPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentCPUUtilizationPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentCPUUtilizationPercentage")(js.undefined)
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

