package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGroupCertificateAuthorityResponse extends js.Object {
  /**
    * The ARN of the group certificate authority.
    */
  var GroupCertificateAuthorityArn: js.UndefOr[string] = js.native
}

object CreateGroupCertificateAuthorityResponse {
  @scala.inline
  def apply(): CreateGroupCertificateAuthorityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGroupCertificateAuthorityResponse]
  }
  @scala.inline
  implicit class CreateGroupCertificateAuthorityResponseOps[Self <: CreateGroupCertificateAuthorityResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupCertificateAuthorityArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupCertificateAuthorityArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupCertificateAuthorityArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupCertificateAuthorityArn")(js.undefined)
        ret
    }
  }
  
}

