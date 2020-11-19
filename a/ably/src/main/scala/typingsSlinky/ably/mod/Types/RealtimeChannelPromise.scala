package typingsSlinky.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RealtimeChannelPromise extends RealtimeChannelBase {
  
  def attach(): js.Promise[Unit] = js.native
  
  def detach(): js.Promise[Unit] = js.native
  
  def history(): js.Promise[PaginatedResult[Message]] = js.native
  def history(params: RealtimeHistoryParams): js.Promise[PaginatedResult[Message]] = js.native
  
  var presence: RealtimePresencePromise = js.native
  
  def publish(messagesOrName: js.Any): js.Promise[Unit] = js.native
  def publish(messagesOrName: js.Any, messageData: js.Any): js.Promise[Unit] = js.native
  
  def setOptions(options: ChannelOptions): js.Promise[Unit] = js.native
  
  def subscribe(eventOrCallback: String): js.Promise[Unit] = js.native
  def subscribe(eventOrCallback: String, listener: messageCallback[Message]): js.Promise[Unit] = js.native
  def subscribe(eventOrCallback: js.Array[String]): js.Promise[Unit] = js.native
  def subscribe(eventOrCallback: js.Array[String], listener: messageCallback[Message]): js.Promise[Unit] = js.native
  def subscribe(eventOrCallback: messageCallback[Message]): js.Promise[Unit] = js.native
  def subscribe(eventOrCallback: messageCallback[Message], listener: messageCallback[Message]): js.Promise[Unit] = js.native
  
  def whenState(targetState: ChannelState): js.Promise[ChannelStateChange] = js.native
}
