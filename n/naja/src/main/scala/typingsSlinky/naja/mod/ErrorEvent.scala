package typingsSlinky.naja.mod

import org.scalajs.dom.raw.XMLHttpRequest
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorEvent[T /* <: js.Object */] extends Event_ {
  val error: js.Error = js.native
  val options: NajaOptions = js.native
  val response: js.UndefOr[T] = js.native
  val xhr: XMLHttpRequest = js.native
}

