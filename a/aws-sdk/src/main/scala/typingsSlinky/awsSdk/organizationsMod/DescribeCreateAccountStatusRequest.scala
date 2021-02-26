package typingsSlinky.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCreateAccountStatusRequest extends StObject {
  
  /**
    * Specifies the Id value that uniquely identifies the CreateAccount request. You can get the value from the CreateAccountStatus.Id response in an earlier CreateAccount request, or from the ListCreateAccountStatus operation. The regex pattern for a create account request ID string requires "car-" followed by from 8 to 32 lowercase letters or digits.
    */
  var CreateAccountRequestId: typingsSlinky.awsSdk.organizationsMod.CreateAccountRequestId = js.native
}
object DescribeCreateAccountStatusRequest {
  
  @scala.inline
  def apply(CreateAccountRequestId: CreateAccountRequestId): DescribeCreateAccountStatusRequest = {
    val __obj = js.Dynamic.literal(CreateAccountRequestId = CreateAccountRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCreateAccountStatusRequest]
  }
  
  @scala.inline
  implicit class DescribeCreateAccountStatusRequestMutableBuilder[Self <: DescribeCreateAccountStatusRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateAccountRequestId(value: CreateAccountRequestId): Self = StObject.set(x, "CreateAccountRequestId", value.asInstanceOf[js.Any])
  }
}
