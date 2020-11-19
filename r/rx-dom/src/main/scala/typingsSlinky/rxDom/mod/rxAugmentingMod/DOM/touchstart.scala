package typingsSlinky.rxDom.mod.rxAugmentingMod.DOM

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.TouchEvent
import typingsSlinky.rx.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rx", "DOM.touchstart")
@js.native
object touchstart extends js.Object {
  
  def apply(element: Element): Observable[TouchEvent] = js.native
  def apply(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): Observable[TouchEvent] = js.native
  def apply(element: Element, selector: js.Function): Observable[TouchEvent] = js.native
  def apply(element: Element, selector: js.Function, useCapture: Boolean): Observable[TouchEvent] = js.native
}
