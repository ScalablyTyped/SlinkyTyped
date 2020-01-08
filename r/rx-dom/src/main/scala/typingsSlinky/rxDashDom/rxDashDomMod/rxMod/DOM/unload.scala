package typingsSlinky.rxDashDom.rxDashDomMod.rxMod.DOM

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import typingsSlinky.rxDashLiteDashAggregates.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "DOM.unload")
@js.native
object unload extends js.Object {
  def apply(element: Element): Observable[Event] = js.native
  def apply(element: Element, selector: js.Function): Observable[Event] = js.native
  def apply(element: Element, selector: js.Function, useCapture: Boolean): Observable[Event] = js.native
}

