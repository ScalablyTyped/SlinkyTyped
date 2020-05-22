package typingsSlinky.babylonjs.BABYLON

import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.WheelEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointerInfoBase extends js.Object {
  /**
    * Defines the related dom event
    */
  var event: PointerEvent | WheelEvent
  /**
    * Defines the type of event (PointerEventTypes)
    */
  var `type`: Double
}

object PointerInfoBase {
  @scala.inline
  def apply(event: PointerEvent | WheelEvent, `type`: Double): PointerInfoBase = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerInfoBase]
  }
}

