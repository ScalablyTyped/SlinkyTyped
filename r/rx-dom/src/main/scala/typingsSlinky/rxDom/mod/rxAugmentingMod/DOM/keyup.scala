package typingsSlinky.rxDom.mod.rxAugmentingMod.DOM

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.KeyboardEvent
import typingsSlinky.rx.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rx", "DOM.keyup")
@js.native
object keyup extends js.Object {
  
  def apply(element: Element): Observable[KeyboardEvent] = js.native
  def apply(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): Observable[KeyboardEvent] = js.native
  def apply(element: Element, selector: js.Function): Observable[KeyboardEvent] = js.native
  def apply(element: Element, selector: js.Function, useCapture: Boolean): Observable[KeyboardEvent] = js.native
}
