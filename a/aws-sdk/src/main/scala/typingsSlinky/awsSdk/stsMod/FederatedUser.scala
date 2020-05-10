package typingsSlinky.awsSdk.stsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FederatedUser extends js.Object {
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
  implicit class FederatedUserOps[Self <: FederatedUser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: arnType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFederatedUserId(value: federatedIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FederatedUserId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

