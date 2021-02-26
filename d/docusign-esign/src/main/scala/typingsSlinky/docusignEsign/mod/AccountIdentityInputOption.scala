package typingsSlinky.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountIdentityInputOption extends StObject {
  
  var isRequired: js.UndefOr[Boolean] = js.native
  
  var optionName: js.UndefOr[String] = js.native
  
  var valueType: js.UndefOr[String] = js.native
}
object AccountIdentityInputOption {
  
  @scala.inline
  def apply(): AccountIdentityInputOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountIdentityInputOption]
  }
  
  @scala.inline
  implicit class AccountIdentityInputOptionMutableBuilder[Self <: AccountIdentityInputOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsRequired(value: Boolean): Self = StObject.set(x, "isRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRequiredUndefined: Self = StObject.set(x, "isRequired", js.undefined)
    
    @scala.inline
    def setOptionName(value: String): Self = StObject.set(x, "optionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionNameUndefined: Self = StObject.set(x, "optionName", js.undefined)
    
    @scala.inline
    def setValueType(value: String): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueTypeUndefined: Self = StObject.set(x, "valueType", js.undefined)
  }
}
