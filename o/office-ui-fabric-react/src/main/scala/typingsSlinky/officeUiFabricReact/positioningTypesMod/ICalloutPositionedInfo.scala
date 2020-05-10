package typingsSlinky.officeUiFabricReact.positioningTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICalloutPositionedInfo extends IPositionedData {
  var beakPosition: ICalloutBeakPositionedInfo = js.native
}

object ICalloutPositionedInfo {
  @scala.inline
  def apply(beakPosition: ICalloutBeakPositionedInfo, elementPosition: IPosition, targetEdge: RectangleEdge): ICalloutPositionedInfo = {
    val __obj = js.Dynamic.literal(beakPosition = beakPosition.asInstanceOf[js.Any], elementPosition = elementPosition.asInstanceOf[js.Any], targetEdge = targetEdge.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalloutPositionedInfo]
  }
  @scala.inline
  implicit class ICalloutPositionedInfoOps[Self <: ICalloutPositionedInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeakPosition(value: ICalloutBeakPositionedInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beakPosition")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

