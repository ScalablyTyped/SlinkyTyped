package typingsSlinky.antDesignReactNative

import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.RegisteredStyle
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGrayBorderBox extends js.Object {
  var grayBorderBox: RegisteredStyle[ViewStyle] = js.native
  var icon: RegisteredStyle[ImageStyle] = js.native
  var text: RegisteredStyle[TextStyle] = js.native
}

object AnonGrayBorderBox {
  @scala.inline
  def apply(
    grayBorderBox: RegisteredStyle[ViewStyle],
    icon: RegisteredStyle[ImageStyle],
    text: RegisteredStyle[TextStyle]
  ): AnonGrayBorderBox = {
    val __obj = js.Dynamic.literal(grayBorderBox = grayBorderBox.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGrayBorderBox]
  }
  @scala.inline
  implicit class AnonGrayBorderBoxOps[Self <: AnonGrayBorderBox] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGrayBorderBox(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grayBorderBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcon(value: RegisteredStyle[ImageStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

