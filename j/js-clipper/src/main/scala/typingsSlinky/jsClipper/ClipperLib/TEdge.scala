package typingsSlinky.jsClipper.ClipperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TEdge extends js.Object {
  var deltaX: Double = js.native
  var deltaY: Double = js.native
  var dx: Double = js.native
  var next: TEdge = js.native
  var nextInAEL: TEdge = js.native
  var nextInLML: TEdge = js.native
  var nextInSEL: TEdge = js.native
  var outIdx: Double = js.native
  var polyType: PolyType = js.native
  var prev: TEdge = js.native
  var prevInAEL: TEdge = js.native
  var prevInSEL: TEdge = js.native
  var side: EdgeSide = js.native
  var tmpX: Double = js.native
  var windCnt: Double = js.native
  var windCnt2: Double = js.native
  var windDelta: Double = js.native
  var xbot: Double = js.native
  var xcurr: Double = js.native
  var xtop: Double = js.native
  var ybot: Double = js.native
  var ycurr: Double = js.native
  var ytop: Double = js.native
}

object TEdge {
  @scala.inline
  def apply(
    deltaX: Double,
    deltaY: Double,
    dx: Double,
    next: TEdge,
    nextInAEL: TEdge,
    nextInLML: TEdge,
    nextInSEL: TEdge,
    outIdx: Double,
    polyType: PolyType,
    prev: TEdge,
    prevInAEL: TEdge,
    prevInSEL: TEdge,
    side: EdgeSide,
    tmpX: Double,
    windCnt: Double,
    windCnt2: Double,
    windDelta: Double,
    xbot: Double,
    xcurr: Double,
    xtop: Double,
    ybot: Double,
    ycurr: Double,
    ytop: Double
  ): TEdge = {
    val __obj = js.Dynamic.literal(deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], dx = dx.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], nextInAEL = nextInAEL.asInstanceOf[js.Any], nextInLML = nextInLML.asInstanceOf[js.Any], nextInSEL = nextInSEL.asInstanceOf[js.Any], outIdx = outIdx.asInstanceOf[js.Any], polyType = polyType.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], prevInAEL = prevInAEL.asInstanceOf[js.Any], prevInSEL = prevInSEL.asInstanceOf[js.Any], side = side.asInstanceOf[js.Any], tmpX = tmpX.asInstanceOf[js.Any], windCnt = windCnt.asInstanceOf[js.Any], windCnt2 = windCnt2.asInstanceOf[js.Any], windDelta = windDelta.asInstanceOf[js.Any], xbot = xbot.asInstanceOf[js.Any], xcurr = xcurr.asInstanceOf[js.Any], xtop = xtop.asInstanceOf[js.Any], ybot = ybot.asInstanceOf[js.Any], ycurr = ycurr.asInstanceOf[js.Any], ytop = ytop.asInstanceOf[js.Any])
    __obj.asInstanceOf[TEdge]
  }
  @scala.inline
  implicit class TEdgeOps[Self <: TEdge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeltaX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeltaY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext(value: TEdge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextInAEL(value: TEdge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextInAEL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextInLML(value: TEdge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextInLML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextInSEL(value: TEdge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextInSEL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutIdx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outIdx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolyType(value: PolyType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polyType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrev(value: TEdge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevInAEL(value: TEdge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevInAEL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevInSEL(value: TEdge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevInSEL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSide(value: EdgeSide): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("side")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTmpX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tmpX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindCnt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windCnt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindCnt2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windCnt2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindDelta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windDelta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXbot(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xbot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXcurr(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xcurr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXtop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xtop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYbot(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ybot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYcurr(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ycurr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYtop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ytop")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

