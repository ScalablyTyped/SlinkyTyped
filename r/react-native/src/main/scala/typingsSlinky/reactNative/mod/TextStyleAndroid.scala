package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.reactNativeStrings.auto
import typingsSlinky.reactNative.reactNativeStrings.bottom
import typingsSlinky.reactNative.reactNativeStrings.center
import typingsSlinky.reactNative.reactNativeStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextStyleAndroid extends ViewStyle {
  var includeFontPadding: js.UndefOr[Boolean] = js.native
  var textAlignVertical: js.UndefOr[auto | top | bottom | center] = js.native
}

object TextStyleAndroid {
  @scala.inline
  def apply(): TextStyleAndroid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextStyleAndroid]
  }
  @scala.inline
  implicit class TextStyleAndroidOps[Self <: TextStyleAndroid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeFontPadding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeFontPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeFontPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeFontPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withTextAlignVertical(value: auto | top | bottom | center): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlignVertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextAlignVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlignVertical")(js.undefined)
        ret
    }
  }
  
}

