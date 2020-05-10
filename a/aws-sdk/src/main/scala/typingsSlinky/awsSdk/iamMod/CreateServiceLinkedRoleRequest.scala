package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateServiceLinkedRoleRequest extends js.Object {
  /**
    * The service principal for the AWS service to which this role is attached. You use a string similar to a URL but without the http:// in front. For example: elasticbeanstalk.amazonaws.com.  Service principals are unique and case-sensitive. To find the exact service principal for your service-linked role, see AWS Services That Work with IAM in the IAM User Guide. Look for the services that have Yes in the Service-Linked Role column. Choose the Yes link to view the service-linked role documentation for that service.
    */
  var AWSServiceName: groupNameType = js.native
  /**
    *  A string that you provide, which is combined with the service-provided prefix to form the complete role name. If you make multiple requests for the same service, then you must supply a different CustomSuffix for each request. Otherwise the request fails with a duplicate role name error. For example, you could add -1 or -debug to the suffix. Some services do not support the CustomSuffix parameter. If you provide an optional suffix and the operation fails, try the operation again without the suffix.
    */
  var CustomSuffix: js.UndefOr[customSuffixType] = js.native
  /**
    * The description of the role.
    */
  var Description: js.UndefOr[roleDescriptionType] = js.native
}

object CreateServiceLinkedRoleRequest {
  @scala.inline
  def apply(AWSServiceName: groupNameType): CreateServiceLinkedRoleRequest = {
    val __obj = js.Dynamic.literal(AWSServiceName = AWSServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateServiceLinkedRoleRequest]
  }
  @scala.inline
  implicit class CreateServiceLinkedRoleRequestOps[Self <: CreateServiceLinkedRoleRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAWSServiceName(value: groupNameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AWSServiceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomSuffix(value: customSuffixType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomSuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: roleDescriptionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
  }
  
}

