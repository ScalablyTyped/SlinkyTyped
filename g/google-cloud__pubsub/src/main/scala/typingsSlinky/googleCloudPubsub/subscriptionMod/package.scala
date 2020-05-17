package typingsSlinky.googleCloudPubsub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object subscriptionMod {
  type CreateSubscriptionCallback = typingsSlinky.googleCloudPubsub.subscriptionMod.SubscriptionCallback
  type CreateSubscriptionResponse = typingsSlinky.googleCloudPubsub.subscriptionMod.SubscriptionResponse
  type GetSubscriptionCallback = typingsSlinky.googleCloudPubsub.subscriptionMod.SubscriptionCallback
  type GetSubscriptionMetadataCallback = typingsSlinky.googleCloudPubsub.subscriptionMod.MetadataCallback
  type GetSubscriptionMetadataResponse = typingsSlinky.googleCloudPubsub.subscriptionMod.MetadataResponse
  type GetSubscriptionResponse = typingsSlinky.googleCloudPubsub.subscriptionMod.SubscriptionResponse
  type MetadataCallback = typingsSlinky.googleCloudPubsub.srcPubsubMod.RequestCallback[
    typingsSlinky.googleCloudPubsub.pubsubMod.google.pubsub.v1.ISubscription, 
    scala.Unit
  ]
  type MetadataResponse = js.Array[typingsSlinky.googleCloudPubsub.pubsubMod.google.pubsub.v1.ISubscription]
  type OidcToken = typingsSlinky.googleCloudPubsub.pubsubMod.google.pubsub.v1.PushConfig.IOidcToken
  type PushConfig = typingsSlinky.googleCloudPubsub.pubsubMod.google.pubsub.v1.IPushConfig
  type SetSubscriptionMetadataCallback = typingsSlinky.googleCloudPubsub.subscriptionMod.MetadataCallback
  type SetSubscriptionMetadataResponse = typingsSlinky.googleCloudPubsub.subscriptionMod.MetadataResponse
  type SubscriptionCallback = typingsSlinky.googleCloudPubsub.srcPubsubMod.ResourceCallback[
    typingsSlinky.googleCloudPubsub.subscriptionMod.Subscription, 
    typingsSlinky.googleCloudPubsub.pubsubMod.google.pubsub.v1.ISubscription
  ]
  type SubscriptionCloseCallback = js.Function1[/* err */ js.UndefOr[js.Error], scala.Unit]
  type SubscriptionResponse = js.Tuple2[
    typingsSlinky.googleCloudPubsub.subscriptionMod.Subscription, 
    typingsSlinky.googleCloudPubsub.pubsubMod.google.pubsub.v1.ISubscription
  ]
}
