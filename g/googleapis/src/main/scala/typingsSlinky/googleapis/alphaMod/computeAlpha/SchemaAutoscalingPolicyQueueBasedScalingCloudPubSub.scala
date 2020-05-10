package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration parameters for scaling based on Cloud Pub/Sub subscription
  * queue.
  */
@js.native
trait SchemaAutoscalingPolicyQueueBasedScalingCloudPubSub extends js.Object {
  /**
    * Cloud Pub/Sub subscription used for scaling. Provide the partial URL
    * (starting with projects/) or just the subscription name. The subscription
    * must be assigned to the topic specified in topicName and must be in a
    * pull configuration. The subscription must belong to the same project as
    * the Autoscaler.
    */
  var subscription: js.UndefOr[String] = js.native
  /**
    * Cloud Pub/Sub topic used for scaling. Provide the partial URL or partial
    * URL (starting with projects/) or just the topic name. The topic must
    * belong to the same project as the Autoscaler resource.
    */
  var topic: js.UndefOr[String] = js.native
}

object SchemaAutoscalingPolicyQueueBasedScalingCloudPubSub {
  @scala.inline
  def apply(): SchemaAutoscalingPolicyQueueBasedScalingCloudPubSub = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoscalingPolicyQueueBasedScalingCloudPubSub]
  }
  @scala.inline
  implicit class SchemaAutoscalingPolicyQueueBasedScalingCloudPubSubOps[Self <: SchemaAutoscalingPolicyQueueBasedScalingCloudPubSub] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubscription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(js.undefined)
        ret
    }
    @scala.inline
    def withTopic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topic")(js.undefined)
        ret
    }
  }
  
}

