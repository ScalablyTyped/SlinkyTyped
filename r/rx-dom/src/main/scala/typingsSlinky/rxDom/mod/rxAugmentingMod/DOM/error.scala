package typingsSlinky.rxDom.mod.rxAugmentingMod.DOM

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import typingsSlinky.rx.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rx", "DOM.error")
@js.native
object error extends js.Object {
  
  def apply(element: Element): Observable[Event] = js.native
  def apply(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): Observable[Event] = js.native
  def apply(element: Element, selector: js.Function): Observable[Event] = js.native
  def apply(element: Element, selector: js.Function, useCapture: Boolean): Observable[Event] = js.native
}
