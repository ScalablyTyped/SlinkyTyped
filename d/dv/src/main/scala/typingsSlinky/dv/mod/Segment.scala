package typingsSlinky.dv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Segment extends js.Object {
  var error: Double = js.native
  var p1: Point = js.native
  var p2: Point = js.native
}

object Segment {
  @scala.inline
  def apply(error: Double, p1: Point, p2: Point): Segment = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], p1 = p1.asInstanceOf[js.Any], p2 = p2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Segment]
  }
  @scala.inline
  implicit class SegmentOps[Self <: Segment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withP1(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withP2(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p2")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

