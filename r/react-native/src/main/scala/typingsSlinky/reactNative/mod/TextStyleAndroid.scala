package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.reactNativeStrings.auto
import typingsSlinky.reactNative.reactNativeStrings.bottom
import typingsSlinky.reactNative.reactNativeStrings.center
import typingsSlinky.reactNative.reactNativeStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class TextStyleAndroidMutableBuilder[Self <: TextStyleAndroid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeFontPadding(value: Boolean): Self = StObject.set(x, "includeFontPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeFontPaddingUndefined: Self = StObject.set(x, "includeFontPadding", js.undefined)
    
    @scala.inline
    def setTextAlignVertical(value: auto | top | bottom | center): Self = StObject.set(x, "textAlignVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlignVerticalUndefined: Self = StObject.set(x, "textAlignVertical", js.undefined)
  }
}
