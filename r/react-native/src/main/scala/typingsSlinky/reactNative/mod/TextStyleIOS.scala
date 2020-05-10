package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.reactNativeStrings.auto
import typingsSlinky.reactNative.reactNativeStrings.dashed
import typingsSlinky.reactNative.reactNativeStrings.dotted
import typingsSlinky.reactNative.reactNativeStrings.double
import typingsSlinky.reactNative.reactNativeStrings.ltr
import typingsSlinky.reactNative.reactNativeStrings.rtl
import typingsSlinky.reactNative.reactNativeStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextStyleIOS extends ViewStyle {
  var fontVariant: js.UndefOr[js.Array[FontVariant]] = js.native
  var letterSpacing: js.UndefOr[Double] = js.native
  var textDecorationColor: js.UndefOr[String] = js.native
  var textDecorationStyle: js.UndefOr[solid | double | dotted | dashed] = js.native
  var writingDirection: js.UndefOr[auto | ltr | rtl] = js.native
}

object TextStyleIOS {
  @scala.inline
  def apply(): TextStyleIOS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextStyleIOS]
  }
  @scala.inline
  implicit class TextStyleIOSOps[Self <: TextStyleIOS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFontVariant(value: js.Array[FontVariant]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontVariant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontVariant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontVariant")(js.undefined)
        ret
    }
    @scala.inline
    def withLetterSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("letterSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLetterSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("letterSpacing")(js.undefined)
        ret
    }
    @scala.inline
    def withTextDecorationColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDecorationColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextDecorationColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDecorationColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTextDecorationStyle(value: solid | double | dotted | dashed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDecorationStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextDecorationStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDecorationStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withWritingDirection(value: auto | ltr | rtl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writingDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWritingDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writingDirection")(js.undefined)
        ret
    }
  }
  
}

