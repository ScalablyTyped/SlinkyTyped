package typingsSlinky.awsSdk.stsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FederatedUser extends StObject {
  
  /**
    * The ARN that specifies the federated user that is associated with the credentials. For more information about ARNs and how to use them in policies, see IAM Identifiers in the IAM User Guide. 
    */
  var Arn: arnType = js.native
  
  /**
    * The string that identifies the federated user associated with the credentials, similar to the unique ID of an IAM user.
    */
  var FederatedUserId: federatedIdType = js.native
}
object FederatedUser {
  
  @scala.inline
  def apply(Arn: arnType, FederatedUserId: federatedIdType): FederatedUser = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], FederatedUserId = FederatedUserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FederatedUser]
  }
  
  @scala.inline
  implicit class FederatedUserMutableBuilder[Self <: FederatedUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: arnType): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFederatedUserId(value: federatedIdType): Self = StObject.set(x, "FederatedUserId", value.asInstanceOf[js.Any])
  }
}
