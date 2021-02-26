package typingsSlinky.googleSpreadsheet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberFormat extends StObject {
  
  /**
    * see https://developers.google.com/sheets/api/guides/formats
    */
  var pattern: String = js.native
  
  var `type`: NumberFormatType = js.native
}
object NumberFormat {
  
  @scala.inline
  def apply(pattern: String, `type`: NumberFormatType): NumberFormat = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFormat]
  }
  
  @scala.inline
  implicit class NumberFormatMutableBuilder[Self <: NumberFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: NumberFormatType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
