package typingsSlinky.agGrid.touchListenerMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.agGrid.iEventEmitterMod.IEventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/widgets/touchListener", "TouchListener")
@js.native
class TouchListener protected () extends IEventEmitter {
  def this(eElement: HTMLElement) = this()
  def this(eElement: HTMLElement, preventMouseClick: Boolean) = this()
  
  /* private */ def checkForDoubleTap(): js.Any = js.native
  
  def destroy(): Unit = js.native
  
  var destroyFuncs: js.Any = js.native
  
  var eElement: js.Any = js.native
  
  var eventService: js.Any = js.native
  
  /* private */ def getActiveTouch(touchList: js.Any): js.Any = js.native
  
  var lastTapTime: js.Any = js.native
  
  var moved: js.Any = js.native
  
  /* private */ def onTouchEnd(touchEvent: js.Any): js.Any = js.native
  
  /* private */ def onTouchMove(touchEvent: js.Any): js.Any = js.native
  
  /* private */ def onTouchStart(touchEvent: js.Any): js.Any = js.native
  
  var preventMouseClick: js.Any = js.native
  
  var touchStart: js.Any = js.native
  
  var touching: js.Any = js.native
}
/* static members */
@JSImport("ag-grid/dist/lib/widgets/touchListener", "TouchListener")
@js.native
object TouchListener extends js.Object {
  
  var DOUBLE_TAP_MILLIS: js.Any = js.native
  
  var EVENT_DOUBLE_TAP: String = js.native
  
  var EVENT_LONG_TAP: String = js.native
  
  var EVENT_TAP: String = js.native
}
