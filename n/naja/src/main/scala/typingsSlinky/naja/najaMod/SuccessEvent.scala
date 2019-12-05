package typingsSlinky.naja.najaMod

import org.scalajs.dom.raw.XMLHttpRequest
import typingsSlinky.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuccessEvent[T /* <: js.Object */] extends Event {
  val options: NajaOptions = js.native
  val response: T = js.native
  val xhr: XMLHttpRequest = js.native
}

