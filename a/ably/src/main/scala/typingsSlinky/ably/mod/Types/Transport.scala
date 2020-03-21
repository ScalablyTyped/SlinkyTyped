package typingsSlinky.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ably.ablyStrings.web_socket
  - typingsSlinky.ably.ablyStrings.xhr_streaming
  - typingsSlinky.ably.ablyStrings.xhr_polling
  - typingsSlinky.ably.ablyStrings.jsonp
  - typingsSlinky.ably.ablyStrings.comet
*/
trait Transport extends js.Object

object Transport {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def comet: typingsSlinky.ably.ablyStrings.comet = this.cast("comet")
  @scala.inline
  def jsonp: typingsSlinky.ably.ablyStrings.jsonp = this.cast("jsonp")
  @scala.inline
  def web_socket: typingsSlinky.ably.ablyStrings.web_socket = this.cast("web_socket")
  @scala.inline
  def xhr_polling: typingsSlinky.ably.ablyStrings.xhr_polling = this.cast("xhr_polling")
  @scala.inline
  def xhr_streaming: typingsSlinky.ably.ablyStrings.xhr_streaming = this.cast("xhr_streaming")
}

