package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeUserPoolRequest extends StObject {
  
  /**
    * The user pool ID for the user pool you want to describe.
    */
  var UserPoolId: UserPoolIdType = js.native
}
object DescribeUserPoolRequest {
  
  @scala.inline
  def apply(UserPoolId: UserPoolIdType): DescribeUserPoolRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUserPoolRequest]
  }
  
  @scala.inline
  implicit class DescribeUserPoolRequestMutableBuilder[Self <: DescribeUserPoolRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
  }
}
