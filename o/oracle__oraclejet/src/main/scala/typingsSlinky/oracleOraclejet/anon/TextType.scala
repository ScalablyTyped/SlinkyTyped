package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.billion
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.million
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.number
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.percent
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.quadrillion
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.thousand
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.trillion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextType extends StObject {
  
  var converter: js.UndefOr[typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Converter[String]] = js.native
  
  var rendered: js.UndefOr[on | off] = js.native
  
  var scaling: js.UndefOr[none | thousand | million | billion | trillion | quadrillion | auto] = js.native
  
  var style: js.UndefOr[js.Object] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var textType: js.UndefOr[percent | number] = js.native
}
object TextType {
  
  @scala.inline
  def apply(): TextType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextType]
  }
  
  @scala.inline
  implicit class TextTypeMutableBuilder[Self <: TextType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConverter(value: typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Converter[String]): Self = StObject.set(x, "converter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConverterUndefined: Self = StObject.set(x, "converter", js.undefined)
    
    @scala.inline
    def setRendered(value: on | off): Self = StObject.set(x, "rendered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderedUndefined: Self = StObject.set(x, "rendered", js.undefined)
    
    @scala.inline
    def setScaling(value: none | thousand | million | billion | trillion | quadrillion | auto): Self = StObject.set(x, "scaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalingUndefined: Self = StObject.set(x, "scaling", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextType(value: percent | number): Self = StObject.set(x, "textType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTypeUndefined: Self = StObject.set(x, "textType", js.undefined)
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
