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
}

