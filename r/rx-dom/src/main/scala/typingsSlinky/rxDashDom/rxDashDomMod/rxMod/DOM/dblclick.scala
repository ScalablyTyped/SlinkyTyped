package typingsSlinky.rxDashDom.rxDashDomMod.rxMod.DOM

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.rxDashLiteDashAggregates.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "DOM.dblclick")
@js.native
object dblclick extends js.Object {
  def apply(element: Element): Observable[MouseEvent] = js.native
  def apply(element: Element, selector: js.Function): Observable[MouseEvent] = js.native
  def apply(element: Element, selector: js.Function, useCapture: Boolean): Observable[MouseEvent] = js.native
}

