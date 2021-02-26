package typingsSlinky.exceljs.mod

import typingsSlinky.exceljs.anon.PartialColor
import typingsSlinky.exceljs.exceljsStrings.pattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FillPattern extends Fill {
  
  var bgColor: js.UndefOr[PartialColor] = js.native
  
  var fgColor: PartialColor = js.native
  
  var pattern: FillPatterns = js.native
  
  var `type`: pattern = js.native
}
object FillPattern {
  
  @scala.inline
  def apply(fgColor: PartialColor, pattern: FillPatterns, `type`: pattern): FillPattern = {
    val __obj = js.Dynamic.literal(fgColor = fgColor.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillPattern]
  }
  
  @scala.inline
  implicit class FillPatternMutableBuilder[Self <: FillPattern] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBgColor(value: PartialColor): Self = StObject.set(x, "bgColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgColorUndefined: Self = StObject.set(x, "bgColor", js.undefined)
    
    @scala.inline
    def setFgColor(value: PartialColor): Self = StObject.set(x, "fgColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPattern(value: FillPatterns): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: pattern): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
