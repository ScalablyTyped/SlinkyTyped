package typingsSlinky.antdMobileRn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBorderBottomWidthBorderColor extends js.Object {
  var borderBottomWidth: Double = js.native
  var borderColor: String = js.native
  var borderStyle: String = js.native
}

object AnonBorderBottomWidthBorderColor {
  @scala.inline
  def apply(borderBottomWidth: Double, borderColor: String, borderStyle: String): AnonBorderBottomWidthBorderColor = {
    val __obj = js.Dynamic.literal(borderBottomWidth = borderBottomWidth.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderStyle = borderStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBorderBottomWidthBorderColor]
  }
  @scala.inline
  implicit class AnonBorderBottomWidthBorderColorOps[Self <: AnonBorderBottomWidthBorderColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderBottomWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottomWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderStyle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

