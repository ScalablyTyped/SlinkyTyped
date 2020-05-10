package typingsSlinky.antdMobileRn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBorderTopColor extends js.Object {
  var backgroundColor: String = js.native
  var borderTopColor: String = js.native
  var borderTopWidth: Double = js.native
}

object AnonBorderTopColor {
  @scala.inline
  def apply(backgroundColor: String, borderTopColor: String, borderTopWidth: Double): AnonBorderTopColor = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderTopColor = borderTopColor.asInstanceOf[js.Any], borderTopWidth = borderTopWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBorderTopColor]
  }
  @scala.inline
  implicit class AnonBorderTopColorOps[Self <: AnonBorderTopColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderTopColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTopColor")(value.asInstanceOf[js.Any])
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

