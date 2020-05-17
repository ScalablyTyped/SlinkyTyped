package typingsSlinky.googleCloudPubsub.srcPubsubMod

import typingsSlinky.googleCloudPubsub.topicMod.GetTopicSubscriptionsCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.googleCloudPubsub.srcPubsubMod.GetAllSubscriptionsCallback
  - typingsSlinky.googleCloudPubsub.topicMod.GetTopicSubscriptionsCallback
*/
trait GetSubscriptionsCallback extends js.Object

object GetSubscriptionsCallback {
  @scala.inline
  implicit def apply(value: GetAllSubscriptionsCallback | GetTopicSubscriptionsCallback): GetSubscriptionsCallback = value.asInstanceOf[GetSubscriptionsCallback]
}

