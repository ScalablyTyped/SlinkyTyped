package typingsSlinky.oracleOraclejet.ojvalidationgroupMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pending
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojvalidationgroup.ojValidationGroupSettableProperties> */
@js.native
trait ojValidationGroupSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  
  var valid: js.UndefOr[
    typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown
  ] = js.native
}
object ojValidationGroupSettablePropertiesLenient {
  
  @scala.inline
  def apply(): ojValidationGroupSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojValidationGroupSettablePropertiesLenient]
  }
  
  @scala.inline
  implicit class ojValidationGroupSettablePropertiesLenientOps[Self <: ojValidationGroupSettablePropertiesLenient] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def deleteValid: Self = this.set("valid", js.undefined)
  }
}
