package typingsSlinky.figma.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VectorSegment extends js.Object {
  val end: Double = js.native
  val start: Double = js.native
   // Defaults to { x: 0, y: 0 }
  val tangentEnd: js.UndefOr[Vector] = js.native
  val tangentStart: js.UndefOr[Vector] = js.native
}

object VectorSegment {
  @scala.inline
  def apply(end: Double, start: Double): VectorSegment = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorSegment]
  }
  @scala.inline
  implicit class VectorSegmentOps[Self <: VectorSegment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTangentEnd(value: Vector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tangentEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTangentEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tangentEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withTangentStart(value: Vector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tangentStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTangentStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tangentStart")(js.undefined)
        ret
    }
  }
  
}

