package typingsSlinky.rxDom.mod.rxAugmentingMod.DOM

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import typingsSlinky.rxLiteAggregates.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "DOM.submit")
@js.native
object submit extends js.Object {
  def apply(element: Element): Observable[Event] = js.native
  def apply(element: Element, selector: js.Function): Observable[Event] = js.native
  def apply(element: Element, selector: js.Function, useCapture: Boolean): Observable[Event] = js.native
}

