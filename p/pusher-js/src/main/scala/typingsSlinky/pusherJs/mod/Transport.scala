package typingsSlinky.pusherJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.pusherJs.pusherJsStrings.ws
  - typingsSlinky.pusherJs.pusherJsStrings.wss
  - typingsSlinky.pusherJs.pusherJsStrings.xhr_streaming
  - typingsSlinky.pusherJs.pusherJsStrings.xhr_polling
  - typingsSlinky.pusherJs.pusherJsStrings.sockjs
*/
trait Transport extends js.Object

object Transport {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def sockjs: typingsSlinky.pusherJs.pusherJsStrings.sockjs = this.cast("sockjs")
  @scala.inline
  def ws: typingsSlinky.pusherJs.pusherJsStrings.ws = this.cast("ws")
  @scala.inline
  def wss: typingsSlinky.pusherJs.pusherJsStrings.wss = this.cast("wss")
  @scala.inline
  def xhr_polling: typingsSlinky.pusherJs.pusherJsStrings.xhr_polling = this.cast("xhr_polling")
  @scala.inline
  def xhr_streaming: typingsSlinky.pusherJs.pusherJsStrings.xhr_streaming = this.cast("xhr_streaming")
}

