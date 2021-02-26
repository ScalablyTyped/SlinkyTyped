package typingsSlinky.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPublicAccessBlockRequest extends StObject {
  
  /**
    * The account ID for the AWS account whose PublicAccessBlock configuration you want to retrieve.
    */
  var AccountId: typingsSlinky.awsSdk.s3controlMod.AccountId = js.native
}
object GetPublicAccessBlockRequest {
  
  @scala.inline
  def apply(AccountId: AccountId): GetPublicAccessBlockRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPublicAccessBlockRequest]
  }
  
  @scala.inline
  implicit class GetPublicAccessBlockRequestMutableBuilder[Self <: GetPublicAccessBlockRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
  }
}
