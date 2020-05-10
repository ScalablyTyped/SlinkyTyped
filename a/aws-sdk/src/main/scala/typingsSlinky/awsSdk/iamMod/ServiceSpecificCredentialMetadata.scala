package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceSpecificCredentialMetadata extends js.Object {
  /**
    * The date and time, in ISO 8601 date-time format, when the service-specific credential were created.
    */
  var CreateDate: js.Date = js.native
  /**
    * The name of the service associated with the service-specific credential.
    */
  var ServiceName: serviceName = js.native
  /**
    * The unique identifier for the service-specific credential.
    */
  var ServiceSpecificCredentialId: serviceSpecificCredentialId = js.native
  /**
    * The generated user name for the service-specific credential.
    */
  var ServiceUserName: serviceUserName = js.native
  /**
    * The status of the service-specific credential. Active means that the key is valid for API calls, while Inactive means it is not.
    */
  var Status: statusType = js.native
  /**
    * The name of the IAM user associated with the service-specific credential.
    */
  var UserName: userNameType = js.native
}

object ServiceSpecificCredentialMetadata {
  @scala.inline
  def apply(
    CreateDate: js.Date,
    ServiceName: serviceName,
    ServiceSpecificCredentialId: serviceSpecificCredentialId,
    ServiceUserName: serviceUserName,
    Status: statusType,
    UserName: userNameType
  ): ServiceSpecificCredentialMetadata = {
    val __obj = js.Dynamic.literal(CreateDate = CreateDate.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any], ServiceSpecificCredentialId = ServiceSpecificCredentialId.asInstanceOf[js.Any], ServiceUserName = ServiceUserName.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceSpecificCredentialMetadata]
  }
  @scala.inline
  implicit class ServiceSpecificCredentialMetadataOps[Self <: ServiceSpecificCredentialMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceName(value: serviceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceSpecificCredentialId(value: serviceSpecificCredentialId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceSpecificCredentialId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceUserName(value: serviceUserName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceUserName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: statusType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserName(value: userNameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

