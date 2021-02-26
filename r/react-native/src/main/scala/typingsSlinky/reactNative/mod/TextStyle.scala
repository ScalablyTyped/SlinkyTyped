package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.anon.Height
import typingsSlinky.reactNative.reactNativeStrings.`100`
import typingsSlinky.reactNative.reactNativeStrings.`200`
import typingsSlinky.reactNative.reactNativeStrings.`300`
import typingsSlinky.reactNative.reactNativeStrings.`400`
import typingsSlinky.reactNative.reactNativeStrings.`500`
import typingsSlinky.reactNative.reactNativeStrings.`600`
import typingsSlinky.reactNative.reactNativeStrings.`700`
import typingsSlinky.reactNative.reactNativeStrings.`800`
import typingsSlinky.reactNative.reactNativeStrings.`900`
import typingsSlinky.reactNative.reactNativeStrings.`line-through`
import typingsSlinky.reactNative.reactNativeStrings.`underline line-through`
import typingsSlinky.reactNative.reactNativeStrings.auto
import typingsSlinky.reactNative.reactNativeStrings.bold
import typingsSlinky.reactNative.reactNativeStrings.bottom
import typingsSlinky.reactNative.reactNativeStrings.capitalize
import typingsSlinky.reactNative.reactNativeStrings.center
import typingsSlinky.reactNative.reactNativeStrings.italic
import typingsSlinky.reactNative.reactNativeStrings.justify
import typingsSlinky.reactNative.reactNativeStrings.left
import typingsSlinky.reactNative.reactNativeStrings.lowercase
import typingsSlinky.reactNative.reactNativeStrings.none
import typingsSlinky.reactNative.reactNativeStrings.normal_
import typingsSlinky.reactNative.reactNativeStrings.right
import typingsSlinky.reactNative.reactNativeStrings.top
import typingsSlinky.reactNative.reactNativeStrings.underline
import typingsSlinky.reactNative.reactNativeStrings.uppercase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.reactNative.mod.TransformsStyle because Already inherited
- typingsSlinky.reactNative.mod.ShadowStyleIOS because Already inherited
- typingsSlinky.reactNative.mod.FlexStyle because Already inherited
- typingsSlinky.reactNative.mod.ViewStyle because Already inherited
- typingsSlinky.reactNative.mod.TextStyleAndroid because var conflicts: alignContent, alignItems, alignSelf, aspectRatio, backfaceVisibility, backgroundColor, borderBottomColor, borderBottomEndRadius, borderBottomLeftRadius, borderBottomRightRadius, borderBottomStartRadius, borderBottomWidth, borderColor, borderEndColor, borderEndWidth, borderLeftColor, borderLeftWidth, borderRadius, borderRightColor, borderRightWidth, borderStartColor, borderStartWidth, borderStyle, borderTopColor, borderTopEndRadius, borderTopLeftRadius, borderTopRightRadius, borderTopStartRadius, borderTopWidth, borderWidth, bottom, direction, display, elevation, end, flex, flexBasis, flexDirection, flexGrow, flexShrink, flexWrap, height, justifyContent, left, margin, marginBottom, marginEnd, marginHorizontal, marginLeft, marginRight, marginStart, marginTop, marginVertical, maxHeight, maxWidth, minHeight, minWidth, opacity, overflow, padding, paddingBottom, paddingEnd, paddingHorizontal, paddingLeft, paddingRight, paddingStart, paddingTop, paddingVertical, position, right, rotation, scaleX, scaleY, shadowColor, shadowOffset, shadowOpacity, shadowRadius, start, testID, top, transform, transformMatrix, translateX, translateY, width, zIndex. Inlined textAlignVertical, includeFontPadding */ @js.native
trait TextStyle extends TextStyleIOS {
  
  var color: js.UndefOr[ColorValue] = js.native
  
  var fontFamily: js.UndefOr[String] = js.native
  
  var fontSize: js.UndefOr[Double] = js.native
  
  var fontStyle: js.UndefOr[normal_ | italic] = js.native
  
  /**
    * Specifies font weight. The values 'normal' and 'bold' are supported
    * for most fonts. Not all fonts have a variant for each of the numeric
    * values, in that case the closest one is chosen.
    */
  var fontWeight: js.UndefOr[
    normal_ | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900`
  ] = js.native
  
  var includeFontPadding: js.UndefOr[Boolean] = js.native
  
  var lineHeight: js.UndefOr[Double] = js.native
  
  var textAlign: js.UndefOr[auto | left | right | center | justify] = js.native
  
  var textAlignVertical: js.UndefOr[auto | top | bottom | center] = js.native
  
  var textDecorationLine: js.UndefOr[none | underline | `line-through` | (`underline line-through`)] = js.native
  
  var textShadowColor: js.UndefOr[ColorValue] = js.native
  
  var textShadowOffset: js.UndefOr[Height] = js.native
  
  var textShadowRadius: js.UndefOr[Double] = js.native
  
  var textTransform: js.UndefOr[none | capitalize | uppercase | lowercase] = js.native
}
object TextStyle {
  
  @scala.inline
  def apply(): TextStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextStyle]
  }
  
  @scala.inline
  implicit class TextStyleMutableBuilder[Self <: TextStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: ColorValue): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setFontStyle(value: normal_ | italic): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    @scala.inline
    def setFontWeight(value: normal_ | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900`): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    @scala.inline
    def setIncludeFontPadding(value: Boolean): Self = StObject.set(x, "includeFontPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeFontPaddingUndefined: Self = StObject.set(x, "includeFontPadding", js.undefined)
    
    @scala.inline
    def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
    @scala.inline
    def setTextAlign(value: auto | left | right | center | justify): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    @scala.inline
    def setTextAlignVertical(value: auto | top | bottom | center): Self = StObject.set(x, "textAlignVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlignVerticalUndefined: Self = StObject.set(x, "textAlignVertical", js.undefined)
    
    @scala.inline
    def setTextDecorationLine(value: none | underline | `line-through` | (`underline line-through`)): Self = StObject.set(x, "textDecorationLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDecorationLineUndefined: Self = StObject.set(x, "textDecorationLine", js.undefined)
    
    @scala.inline
    def setTextShadowColor(value: ColorValue): Self = StObject.set(x, "textShadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextShadowColorUndefined: Self = StObject.set(x, "textShadowColor", js.undefined)
    
    @scala.inline
    def setTextShadowOffset(value: Height): Self = StObject.set(x, "textShadowOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextShadowOffsetUndefined: Self = StObject.set(x, "textShadowOffset", js.undefined)
    
    @scala.inline
    def setTextShadowRadius(value: Double): Self = StObject.set(x, "textShadowRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextShadowRadiusUndefined: Self = StObject.set(x, "textShadowRadius", js.undefined)
    
    @scala.inline
    def setTextTransform(value: none | capitalize | uppercase | lowercase): Self = StObject.set(x, "textTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTransformUndefined: Self = StObject.set(x, "textTransform", js.undefined)
  }
}
