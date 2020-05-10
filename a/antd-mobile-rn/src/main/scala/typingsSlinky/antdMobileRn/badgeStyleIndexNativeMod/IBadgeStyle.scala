package typingsSlinky.antdMobileRn.badgeStyleIndexNativeMod

import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBadgeStyle extends js.Object {
  var dot: ViewStyle = js.native
  var dotSizelarge: ViewStyle = js.native
  var text: TextStyle = js.native
  var textCorner: ViewStyle = js.native
  var textCornerWrap: ViewStyle = js.native
  var textCornerlarge: ViewStyle = js.native
  var textDom: ViewStyle = js.native
  var wrap: ViewStyle = js.native
}

object IBadgeStyle {
  @scala.inline
  def apply(
    dot: ViewStyle,
    dotSizelarge: ViewStyle,
    text: TextStyle,
    textCorner: ViewStyle,
    textCornerWrap: ViewStyle,
    textCornerlarge: ViewStyle,
    textDom: ViewStyle,
    wrap: ViewStyle
  ): IBadgeStyle = {
    val __obj = js.Dynamic.literal(dot = dot.asInstanceOf[js.Any], dotSizelarge = dotSizelarge.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textCorner = textCorner.asInstanceOf[js.Any], textCornerWrap = textCornerWrap.asInstanceOf[js.Any], textCornerlarge = textCornerlarge.asInstanceOf[js.Any], textDom = textDom.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBadgeStyle]
  }
  @scala.inline
  implicit class IBadgeStyleOps[Self <: IBadgeStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDot(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDotSizelarge(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotSizelarge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextCorner(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textCorner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextCornerWrap(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textCornerWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextCornerlarge(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textCornerlarge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextDom(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDom")(value.asInstanceOf[js.Any])
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

