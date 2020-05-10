package typingsSlinky.babylonjs.pointerEventsMod

import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.WheelEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Events/pointerEvents", "PointerInfoBase")
@js.native
class PointerInfoBase protected () extends js.Object {
  def this(
    /**
    * Defines the type of event (PointerEventTypes)
    */
  `type`: Double,
    /**
    * Defines the related dom event
    */
  event: WheelEvent
  ) = this()
  /**
    * Instantiates the base class of pointers info.
    * @param type Defines the type of event (PointerEventTypes)
    * @param event Defines the related dom event
    */
  def this(
    /**
    * Defines the type of event (PointerEventTypes)
    */
  `type`: Double,
    /**
    * Defines the related dom event
    */
  event: PointerEvent
  ) = this()
  /**
    * Defines the related dom event
    */
  var event: PointerEvent | WheelEvent = js.native
  /**
    * Defines the type of event (PointerEventTypes)
    */
  var `type`: Double = js.native
}

