package typingsSlinky.d3.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.d3Selection.mod.BaseType
import typingsSlinky.d3Selection.mod.EnterElement
import typingsSlinky.d3Selection.mod.Selection_
import typingsSlinky.std.Document_
import typingsSlinky.std.Element
import typingsSlinky.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "select")
@js.native
object select extends js.Object {
  def apply[OldDatum](): Selection_[Null, OldDatum, Null, js.UndefOr[scala.Nothing]] = js.native
  def apply[OldDatum](node: EnterElement): Selection_[EnterElement, OldDatum, Null, js.UndefOr[scala.Nothing]] = js.native
  def apply[OldDatum](node: Document_): Selection_[Document_, OldDatum, Null, js.UndefOr[scala.Nothing]] = js.native
  def apply[OldDatum](node: Element): Selection_[org.scalajs.dom.raw.Element, OldDatum, Null, js.UndefOr[scala.Nothing]] = js.native
  def apply[OldDatum](node: Window_): Selection_[Window_, OldDatum, Null, js.UndefOr[scala.Nothing]] = js.native
  def apply[GElement /* <: BaseType */, OldDatum](selector: String): Selection_[GElement, OldDatum, HTMLElement, _] = js.native
}

