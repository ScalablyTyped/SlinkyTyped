package typingsSlinky.d3.d3Mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.d3DashSelection.d3DashSelectionMod.BaseType
import typingsSlinky.d3DashSelection.d3DashSelectionMod.EnterElement
import typingsSlinky.d3DashSelection.d3DashSelectionMod.Selection
import typingsSlinky.std.Document
import typingsSlinky.std.Element
import typingsSlinky.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "select")
@js.native
object select extends js.Object {
  def apply[OldDatum](): Selection[Null, OldDatum, Null, js.UndefOr[scala.Nothing]] = js.native
  def apply[OldDatum](node: EnterElement): Selection[EnterElement, OldDatum, Null, js.UndefOr[scala.Nothing]] = js.native
  def apply[OldDatum](node: Document): Selection[org.scalajs.dom.raw.Document, OldDatum, Null, js.UndefOr[scala.Nothing]] = js.native
  def apply[OldDatum](node: Element): Selection[org.scalajs.dom.raw.Element, OldDatum, Null, js.UndefOr[scala.Nothing]] = js.native
  def apply[OldDatum](node: Window): Selection[org.scalajs.dom.raw.Window, OldDatum, Null, js.UndefOr[scala.Nothing]] = js.native
  def apply[GElement /* <: BaseType */, OldDatum](selector: String): Selection[GElement, OldDatum, HTMLElement, _] = js.native
}

