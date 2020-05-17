package typingsSlinky.activexOffice.Office

import typingsSlinky.activexStdole.stdole.IPictureDisp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignatureInfo extends js.Object {
  val Application: js.Any = js.native
  val CertificateVerificationResults: typingsSlinky.activexOffice.Office.CertificateVerificationResults = js.native
  val ContentVerificationResults: typingsSlinky.activexOffice.Office.ContentVerificationResults = js.native
  val Creator: Double = js.native
  val IsCertificateExpired: Boolean = js.native
  val IsCertificateRevoked: Boolean = js.native
  val IsCertificateUntrusted: Boolean = js.native
  val IsValid: Boolean = js.native
  @JSName("Office.SignatureInfo_typekey")
  var OfficeDotSignatureInfo_typekey: SignatureInfo = js.native
  val ReadOnly: Boolean = js.native
  var SignatureComment: String = js.native
  var SignatureImage: IPictureDisp = js.native
  val SignatureProvider: String = js.native
  var SignatureText: String = js.native
  def GetCertificateDetail(certdet: CertificateDetail): js.Any = js.native
  def GetSignatureDetail(sigdet: SignatureDetail): js.Any = js.native
  def SelectCertificateDetailByThumbprint(bstrThumbprint: String): Unit = js.native
  def SelectSignatureCertificate(ParentWindow: js.Any): Unit = js.native
  def ShowSignatureCertificate(ParentWindow: js.Any): Unit = js.native
}

object SignatureInfo {
  @scala.inline
  def apply(
    Application: js.Any,
    CertificateVerificationResults: CertificateVerificationResults,
    ContentVerificationResults: ContentVerificationResults,
    Creator: Double,
    GetCertificateDetail: CertificateDetail => js.Any,
    GetSignatureDetail: SignatureDetail => js.Any,
    IsCertificateExpired: Boolean,
    IsCertificateRevoked: Boolean,
    IsCertificateUntrusted: Boolean,
    IsValid: Boolean,
    OfficeDotSignatureInfo_typekey: SignatureInfo,
    ReadOnly: Boolean,
    SelectCertificateDetailByThumbprint: String => Unit,
    SelectSignatureCertificate: js.Any => Unit,
    ShowSignatureCertificate: js.Any => Unit,
    SignatureComment: String,
    SignatureImage: IPictureDisp,
    SignatureProvider: String,
    SignatureText: String
  ): SignatureInfo = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], CertificateVerificationResults = CertificateVerificationResults.asInstanceOf[js.Any], ContentVerificationResults = ContentVerificationResults.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], GetCertificateDetail = js.Any.fromFunction1(GetCertificateDetail), GetSignatureDetail = js.Any.fromFunction1(GetSignatureDetail), IsCertificateExpired = IsCertificateExpired.asInstanceOf[js.Any], IsCertificateRevoked = IsCertificateRevoked.asInstanceOf[js.Any], IsCertificateUntrusted = IsCertificateUntrusted.asInstanceOf[js.Any], IsValid = IsValid.asInstanceOf[js.Any], ReadOnly = ReadOnly.asInstanceOf[js.Any], SelectCertificateDetailByThumbprint = js.Any.fromFunction1(SelectCertificateDetailByThumbprint), SelectSignatureCertificate = js.Any.fromFunction1(SelectSignatureCertificate), ShowSignatureCertificate = js.Any.fromFunction1(ShowSignatureCertificate), SignatureComment = SignatureComment.asInstanceOf[js.Any], SignatureImage = SignatureImage.asInstanceOf[js.Any], SignatureProvider = SignatureProvider.asInstanceOf[js.Any], SignatureText = SignatureText.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.SignatureInfo_typekey")(OfficeDotSignatureInfo_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureInfo]
  }
  @scala.inline
  implicit class SignatureInfoOps[Self <: SignatureInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCertificateVerificationResults(value: CertificateVerificationResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateVerificationResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentVerificationResults(value: ContentVerificationResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentVerificationResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCertificateDetail(value: CertificateDetail => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetCertificateDetail")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSignatureDetail(value: SignatureDetail => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetSignatureDetail")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsCertificateExpired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsCertificateExpired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCertificateRevoked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsCertificateRevoked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCertificateUntrusted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsCertificateUntrusted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfficeDotSignatureInfo_typekey(value: SignatureInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Office.SignatureInfo_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectCertificateDetailByThumbprint(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectCertificateDetailByThumbprint")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSelectSignatureCertificate(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectSignatureCertificate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShowSignatureCertificate(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowSignatureCertificate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSignatureComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignatureComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignatureImage(value: IPictureDisp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignatureImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignatureProvider(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignatureProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignatureText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignatureText")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

