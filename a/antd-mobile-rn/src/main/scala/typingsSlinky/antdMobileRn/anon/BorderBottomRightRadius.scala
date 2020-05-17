package typingsSlinky.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderBottomRightRadius extends js.Object {
  var borderBottomLeftRadius: Double = js.native
  var borderBottomRightRadius: Double = js.native
}

object BorderBottomRightRadius {
  @scala.inline
  def apply(borderBottomLeftRadius: Double, borderBottomRightRadius: Double): BorderBottomRightRadius = {
    val __obj = js.Dynamic.literal(borderBottomLeftRadius = borderBottomLeftRadius.asInstanceOf[js.Any], borderBottomRightRadius = borderBottomRightRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderBottomRightRadius]
  }
  @scala.inline
  implicit class BorderBottomRightRadiusOps[Self <: BorderBottomRightRadius] (val x: Self) extends AnyVal {
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
    def withBorderBottomRightRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottomRightRadius")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

