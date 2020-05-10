package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGroupCertificateConfigurationResponse extends js.Object {
  /**
    * The amount of time remaining before the certificate authority expires, in milliseconds.
    */
  var CertificateAuthorityExpiryInMilliseconds: js.UndefOr[string] = js.native
  /**
    * The amount of time remaining before the certificate expires, in milliseconds.
    */
  var CertificateExpiryInMilliseconds: js.UndefOr[string] = js.native
  /**
    * The ID of the group certificate configuration.
    */
  var GroupId: js.UndefOr[string] = js.native
}

object GetGroupCertificateConfigurationResponse {
  @scala.inline
  def apply(): GetGroupCertificateConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGroupCertificateConfigurationResponse]
  }
  @scala.inline
  implicit class GetGroupCertificateConfigurationResponseOps[Self <: GetGroupCertificateConfigurationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateAuthorityExpiryInMilliseconds(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateAuthorityExpiryInMilliseconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateAuthorityExpiryInMilliseconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateAuthorityExpiryInMilliseconds")(js.undefined)
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
    @scala.inline
    def withGroupId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupId")(js.undefined)
        ret
    }
  }
  
}

