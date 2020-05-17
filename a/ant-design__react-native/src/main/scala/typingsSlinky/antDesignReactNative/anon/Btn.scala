package typingsSlinky.antDesignReactNative.anon

import typingsSlinky.reactNative.mod.RegisteredStyle
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Btn extends js.Object {
  var btn: RegisteredStyle[ViewStyle] = js.native
  var cancelBtn: RegisteredStyle[ViewStyle] = js.native
  var cancelBtnMask: RegisteredStyle[ViewStyle] = js.native
  var container: RegisteredStyle[ViewStyle] = js.native
  var content: RegisteredStyle[ViewStyle] = js.native
  var destructiveBtn: RegisteredStyle[TextStyle] = js.native
  var mask: RegisteredStyle[ViewStyle] = js.native
  var message: RegisteredStyle[ViewStyle] = js.native
  var title: RegisteredStyle[ViewStyle] = js.native
  var titleText: RegisteredStyle[TextStyle] = js.native
  var wrap: RegisteredStyle[ViewStyle] = js.native
}

object Btn {
  @scala.inline
  def apply(
    btn: RegisteredStyle[ViewStyle],
    cancelBtn: RegisteredStyle[ViewStyle],
    cancelBtnMask: RegisteredStyle[ViewStyle],
    container: RegisteredStyle[ViewStyle],
    content: RegisteredStyle[ViewStyle],
    destructiveBtn: RegisteredStyle[TextStyle],
    mask: RegisteredStyle[ViewStyle],
    message: RegisteredStyle[ViewStyle],
    title: RegisteredStyle[ViewStyle],
    titleText: RegisteredStyle[TextStyle],
    wrap: RegisteredStyle[ViewStyle]
  ): Btn = {
    val __obj = js.Dynamic.literal(btn = btn.asInstanceOf[js.Any], cancelBtn = cancelBtn.asInstanceOf[js.Any], cancelBtnMask = cancelBtnMask.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], destructiveBtn = destructiveBtn.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleText = titleText.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Btn]
  }
  @scala.inline
  implicit class BtnOps[Self <: Btn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBtn(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancelBtn(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelBtn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancelBtnMask(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelBtnMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestructiveBtn(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destructiveBtn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMask(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withWrap(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

