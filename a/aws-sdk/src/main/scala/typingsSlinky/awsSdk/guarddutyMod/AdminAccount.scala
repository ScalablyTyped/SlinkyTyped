package typingsSlinky.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdminAccount extends StObject {
  
  /**
    * The AWS account ID for the account.
    */
  var AdminAccountId: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether the account is enabled as the delegated administrator.
    */
  var AdminStatus: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.AdminStatus] = js.native
}
object AdminAccount {
  
  @scala.inline
  def apply(): AdminAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdminAccount]
  }
  
  @scala.inline
  implicit class AdminAccountMutableBuilder[Self <: AdminAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdminAccountId(value: String): Self = StObject.set(x, "AdminAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdminAccountIdUndefined: Self = StObject.set(x, "AdminAccountId", js.undefined)
    
    @scala.inline
    def setAdminStatus(value: AdminStatus): Self = StObject.set(x, "AdminStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdminStatusUndefined: Self = StObject.set(x, "AdminStatus", js.undefined)
  }
}
