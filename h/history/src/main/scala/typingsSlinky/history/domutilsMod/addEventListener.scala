package typingsSlinky.history.domutilsMod

import org.scalajs.dom.raw.EventTarget
import typingsSlinky.std.EventListener
import typingsSlinky.std.EventListenerObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("history/DOMUtils", "addEventListener")
@js.native
object addEventListener extends js.Object {
  
  def apply(node: EventTarget, event: String, listener: EventListener): Unit = js.native
  def apply(node: EventTarget, event: String, listener: EventListenerObject): Unit = js.native
}
