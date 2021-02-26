package typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet

import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A builder for text styles.
  */
@js.native
trait TextStyleBuilder extends StObject {
  
  def build(): TextStyle = js.native
  
  def setBold(bold: Boolean): TextStyleBuilder = js.native
  
  def setFontFamily(fontFamily: String): TextStyleBuilder = js.native
  
  def setFontSize(fontSize: Integer): TextStyleBuilder = js.native
  
  def setForegroundColor(cssString: String): TextStyleBuilder = js.native
  
  def setItalic(italic: Boolean): TextStyleBuilder = js.native
  
  def setStrikethrough(strikethrough: Boolean): TextStyleBuilder = js.native
  
  def setUnderline(underline: Boolean): TextStyleBuilder = js.native
}
object TextStyleBuilder {
  
  @scala.inline
  def apply(
    build: () => TextStyle,
    setBold: Boolean => TextStyleBuilder,
    setFontFamily: String => TextStyleBuilder,
    setFontSize: Integer => TextStyleBuilder,
    setForegroundColor: String => TextStyleBuilder,
    setItalic: Boolean => TextStyleBuilder,
    setStrikethrough: Boolean => TextStyleBuilder,
    setUnderline: Boolean => TextStyleBuilder
  ): TextStyleBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), setBold = js.Any.fromFunction1(setBold), setFontFamily = js.Any.fromFunction1(setFontFamily), setFontSize = js.Any.fromFunction1(setFontSize), setForegroundColor = js.Any.fromFunction1(setForegroundColor), setItalic = js.Any.fromFunction1(setItalic), setStrikethrough = js.Any.fromFunction1(setStrikethrough), setUnderline = js.Any.fromFunction1(setUnderline))
    __obj.asInstanceOf[TextStyleBuilder]
  }
  
  @scala.inline
  implicit class TextStyleBuilderMutableBuilder[Self <: TextStyleBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuild(value: () => TextStyle): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetBold(value: Boolean => TextStyleBuilder): Self = StObject.set(x, "setBold", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFontFamily(value: String => TextStyleBuilder): Self = StObject.set(x, "setFontFamily", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFontSize(value: Integer => TextStyleBuilder): Self = StObject.set(x, "setFontSize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetForegroundColor(value: String => TextStyleBuilder): Self = StObject.set(x, "setForegroundColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetItalic(value: Boolean => TextStyleBuilder): Self = StObject.set(x, "setItalic", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStrikethrough(value: Boolean => TextStyleBuilder): Self = StObject.set(x, "setStrikethrough", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetUnderline(value: Boolean => TextStyleBuilder): Self = StObject.set(x, "setUnderline", js.Any.fromFunction1(value))
  }
}
