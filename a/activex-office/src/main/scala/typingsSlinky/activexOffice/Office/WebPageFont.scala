package typingsSlinky.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebPageFont extends StObject {
  
  val Application: js.Any = js.native
  
  val Creator: Double = js.native
  
  var FixedWidthFont: String = js.native
  
  var FixedWidthFontSize: Double = js.native
  
  @JSName("Office.WebPageFont_typekey")
  var OfficeDotWebPageFont_typekey: WebPageFont = js.native
  
  var ProportionalFont: String = js.native
  
  var ProportionalFontSize: Double = js.native
}
object WebPageFont {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    FixedWidthFont: String,
    FixedWidthFontSize: Double,
    OfficeDotWebPageFont_typekey: WebPageFont,
    ProportionalFont: String,
    ProportionalFontSize: Double
  ): WebPageFont = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], FixedWidthFont = FixedWidthFont.asInstanceOf[js.Any], FixedWidthFontSize = FixedWidthFontSize.asInstanceOf[js.Any], ProportionalFont = ProportionalFont.asInstanceOf[js.Any], ProportionalFontSize = ProportionalFontSize.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.WebPageFont_typekey")(OfficeDotWebPageFont_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebPageFont]
  }
  
  @scala.inline
  implicit class WebPageFontMutableBuilder[Self <: WebPageFont] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedWidthFont(value: String): Self = StObject.set(x, "FixedWidthFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedWidthFontSize(value: Double): Self = StObject.set(x, "FixedWidthFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotWebPageFont_typekey(value: WebPageFont): Self = StObject.set(x, "Office.WebPageFont_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProportionalFont(value: String): Self = StObject.set(x, "ProportionalFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProportionalFontSize(value: Double): Self = StObject.set(x, "ProportionalFontSize", value.asInstanceOf[js.Any])
  }
}
