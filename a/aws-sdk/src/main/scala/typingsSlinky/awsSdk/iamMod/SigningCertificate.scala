package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SigningCertificate extends js.Object {
  /**
    * The contents of the signing certificate.
    */
  var CertificateBody: certificateBodyType = js.native
  /**
    * The ID for the signing certificate.
    */
  var CertificateId: certificateIdType = js.native
  /**
    * The status of the signing certificate. Active means that the key is valid for API calls, while Inactive means it is not.
    */
  var Status: statusType = js.native
  /**
    * The date when the signing certificate was uploaded.
    */
  var UploadDate: js.UndefOr[js.Date] = js.native
  /**
    * The name of the user the signing certificate is associated with.
    */
  var UserName: userNameType = js.native
}

object SigningCertificate {
  @scala.inline
  def apply(
    CertificateBody: certificateBodyType,
    CertificateId: certificateIdType,
    Status: statusType,
    UserName: userNameType
  ): SigningCertificate = {
    val __obj = js.Dynamic.literal(CertificateBody = CertificateBody.asInstanceOf[js.Any], CertificateId = CertificateId.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SigningCertificate]
  }
  @scala.inline
  implicit class SigningCertificateOps[Self <: SigningCertificate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateBody(value: certificateBodyType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCertificateId(value: certificateIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateId")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withUploadDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadDate")(js.undefined)
        ret
    }
  }
  
}

