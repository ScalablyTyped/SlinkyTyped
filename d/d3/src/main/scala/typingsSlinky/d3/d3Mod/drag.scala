package typingsSlinky.d3.d3Mod

import org.scalajs.dom.raw.Element
import typingsSlinky.d3DashDrag.d3DashDragMod.DragBehavior
import typingsSlinky.d3DashDrag.d3DashDragMod.SubjectPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "drag")
@js.native
object drag extends js.Object {
  def apply[GElement /* <: Element */, Datum](): DragBehavior[GElement, Datum, Datum | SubjectPosition] = js.native
}

