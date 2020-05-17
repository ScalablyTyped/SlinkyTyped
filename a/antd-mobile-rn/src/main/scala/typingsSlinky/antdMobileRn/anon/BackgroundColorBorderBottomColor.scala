package typingsSlinky.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundColorBorderBottomColor extends js.Object {
  var alignItems: String = js.native
  var backgroundColor: String = js.native
  var borderBottomColor: String = js.native
  var paddingVertical: Double = js.native
}

object BackgroundColorBorderBottomColor {
  @scala.inline
  def apply(alignItems: String, backgroundColor: String, borderBottomColor: String, paddingVertical: Double): BackgroundColorBorderBottomColor = {
    val __obj = js.Dynamic.literal(alignItems = alignItems.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], borderBottomColor = borderBottomColor.asInstanceOf[js.Any], paddingVertical = paddingVertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColorBorderBottomColor]
  }
  @scala.inline
  implicit class BackgroundColorBorderBottomColorOps[Self <: BackgroundColorBorderBottomColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignItems(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderBottomColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottomColor")(value.asInstanceOf[js.Any])
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

