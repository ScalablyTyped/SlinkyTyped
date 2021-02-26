package typingsSlinky.exceljs.mod

import typingsSlinky.exceljs.anon.PartialAlignment
import typingsSlinky.exceljs.anon.PartialBorders
import typingsSlinky.exceljs.anon.PartialFont
import typingsSlinky.exceljs.anon.PartialProtection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Style extends StObject {
  
  var alignment: PartialAlignment = js.native
  
  var border: PartialBorders = js.native
  
  var fill: Fill = js.native
  
  var font: PartialFont = js.native
  
  var numFmt: String = js.native
  
  var protection: PartialProtection = js.native
}
object Style {
  
  @scala.inline
  def apply(
    alignment: PartialAlignment,
    border: PartialBorders,
    fill: Fill,
    font: PartialFont,
    numFmt: String,
    protection: PartialProtection
  ): Style = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], numFmt = numFmt.asInstanceOf[js.Any], protection = protection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Style]
  }
  
  @scala.inline
  implicit class StyleMutableBuilder[Self <: Style] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignment(value: PartialAlignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorder(value: PartialBorders): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFill(value: Fill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFont(value: PartialFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumFmt(value: String): Self = StObject.set(x, "numFmt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtection(value: PartialProtection): Self = StObject.set(x, "protection", value.asInstanceOf[js.Any])
  }
}
