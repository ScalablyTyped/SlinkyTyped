package typingsSlinky.rxDashDom.rxDashDomMod.rxMod.DOM

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.TouchEvent
import typingsSlinky.rxDashLiteDashAggregates.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "DOM.touchmove")
@js.native
object touchmove extends js.Object {
  def apply(element: Element): Observable[TouchEvent] = js.native
  def apply(element: Element, selector: js.Function): Observable[TouchEvent] = js.native
  def apply(element: Element, selector: js.Function, useCapture: Boolean): Observable[TouchEvent] = js.native
}

