package typingsSlinky.reactDndHtml5Backend

import typingsSlinky.dndCore.interfacesMod.XYCoord
import typingsSlinky.reactDndHtml5Backend.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd-html5-backend/lib/OffsetUtils", JSImport.Namespace)
@js.native
object offsetUtilsMod extends js.Object {
  def getDragPreviewOffset(
    sourceNode: js.Any,
    dragPreview: js.Any,
    clientOffset: XYCoord,
    anchorPoint: js.Any,
    offsetPoint: js.Any
  ): X = js.native
  def getEventClientOffset(e: js.Any): X = js.native
  def getNodeClientOffset(node: js.Any): X | Null = js.native
}

