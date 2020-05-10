package typingsSlinky.awsSdk.acmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePermissionRequest extends js.Object {
  /**
    * The Amazon Resource Number (ARN) of the private CA that issued the permissions. You can find the CA's ARN by calling the ListCertificateAuthorities action. This must have the following form:   arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012 . 
    */
  var CertificateAuthorityArn: Arn = js.native
  /**
    * The AWS service or identity that will have its CA permissions revoked. At this time, the only valid service principal is acm.amazonaws.com 
    */
  var Principal: typingsSlinky.awsSdk.acmpcaMod.Principal = js.native
  /**
    * The AWS account that calls this action.
    */
  var SourceAccount: js.UndefOr[AccountId] = js.native
}

object DeletePermissionRequest {
  @scala.inline
  def apply(CertificateAuthorityArn: Arn, Principal: Principal): DeletePermissionRequest = {
    val __obj = js.Dynamic.literal(CertificateAuthorityArn = CertificateAuthorityArn.asInstanceOf[js.Any], Principal = Principal.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePermissionRequest]
  }
  @scala.inline
  implicit class DeletePermissionRequestOps[Self <: DeletePermissionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateAuthorityArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateAuthorityArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrincipal(value: Principal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Principal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceAccount(value: AccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceAccount")(js.undefined)
        ret
    }
  }
  
}

