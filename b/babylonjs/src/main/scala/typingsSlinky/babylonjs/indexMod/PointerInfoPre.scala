package typingsSlinky.babylonjs.indexMod

import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.WheelEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/index", "PointerInfoPre")
@js.native
class PointerInfoPre protected ()
  extends typingsSlinky.babylonjs.eventsIndexMod.PointerInfoPre {
  def this(`type`: Double, event: WheelEvent, localX: Double, localY: Double) = this()
  /**
    * Instantiates a PointerInfoPre to store pointer related info to the onPrePointerObservable event.
    * @param type Defines the type of event (PointerEventTypes)
    * @param event Defines the related dom event
    * @param localX Defines the local x coordinates of the pointer when the event occured
    * @param localY Defines the local y coordinates of the pointer when the event occured
    */
  def this(`type`: Double, event: PointerEvent, localX: Double, localY: Double) = this()
}

