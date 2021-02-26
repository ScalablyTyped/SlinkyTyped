package typingsSlinky.reactSketchapp.typesMod

import typingsSlinky.reactSketchapp.anon.Width
import typingsSlinky.reactSketchapp.reactSketchappStrings.auto
import typingsSlinky.reactSketchapp.reactSketchappStrings.center
import typingsSlinky.reactSketchapp.reactSketchappStrings.italic
import typingsSlinky.reactSketchapp.reactSketchappStrings.justify
import typingsSlinky.reactSketchapp.reactSketchappStrings.left
import typingsSlinky.reactSketchapp.reactSketchappStrings.lowercase
import typingsSlinky.reactSketchapp.reactSketchappStrings.ltr
import typingsSlinky.reactSketchapp.reactSketchappStrings.normal
import typingsSlinky.reactSketchapp.reactSketchappStrings.right
import typingsSlinky.reactSketchapp.reactSketchappStrings.rtl
import typingsSlinky.reactSketchapp.reactSketchappStrings.uppercase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextStyle extends StObject {
  
  var color: js.UndefOr[Color] = js.native
  
  var fontFamily: js.UndefOr[String] = js.native
  
  var fontSize: js.UndefOr[Double] = js.native
  
  var fontStyle: js.UndefOr[normal | italic] = js.native
  
  var fontWeight: js.UndefOr[String] = js.native
  
  var letterSpacing: js.UndefOr[Double] = js.native
  
  var lineHeight: js.UndefOr[Double] = js.native
  
  var paragraphSpacing: js.UndefOr[Double] = js.native
  
  var textAlign: js.UndefOr[auto | left | right | center | justify] = js.native
  
  var textDecoration: js.UndefOr[String] = js.native
  
  var textShadowColor: js.UndefOr[Color] = js.native
  
  var textShadowOffset: js.UndefOr[Width] = js.native
  
  var textShadowOpacity: js.UndefOr[Double] = js.native
  
  var textShadowRadius: js.UndefOr[Double] = js.native
  
  var textShadowSpread: js.UndefOr[Double] = js.native
  
  var textTransform: js.UndefOr[uppercase | lowercase] = js.native
  
  var writingDirection: js.UndefOr[auto | ltr | rtl] = js.native
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
    def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
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
    def setFontStyle(value: normal | italic): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    @scala.inline
    def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    @scala.inline
    def setLetterSpacing(value: Double): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
    
    @scala.inline
    def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
    @scala.inline
    def setParagraphSpacing(value: Double): Self = StObject.set(x, "paragraphSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParagraphSpacingUndefined: Self = StObject.set(x, "paragraphSpacing", js.undefined)
    
    @scala.inline
    def setTextAlign(value: auto | left | right | center | justify): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    @scala.inline
    def setTextDecoration(value: String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
    
    @scala.inline
    def setTextShadowColor(value: Color): Self = StObject.set(x, "textShadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextShadowColorUndefined: Self = StObject.set(x, "textShadowColor", js.undefined)
    
    @scala.inline
    def setTextShadowOffset(value: Width): Self = StObject.set(x, "textShadowOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextShadowOffsetUndefined: Self = StObject.set(x, "textShadowOffset", js.undefined)
    
    @scala.inline
    def setTextShadowOpacity(value: Double): Self = StObject.set(x, "textShadowOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextShadowOpacityUndefined: Self = StObject.set(x, "textShadowOpacity", js.undefined)
    
    @scala.inline
    def setTextShadowRadius(value: Double): Self = StObject.set(x, "textShadowRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextShadowRadiusUndefined: Self = StObject.set(x, "textShadowRadius", js.undefined)
    
    @scala.inline
    def setTextShadowSpread(value: Double): Self = StObject.set(x, "textShadowSpread", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextShadowSpreadUndefined: Self = StObject.set(x, "textShadowSpread", js.undefined)
    
    @scala.inline
    def setTextTransform(value: uppercase | lowercase): Self = StObject.set(x, "textTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTransformUndefined: Self = StObject.set(x, "textTransform", js.undefined)
    
    @scala.inline
    def setWritingDirection(value: auto | ltr | rtl): Self = StObject.set(x, "writingDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritingDirectionUndefined: Self = StObject.set(x, "writingDirection", js.undefined)
  }
}
