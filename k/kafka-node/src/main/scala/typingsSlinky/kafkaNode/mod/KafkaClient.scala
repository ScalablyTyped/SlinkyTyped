package typingsSlinky.kafkaNode.mod

import typingsSlinky.kafkaNode.kafkaNodeStrings.brokersChanged
import typingsSlinky.kafkaNode.kafkaNodeStrings.close
import typingsSlinky.kafkaNode.kafkaNodeStrings.connect
import typingsSlinky.kafkaNode.kafkaNodeStrings.error
import typingsSlinky.kafkaNode.kafkaNodeStrings.ready
import typingsSlinky.kafkaNode.kafkaNodeStrings.reconnect
import typingsSlinky.kafkaNode.kafkaNodeStrings.socket_error
import typingsSlinky.kafkaNode.kafkaNodeStrings.zkReconnect
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kafka-node", "KafkaClient")
@js.native
class KafkaClient () extends EventEmitter {
  def this(options: KafkaClientOptions) = this()
  
  def close(): Unit = js.native
  def close(cb: js.Function0[Unit]): Unit = js.native
  
  def connect(): Unit = js.native
  
  def createTopics(
    topics: js.Array[CreateTopicRequest],
    callback: js.Function2[/* error */ js.Any, /* result */ js.Array[CreateTopicResponse], _]
  ): Unit = js.native
  
  def loadMetadataForTopics(
    topics: js.Array[String],
    callback: js.Function2[/* error */ js.Any, /* result */ MetadataResponse, _]
  ): Unit = js.native
  
  // Note: socket_error is currently KafkaClient only, and zkReconnect is currently Client only.
  @JSName("on")
  def on_brokersChanged(eventName: brokersChanged, cb: js.Function0[_]): this.type = js.native
  @JSName("on")
  def on_close(eventName: close, cb: js.Function0[_]): this.type = js.native
  @JSName("on")
  def on_connect(eventName: connect, cb: js.Function0[_]): this.type = js.native
  @JSName("on")
  def on_error(eventName: error, cb: js.Function1[/* error */ js.Any, _]): this.type = js.native
  @JSName("on")
  def on_ready(eventName: ready, cb: js.Function0[_]): this.type = js.native
  @JSName("on")
  def on_reconnect(eventName: reconnect, cb: js.Function0[_]): this.type = js.native
  @JSName("on")
  def on_socketerror(eventName: socket_error, cb: js.Function1[/* error */ js.Any, _]): this.type = js.native
  @JSName("on")
  def on_zkReconnect(eventName: zkReconnect, cb: js.Function0[_]): this.type = js.native
  
  def refreshMetadata(topics: js.Array[String]): Unit = js.native
  def refreshMetadata(topics: js.Array[String], cb: js.Function1[/* error */ js.UndefOr[js.Any], _]): Unit = js.native
  
  def sendOffsetCommitV2Request(
    group: String,
    generationId: Double,
    memberId: String,
    commits: js.Array[OffsetCommitRequest],
    cb: js.Function2[/* error */ js.Any, /* data */ js.Any, _]
  ): Unit = js.native
  
  def topicExists(
    topics: js.Array[String],
    cb: js.Function1[/* error */ js.UndefOr[TopicsNotExistError | js.Any], _]
  ): Unit = js.native
}
