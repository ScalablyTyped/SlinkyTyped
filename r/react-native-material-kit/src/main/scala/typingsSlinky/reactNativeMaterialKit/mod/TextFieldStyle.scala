package typingsSlinky.reactNativeMaterialKit.mod

import typingsSlinky.reactNativeMaterialKit.anon.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextFieldStyle extends js.Object {
  var highlightColor: js.UndefOr[String] = js.native
  var textInputStyle: js.UndefOr[Color] = js.native
  var tintColor: js.UndefOr[String] = js.native
}

object TextFieldStyle {
  @scala.inline
  def apply(): TextFieldStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextFieldStyle]
  }
  @scala.inline
  implicit class TextFieldStyleOps[Self <: TextFieldStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHighlightColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTextInputStyle(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textInputStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextInputStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textInputStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTintColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tintColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTintColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tintColor")(js.undefined)
        ret
    }
  }
  
}

