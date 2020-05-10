package typingsSlinky.officeUiFabricReact.positioningPositioningMod

import typingsSlinky.officeUiFabricReact.positioningTypesMod.RectangleEdge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IElementPositionInfo extends IElementPosition {
  var targetRectangle: Rectangle = js.native
}

object IElementPositionInfo {
  @scala.inline
  def apply(elementRectangle: Rectangle, targetEdge: RectangleEdge, targetRectangle: Rectangle): IElementPositionInfo = {
    val __obj = js.Dynamic.literal(elementRectangle = elementRectangle.asInstanceOf[js.Any], targetEdge = targetEdge.asInstanceOf[js.Any], targetRectangle = targetRectangle.asInstanceOf[js.Any])
    __obj.asInstanceOf[IElementPositionInfo]
  }
  @scala.inline
  implicit class IElementPositionInfoOps[Self <: IElementPositionInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargetRectangle(value: Rectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetRectangle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

