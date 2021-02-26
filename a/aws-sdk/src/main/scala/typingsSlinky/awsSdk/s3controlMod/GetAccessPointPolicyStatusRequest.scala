package typingsSlinky.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAccessPointPolicyStatusRequest extends StObject {
  
  /**
    * The account ID for the account that owns the specified access point.
    */
  var AccountId: typingsSlinky.awsSdk.s3controlMod.AccountId = js.native
  
  /**
    * The name of the access point whose policy status you want to retrieve.
    */
  var Name: AccessPointName = js.native
}
object GetAccessPointPolicyStatusRequest {
  
  @scala.inline
  def apply(AccountId: AccountId, Name: AccessPointName): GetAccessPointPolicyStatusRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccessPointPolicyStatusRequest]
  }
  
  @scala.inline
  implicit class GetAccessPointPolicyStatusRequestMutableBuilder[Self <: GetAccessPointPolicyStatusRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: AccessPointName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
