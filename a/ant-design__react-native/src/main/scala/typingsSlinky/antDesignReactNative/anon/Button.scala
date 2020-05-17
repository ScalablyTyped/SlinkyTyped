package typingsSlinky.antDesignReactNative.anon

import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.RegisteredStyle
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Button extends js.Object {
  var button: RegisteredStyle[ViewStyle] = js.native
  var buttonWrap: RegisteredStyle[ViewStyle] = js.native
  var img: RegisteredStyle[ImageStyle] = js.native
  var imgWrap: RegisteredStyle[ViewStyle] = js.native
  var message: RegisteredStyle[ViewStyle] = js.native
  var messageText: RegisteredStyle[TextStyle] = js.native
  var result: RegisteredStyle[ViewStyle] = js.native
  var title: RegisteredStyle[ViewStyle] = js.native
  var titleText: RegisteredStyle[TextStyle] = js.native
}

object Button {
  @scala.inline
  def apply(
    button: RegisteredStyle[ViewStyle],
    buttonWrap: RegisteredStyle[ViewStyle],
    img: RegisteredStyle[ImageStyle],
    imgWrap: RegisteredStyle[ViewStyle],
    message: RegisteredStyle[ViewStyle],
    messageText: RegisteredStyle[TextStyle],
    result: RegisteredStyle[ViewStyle],
    title: RegisteredStyle[ViewStyle],
    titleText: RegisteredStyle[TextStyle]
  ): Button = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], buttonWrap = buttonWrap.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], imgWrap = imgWrap.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageText = messageText.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleText = titleText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Button]
  }
  @scala.inline
  implicit class ButtonOps[Self <: Button] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButton(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonWrap(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImg(value: RegisteredStyle[ImageStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("img")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImgWrap(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imgWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageText(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitleText(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleText")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

