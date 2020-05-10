package typingsSlinky.officeUiFabricReact.positioningTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPositionDirectionalHintData extends js.Object {
  var alignTargetEdge: js.UndefOr[Boolean] = js.native
  var alignmentEdge: js.UndefOr[RectangleEdge] = js.native
  var isAuto: js.UndefOr[Boolean] = js.native
  var targetEdge: RectangleEdge = js.native
}

object IPositionDirectionalHintData {
  @scala.inline
  def apply(targetEdge: RectangleEdge): IPositionDirectionalHintData = {
    val __obj = js.Dynamic.literal(targetEdge = targetEdge.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPositionDirectionalHintData]
  }
  @scala.inline
  implicit class IPositionDirectionalHintDataOps[Self <: IPositionDirectionalHintData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargetEdge(value: RectangleEdge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetEdge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlignTargetEdge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignTargetEdge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignTargetEdge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignTargetEdge")(js.undefined)
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
    @scala.inline
    def withIsAuto(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAuto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAuto: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAuto")(js.undefined)
        ret
    }
  }
  
}

