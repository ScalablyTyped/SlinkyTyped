package typingsSlinky.easeljs.createjs.Graphics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrokeStyle extends js.Object {
  // properties
  var caps: String = js.native
  var joints: String = js.native
  var miterLimit: Double = js.native
  var width: Double = js.native
}

object StrokeStyle {
  @scala.inline
  def apply(caps: String, joints: String, miterLimit: Double, width: Double): StrokeStyle = {
    val __obj = js.Dynamic.literal(caps = caps.asInstanceOf[js.Any], joints = joints.asInstanceOf[js.Any], miterLimit = miterLimit.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrokeStyle]
  }
  @scala.inline
  implicit class StrokeStyleOps[Self <: StrokeStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaps(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJoints(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("joints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMiterLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("miterLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

