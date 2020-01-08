package typingsSlinky.atGoogleDashCloudPubsub

import typingsSlinky.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1.IReceivedMessage
import typingsSlinky.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1.ISubscription
import typingsSlinky.atGoogleDashCloudPubsub.buildSrcPublisherMod.PublishOptions
import typingsSlinky.atGoogleDashCloudPubsub.buildSrcPubsubMod.ClientConfig
import typingsSlinky.atGoogleDashCloudPubsub.buildSrcSubscriberMod.Subscriber
import typingsSlinky.atGoogleDashCloudPubsub.buildSrcSubscriptionMod.SubscriptionMetadata
import typingsSlinky.atGoogleDashCloudPubsub.buildSrcSubscriptionMod.SubscriptionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub", JSImport.Namespace)
@js.native
object atGoogleDashCloudPubsubMod extends js.Object {
  @js.native
  class IAM protected ()
    extends typingsSlinky.atGoogleDashCloudPubsub.buildSrcIamMod.IAM {
    def this(pubsub: typingsSlinky.atGoogleDashCloudPubsub.buildSrcPubsubMod.PubSub, id: String) = this()
  }
  
  @js.native
  class Message protected ()
    extends typingsSlinky.atGoogleDashCloudPubsub.buildSrcSubscriberMod.Message {
    /**
      * @hideconstructor
      *
      * @param {Subscriber} sub The parent subscriber.
      * @param {object} message The raw message response.
      */
    def this(sub: Subscriber, hasAckIdMessage: IReceivedMessage) = this()
  }
  
  @js.native
  class PubSub ()
    extends typingsSlinky.atGoogleDashCloudPubsub.buildSrcPubsubMod.PubSub {
    def this(options: ClientConfig) = this()
  }
  
  @js.native
  class Snapshot protected ()
    extends typingsSlinky.atGoogleDashCloudPubsub.buildSrcSnapshotMod.Snapshot {
    def this(parent: PubSub, name: String) = this()
    def this(parent: typingsSlinky.atGoogleDashCloudPubsub.buildSrcSubscriptionMod.Subscription, name: String) = this()
  }
  
  @js.native
  class Subscription protected ()
    extends typingsSlinky.atGoogleDashCloudPubsub.buildSrcSubscriptionMod.Subscription {
    def this(pubsub: typingsSlinky.atGoogleDashCloudPubsub.buildSrcPubsubMod.PubSub, name: String) = this()
    def this(
      pubsub: typingsSlinky.atGoogleDashCloudPubsub.buildSrcPubsubMod.PubSub,
      name: String,
      options: SubscriptionOptions
    ) = this()
  }
  
  @js.native
  class Topic protected ()
    extends typingsSlinky.atGoogleDashCloudPubsub.buildSrcTopicMod.Topic {
    def this(pubsub: typingsSlinky.atGoogleDashCloudPubsub.buildSrcPubsubMod.PubSub, name: String) = this()
    def this(
      pubsub: typingsSlinky.atGoogleDashCloudPubsub.buildSrcPubsubMod.PubSub,
      name: String,
      options: PublishOptions
    ) = this()
  }
  
  val v1: js.Any = js.native
  /* static members */
  @js.native
  object Snapshot extends js.Object {
    def formatName_(projectId: String, name: String): String = js.native
  }
  
  /* static members */
  @js.native
  object Subscription extends js.Object {
    /*!
      * Formats Subscription metadata.
      *
      * @private
      */
    def formatMetadata_(metadata: SubscriptionMetadata): ISubscription = js.native
    /*!
      * Format the name of a subscription. A subscription's full name is in the
      * format of projects/{projectId}/subscriptions/{subName}.
      *
      * @private
      */
    def formatName_(projectId: String, name: String): String = js.native
  }
  
  /* static members */
  @js.native
  object Topic extends js.Object {
    /**
      * Format the name of a topic. A Topic's full name is in the format of
      * 'projects/{projectId}/topics/{topicName}'.
      *
      * @private
      *
      * @return {string}
      */
    def formatName_(projectId: String, name: String): String = js.native
  }
  
}

