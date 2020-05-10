package typingsSlinky.antdMobileRn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBorderTopLeftRadius extends js.Object {
  var borderTopLeftRadius: Double = js.native
  var borderTopRightRadius: Double = js.native
  var borderTopWidth: Double = js.native
}

object AnonBorderTopLeftRadius {
  @scala.inline
  def apply(borderTopLeftRadius: Double, borderTopRightRadius: Double, borderTopWidth: Double): AnonBorderTopLeftRadius = {
    val __obj = js.Dynamic.literal(borderTopLeftRadius = borderTopLeftRadius.asInstanceOf[js.Any], borderTopRightRadius = borderTopRightRadius.asInstanceOf[js.Any], borderTopWidth = borderTopWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBorderTopLeftRadius]
  }
  @scala.inline
  implicit class AnonBorderTopLeftRadiusOps[Self <: AnonBorderTopLeftRadius] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderTopLeftRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTopLeftRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderTopRightRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTopRightRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderTopWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTopWidth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

