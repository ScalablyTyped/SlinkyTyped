package typingsSlinky.eventsource.mod

import typingsSlinky.eventsource.Event
import typingsSlinky.eventsource.EventListener
import typingsSlinky.eventsource.MessageEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventSource extends js.Object {
  
  val CLOSED: Double = js.native
  
  val CONNECTING: Double = js.native
  
  val OPEN: Double = js.native
  
  def addEventListener(`type`: String, listener: EventListener): Unit = js.native
  
  def close(): Unit = js.native
  
  def dispatchEvent(evt: Event): Boolean = js.native
  
  def onerror(evt: MessageEvent): js.Any = js.native
  
  def onmessage(evt: MessageEvent): js.Any = js.native
  
  def onopen(evt: MessageEvent): js.Any = js.native
  
  val readyState: Double = js.native
  
  def removeEventListener(`type`: String): Unit = js.native
  def removeEventListener(`type`: String, listener: EventListener): Unit = js.native
  
  val url: String = js.native
  
  val withCredentials: Boolean = js.native
}
