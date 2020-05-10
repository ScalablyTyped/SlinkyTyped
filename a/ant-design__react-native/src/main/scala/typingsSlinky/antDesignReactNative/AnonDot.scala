package typingsSlinky.antDesignReactNative

import typingsSlinky.reactNative.mod.RegisteredStyle
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDot extends js.Object {
  var dot: RegisteredStyle[ViewStyle] = js.native
  var dotSizelarge: RegisteredStyle[ViewStyle] = js.native
  var text: RegisteredStyle[TextStyle] = js.native
  var textCorner: RegisteredStyle[ViewStyle] = js.native
  var textCornerWrap: RegisteredStyle[ViewStyle] = js.native
  var textCornerlarge: RegisteredStyle[ViewStyle] = js.native
  var textDom: RegisteredStyle[ViewStyle] = js.native
  var wrap: RegisteredStyle[ViewStyle] = js.native
}

object AnonDot {
  @scala.inline
  def apply(
    dot: RegisteredStyle[ViewStyle],
    dotSizelarge: RegisteredStyle[ViewStyle],
    text: RegisteredStyle[TextStyle],
    textCorner: RegisteredStyle[ViewStyle],
    textCornerWrap: RegisteredStyle[ViewStyle],
    textCornerlarge: RegisteredStyle[ViewStyle],
    textDom: RegisteredStyle[ViewStyle],
    wrap: RegisteredStyle[ViewStyle]
  ): AnonDot = {
    val __obj = js.Dynamic.literal(dot = dot.asInstanceOf[js.Any], dotSizelarge = dotSizelarge.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textCorner = textCorner.asInstanceOf[js.Any], textCornerWrap = textCornerWrap.asInstanceOf[js.Any], textCornerlarge = textCornerlarge.asInstanceOf[js.Any], textDom = textDom.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDot]
  }
  @scala.inline
  implicit class AnonDotOps[Self <: AnonDot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDot(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDotSizelarge(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotSizelarge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextCorner(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textCorner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextCornerWrap(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textCornerWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextCornerlarge(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textCornerlarge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextDom(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDom")(value.asInstanceOf[js.Any])
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

