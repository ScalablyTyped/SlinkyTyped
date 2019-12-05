package typingsSlinky.engineDotIoDashClient.engineDotIoDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.engineDotIoDashClient.engineDotIoDashClientStrings.polling
  - typings.engineDotIoDashClient.engineDotIoDashClientStrings.websocket
*/
trait Transport extends js.Object

object Transport {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def polling: typingsSlinky.engineDotIoDashClient.engineDotIoDashClientStrings.polling = this.cast("polling")
  @scala.inline
  def websocket: typingsSlinky.engineDotIoDashClient.engineDotIoDashClientStrings.websocket = this.cast("websocket")
}

