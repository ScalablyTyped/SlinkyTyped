package typingsSlinky.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RealtimeChannelBase extends EventEmitter[channelEventCallback, ChannelStateChange, ChannelEvent, ChannelState] {
  
  var errorReason: ErrorInfo = js.native
  
  var modes: ChannelModes = js.native
  
  var name: String = js.native
  
  var params: ChannelParams = js.native
  
  var state: ChannelState = js.native
  
  def unsubscribe(): Unit = js.native
  def unsubscribe(eventOrListener: js.UndefOr[scala.Nothing], listener: messageCallback[Message]): Unit = js.native
  def unsubscribe(eventOrListener: String): Unit = js.native
  def unsubscribe(eventOrListener: String, listener: messageCallback[Message]): Unit = js.native
  def unsubscribe(eventOrListener: js.Array[String]): Unit = js.native
  def unsubscribe(eventOrListener: js.Array[String], listener: messageCallback[Message]): Unit = js.native
  def unsubscribe(eventOrListener: messageCallback[Message]): Unit = js.native
  def unsubscribe(eventOrListener: messageCallback[Message], listener: messageCallback[Message]): Unit = js.native
}
