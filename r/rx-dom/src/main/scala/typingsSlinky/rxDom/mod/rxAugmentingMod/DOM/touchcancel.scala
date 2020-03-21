package typingsSlinky.rxDom.mod.rxAugmentingMod.DOM

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.TouchEvent
import typingsSlinky.rxLiteAggregates.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "DOM.touchcancel")
@js.native
object touchcancel extends js.Object {
  // Touch Events
  def apply(element: Element): Observable[TouchEvent] = js.native
  def apply(element: Element, selector: js.Function): Observable[TouchEvent] = js.native
  def apply(element: Element, selector: js.Function, useCapture: Boolean): Observable[TouchEvent] = js.native
}

