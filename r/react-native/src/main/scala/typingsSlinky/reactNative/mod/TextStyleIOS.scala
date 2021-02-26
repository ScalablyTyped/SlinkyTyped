package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.reactNativeStrings.auto
import typingsSlinky.reactNative.reactNativeStrings.dashed
import typingsSlinky.reactNative.reactNativeStrings.dotted
import typingsSlinky.reactNative.reactNativeStrings.double
import typingsSlinky.reactNative.reactNativeStrings.ltr
import typingsSlinky.reactNative.reactNativeStrings.rtl
import typingsSlinky.reactNative.reactNativeStrings.solid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextStyleIOS extends ViewStyle {
  
  var fontVariant: js.UndefOr[js.Array[FontVariant]] = js.native
  
  var letterSpacing: js.UndefOr[Double] = js.native
  
  var textDecorationColor: js.UndefOr[ColorValue] = js.native
  
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
  implicit class TextStyleIOSMutableBuilder[Self <: TextStyleIOS] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFontVariant(value: js.Array[FontVariant]): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", js.undefined)
    
    @scala.inline
    def setFontVariantVarargs(value: FontVariant*): Self = StObject.set(x, "fontVariant", js.Array(value :_*))
    
    @scala.inline
    def setLetterSpacing(value: Double): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
    
    @scala.inline
    def setTextDecorationColor(value: ColorValue): Self = StObject.set(x, "textDecorationColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDecorationColorUndefined: Self = StObject.set(x, "textDecorationColor", js.undefined)
    
    @scala.inline
    def setTextDecorationStyle(value: solid | double | dotted | dashed): Self = StObject.set(x, "textDecorationStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDecorationStyleUndefined: Self = StObject.set(x, "textDecorationStyle", js.undefined)
    
    @scala.inline
    def setWritingDirection(value: auto | ltr | rtl): Self = StObject.set(x, "writingDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritingDirectionUndefined: Self = StObject.set(x, "writingDirection", js.undefined)
  }
}
