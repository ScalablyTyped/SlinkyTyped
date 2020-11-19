package typingsSlinky.scChannel.mod

import typingsSlinky.asyncIterableStream.mod.AsyncIterableStream
import typingsSlinky.scChannel.scChannelStrings.pending
import typingsSlinky.scChannel.scChannelStrings.subscribed
import typingsSlinky.scChannel.scChannelStrings.unsubscribed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SCChannel[T] extends AsyncIterableStream[T] {
  
  val PENDING: pending = js.native
  
  val SUBSCRIBED: subscribed = js.native
  
  val UNSUBSCRIBED: unsubscribed = js.native
  
  var client: Client = js.native
  
  def close(): Unit = js.native
  
  def closeAllListeners(): Unit = js.native
  
  def closeListener(eventName: String): Unit = js.native
  
  def isSubscribed(): Boolean = js.native
  def isSubscribed(includePending: Boolean): Boolean = js.native
  
  def listener(eventName: String): typingsSlinky.streamDemux.demuxedConsumableStreamMod.^[T] = js.native
  
  var name: String = js.native
  
  var options: js.Object = js.native
  
  def publish(data: js.Any): js.Any = js.native
  
  var state: ChannelState = js.native
  
  def subscribe(): Unit = js.native
  def subscribe(options: js.Any): Unit = js.native
  
  def unsubscribe(): Unit = js.native
}
