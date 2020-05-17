package typingsSlinky.jsClipper.ClipperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HorzJoinRec extends js.Object {
  var edge: TEdge = js.native
  var savedIdx: Double = js.native
}

object HorzJoinRec {
  @scala.inline
  def apply(edge: TEdge, savedIdx: Double): HorzJoinRec = {
    val __obj = js.Dynamic.literal(edge = edge.asInstanceOf[js.Any], savedIdx = savedIdx.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorzJoinRec]
  }
  @scala.inline
  implicit class HorzJoinRecOps[Self <: HorzJoinRec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEdge(value: TEdge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSavedIdx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savedIdx")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

