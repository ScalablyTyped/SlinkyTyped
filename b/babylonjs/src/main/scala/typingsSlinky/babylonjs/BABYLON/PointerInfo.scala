package typingsSlinky.babylonjs.BABYLON

import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.WheelEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointerInfo extends PointerInfoBase {
  /**
    * Defines the picking info associated to the info (if any)\
    */
  var pickInfo: Nullable[PickingInfo] = js.native
}

object PointerInfo {
  @scala.inline
  def apply(event: PointerEvent | WheelEvent, `type`: Double): PointerInfo = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerInfo]
  }
  @scala.inline
  implicit class PointerInfoOps[Self <: PointerInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPickInfo(value: Nullable[PickingInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPickInfoNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickInfo")(null)
        ret
    }
  }
  
}

