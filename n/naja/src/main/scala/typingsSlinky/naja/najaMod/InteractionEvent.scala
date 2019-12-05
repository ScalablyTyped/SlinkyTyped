package typingsSlinky.naja.najaMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InteractionEvent extends Event {
  val element: HTMLElement = js.native
  val options: RequestOptions = js.native
  val originalEvent: js.UndefOr[SnippetUpdateEvent] = js.native
}

