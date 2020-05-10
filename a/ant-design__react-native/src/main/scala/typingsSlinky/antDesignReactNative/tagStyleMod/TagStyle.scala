package typingsSlinky.antDesignReactNative.tagStyleMod

import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagStyle extends js.Object {
  var activeText: TextStyle = js.native
  var activeWrap: ViewStyle = js.native
  var close: ViewStyle = js.native
  var closeAndroid: ViewStyle = js.native
  var closeIOS: ViewStyle = js.native
  var closeText: TextStyle = js.native
  var closeTransform: ViewStyle = js.native
  var disabledText: TextStyle = js.native
  var disabledWrap: ViewStyle = js.native
  var normalText: TextStyle = js.native
  var normalWrap: ViewStyle = js.native
  var tag: ViewStyle = js.native
  var text: TextStyle = js.native
  var textSmall: TextStyle = js.native
  var wrap: ViewStyle = js.native
  var wrapSmall: ViewStyle = js.native
}

object TagStyle {
  @scala.inline
  def apply(
    activeText: TextStyle,
    activeWrap: ViewStyle,
    close: ViewStyle,
    closeAndroid: ViewStyle,
    closeIOS: ViewStyle,
    closeText: TextStyle,
    closeTransform: ViewStyle,
    disabledText: TextStyle,
    disabledWrap: ViewStyle,
    normalText: TextStyle,
    normalWrap: ViewStyle,
    tag: ViewStyle,
    text: TextStyle,
    textSmall: TextStyle,
    wrap: ViewStyle,
    wrapSmall: ViewStyle
  ): TagStyle = {
    val __obj = js.Dynamic.literal(activeText = activeText.asInstanceOf[js.Any], activeWrap = activeWrap.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], closeAndroid = closeAndroid.asInstanceOf[js.Any], closeIOS = closeIOS.asInstanceOf[js.Any], closeText = closeText.asInstanceOf[js.Any], closeTransform = closeTransform.asInstanceOf[js.Any], disabledText = disabledText.asInstanceOf[js.Any], disabledWrap = disabledWrap.asInstanceOf[js.Any], normalText = normalText.asInstanceOf[js.Any], normalWrap = normalWrap.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textSmall = textSmall.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any], wrapSmall = wrapSmall.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagStyle]
  }
  @scala.inline
  implicit class TagStyleOps[Self <: TagStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveText(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveWrap(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClose(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloseAndroid(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeAndroid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloseIOS(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeIOS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloseText(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloseTransform(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabledText(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabledWrap(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormalText(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormalWrap(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTag(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextSmall(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textSmall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrap(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrapSmall(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapSmall")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

