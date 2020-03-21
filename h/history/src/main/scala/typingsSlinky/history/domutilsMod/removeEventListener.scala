package typingsSlinky.history.domutilsMod

import org.scalajs.dom.raw.EventTarget
import typingsSlinky.std.EventListener
import typingsSlinky.std.EventListenerObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("history/DOMUtils", "removeEventListener")
@js.native
object removeEventListener extends js.Object {
  def apply(node: EventTarget, event: String, listener: EventListener): Unit = js.native
  def apply(node: EventTarget, event: String, listener: EventListenerObject): Unit = js.native
}

