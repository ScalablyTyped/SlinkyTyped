package typingsSlinky.jointjs.mod.anchors

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jointjs.mod.linkAnchors.ConnectionClosestAnchorArguments
import typingsSlinky.jointjs.mod.linkAnchors.ConnectionLengthAnchorArguments
import typingsSlinky.jointjs.mod.linkAnchors.ConnectionPerpendicularAnchorArguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnchorArgumentsMap
  extends /* key */ StringDictionary[StringDictionary[js.Any]] {
  var bottom: BBoxAnchorArguments = js.native
  var bottomLeft: BBoxAnchorArguments = js.native
  var bottomRight: BBoxAnchorArguments = js.native
  var center: BBoxAnchorArguments = js.native
  var connectionClosest: ConnectionClosestAnchorArguments = js.native
  var connectionLength: ConnectionLengthAnchorArguments = js.native
  var connectionPerpendicular: ConnectionPerpendicularAnchorArguments = js.native
  var connectionRatio: ConnectionLengthAnchorArguments = js.native
  var left: BBoxAnchorArguments = js.native
  var midSide: MidSideAnchorArguments = js.native
  var modelCenter: ModelCenterAnchorArguments = js.native
  var perpendicular: PaddingAnchorArguments = js.native
  var right: BBoxAnchorArguments = js.native
  var top: BBoxAnchorArguments = js.native
  var topLeft: BBoxAnchorArguments = js.native
  var topRight: BBoxAnchorArguments = js.native
}

object AnchorArgumentsMap {
  @scala.inline
  def apply(
    bottom: BBoxAnchorArguments,
    bottomLeft: BBoxAnchorArguments,
    bottomRight: BBoxAnchorArguments,
    center: BBoxAnchorArguments,
    connectionClosest: ConnectionClosestAnchorArguments,
    connectionLength: ConnectionLengthAnchorArguments,
    connectionPerpendicular: ConnectionPerpendicularAnchorArguments,
    connectionRatio: ConnectionLengthAnchorArguments,
    left: BBoxAnchorArguments,
    midSide: MidSideAnchorArguments,
    modelCenter: ModelCenterAnchorArguments,
    perpendicular: PaddingAnchorArguments,
    right: BBoxAnchorArguments,
    top: BBoxAnchorArguments,
    topLeft: BBoxAnchorArguments,
    topRight: BBoxAnchorArguments
  ): AnchorArgumentsMap = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], bottomLeft = bottomLeft.asInstanceOf[js.Any], bottomRight = bottomRight.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], connectionClosest = connectionClosest.asInstanceOf[js.Any], connectionLength = connectionLength.asInstanceOf[js.Any], connectionPerpendicular = connectionPerpendicular.asInstanceOf[js.Any], connectionRatio = connectionRatio.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], midSide = midSide.asInstanceOf[js.Any], modelCenter = modelCenter.asInstanceOf[js.Any], perpendicular = perpendicular.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], topLeft = topLeft.asInstanceOf[js.Any], topRight = topRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnchorArgumentsMap]
  }
  @scala.inline
  implicit class AnchorArgumentsMapOps[Self <: AnchorArgumentsMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottom(value: BBoxAnchorArguments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBottomLeft(value: BBoxAnchorArguments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBottomRight(value: BBoxAnchorArguments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCenter(value: BBoxAnchorArguments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectionClosest(value: ConnectionClosestAnchorArguments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionClosest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectionLength(value: ConnectionLengthAnchorArguments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectionPerpendicular(value: ConnectionPerpendicularAnchorArguments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionPerpendicular")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectionRatio(value: ConnectionLengthAnchorArguments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeft(value: BBoxAnchorArguments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMidSide(value: MidSideAnchorArguments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("midSide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModelCenter(value: ModelCenterAnchorArguments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPerpendicular(value: PaddingAnchorArguments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perpendicular")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRight(value: BBoxAnchorArguments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTop(value: BBoxAnchorArguments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopLeft(value: BBoxAnchorArguments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopRight(value: BBoxAnchorArguments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topRight")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

