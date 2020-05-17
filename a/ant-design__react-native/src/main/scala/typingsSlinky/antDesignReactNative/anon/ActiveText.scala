package typingsSlinky.antDesignReactNative.anon

import typingsSlinky.reactNative.mod.RegisteredStyle
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveText extends js.Object {
  var activeText: RegisteredStyle[TextStyle] = js.native
  var activeWrap: RegisteredStyle[ViewStyle] = js.native
  var close: RegisteredStyle[ViewStyle] = js.native
  var closeAndroid: RegisteredStyle[ViewStyle] = js.native
  var closeIOS: RegisteredStyle[ViewStyle] = js.native
  var closeText: RegisteredStyle[TextStyle] = js.native
  var closeTransform: RegisteredStyle[ViewStyle] = js.native
  var disabledText: RegisteredStyle[TextStyle] = js.native
  var disabledWrap: RegisteredStyle[ViewStyle] = js.native
  var normalText: RegisteredStyle[TextStyle] = js.native
  var normalWrap: RegisteredStyle[ViewStyle] = js.native
  var tag: RegisteredStyle[ViewStyle] = js.native
  var text: RegisteredStyle[TextStyle] = js.native
  var textSmall: RegisteredStyle[TextStyle] = js.native
  var wrap: RegisteredStyle[ViewStyle] = js.native
  var wrapSmall: RegisteredStyle[ViewStyle] = js.native
}

object ActiveText {
  @scala.inline
  def apply(
    activeText: RegisteredStyle[TextStyle],
    activeWrap: RegisteredStyle[ViewStyle],
    close: RegisteredStyle[ViewStyle],
    closeAndroid: RegisteredStyle[ViewStyle],
    closeIOS: RegisteredStyle[ViewStyle],
    closeText: RegisteredStyle[TextStyle],
    closeTransform: RegisteredStyle[ViewStyle],
    disabledText: RegisteredStyle[TextStyle],
    disabledWrap: RegisteredStyle[ViewStyle],
    normalText: RegisteredStyle[TextStyle],
    normalWrap: RegisteredStyle[ViewStyle],
    tag: RegisteredStyle[ViewStyle],
    text: RegisteredStyle[TextStyle],
    textSmall: RegisteredStyle[TextStyle],
    wrap: RegisteredStyle[ViewStyle],
    wrapSmall: RegisteredStyle[ViewStyle]
  ): ActiveText = {
    val __obj = js.Dynamic.literal(activeText = activeText.asInstanceOf[js.Any], activeWrap = activeWrap.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], closeAndroid = closeAndroid.asInstanceOf[js.Any], closeIOS = closeIOS.asInstanceOf[js.Any], closeText = closeText.asInstanceOf[js.Any], closeTransform = closeTransform.asInstanceOf[js.Any], disabledText = disabledText.asInstanceOf[js.Any], disabledWrap = disabledWrap.asInstanceOf[js.Any], normalText = normalText.asInstanceOf[js.Any], normalWrap = normalWrap.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textSmall = textSmall.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any], wrapSmall = wrapSmall.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveText]
  }
  @scala.inline
  implicit class ActiveTextOps[Self <: ActiveText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveText(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveWrap(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClose(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloseAndroid(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeAndroid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloseIOS(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeIOS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloseText(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloseTransform(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabledText(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabledWrap(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormalText(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormalWrap(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTag(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextSmall(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textSmall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrap(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrapSmall(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapSmall")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

