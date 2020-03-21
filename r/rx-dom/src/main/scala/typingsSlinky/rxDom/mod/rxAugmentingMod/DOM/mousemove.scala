package typingsSlinky.rxDom.mod.rxAugmentingMod.DOM

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.rxLiteAggregates.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "DOM.mousemove")
@js.native
object mousemove extends js.Object {
  def apply(element: Element): Observable[MouseEvent] = js.native
  def apply(element: Element, selector: js.Function): Observable[MouseEvent] = js.native
  def apply(element: Element, selector: js.Function, useCapture: Boolean): Observable[MouseEvent] = js.native
}

