package typingsSlinky.fridaGum.global

import typingsSlinky.fridaGum.MessageCallback
import typingsSlinky.fridaGum.MessageRecvOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("recv")
@js.native
object recv extends js.Object {
  
  /**
    * Requests callback to be called on the next message received from your Frida-based application.
    *
    * This will only give you one message, so you need to call `recv()` again to receive the next one.
    */
  def apply(callback: MessageCallback): MessageRecvOperation = js.native
  /**
    * Requests callback to be called when the next message of the given `type` has been received from your
    * Frida-based application.
    *
    * This will only give you one message, so you need to call `recv()` again to receive the next one.
    */
  def apply(`type`: String, callback: MessageCallback): MessageRecvOperation = js.native
}
