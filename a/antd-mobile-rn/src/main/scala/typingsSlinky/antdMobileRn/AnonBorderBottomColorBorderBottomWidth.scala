package typingsSlinky.antdMobileRn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBorderBottomColorBorderBottomWidth extends js.Object {
  var borderBottomColor: String = js.native
  var borderBottomWidth: Double = js.native
}

object AnonBorderBottomColorBorderBottomWidth {
  @scala.inline
  def apply(borderBottomColor: String, borderBottomWidth: Double): AnonBorderBottomColorBorderBottomWidth = {
    val __obj = js.Dynamic.literal(borderBottomColor = borderBottomColor.asInstanceOf[js.Any], borderBottomWidth = borderBottomWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBorderBottomColorBorderBottomWidth]
  }
  @scala.inline
  implicit class AnonBorderBottomColorBorderBottomWidthOps[Self <: AnonBorderBottomColorBorderBottomWidth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderBottomColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottomColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderBottomWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottomWidth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

