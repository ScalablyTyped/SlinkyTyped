package typingsSlinky.materialUi.MaterialUI.Utils

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.Element
import typingsSlinky.std.EventListener
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Events extends js.Object {
  def isKeyboard(e: Event_): Boolean = js.native
  def off(el: Element, `type`: String, callback: EventListener): Unit = js.native
  def on(el: Element, `type`: String, callback: EventListener): Unit = js.native
  def once(el: Element, `type`: String, callback: EventListener): Unit = js.native
}

@JSGlobal("__MaterialUI.Utils.Events")
@js.native
object Events extends TopLevel[Events]

