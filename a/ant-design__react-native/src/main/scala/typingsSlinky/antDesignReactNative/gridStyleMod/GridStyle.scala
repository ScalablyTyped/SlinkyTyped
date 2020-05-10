package typingsSlinky.antDesignReactNative.gridStyleMod

import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridStyle extends js.Object {
  var grayBorderBox: ViewStyle = js.native
  var icon: ImageStyle = js.native
  var text: TextStyle = js.native
}

object GridStyle {
  @scala.inline
  def apply(grayBorderBox: ViewStyle, icon: ImageStyle, text: TextStyle): GridStyle = {
    val __obj = js.Dynamic.literal(grayBorderBox = grayBorderBox.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridStyle]
  }
  @scala.inline
  implicit class GridStyleOps[Self <: GridStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGrayBorderBox(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grayBorderBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcon(value: ImageStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

