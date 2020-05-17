package typingsSlinky.domMediacaptureRecord

import org.scalajs.dom.raw.DOMException
import typingsSlinky.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaRecorderErrorEvent extends Event {
  val error: DOMException = js.native
}

