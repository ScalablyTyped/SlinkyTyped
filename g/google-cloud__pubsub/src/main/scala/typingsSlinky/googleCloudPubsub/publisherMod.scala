package typingsSlinky.googleCloudPubsub

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleCloudPubsub.messageBatchMod.BatchPublishOptions
import typingsSlinky.googleCloudPubsub.opentelemetryTracingMod.OpenTelemetryTracer
import typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.IPubsubMessage
import typingsSlinky.googleCloudPubsub.publisherMessageQueuesMod.OrderedQueue
import typingsSlinky.googleCloudPubsub.publisherMessageQueuesMod.Queue
import typingsSlinky.googleCloudPubsub.pubsubMod.EmptyCallback
import typingsSlinky.googleCloudPubsub.pubsubMod.RequestCallback
import typingsSlinky.googleCloudPubsub.topicMod.Topic
import typingsSlinky.googleGax.gaxMod.CallOptions
import typingsSlinky.node.Buffer
import typingsSlinky.opentelemetryApi.spanMod.Span
import typingsSlinky.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object publisherMod {
  
  @JSImport("@google-cloud/pubsub/build/src/publisher", "BATCH_LIMITS")
  @js.native
  val BATCH_LIMITS: BatchPublishOptions = js.native
  
  @JSImport("@google-cloud/pubsub/build/src/publisher", "Publisher")
  @js.native
  class Publisher protected () extends StObject {
    def this(topic: Topic) = this()
    def this(topic: Topic, options: PublishOptions) = this()
    
    /**
      * Constructs an OpenTelemetry span
      *
      * @private
      *
      * @param {PubsubMessage} message The message to create a span for
      */
    def constructSpan(message: PubsubMessage): js.UndefOr[Span] = js.native
    
    def flush(): js.Promise[Unit] = js.native
    def flush(callback: EmptyCallback): Unit = js.native
    
    var orderedQueues: Map[String, OrderedQueue] = js.native
    
    def publish(data: Buffer): js.Promise[String] = js.native
    def publish(data: Buffer, attributes: Attributes): js.Promise[String] = js.native
    def publish(data: Buffer, attributes: Attributes, callback: PublishCallback): Unit = js.native
    def publish(data: Buffer, callback: PublishCallback): Unit = js.native
    
    /**
      * Publish the provided message.
      *
      * @private
      *
      * @throws {TypeError} If data is not a Buffer object.
      * @throws {TypeError} If any value in `attributes` object is not a string.
      *
      * @param {PubsubMessage} [message] Options for this message.
      * @param {PublishCallback} [callback] Callback function.
      */
    def publishMessage(message: PubsubMessage, callback: PublishCallback): Unit = js.native
    
    var queue: Queue = js.native
    
    /**
      * Indicates to the publisher that it is safe to continue publishing for the
      * supplied ordering key.
      *
      * @private
      *
      * @param {string} key The ordering key to continue publishing for.
      */
    def resumePublishing(key: String): Unit = js.native
    
    /**
      * Sets the Publisher options.
      *
      * @private
      *
      * @param {PublishOptions} options The publisher options.
      */
    def setOptions(): Unit = js.native
    def setOptions(options: PublishOptions): Unit = js.native
    
    var settings: PublishOptions = js.native
    
    var topic: Topic = js.native
    
    var tracing: js.UndefOr[OpenTelemetryTracer] = js.native
  }
  
  type Attributes = StringDictionary[String]
  
  type PublishCallback = RequestCallback[String, Unit]
  
  @js.native
  trait PublishOptions extends StObject {
    
    var batching: js.UndefOr[BatchPublishOptions] = js.native
    
    var enableOpenTelemetryTracing: js.UndefOr[Boolean] = js.native
    
    var gaxOpts: js.UndefOr[CallOptions] = js.native
    
    var messageOrdering: js.UndefOr[Boolean] = js.native
  }
  object PublishOptions {
    
    @scala.inline
    def apply(): PublishOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PublishOptions]
    }
    
    @scala.inline
    implicit class PublishOptionsMutableBuilder[Self <: PublishOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBatching(value: BatchPublishOptions): Self = StObject.set(x, "batching", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatchingUndefined: Self = StObject.set(x, "batching", js.undefined)
      
      @scala.inline
      def setEnableOpenTelemetryTracing(value: Boolean): Self = StObject.set(x, "enableOpenTelemetryTracing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableOpenTelemetryTracingUndefined: Self = StObject.set(x, "enableOpenTelemetryTracing", js.undefined)
      
      @scala.inline
      def setGaxOpts(value: CallOptions): Self = StObject.set(x, "gaxOpts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGaxOptsUndefined: Self = StObject.set(x, "gaxOpts", js.undefined)
      
      @scala.inline
      def setMessageOrdering(value: Boolean): Self = StObject.set(x, "messageOrdering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageOrderingUndefined: Self = StObject.set(x, "messageOrdering", js.undefined)
    }
  }
  
  type PubsubMessage = IPubsubMessage
}
