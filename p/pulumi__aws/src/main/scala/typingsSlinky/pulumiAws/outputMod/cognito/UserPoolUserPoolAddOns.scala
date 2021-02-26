package typingsSlinky.pulumiAws.outputMod.cognito

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserPoolUserPoolAddOns extends StObject {
  
  /**
    * The mode for advanced security, must be one of `OFF`, `AUDIT` or `ENFORCED`.
    */
  var advancedSecurityMode: String = js.native
}
object UserPoolUserPoolAddOns {
  
  @scala.inline
  def apply(advancedSecurityMode: String): UserPoolUserPoolAddOns = {
    val __obj = js.Dynamic.literal(advancedSecurityMode = advancedSecurityMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolUserPoolAddOns]
  }
  
  @scala.inline
  implicit class UserPoolUserPoolAddOnsMutableBuilder[Self <: UserPoolUserPoolAddOns] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvancedSecurityMode(value: String): Self = StObject.set(x, "advancedSecurityMode", value.asInstanceOf[js.Any])
  }
}
