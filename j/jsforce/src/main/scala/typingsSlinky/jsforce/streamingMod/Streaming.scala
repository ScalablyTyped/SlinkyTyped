package typingsSlinky.jsforce.streamingMod

import typingsSlinky.jsforce.channelMod.Channel
import typingsSlinky.jsforce.connectionMod.Connection
import typingsSlinky.jsforce.topicMod.Topic
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce/streaming", "Streaming")
@js.native
class Streaming protected () extends EventEmitter {
  def this(connection: Connection) = this()
  def channel(channelId: String): Channel = js.native
  def createClient(): js.Any = js.native
  def createClient(extensions: js.Array[_]): js.Any = js.native
  def subscribe(name: String, listener: StreamingMessage): js.Any = js.native
   // Faye Subscription
  def topic(name: String): Topic = js.native
  def unsubscribe(name: String, listener: StreamingMessage): Streaming = js.native
}

