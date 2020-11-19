package typingsSlinky.rxDom.mod.rxAugmentingMod.DOM

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.FocusEvent
import typingsSlinky.rx.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rx", "DOM.focus")
@js.native
object focus extends js.Object {
  
  def apply(element: Element): Observable[FocusEvent] = js.native
  def apply(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): Observable[FocusEvent] = js.native
  def apply(element: Element, selector: js.Function): Observable[FocusEvent] = js.native
  def apply(element: Element, selector: js.Function, useCapture: Boolean): Observable[FocusEvent] = js.native
}
