package typingsSlinky.pusherJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Channel extends EventsDispatcher {
  
  /**
    * Authenticates the connection as a member of the channel.
    */
  def authorize(socketId: String, callback: js.Function1[/* data */ js.Any, Unit]): Unit = js.native
  
  var name: String = js.native
  
  var pusher: Pusher = js.native
  
  var subscribed: Boolean = js.native
  
  /** Triggers an event */
  def trigger(eventName: String): Boolean = js.native
  def trigger(eventName: String, data: js.Any): Boolean = js.native
}
