package typingsSlinky.awesomplete.anon

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.ParentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Call extends js.Object {
  
  def apply(expr: String): String | Element = js.native
  def apply(expr: String, con: ParentNode): String | Element = js.native
  def apply(expr: Element): String | Element = js.native
  def apply(expr: Element, con: ParentNode): String | Element = js.native
  
  def create(tag: String, o: js.Any): HTMLElement = js.native
  
  def fire(target: EventTarget, `type`: String, properties: js.Any): js.Any = js.native
  
  def regExpEscape(s: Replace): js.Any = js.native
  
  def siblingIndex(el: Element): Double = js.native
}
