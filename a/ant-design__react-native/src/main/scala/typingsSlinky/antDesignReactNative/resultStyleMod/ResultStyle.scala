package typingsSlinky.antDesignReactNative.resultStyleMod

import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultStyle extends js.Object {
  var button: ViewStyle = js.native
  var buttonWrap: ViewStyle = js.native
  var img: ImageStyle = js.native
  var imgWrap: ViewStyle = js.native
  var message: ViewStyle = js.native
  var messageText: TextStyle = js.native
  var result: ViewStyle = js.native
  var title: ViewStyle = js.native
  var titleText: TextStyle = js.native
}

object ResultStyle {
  @scala.inline
  def apply(
    button: ViewStyle,
    buttonWrap: ViewStyle,
    img: ImageStyle,
    imgWrap: ViewStyle,
    message: ViewStyle,
    messageText: TextStyle,
    result: ViewStyle,
    title: ViewStyle,
    titleText: TextStyle
  ): ResultStyle = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], buttonWrap = buttonWrap.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], imgWrap = imgWrap.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageText = messageText.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleText = titleText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultStyle]
  }
  @scala.inline
  implicit class ResultStyleOps[Self <: ResultStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButton(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonWrap(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImg(value: ImageStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("img")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImgWrap(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imgWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageText(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitleText(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleText")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

