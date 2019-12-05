package typingsSlinky.naja.najaMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnippetUpdateEvent extends Event {
  val content: String = js.native
  val snippet: HTMLElement = js.native
}

