package typingsSlinky.oracleOraclejet.ojbuttonMod

import typingsSlinky.oracleOraclejet.mod.baseComponentSettableProperties
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.all
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.full
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.half
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.icons
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.outlined
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojButtonSettableProperties extends baseComponentSettableProperties {
  
  var chroming: full | half | outlined = js.native
  
  var disabled: Boolean = js.native
  
  var display: all | icons = js.native
}
object ojButtonSettableProperties {
  
  @scala.inline
  def apply(chroming: full | half | outlined, disabled: Boolean, display: all | icons): ojButtonSettableProperties = {
    val __obj = js.Dynamic.literal(chroming = chroming.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojButtonSettableProperties]
  }
  
  @scala.inline
  implicit class ojButtonSettablePropertiesMutableBuilder[Self <: ojButtonSettableProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChroming(value: full | half | outlined): Self = StObject.set(x, "chroming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplay(value: all | icons): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
  }
}
