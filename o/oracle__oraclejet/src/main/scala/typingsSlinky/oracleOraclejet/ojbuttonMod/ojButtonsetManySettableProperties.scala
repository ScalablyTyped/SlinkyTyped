package typingsSlinky.oracleOraclejet.ojbuttonMod

import typingsSlinky.oracleOraclejet.mod.baseComponentSettableProperties
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.all
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.full
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.half
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.icons
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.oneTabstop
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.outlined
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojButtonsetManySettableProperties extends baseComponentSettableProperties {
  
  var chroming: full | half | outlined = js.native
  
  var disabled: Boolean = js.native
  
  var display: all | icons = js.native
  
  var focusManagement: oneTabstop | none = js.native
  
  var value: js.Array[_] | Null = js.native
}
object ojButtonsetManySettableProperties {
  
  @scala.inline
  def apply(
    chroming: full | half | outlined,
    disabled: Boolean,
    display: all | icons,
    focusManagement: oneTabstop | none
  ): ojButtonsetManySettableProperties = {
    val __obj = js.Dynamic.literal(chroming = chroming.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], focusManagement = focusManagement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojButtonsetManySettableProperties]
  }
  
  @scala.inline
  implicit class ojButtonsetManySettablePropertiesMutableBuilder[Self <: ojButtonsetManySettableProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChroming(value: full | half | outlined): Self = StObject.set(x, "chroming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplay(value: all | icons): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusManagement(value: oneTabstop | none): Self = StObject.set(x, "focusManagement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Array[_]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
    
    @scala.inline
    def setValueVarargs(value: js.Any*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
