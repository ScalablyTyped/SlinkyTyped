package typingsSlinky.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundColorBorderWidth extends js.Object {
  var backgroundColor: String = js.native
  var borderWidth: Double = js.native
}

object BackgroundColorBorderWidth {
  @scala.inline
  def apply(backgroundColor: String, borderWidth: Double): BackgroundColorBorderWidth = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColorBorderWidth]
  }
  @scala.inline
  implicit class BackgroundColorBorderWidthOps[Self <: BackgroundColorBorderWidth] (val x: Self) extends AnyVal {
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
    def withBorderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

