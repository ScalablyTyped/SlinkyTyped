package typingsSlinky.naja.najaMod

import org.scalajs.dom.raw.XMLHttpRequest
import typingsSlinky.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartEvent extends Event {
  val request: js.Promise[Unit] = js.native
  val xhr: XMLHttpRequest = js.native
}

