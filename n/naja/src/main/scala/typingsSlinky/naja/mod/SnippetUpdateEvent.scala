package typingsSlinky.naja.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnippetUpdateEvent extends Event {
  
  val content: String = js.native
  
  val snippet: HTMLElement = js.native
}
