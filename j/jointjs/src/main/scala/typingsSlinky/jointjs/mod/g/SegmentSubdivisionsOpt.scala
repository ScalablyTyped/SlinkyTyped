package typingsSlinky.jointjs.mod.g

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentSubdivisionsOpt extends PrecisionOpt {
  var segmentSubdivisions: js.UndefOr[js.Array[js.Array[Curve]]] = js.native
}

object SegmentSubdivisionsOpt {
  @scala.inline
  def apply(): SegmentSubdivisionsOpt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentSubdivisionsOpt]
  }
  @scala.inline
  implicit class SegmentSubdivisionsOptOps[Self <: SegmentSubdivisionsOpt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSegmentSubdivisions(value: js.Array[js.Array[Curve]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentSubdivisions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentSubdivisions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentSubdivisions")(js.undefined)
        ret
    }
  }
  
}

