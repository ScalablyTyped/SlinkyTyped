package typingsSlinky.d3DashTransition.d3DashTransitionMod

import typingsSlinky.d3DashSelection.d3DashSelectionMod.BaseType
import typingsSlinky.d3DashSelection.d3DashSelectionMod.EnterElement
import typingsSlinky.std.Document
import typingsSlinky.std.Element
import typingsSlinky.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-transition", "active")
@js.native
object active extends js.Object {
  def apply[Datum, PElement /* <: BaseType */, PDatum](): (Transition[Null, Datum, PElement, PDatum]) | Null = js.native
  def apply[Datum, PElement /* <: BaseType */, PDatum](node: Null, name: String): (Transition[Null, Datum, PElement, PDatum]) | Null = js.native
  def apply[Datum, PElement /* <: BaseType */, PDatum](node: EnterElement): (Transition[EnterElement, Datum, PElement, PDatum]) | Null = js.native
  def apply[Datum, PElement /* <: BaseType */, PDatum](node: EnterElement, name: String): (Transition[EnterElement, Datum, PElement, PDatum]) | Null = js.native
  def apply[Datum, PElement /* <: BaseType */, PDatum](node: Document): (Transition[org.scalajs.dom.raw.Document, Datum, PElement, PDatum]) | Null = js.native
  def apply[Datum, PElement /* <: BaseType */, PDatum](node: Document, name: String): (Transition[org.scalajs.dom.raw.Document, Datum, PElement, PDatum]) | Null = js.native
  def apply[Datum, PElement /* <: BaseType */, PDatum](node: Element): (Transition[org.scalajs.dom.raw.Element, Datum, PElement, PDatum]) | Null = js.native
  def apply[Datum, PElement /* <: BaseType */, PDatum](node: Element, name: String): (Transition[org.scalajs.dom.raw.Element, Datum, PElement, PDatum]) | Null = js.native
  def apply[Datum, PElement /* <: BaseType */, PDatum](node: Window): (Transition[org.scalajs.dom.raw.Window, Datum, PElement, PDatum]) | Null = js.native
  def apply[Datum, PElement /* <: BaseType */, PDatum](node: Window, name: String): (Transition[org.scalajs.dom.raw.Window, Datum, PElement, PDatum]) | Null = js.native
}

