package typingsSlinky.reactNativeMaterialKit.mod

import typingsSlinky.reactNative.mod.TextInputProps
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNativeMaterialKit.mod.MKPropTypes.font
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class MKTextFieldPropertiesMutableBuilder[Self <: MKTextFieldProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalInputProps(value: TextInputProps): Self = StObject.set(x, "additionalInputProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalInputPropsUndefined: Self = StObject.set(x, "additionalInputProps", js.undefined)
    
    @scala.inline
    def setFloatingLabelAniDuration(value: Double): Self = StObject.set(x, "floatingLabelAniDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatingLabelAniDurationUndefined: Self = StObject.set(x, "floatingLabelAniDuration", js.undefined)
    
    @scala.inline
    def setFloatingLabelBottomMargin(value: Double): Self = StObject.set(x, "floatingLabelBottomMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatingLabelBottomMarginUndefined: Self = StObject.set(x, "floatingLabelBottomMargin", js.undefined)
    
    @scala.inline
    def setFloatingLabelEnabled(value: Boolean): Self = StObject.set(x, "floatingLabelEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatingLabelEnabledUndefined: Self = StObject.set(x, "floatingLabelEnabled", js.undefined)
    
    @scala.inline
    def setFloatingLabelFont(value: font): Self = StObject.set(x, "floatingLabelFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatingLabelFontUndefined: Self = StObject.set(x, "floatingLabelFont", js.undefined)
    
    @scala.inline
    def setHighlightColor(value: String): Self = StObject.set(x, "highlightColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightColorUndefined: Self = StObject.set(x, "highlightColor", js.undefined)
    
    @scala.inline
    def setOnTextChange(value: /* val */ String => Unit): Self = StObject.set(x, "onTextChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTextChangeUndefined: Self = StObject.set(x, "onTextChange", js.undefined)
    
    @scala.inline
    def setPassword(value: Boolean): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextInputStyle(value: TextStyle): Self = StObject.set(x, "textInputStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextInputStyleUndefined: Self = StObject.set(x, "textInputStyle", js.undefined)
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
    
    @scala.inline
    def setUnderlineEnabled(value: Boolean): Self = StObject.set(x, "underlineEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlineEnabledUndefined: Self = StObject.set(x, "underlineEnabled", js.undefined)
    
    @scala.inline
    def setUnderlineSize(value: Double): Self = StObject.set(x, "underlineSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlineSizeUndefined: Self = StObject.set(x, "underlineSize", js.undefined)
  }
}
