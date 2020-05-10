package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupCertificateAuthorityProperties extends js.Object {
  /**
    * The ARN of the certificate authority for the group.
    */
  var GroupCertificateAuthorityArn: js.UndefOr[string] = js.native
  /**
    * The ID of the certificate authority for the group.
    */
  var GroupCertificateAuthorityId: js.UndefOr[string] = js.native
}

object GroupCertificateAuthorityProperties {
  @scala.inline
  def apply(): GroupCertificateAuthorityProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupCertificateAuthorityProperties]
  }
  @scala.inline
  implicit class GroupCertificateAuthorityPropertiesOps[Self <: GroupCertificateAuthorityProperties] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withGroupCertificateAuthorityId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupCertificateAuthorityId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupCertificateAuthorityId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupCertificateAuthorityId")(js.undefined)
        ret
    }
  }
  
}

