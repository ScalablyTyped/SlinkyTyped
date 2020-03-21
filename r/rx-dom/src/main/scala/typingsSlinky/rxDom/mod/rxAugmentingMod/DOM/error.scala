package typingsSlinky.rxDom.mod.rxAugmentingMod.DOM

import org.scalajs.dom.raw.Element
import typingsSlinky.rxLiteAggregates.Rx.Observable
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "DOM.error")
@js.native
object error extends js.Object {
  def apply(element: Element): Observable[Event_] = js.native
  def apply(element: Element, selector: js.Function): Observable[Event_] = js.native
  def apply(element: Element, selector: js.Function, useCapture: Boolean): Observable[Event_] = js.native
}

