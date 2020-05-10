package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteCertificateRequest extends js.Object {
  /**
    * The ID of the certificate. (The last part of the certificate ARN contains the certificate ID.)
    */
  var certificateId: CertificateId = js.native
  /**
    * Forces the deletion of a certificate if it is inactive and is not attached to an IoT thing.
    */
  var forceDelete: js.UndefOr[ForceDelete] = js.native
}

object DeleteCertificateRequest {
  @scala.inline
  def apply(certificateId: CertificateId): DeleteCertificateRequest = {
    val __obj = js.Dynamic.literal(certificateId = certificateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCertificateRequest]
  }
  @scala.inline
  implicit class DeleteCertificateRequestOps[Self <: DeleteCertificateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateId(value: CertificateId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForceDelete(value: ForceDelete): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceDelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceDelete")(js.undefined)
        ret
    }
  }
  
}

