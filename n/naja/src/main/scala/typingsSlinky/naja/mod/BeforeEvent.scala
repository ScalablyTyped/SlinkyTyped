package typingsSlinky.naja.mod

import org.scalajs.dom.raw.XMLHttpRequest
import typingsSlinky.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeforeEvent[T /* <: RequestData */] extends Event {
  val data: T = js.native
  val method: RequestMethod = js.native
  val options: NajaOptions = js.native
  val url: String = js.native
  val xhr: XMLHttpRequest = js.native
}

