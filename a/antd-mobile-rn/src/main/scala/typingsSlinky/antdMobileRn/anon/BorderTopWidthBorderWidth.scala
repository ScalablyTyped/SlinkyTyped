package typingsSlinky.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderTopWidthBorderWidth extends js.Object {
  var borderColor: String = js.native
  var borderTopWidth: Double = js.native
  var borderWidth: Double = js.native
}

object BorderTopWidthBorderWidth {
  @scala.inline
  def apply(borderColor: String, borderTopWidth: Double, borderWidth: Double): BorderTopWidthBorderWidth = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderTopWidth = borderTopWidth.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderTopWidthBorderWidth]
  }
  @scala.inline
  implicit class BorderTopWidthBorderWidthOps[Self <: BorderTopWidthBorderWidth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderTopWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTopWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

