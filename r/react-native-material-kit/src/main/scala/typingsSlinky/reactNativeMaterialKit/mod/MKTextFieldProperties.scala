package typingsSlinky.reactNativeMaterialKit.mod

import typingsSlinky.reactNative.mod.TextInputProps
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNativeMaterialKit.mod.MKPropTypes.font
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.reactNativeMaterialKit.mod.FloatingLabelProperties because var conflicts: allowFontScaling. Inlined floatingLabelEnabled, floatingLabelAniDuration, floatingLabelBottomMargin, floatingLabelFont */ @js.native
trait MKTextFieldProperties extends TextInputProps {
  var additionalInputProps: js.UndefOr[TextInputProps] = js.native
  var floatingLabelAniDuration: js.UndefOr[Double] = js.native
  var floatingLabelBottomMargin: js.UndefOr[Double] = js.native
  var floatingLabelEnabled: js.UndefOr[Boolean] = js.native
  var floatingLabelFont: js.UndefOr[font] = js.native
  var highlightColor: js.UndefOr[String] = js.native
  var onTextChange: js.UndefOr[js.Function1[/* val */ String, Unit]] = js.native
  var password: js.UndefOr[Boolean] = js.native
  var text: js.UndefOr[String] = js.native
  var textInputStyle: js.UndefOr[TextStyle] = js.native
  var tintColor: js.UndefOr[String] = js.native
  var underlineEnabled: js.UndefOr[Boolean] = js.native
  var underlineSize: js.UndefOr[Double] = js.native
}

object MKTextFieldProperties {
  @scala.inline
  def apply(): MKTextFieldProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MKTextFieldProperties]
  }
  @scala.inline
  implicit class MKTextFieldPropertiesOps[Self <: MKTextFieldProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalInputProps(value: TextInputProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalInputProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalInputProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalInputProps")(js.undefined)
        ret
    }
    @scala.inline
    def withFloatingLabelAniDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatingLabelAniDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloatingLabelAniDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatingLabelAniDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withFloatingLabelBottomMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatingLabelBottomMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloatingLabelBottomMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatingLabelBottomMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withFloatingLabelEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatingLabelEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloatingLabelEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatingLabelEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFloatingLabelFont(value: font): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatingLabelFont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloatingLabelFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatingLabelFont")(js.undefined)
        ret
    }
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
    def withOnTextChange(value: /* val */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTextChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTextChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTextChange")(js.undefined)
        ret
    }
    @scala.inline
    def withPassword(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTextInputStyle(value: TextStyle): Self = {
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
    @scala.inline
    def withUnderlineEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlineEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnderlineEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlineEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withUnderlineSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlineSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnderlineSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlineSize")(js.undefined)
        ret
    }
  }
  
}

