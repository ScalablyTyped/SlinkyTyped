package typingsSlinky.jointjs.mod.g

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scale_ extends js.Object {
  var sx: Double = js.native
  var sy: Double = js.native
}

object Scale_ {
  @scala.inline
  def apply(sx: Double, sy: Double): Scale_ = {
    val __obj = js.Dynamic.literal(sx = sx.asInstanceOf[js.Any], sy = sy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale_]
  }
  @scala.inline
  implicit class Scale_Ops[Self <: Scale_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

