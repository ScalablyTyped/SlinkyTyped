package typingsSlinky.pulumiKubernetes.outputMod.autoscaling.v1

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
  val currentCPUUtilizationPercentage: Double = js.native
  /**
    * current number of replicas of pods managed by this autoscaler.
    */
  val currentReplicas: Double = js.native
  /**
    * desired number of replicas of pods managed by this autoscaler.
    */
  val desiredReplicas: Double = js.native
  /**
    * last time the HorizontalPodAutoscaler scaled the number of pods; used by the autoscaler to
    * control how often the number of pods is changed.
    */
  val lastScaleTime: String = js.native
  /**
    * most recent generation observed by this autoscaler.
    */
  val observedGeneration: Double = js.native
}

object HorizontalPodAutoscalerStatus {
  @scala.inline
  def apply(
    currentCPUUtilizationPercentage: Double,
    currentReplicas: Double,
    desiredReplicas: Double,
    lastScaleTime: String,
    observedGeneration: Double
  ): HorizontalPodAutoscalerStatus = {
    val __obj = js.Dynamic.literal(currentCPUUtilizationPercentage = currentCPUUtilizationPercentage.asInstanceOf[js.Any], currentReplicas = currentReplicas.asInstanceOf[js.Any], desiredReplicas = desiredReplicas.asInstanceOf[js.Any], lastScaleTime = lastScaleTime.asInstanceOf[js.Any], observedGeneration = observedGeneration.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalPodAutoscalerStatus]
  }
  @scala.inline
  implicit class HorizontalPodAutoscalerStatusOps[Self <: HorizontalPodAutoscalerStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentCPUUtilizationPercentage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentCPUUtilizationPercentage")(value.asInstanceOf[js.Any])
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

