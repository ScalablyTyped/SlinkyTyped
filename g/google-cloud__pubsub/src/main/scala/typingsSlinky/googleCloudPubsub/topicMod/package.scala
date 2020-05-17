package typingsSlinky.googleCloudPubsub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object topicMod {
  type CreateTopicCallback = typingsSlinky.googleCloudPubsub.topicMod.TopicCallback
  type CreateTopicResponse = typingsSlinky.googleCloudPubsub.topicMod.TopicResponse
  type GetTopicCallback = typingsSlinky.googleCloudPubsub.topicMod.TopicCallback
  type GetTopicMetadataCallback = typingsSlinky.googleCloudPubsub.topicMod.MetadataCallback
  type GetTopicMetadataResponse = typingsSlinky.googleCloudPubsub.topicMod.MetadataResponse
  type GetTopicResponse = typingsSlinky.googleCloudPubsub.topicMod.TopicResponse
  type GetTopicSubscriptionsCallback = typingsSlinky.googleCloudPubsub.srcPubsubMod.RequestCallback[
    typingsSlinky.googleCloudPubsub.subscriptionMod.Subscription, 
    typingsSlinky.googleCloudPubsub.pubsubMod.google.pubsub.v1.IListTopicSubscriptionsResponse
  ]
  type GetTopicSubscriptionsResponse = typingsSlinky.googleCloudPubsub.srcPubsubMod.PagedResponse[
    typingsSlinky.googleCloudPubsub.subscriptionMod.Subscription, 
    typingsSlinky.googleCloudPubsub.pubsubMod.google.pubsub.v1.IListTopicSubscriptionsResponse
  ]
  type MetadataCallback = typingsSlinky.googleCloudPubsub.srcPubsubMod.RequestCallback[typingsSlinky.googleCloudPubsub.topicMod.TopicMetadata, scala.Unit]
  type MetadataResponse = js.Array[typingsSlinky.googleCloudPubsub.topicMod.TopicMetadata]
  type SetTopicMetadataCallback = typingsSlinky.googleCloudPubsub.topicMod.MetadataCallback
  type SetTopicMetadataResponse = typingsSlinky.googleCloudPubsub.topicMod.MetadataResponse
  type TopicCallback = typingsSlinky.googleCloudPubsub.srcPubsubMod.ResourceCallback[
    typingsSlinky.googleCloudPubsub.topicMod.Topic, 
    typingsSlinky.googleCloudPubsub.topicMod.TopicMetadata
  ]
  type TopicMetadata = typingsSlinky.googleCloudPubsub.pubsubMod.google.pubsub.v1.ITopic
  type TopicResponse = js.Tuple2[
    typingsSlinky.googleCloudPubsub.topicMod.Topic, 
    typingsSlinky.googleCloudPubsub.topicMod.TopicMetadata
  ]
}
