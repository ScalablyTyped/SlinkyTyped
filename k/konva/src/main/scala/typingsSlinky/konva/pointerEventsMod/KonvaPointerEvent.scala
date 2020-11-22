package typingsSlinky.konva.pointerEventsMod

import org.scalajs.dom.raw.PointerEvent
import typingsSlinky.konva.nodeMod.KonvaEventObject
import typingsSlinky.konva.nodeMod.Node
import typingsSlinky.konva.nodeMod.NodeConfig
import typingsSlinky.konva.shapeMod.Shape
import typingsSlinky.konva.shapeMod.ShapeConfig
import typingsSlinky.konva.stageMod.Stage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KonvaPointerEvent extends KonvaEventObject[PointerEvent] {
  
  var pointerId: Double = js.native
}
object KonvaPointerEvent {
  
  @scala.inline
  def apply(
    cancelBubble: Boolean,
    currentTarget: Node[NodeConfig],
    evt: PointerEvent,
    pointerId: Double,
    target: Shape[ShapeConfig] | Stage
  ): KonvaPointerEvent = {
    val __obj = js.Dynamic.literal(cancelBubble = cancelBubble.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], evt = evt.asInstanceOf[js.Any], pointerId = pointerId.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[KonvaPointerEvent]
  }
  
  @scala.inline
  implicit class KonvaPointerEventOps[Self <: KonvaPointerEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPointerId(value: Double): Self = this.set("pointerId", value.asInstanceOf[js.Any])
  }
}
