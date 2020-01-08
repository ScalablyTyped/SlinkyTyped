package typingsSlinky.atGoogleDashCloudPubsub

import typingsSlinky.atGoogleDashCloudPubsub.atGoogleDashCloudPubsubStrings.messageRetentionDuration
import typingsSlinky.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1.IPushConfig
import typingsSlinky.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1.ISubscription
import typingsSlinky.atGoogleDashCloudPubsub.buildSrcIamMod.IAM
import typingsSlinky.atGoogleDashCloudPubsub.buildSrcPubsubMod.EmptyCallback
import typingsSlinky.atGoogleDashCloudPubsub.buildSrcPubsubMod.EmptyResponse
import typingsSlinky.atGoogleDashCloudPubsub.buildSrcPubsubMod.ExistsCallback
import typingsSlinky.atGoogleDashCloudPubsub.buildSrcPubsubMod.ExistsResponse
import typingsSlinky.atGoogleDashCloudPubsub.buildSrcPubsubMod.Omit
import typingsSlinky.atGoogleDashCloudPubsub.buildSrcPubsubMod.PubSub
import typingsSlinky.atGoogleDashCloudPubsub.buildSrcPubsubMod.RequestCallback
import typingsSlinky.atGoogleDashCloudPubsub.buildSrcPubsubMod.RequestConfig
import typingsSlinky.atGoogleDashCloudPubsub.buildSrcPubsubMod.ResourceCallback
import typingsSlinky.atGoogleDashCloudPubsub.buildSrcSnapshotMod.CreateSnapshotCallback
import typingsSlinky.atGoogleDashCloudPubsub.buildSrcSnapshotMod.CreateSnapshotResponse
import typingsSlinky.atGoogleDashCloudPubsub.buildSrcSnapshotMod.SeekCallback
import typingsSlinky.atGoogleDashCloudPubsub.buildSrcSnapshotMod.SeekResponse
import typingsSlinky.atGoogleDashCloudPubsub.buildSrcSnapshotMod.Snapshot
import typingsSlinky.atGoogleDashCloudPubsub.buildSrcSubscriberMod.SubscriberOptions
import typingsSlinky.atGoogleDashCloudPubsub.buildSrcTopicMod.Topic
import typingsSlinky.googleDashGax.buildSrcGaxMod.CallOptions
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub/build/src/subscription", JSImport.Namespace)
@js.native
object buildSrcSubscriptionMod extends js.Object {
  @js.native
  class Subscription protected () extends EventEmitter {
    def this(pubsub: PubSub, name: String) = this()
    def this(pubsub: PubSub, name: String, options: SubscriptionOptions) = this()
    /**
      * Watches for incoming message event handlers and open/closes the
      * subscriber as needed.
      *
      * @private
      */
    var _listen: js.Any = js.native
    var _subscriber: js.Any = js.native
    var iam: IAM = js.native
    /**
      * Indicates if the Subscription is open and receiving messages.
      *
      * @type {boolean}
      */
    val isOpen: Boolean = js.native
    var metadata: js.UndefOr[ISubscription] = js.native
    var name: String = js.native
    /**
      * @type {string}
      */
    val projectId: String = js.native
    var pubsub: PubSub = js.native
    @JSName("request")
    var request_Original: Fn_Callback = js.native
    var topic: js.UndefOr[Topic | String] = js.native
    def close(): js.Promise[Unit] = js.native
    def close(callback: SubscriptionCloseCallback): Unit = js.native
    def create(): js.Promise[CreateSubscriptionResponse] = js.native
    def create(callback: CreateSubscriptionCallback): Unit = js.native
    def create(options: CreateSubscriptionOptions): js.Promise[CreateSubscriptionResponse] = js.native
    def create(options: CreateSubscriptionOptions, callback: CreateSubscriptionCallback): Unit = js.native
    def createSnapshot(name: String): js.Promise[CreateSnapshotResponse] = js.native
    def createSnapshot(name: String, callback: CreateSnapshotCallback): Unit = js.native
    def createSnapshot(name: String, gaxOpts: CallOptions): js.Promise[CreateSnapshotResponse] = js.native
    def createSnapshot(name: String, gaxOpts: CallOptions, callback: CreateSnapshotCallback): Unit = js.native
    def delete(): js.Promise[EmptyResponse] = js.native
    def delete(callback: EmptyCallback): Unit = js.native
    def delete(gaxOpts: CallOptions): js.Promise[EmptyResponse] = js.native
    def delete(gaxOpts: CallOptions, callback: EmptyCallback): Unit = js.native
    def exists(): js.Promise[ExistsResponse] = js.native
    def exists(callback: ExistsCallback): Unit = js.native
    def get(): js.Promise[GetSubscriptionResponse] = js.native
    def get(callback: GetSubscriptionCallback): Unit = js.native
    def get(gaxOpts: GetSubscriptionOptions): js.Promise[GetSubscriptionResponse] = js.native
    def get(gaxOpts: GetSubscriptionOptions, callback: GetSubscriptionCallback): Unit = js.native
    def getMetadata(): js.Promise[GetSubscriptionMetadataResponse] = js.native
    def getMetadata(callback: GetSubscriptionMetadataCallback): Unit = js.native
    def getMetadata(gaxOpts: CallOptions): js.Promise[GetSubscriptionMetadataResponse] = js.native
    def getMetadata(gaxOpts: CallOptions, callback: GetSubscriptionMetadataCallback): Unit = js.native
    def modifyPushConfig(config: PushConfig): js.Promise[EmptyResponse] = js.native
    def modifyPushConfig(config: PushConfig, callback: EmptyCallback): Unit = js.native
    def modifyPushConfig(config: PushConfig, gaxOpts: CallOptions): js.Promise[EmptyResponse] = js.native
    def modifyPushConfig(config: PushConfig, gaxOpts: CallOptions, callback: EmptyCallback): Unit = js.native
    /**
      * Opens the Subscription to receive messages. In general this method
      * shouldn't need to be called, unless you wish to receive messages after
      * calling {@link Subscription#close}. Alternatively one could just assign a
      * new `message` event listener which will also re-open the Subscription.
      *
      * @example
      * subscription.on('message', message => message.ack());
      *
      * // Close the subscription.
      * subscription.close(err => {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      *
      *   The subscription has been closed and messages will no longer be received.
      * });
      *
      * // Resume receiving messages.
      * subscription.open();
      */
    def open(): Unit = js.native
    def request[T, R](config: RequestConfig, callback: RequestCallback[T, R]): Unit = js.native
    def seek(snapshot: String): js.Promise[SeekResponse] = js.native
    def seek(snapshot: String, callback: SeekCallback): Unit = js.native
    def seek(snapshot: String, gaxOpts: CallOptions): js.Promise[SeekResponse] = js.native
    def seek(snapshot: String, gaxOpts: CallOptions, callback: SeekCallback): Unit = js.native
    def seek(snapshot: Date): js.Promise[SeekResponse] = js.native
    def seek(snapshot: Date, callback: SeekCallback): Unit = js.native
    def seek(snapshot: Date, gaxOpts: CallOptions): js.Promise[SeekResponse] = js.native
    def seek(snapshot: Date, gaxOpts: CallOptions, callback: SeekCallback): Unit = js.native
    def setMetadata(metadata: SubscriptionMetadata): js.Promise[SetSubscriptionMetadataResponse] = js.native
    def setMetadata(metadata: SubscriptionMetadata, callback: SetSubscriptionMetadataCallback): Unit = js.native
    def setMetadata(metadata: SubscriptionMetadata, gaxOpts: CallOptions): js.Promise[SetSubscriptionMetadataResponse] = js.native
    def setMetadata(metadata: SubscriptionMetadata, gaxOpts: CallOptions, callback: SetSubscriptionMetadataCallback): Unit = js.native
    /**
      * Sets the Subscription options.
      *
      * @param {SubscriberOptions} options The options.
      */
    def setOptions(options: SubscriberOptions): Unit = js.native
    /**
      * Create a Snapshot object. See {@link Subscription#createSnapshot} to
      * create a snapshot.
      *
      * @throws {Error} If a name is not provided.
      *
      * @param {string} name The name of the snapshot.
      * @returns {Snapshot}
      *
      * @example
      * const snapshot = subscription.snapshot('my-snapshot');
      */
    def snapshot(name: String): Snapshot = js.native
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
  
  type CreateSubscriptionCallback = SubscriptionCallback
  type CreateSubscriptionOptions = SubscriptionMetadata with Anon_FlowControl
  type CreateSubscriptionResponse = SubscriptionResponse
  type GetSubscriptionCallback = SubscriptionCallback
  type GetSubscriptionMetadataCallback = MetadataCallback
  type GetSubscriptionMetadataResponse = MetadataResponse
  type GetSubscriptionOptions = CallOptions with Anon_AutoCreate
  type GetSubscriptionResponse = SubscriptionResponse
  type MetadataCallback = RequestCallback[ISubscription, Unit]
  type MetadataResponse = js.Array[ISubscription]
  type PushConfig = IPushConfig
  type SetSubscriptionMetadataCallback = MetadataCallback
  type SetSubscriptionMetadataResponse = MetadataResponse
  type SubscriptionCallback = ResourceCallback[Subscription, ISubscription]
  type SubscriptionCloseCallback = js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  type SubscriptionMetadata = Anon_MessageRetentionDuration with (Omit[ISubscription, messageRetentionDuration])
  type SubscriptionOptions = SubscriberOptions with Anon_TopicOptional
  type SubscriptionResponse = js.Tuple2[Subscription, ISubscription]
}

