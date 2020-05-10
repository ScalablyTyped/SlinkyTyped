package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration parameters of autoscaling based on queuing system.
  */
@js.native
trait SchemaAutoscalingPolicyQueueBasedScaling extends js.Object {
  /**
    * Scaling based on the average number of tasks in the queue per each active
    * instance. The autoscaler keeps the average number of tasks per instance
    * below this number, based on data collected in the last couple of minutes.
    * The autoscaler will also take into account incoming tasks when
    * calculating when to scale.
    */
  var acceptableBacklogPerInstance: js.UndefOr[Double] = js.native
  /**
    * Configuration for Cloud Pub/Sub subscription queue.
    */
  var cloudPubSub: js.UndefOr[SchemaAutoscalingPolicyQueueBasedScalingCloudPubSub] = js.native
  /**
    * The scaling algorithm will also calculate throughput estimates on its
    * own; if you explicitly provide this value, the autoscaler will take into
    * account your value as well as automatic estimates when deciding how to
    * scale.
    */
  var singleWorkerThroughputPerSec: js.UndefOr[Double] = js.native
}

object SchemaAutoscalingPolicyQueueBasedScaling {
  @scala.inline
  def apply(): SchemaAutoscalingPolicyQueueBasedScaling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoscalingPolicyQueueBasedScaling]
  }
  @scala.inline
  implicit class SchemaAutoscalingPolicyQueueBasedScalingOps[Self <: SchemaAutoscalingPolicyQueueBasedScaling] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptableBacklogPerInstance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptableBacklogPerInstance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptableBacklogPerInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptableBacklogPerInstance")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudPubSub(value: SchemaAutoscalingPolicyQueueBasedScalingCloudPubSub): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudPubSub")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudPubSub: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudPubSub")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleWorkerThroughputPerSec(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleWorkerThroughputPerSec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleWorkerThroughputPerSec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleWorkerThroughputPerSec")(js.undefined)
        ret
    }
  }
  
}

