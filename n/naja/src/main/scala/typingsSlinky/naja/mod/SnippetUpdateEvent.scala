package typingsSlinky.naja.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnippetUpdateEvent extends Event_ {
  val content: String = js.native
  val snippet: HTMLElement = js.native
}

