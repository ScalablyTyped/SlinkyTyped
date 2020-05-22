package typingsSlinky.babylonjs.BABYLON

import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.WheelEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointerInfo extends PointerInfoBase {
  /**
    * Defines the picking info associated to the info (if any)\
    */
  var pickInfo: Nullable[PickingInfo]
}

object PointerInfo {
  @scala.inline
  def apply(event: PointerEvent | WheelEvent, `type`: Double, pickInfo: Nullable[PickingInfo] = null): PointerInfo = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], pickInfo = pickInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerInfo]
  }
}

