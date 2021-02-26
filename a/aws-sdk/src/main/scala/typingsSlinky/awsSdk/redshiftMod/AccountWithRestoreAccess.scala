package typingsSlinky.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountWithRestoreAccess extends StObject {
  
  /**
    * The identifier of an AWS support account authorized to restore a snapshot. For AWS support, the identifier is amazon-redshift-support. 
    */
  var AccountAlias: js.UndefOr[String] = js.native
  
  /**
    * The identifier of an AWS customer account authorized to restore a snapshot.
    */
  var AccountId: js.UndefOr[String] = js.native
}
object AccountWithRestoreAccess {
  
  @scala.inline
  def apply(): AccountWithRestoreAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountWithRestoreAccess]
  }
  
  @scala.inline
  implicit class AccountWithRestoreAccessMutableBuilder[Self <: AccountWithRestoreAccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountAlias(value: String): Self = StObject.set(x, "AccountAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountAliasUndefined: Self = StObject.set(x, "AccountAlias", js.undefined)
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
  }
}
