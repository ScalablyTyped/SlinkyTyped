package typingsSlinky.ol.interactionPointerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointerInteraction
  extends typingsSlinky.ol.interactionInteractionMod.default {
  var handlingDownUpSequence: Boolean = js.native
  var targetPointers: js.Array[typingsSlinky.ol.pointerPointerEventMod.default] = js.native
  /* protected */ def handleDownEvent(mapBrowserEvent: typingsSlinky.ol.mapBrowserPointerEventMod.default): Boolean = js.native
  /* protected */ def handleDragEvent(mapBrowserEvent: typingsSlinky.ol.mapBrowserPointerEventMod.default): Unit = js.native
  /* protected */ def handleMoveEvent(mapBrowserEvent: typingsSlinky.ol.mapBrowserPointerEventMod.default): Unit = js.native
  /* protected */ def handleUpEvent(mapBrowserEvent: typingsSlinky.ol.mapBrowserPointerEventMod.default): Boolean = js.native
  def stopDown(handled: Boolean): Boolean = js.native
}

