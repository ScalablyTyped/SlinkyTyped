package typingsSlinky.antdMobileRn.styleIndexNativeMod

import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionSheetStyle extends js.Object {
  var btn: ViewStyle = js.native
  var cancelBtn: ViewStyle = js.native
  var cancelBtnMask: ViewStyle = js.native
  var container: ViewStyle = js.native
  var content: ViewStyle = js.native
  var destructiveBtn: TextStyle = js.native
  var mask: ViewStyle = js.native
  var message: ViewStyle = js.native
  var title: ViewStyle = js.native
  var titleText: TextStyle = js.native
  var wrap: ViewStyle = js.native
}

object ActionSheetStyle {
  @scala.inline
  def apply(
    btn: ViewStyle,
    cancelBtn: ViewStyle,
    cancelBtnMask: ViewStyle,
    container: ViewStyle,
    content: ViewStyle,
    destructiveBtn: TextStyle,
    mask: ViewStyle,
    message: ViewStyle,
    title: ViewStyle,
    titleText: TextStyle,
    wrap: ViewStyle
  ): ActionSheetStyle = {
    val __obj = js.Dynamic.literal(btn = btn.asInstanceOf[js.Any], cancelBtn = cancelBtn.asInstanceOf[js.Any], cancelBtnMask = cancelBtnMask.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], destructiveBtn = destructiveBtn.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleText = titleText.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionSheetStyle]
  }
  @scala.inline
  implicit class ActionSheetStyleOps[Self <: ActionSheetStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBtn(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancelBtn(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelBtn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancelBtnMask(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelBtnMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestructiveBtn(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destructiveBtn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMask(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withWrap(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

