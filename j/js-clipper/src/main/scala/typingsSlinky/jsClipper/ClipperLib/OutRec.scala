package typingsSlinky.jsClipper.ClipperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutRec extends js.Object {
  var AppendLink: OutRec = js.native
  var FirstLeft: TEdge = js.native
  var bottomPt: OutPt = js.native
  var idx: Double = js.native
  var isHole: Boolean = js.native
  var pts: OutPt = js.native
}

object OutRec {
  @scala.inline
  def apply(AppendLink: OutRec, FirstLeft: TEdge, bottomPt: OutPt, idx: Double, isHole: Boolean, pts: OutPt): OutRec = {
    val __obj = js.Dynamic.literal(AppendLink = AppendLink.asInstanceOf[js.Any], FirstLeft = FirstLeft.asInstanceOf[js.Any], bottomPt = bottomPt.asInstanceOf[js.Any], idx = idx.asInstanceOf[js.Any], isHole = isHole.asInstanceOf[js.Any], pts = pts.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutRec]
  }
  @scala.inline
  implicit class OutRecOps[Self <: OutRec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppendLink(value: OutRec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppendLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstLeft(value: TEdge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBottomPt(value: OutPt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomPt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsHole(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPts(value: OutPt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pts")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

