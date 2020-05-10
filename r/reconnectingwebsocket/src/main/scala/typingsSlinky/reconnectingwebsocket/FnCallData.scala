package typingsSlinky.reconnectingwebsocket

import org.scalajs.dom.raw.Blob
import typingsSlinky.std.ArrayBufferLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallData extends js.Object {
  def apply(data: String): Unit = js.native
  def apply(data: ArrayBufferLike): Unit = js.native
  def apply(data: js.typedarray.ArrayBufferView): Unit = js.native
  def apply(data: Blob): Unit = js.native
}

