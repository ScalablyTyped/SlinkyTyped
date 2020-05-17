package typingsSlinky.jsClipper.ClipperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntersectNode extends js.Object {
  var edge1: TEdge = js.native
  var edge2: TEdge = js.native
  var next: TEdge = js.native
  var pt: TEdge = js.native
}

object IntersectNode {
  @scala.inline
  def apply(edge1: TEdge, edge2: TEdge, next: TEdge, pt: TEdge): IntersectNode = {
    val __obj = js.Dynamic.literal(edge1 = edge1.asInstanceOf[js.Any], edge2 = edge2.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], pt = pt.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntersectNode]
  }
  @scala.inline
  implicit class IntersectNodeOps[Self <: IntersectNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEdge1(value: TEdge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edge1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEdge2(value: TEdge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edge2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext(value: TEdge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPt(value: TEdge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pt")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

