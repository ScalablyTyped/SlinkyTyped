package typingsSlinky.ol.pointerMod

import org.scalajs.dom.raw.PointerEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointerInteraction
  extends typingsSlinky.ol.interactionInteractionMod.default {
  
  def getPointerCount(): Double = js.native
  
  /* protected */ def handleDownEvent(mapBrowserEvent: typingsSlinky.ol.mapBrowserPointerEventMod.default): Boolean = js.native
  
  /* protected */ def handleDragEvent(mapBrowserEvent: typingsSlinky.ol.mapBrowserPointerEventMod.default): Unit = js.native
  
  /* protected */ def handleMoveEvent(mapBrowserEvent: typingsSlinky.ol.mapBrowserPointerEventMod.default): Unit = js.native
  
  /* protected */ def handleUpEvent(mapBrowserEvent: typingsSlinky.ol.mapBrowserPointerEventMod.default): Boolean = js.native
  
  var handlingDownUpSequence: Boolean = js.native
  
  def stopDown(handled: Boolean): Boolean = js.native
  
  var targetPointers: js.Array[PointerEvent] = js.native
}
