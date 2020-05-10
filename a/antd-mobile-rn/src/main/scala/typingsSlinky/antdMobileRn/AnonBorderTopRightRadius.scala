package typingsSlinky.antdMobileRn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBorderTopRightRadius extends js.Object {
  var borderBottomRightRadius: Double = js.native
  var borderTopRightRadius: Double = js.native
}

object AnonBorderTopRightRadius {
  @scala.inline
  def apply(borderBottomRightRadius: Double, borderTopRightRadius: Double): AnonBorderTopRightRadius = {
    val __obj = js.Dynamic.literal(borderBottomRightRadius = borderBottomRightRadius.asInstanceOf[js.Any], borderTopRightRadius = borderTopRightRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBorderTopRightRadius]
  }
  @scala.inline
  implicit class AnonBorderTopRightRadiusOps[Self <: AnonBorderTopRightRadius] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderBottomRightRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottomRightRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderTopRightRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTopRightRadius")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

