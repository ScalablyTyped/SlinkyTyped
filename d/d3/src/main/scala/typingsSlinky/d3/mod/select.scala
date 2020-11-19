package typingsSlinky.d3.mod

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Window
import typingsSlinky.d3Selection.mod.BaseType
import typingsSlinky.d3Selection.mod.EnterElement
import typingsSlinky.d3Selection.mod.Selection_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3", "select")
@js.native
object select extends js.Object {
  
  def apply[OldDatum](node: Null): Selection_[Null, OldDatum, Null, js.UndefOr[scala.Nothing]] = js.native
  def apply[OldDatum](node: EnterElement): Selection_[EnterElement, OldDatum, Null, js.UndefOr[scala.Nothing]] = js.native
  def apply[OldDatum](node: Document): Selection_[Document, OldDatum, Null, js.UndefOr[scala.Nothing]] = js.native
  def apply[OldDatum](node: Element): Selection_[Element, OldDatum, Null, js.UndefOr[scala.Nothing]] = js.native
  def apply[OldDatum](node: Window): Selection_[Window, OldDatum, Null, js.UndefOr[scala.Nothing]] = js.native
  def apply[GElement /* <: BaseType */, OldDatum](selector: String): Selection_[GElement, OldDatum, HTMLElement, _] = js.native
}
