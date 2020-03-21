package typingsSlinky.requestDebug.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.requestDebug.requestDebugStrings.request
  - typingsSlinky.requestDebug.requestDebugStrings.response
  - typingsSlinky.requestDebug.requestDebugStrings.redirect
  - typingsSlinky.requestDebug.requestDebugStrings.auth
*/
trait LogPhase extends js.Object

object LogPhase {
  @scala.inline
  def auth: typingsSlinky.requestDebug.requestDebugStrings.auth = this.cast("auth")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def redirect: typingsSlinky.requestDebug.requestDebugStrings.redirect = this.cast("redirect")
  @scala.inline
  def request: typingsSlinky.requestDebug.requestDebugStrings.request = this.cast("request")
  @scala.inline
  def response: typingsSlinky.requestDebug.requestDebugStrings.response = this.cast("response")
}

