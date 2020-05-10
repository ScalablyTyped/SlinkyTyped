package typingsSlinky.antdMobileRn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBorderBottomLeftRadiusBorderTopLeftRadius extends js.Object {
  var borderBottomLeftRadius: Double = js.native
  var borderTopLeftRadius: Double = js.native
}

object AnonBorderBottomLeftRadiusBorderTopLeftRadius {
  @scala.inline
  def apply(borderBottomLeftRadius: Double, borderTopLeftRadius: Double): AnonBorderBottomLeftRadiusBorderTopLeftRadius = {
    val __obj = js.Dynamic.literal(borderBottomLeftRadius = borderBottomLeftRadius.asInstanceOf[js.Any], borderTopLeftRadius = borderTopLeftRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBorderBottomLeftRadiusBorderTopLeftRadius]
  }
  @scala.inline
  implicit class AnonBorderBottomLeftRadiusBorderTopLeftRadiusOps[Self <: AnonBorderBottomLeftRadiusBorderTopLeftRadius] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderBottomLeftRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottomLeftRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderTopLeftRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTopLeftRadius")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

