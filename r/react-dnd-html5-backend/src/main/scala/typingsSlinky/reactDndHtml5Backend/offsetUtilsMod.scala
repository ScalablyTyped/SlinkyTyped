package typingsSlinky.reactDndHtml5Backend

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.Node
import typingsSlinky.dndCore.interfacesMod.XYCoord
import typingsSlinky.reactDndHtml5Backend.anon.AnchorX
import typingsSlinky.reactDndHtml5Backend.anon.OffsetX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd-html5-backend/lib/OffsetUtils", JSImport.Namespace)
@js.native
object offsetUtilsMod extends js.Object {
  def getDragPreviewOffset(
    sourceNode: HTMLElement,
    dragPreview: HTMLElement,
    clientOffset: XYCoord,
    anchorPoint: AnchorX,
    offsetPoint: OffsetX
  ): XYCoord = js.native
  def getEventClientOffset(e: MouseEvent): XYCoord = js.native
  def getNodeClientOffset(node: Node): XYCoord | Null = js.native
}

