package typingsSlinky.jointjs.mod.Vectorizer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rotation extends js.Object {
  var angle: Double = js.native
  var cx: js.UndefOr[Double] = js.native
  var cy: js.UndefOr[Double] = js.native
}

object Rotation {
  @scala.inline
  def apply(angle: Double): Rotation = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rotation]
  }
  @scala.inline
  implicit class RotationOps[Self <: Rotation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cx")(js.undefined)
        ret
    }
    @scala.inline
    def withCy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cy")(js.undefined)
        ret
    }
  }
  
}

