package typingsSlinky.naja.mod

import org.scalajs.dom.raw.XMLHttpRequest
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartEvent extends Event_ {
  val request: js.Promise[Unit] = js.native
  val xhr: XMLHttpRequest = js.native
}

