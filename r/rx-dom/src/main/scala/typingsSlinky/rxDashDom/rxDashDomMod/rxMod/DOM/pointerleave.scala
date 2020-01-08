package typingsSlinky.rxDashDom.rxDashDomMod.rxMod.DOM

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.PointerEvent
import typingsSlinky.rxDashLiteDashAggregates.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "DOM.pointerleave")
@js.native
object pointerleave extends js.Object {
  def apply(element: Element): Observable[PointerEvent] = js.native
  def apply(element: Element, selector: js.Function): Observable[PointerEvent] = js.native
  def apply(element: Element, selector: js.Function, useCapture: Boolean): Observable[PointerEvent] = js.native
}

