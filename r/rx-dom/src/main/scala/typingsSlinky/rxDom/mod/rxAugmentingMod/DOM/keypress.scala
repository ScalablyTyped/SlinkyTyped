package typingsSlinky.rxDom.mod.rxAugmentingMod.DOM

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.KeyboardEvent
import typingsSlinky.rxLiteAggregates.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "DOM.keypress")
@js.native
object keypress extends js.Object {
  def apply(element: Element): Observable[KeyboardEvent] = js.native
  def apply(element: Element, selector: js.Function): Observable[KeyboardEvent] = js.native
  def apply(element: Element, selector: js.Function, useCapture: Boolean): Observable[KeyboardEvent] = js.native
}

