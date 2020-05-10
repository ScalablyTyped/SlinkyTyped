package typingsSlinky.officeUiFabricReact.positioningPositioningMod

import typingsSlinky.officeUiFabricReact.positioningTypesMod.RectangleEdge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IElementPosition extends js.Object {
  var alignmentEdge: js.UndefOr[RectangleEdge] = js.native
  var elementRectangle: Rectangle = js.native
  var targetEdge: RectangleEdge = js.native
}

object IElementPosition {
  @scala.inline
  def apply(elementRectangle: Rectangle, targetEdge: RectangleEdge): IElementPosition = {
    val __obj = js.Dynamic.literal(elementRectangle = elementRectangle.asInstanceOf[js.Any], targetEdge = targetEdge.asInstanceOf[js.Any])
    __obj.asInstanceOf[IElementPosition]
  }
  @scala.inline
  implicit class IElementPositionOps[Self <: IElementPosition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElementRectangle(value: Rectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementRectangle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetEdge(value: RectangleEdge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetEdge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlignmentEdge(value: RectangleEdge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignmentEdge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignmentEdge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignmentEdge")(js.undefined)
        ret
    }
  }
  
}

