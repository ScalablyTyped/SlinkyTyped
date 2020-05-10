package typingsSlinky.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkRRect extends js.Object {
  var rect: SkRect = js.native
  var rx1: Double = js.native
  var rx2: Double = js.native
  var rx3: Double = js.native
  var rx4: Double = js.native
  var ry1: Double = js.native
  var ry2: Double = js.native
  var ry3: Double = js.native
  var ry4: Double = js.native
}

object SkRRect {
  @scala.inline
  def apply(
    rect: SkRect,
    rx1: Double,
    rx2: Double,
    rx3: Double,
    rx4: Double,
    ry1: Double,
    ry2: Double,
    ry3: Double,
    ry4: Double
  ): SkRRect = {
    val __obj = js.Dynamic.literal(rect = rect.asInstanceOf[js.Any], rx1 = rx1.asInstanceOf[js.Any], rx2 = rx2.asInstanceOf[js.Any], rx3 = rx3.asInstanceOf[js.Any], rx4 = rx4.asInstanceOf[js.Any], ry1 = ry1.asInstanceOf[js.Any], ry2 = ry2.asInstanceOf[js.Any], ry3 = ry3.asInstanceOf[js.Any], ry4 = ry4.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkRRect]
  }
  @scala.inline
  implicit class SkRRectOps[Self <: SkRRect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRect(value: SkRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRx1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rx1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRx2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rx2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRx3(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rx3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRx4(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rx4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRy1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ry1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRy2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ry2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRy3(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ry3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRy4(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ry4")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

