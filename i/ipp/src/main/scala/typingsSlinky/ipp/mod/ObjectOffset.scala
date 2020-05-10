package typingsSlinky.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectOffset extends js.Object {
  var `x-offset`: js.UndefOr[Double] = js.native
  var `y-offset`: js.UndefOr[Double] = js.native
  var `z-offset`: js.UndefOr[Double] = js.native
}

object ObjectOffset {
  @scala.inline
  def apply(): ObjectOffset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectOffset]
  }
  @scala.inline
  implicit class ObjectOffsetOps[Self <: ObjectOffset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withX-offset`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutX-offset`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-offset")(js.undefined)
        ret
    }
    @scala.inline
    def `withY-offset`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y-offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutY-offset`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y-offset")(js.undefined)
        ret
    }
    @scala.inline
    def `withZ-offset`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z-offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutZ-offset`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z-offset")(js.undefined)
        ret
    }
  }
  
}

