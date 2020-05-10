package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterCertificateRequest extends js.Object {
  /**
    * The certificate PEM string that needs to be registered.
    */
  var CertificateData: typingsSlinky.awsSdk.directoryserviceMod.CertificateData = js.native
  /**
    * The identifier of the directory.
    */
  var DirectoryId: typingsSlinky.awsSdk.directoryserviceMod.DirectoryId = js.native
}

object RegisterCertificateRequest {
  @scala.inline
  def apply(CertificateData: CertificateData, DirectoryId: DirectoryId): RegisterCertificateRequest = {
    val __obj = js.Dynamic.literal(CertificateData = CertificateData.asInstanceOf[js.Any], DirectoryId = DirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterCertificateRequest]
  }
  @scala.inline
  implicit class RegisterCertificateRequestOps[Self <: RegisterCertificateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateData(value: CertificateData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirectoryId(value: DirectoryId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

