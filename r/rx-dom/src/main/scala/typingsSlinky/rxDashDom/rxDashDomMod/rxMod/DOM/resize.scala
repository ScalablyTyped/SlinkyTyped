package typingsSlinky.rxDashDom.rxDashDomMod.rxMod.DOM

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.UIEvent
import typingsSlinky.rxDashLiteDashAggregates.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "DOM.resize")
@js.native
object resize extends js.Object {
  def apply(element: Element): Observable[UIEvent] = js.native
  def apply(element: Element, selector: js.Function): Observable[UIEvent] = js.native
  def apply(element: Element, selector: js.Function, useCapture: Boolean): Observable[UIEvent] = js.native
}

