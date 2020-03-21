package typingsSlinky.rxDom.mod.rxAugmentingMod.DOM

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.PointerEvent
import typingsSlinky.rxLiteAggregates.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "DOM.pointerenter")
@js.native
object pointerenter extends js.Object {
  def apply(element: Element): Observable[PointerEvent] = js.native
  def apply(element: Element, selector: js.Function): Observable[PointerEvent] = js.native
  def apply(element: Element, selector: js.Function, useCapture: Boolean): Observable[PointerEvent] = js.native
}

