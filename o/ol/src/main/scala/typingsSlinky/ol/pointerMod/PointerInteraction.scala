package typingsSlinky.ol.pointerMod

import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.UIEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointerInteraction
  extends typingsSlinky.ol.interactionInteractionMod.default {
  
  /**
    * Returns the current number of pointers involved in the interaction,
    * e.g. 2 when two fingers are used.
    */
  def getPointerCount(): Double = js.native
  
  /**
    * Handle pointer down events.
    */
  /* protected */ def handleDownEvent(mapBrowserEvent: typingsSlinky.ol.mapBrowserEventMod.default[UIEvent]): Boolean = js.native
  
  /**
    * Handle pointer drag events.
    */
  /* protected */ def handleDragEvent(mapBrowserEvent: typingsSlinky.ol.mapBrowserEventMod.default[UIEvent]): Unit = js.native
  
  /**
    * Handle pointer move events.
    */
  /* protected */ def handleMoveEvent(mapBrowserEvent: typingsSlinky.ol.mapBrowserEventMod.default[UIEvent]): Unit = js.native
  
  /**
    * Handle pointer up events.
    */
  /* protected */ def handleUpEvent(mapBrowserEvent: typingsSlinky.ol.mapBrowserEventMod.default[UIEvent]): Boolean = js.native
  
  var handlingDownUpSequence: Boolean = js.native
  
  /**
    * This function is used to determine if "down" events should be propagated
    * to other interactions or should be stopped.
    */
  def stopDown(handled: Boolean): Boolean = js.native
  
  var targetPointers: js.Array[PointerEvent] = js.native
}
