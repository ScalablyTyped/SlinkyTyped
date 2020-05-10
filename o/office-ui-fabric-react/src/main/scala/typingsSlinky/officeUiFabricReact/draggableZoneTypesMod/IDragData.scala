package typingsSlinky.officeUiFabricReact.draggableZoneTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDragData extends js.Object {
  var delta: ICoordinates = js.native
  var lastPosition: js.UndefOr[ICoordinates] = js.native
  var position: ICoordinates = js.native
}

object IDragData {
  @scala.inline
  def apply(delta: ICoordinates, position: ICoordinates): IDragData = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDragData]
  }
  @scala.inline
  implicit class IDragDataOps[Self <: IDragData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelta(value: ICoordinates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: ICoordinates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastPosition(value: ICoordinates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastPosition")(js.undefined)
        ret
    }
  }
  
}

