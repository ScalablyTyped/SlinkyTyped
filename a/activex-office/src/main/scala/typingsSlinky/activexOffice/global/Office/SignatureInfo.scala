package typingsSlinky.activexOffice.global.Office

import typingsSlinky.activexOffice.Office.CertificateDetail
import typingsSlinky.activexOffice.Office.SignatureDetail
import typingsSlinky.activexStdole.stdole.IPictureDisp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.SignatureInfo")
@js.native
class SignatureInfo protected ()
  extends typingsSlinky.activexOffice.Office.SignatureInfo {
  /* CompleteClass */
  override val Application: js.Any = js.native
  /* CompleteClass */
  override val CertificateVerificationResults: typingsSlinky.activexOffice.Office.CertificateVerificationResults = js.native
  /* CompleteClass */
  override val ContentVerificationResults: typingsSlinky.activexOffice.Office.ContentVerificationResults = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val IsCertificateExpired: Boolean = js.native
  /* CompleteClass */
  override val IsCertificateRevoked: Boolean = js.native
  /* CompleteClass */
  override val IsCertificateUntrusted: Boolean = js.native
  /* CompleteClass */
  override val IsValid: Boolean = js.native
  /* CompleteClass */
  @JSName("Office.SignatureInfo_typekey")
  override var OfficeDotSignatureInfo_typekey: typingsSlinky.activexOffice.Office.SignatureInfo = js.native
  /* CompleteClass */
  override val ReadOnly: Boolean = js.native
  /* CompleteClass */
  override var SignatureComment: String = js.native
  /* CompleteClass */
  override var SignatureImage: IPictureDisp = js.native
  /* CompleteClass */
  override val SignatureProvider: String = js.native
  /* CompleteClass */
  override var SignatureText: String = js.native
  /* CompleteClass */
  override def GetCertificateDetail(certdet: CertificateDetail): js.Any = js.native
  /* CompleteClass */
  override def GetSignatureDetail(sigdet: SignatureDetail): js.Any = js.native
  /* CompleteClass */
  override def SelectCertificateDetailByThumbprint(bstrThumbprint: String): Unit = js.native
  /* CompleteClass */
  override def SelectSignatureCertificate(ParentWindow: js.Any): Unit = js.native
  /* CompleteClass */
  override def ShowSignatureCertificate(ParentWindow: js.Any): Unit = js.native
}

