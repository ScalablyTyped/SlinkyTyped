package typingsSlinky.konva.anon

import typingsSlinky.konva.konvaStrings.dragging
import typingsSlinky.konva.konvaStrings.ready
import typingsSlinky.konva.konvaStrings.stopped
import typingsSlinky.konva.nodeMod.Node
import typingsSlinky.konva.nodeMod.NodeConfig
import typingsSlinky.konva.typesMod.Vector2d
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragStatus extends StObject {
  
  var dragStatus: stopped | ready | dragging = js.native
  
  var node: Node[NodeConfig] = js.native
  
  var offset: Vector2d = js.native
  
  var pointerId: js.UndefOr[Double] = js.native
  
  var startPointerPos: Vector2d = js.native
}
object DragStatus {
  
  @scala.inline
  def apply(
    dragStatus: stopped | ready | dragging,
    node: Node[NodeConfig],
    offset: Vector2d,
    startPointerPos: Vector2d
  ): DragStatus = {
    val __obj = js.Dynamic.literal(dragStatus = dragStatus.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], startPointerPos = startPointerPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragStatus]
  }
  
  @scala.inline
  implicit class DragStatusMutableBuilder[Self <: DragStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDragStatus(value: stopped | ready | dragging): Self = StObject.set(x, "dragStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: Node[NodeConfig]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Vector2d): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerId(value: Double): Self = StObject.set(x, "pointerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerIdUndefined: Self = StObject.set(x, "pointerId", js.undefined)
    
    @scala.inline
    def setStartPointerPos(value: Vector2d): Self = StObject.set(x, "startPointerPos", value.asInstanceOf[js.Any])
  }
}
