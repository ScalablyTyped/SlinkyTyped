package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGroupCertificateConfigurationRequest extends js.Object {
  /**
    * The amount of time remaining before the certificate expires, in milliseconds.
    */
  var CertificateExpiryInMilliseconds: js.UndefOr[string] = js.native
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: string = js.native
}

object UpdateGroupCertificateConfigurationRequest {
  @scala.inline
  def apply(GroupId: string): UpdateGroupCertificateConfigurationRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGroupCertificateConfigurationRequest]
  }
  @scala.inline
  implicit class UpdateGroupCertificateConfigurationRequestOps[Self <: UpdateGroupCertificateConfigurationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCertificateExpiryInMilliseconds(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateExpiryInMilliseconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateExpiryInMilliseconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateExpiryInMilliseconds")(js.undefined)
        ret
    }
  }
  
}

