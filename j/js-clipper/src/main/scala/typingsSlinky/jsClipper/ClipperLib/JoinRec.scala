package typingsSlinky.jsClipper.ClipperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JoinRec extends js.Object {
  var poly1Idx: Double = js.native
  var poly2Idx: Double = js.native
  var pt1a: IntPoint = js.native
  var pt1b: IntPoint = js.native
  var pt2a: IntPoint = js.native
  var pt2b: IntPoint = js.native
}

object JoinRec {
  @scala.inline
  def apply(poly1Idx: Double, poly2Idx: Double, pt1a: IntPoint, pt1b: IntPoint, pt2a: IntPoint, pt2b: IntPoint): JoinRec = {
    val __obj = js.Dynamic.literal(poly1Idx = poly1Idx.asInstanceOf[js.Any], poly2Idx = poly2Idx.asInstanceOf[js.Any], pt1a = pt1a.asInstanceOf[js.Any], pt1b = pt1b.asInstanceOf[js.Any], pt2a = pt2a.asInstanceOf[js.Any], pt2b = pt2b.asInstanceOf[js.Any])
    __obj.asInstanceOf[JoinRec]
  }
  @scala.inline
  implicit class JoinRecOps[Self <: JoinRec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPoly1Idx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poly1Idx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoly2Idx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poly2Idx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPt1a(value: IntPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pt1a")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPt1b(value: IntPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pt1b")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPt2a(value: IntPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pt2a")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPt2b(value: IntPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pt2b")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

