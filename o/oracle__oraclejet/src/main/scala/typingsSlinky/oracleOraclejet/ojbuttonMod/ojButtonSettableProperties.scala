package typingsSlinky.oracleOraclejet.ojbuttonMod

import typingsSlinky.oracleOraclejet.mod.baseComponentSettableProperties
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.all
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.full
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.half
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.icons
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.outlined
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
  implicit class ojButtonSettablePropertiesOps[Self <: ojButtonSettableProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChroming(value: full | half | outlined): Self = this.set("chroming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplay(value: all | icons): Self = this.set("display", value.asInstanceOf[js.Any])
  }
}
