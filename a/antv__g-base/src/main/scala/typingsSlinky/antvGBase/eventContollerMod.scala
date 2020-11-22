package typingsSlinky.antvGBase

import org.scalajs.dom.raw.Event
import typingsSlinky.antvGBase.anon.ClientX
import typingsSlinky.antvGBase.interfacesMod.IShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g-base/lib/event/event-contoller", JSImport.Namespace)
@js.native
object eventContollerMod extends js.Object {
  
  @js.native
  trait EventController extends js.Object {
    
    def _afterDrag(draggingShape: js.Any, pointInfo: js.Any, event: js.Any): Unit = js.native
    
    def _bindEvents(): Unit = js.native
    
    def _clearEvents(): Unit = js.native
    
    def _emitDragoverEvents(event: js.Any, pointInfo: js.Any, fromShape: js.Any, toShape: js.Any, isCanvasEmit: js.Any): Unit = js.native
    
    def _emitEvent(`type`: js.Any, event: js.Any, pointInfo: js.Any, shape: js.Any): Unit = js.native
    def _emitEvent(
      `type`: js.Any,
      event: js.Any,
      pointInfo: js.Any,
      shape: js.Any,
      fromShape: js.UndefOr[scala.Nothing],
      toShape: js.Any
    ): Unit = js.native
    def _emitEvent(`type`: js.Any, event: js.Any, pointInfo: js.Any, shape: js.Any, fromShape: js.Any): Unit = js.native
    def _emitEvent(
      `type`: js.Any,
      event: js.Any,
      pointInfo: js.Any,
      shape: js.Any,
      fromShape: js.Any,
      toShape: js.Any
    ): Unit = js.native
    
    def _emitMouseoverEvents(event: js.Any, pointInfo: js.Any, fromShape: js.Any, toShape: js.Any): Unit = js.native
    
    def _eventCallback(ev: js.Any): Unit = js.native
    
    def _getEventObj(`type`: js.Any, event: js.Any, point: js.Any, target: js.Any, fromShape: js.Any, toShape: js.Any): typingsSlinky.antvGBase.graphEventMod.default = js.native
    
    def _getPointInfo(ev: js.Any): ClientX = js.native
    
    def _getShape(point: js.Any, ev: Event): IShape = js.native
    
    def _onDocumentMouseUp(ev: js.Any): Unit = js.native
    
    def _onDocumentMove(ev: Event): Unit = js.native
    
    def _ondragover(pointInfo: js.Any, shape: js.Any, event: js.Any): Unit = js.native
    
    def _onmousedown(pointInfo: js.Any, shape: js.Any, event: js.Any): Unit = js.native
    
    def _onmousemove(pointInfo: js.Any, shape: js.Any, event: js.Any): Unit = js.native
    
    def _onmouseup(pointInfo: js.Any, shape: js.Any, event: js.Any): Unit = js.native
    
    def _triggerEvent(`type`: js.Any, ev: js.Any): Unit = js.native
    
    var canvas: js.Any = js.native
    
    var currentShape: js.Any = js.native
    
    def destroy(): Unit = js.native
    
    var dragging: js.Any = js.native
    
    var draggingShape: js.Any = js.native
    
    def init(): Unit = js.native
    
    var mousedownPoint: js.Any = js.native
    
    var mousedownShape: js.Any = js.native
    
    var mousedownTimeStamp: js.Any = js.native
  }
  
  @js.native
  class default protected () extends EventController {
    def this(cfg: js.Any) = this()
  }
}
