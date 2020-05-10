package typingsSlinky.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorDetail extends js.Object {
  /**
    * A brief description of the error.     SubnetNotFound: We couldn't find one of the subnets associated with the cluster.    SecurityGroupNotFound: We couldn't find one of the security groups associated with the cluster.    EniLimitReached: You have reached the elastic network interface limit for your account.    IpNotAvailable: A subnet associated with the cluster doesn't have any free IP addresses.    AccessDenied: You don't have permissions to perform the specified operation.    OperationNotPermitted: The service role associated with the cluster doesn't have the required access permissions for Amazon EKS.    VpcIdNotFound: We couldn't find the VPC associated with the cluster.  
    */
  var errorCode: js.UndefOr[ErrorCode] = js.native
  /**
    * A more complete description of the error.
    */
  var errorMessage: js.UndefOr[String] = js.native
  /**
    * An optional field that contains the resource IDs associated with the error.
    */
  var resourceIds: js.UndefOr[StringList] = js.native
}

object ErrorDetail {
  @scala.inline
  def apply(): ErrorDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorDetail]
  }
  @scala.inline
  implicit class ErrorDetailOps[Self <: ErrorDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorCode(value: ErrorCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceIds(value: StringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceIds")(js.undefined)
        ret
    }
  }
  
}

