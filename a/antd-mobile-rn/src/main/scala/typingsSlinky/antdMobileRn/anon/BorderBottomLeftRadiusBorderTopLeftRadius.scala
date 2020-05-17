package typingsSlinky.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderBottomLeftRadiusBorderTopLeftRadius extends js.Object {
  var borderBottomLeftRadius: Double = js.native
  var borderTopLeftRadius: Double = js.native
}

object BorderBottomLeftRadiusBorderTopLeftRadius {
  @scala.inline
  def apply(borderBottomLeftRadius: Double, borderTopLeftRadius: Double): BorderBottomLeftRadiusBorderTopLeftRadius = {
    val __obj = js.Dynamic.literal(borderBottomLeftRadius = borderBottomLeftRadius.asInstanceOf[js.Any], borderTopLeftRadius = borderTopLeftRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderBottomLeftRadiusBorderTopLeftRadius]
  }
  @scala.inline
  implicit class BorderBottomLeftRadiusBorderTopLeftRadiusOps[Self <: BorderBottomLeftRadiusBorderTopLeftRadius] (val x: Self) extends AnyVal {
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

