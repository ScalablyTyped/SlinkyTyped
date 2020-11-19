package typingsSlinky.oracleOraclejet.ojvalidationgroupMod

import typingsSlinky.oracleOraclejet.mod.JetSettableProperties
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pending
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojValidationGroupSettableProperties extends JetSettableProperties {
  
  val valid: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown = js.native
}
object ojValidationGroupSettableProperties {
  
  @scala.inline
  def apply(valid: valid | pending | invalidHidden | invalidShown): ojValidationGroupSettableProperties = {
    val __obj = js.Dynamic.literal(valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojValidationGroupSettableProperties]
  }
  
  @scala.inline
  implicit class ojValidationGroupSettablePropertiesOps[Self <: ojValidationGroupSettableProperties] (val x: Self) extends AnyVal {
    
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
    def setValid(value: valid | pending | invalidHidden | invalidShown): Self = this.set("valid", value.asInstanceOf[js.Any])
  }
}
