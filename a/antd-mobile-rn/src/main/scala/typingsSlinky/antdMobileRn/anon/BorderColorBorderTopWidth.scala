package typingsSlinky.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderColorBorderTopWidth extends js.Object {
  var borderColor: String = js.native
  var borderTopWidth: Double = js.native
  var flexGrow: Double = js.native
  var paddingVertical: Double = js.native
}

object BorderColorBorderTopWidth {
  @scala.inline
  def apply(borderColor: String, borderTopWidth: Double, flexGrow: Double, paddingVertical: Double): BorderColorBorderTopWidth = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderTopWidth = borderTopWidth.asInstanceOf[js.Any], flexGrow = flexGrow.asInstanceOf[js.Any], paddingVertical = paddingVertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderColorBorderTopWidth]
  }
  @scala.inline
  implicit class BorderColorBorderTopWidthOps[Self <: BorderColorBorderTopWidth] (val x: Self) extends AnyVal {
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
    def withFlexGrow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexGrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaddingVertical(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingVertical")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

