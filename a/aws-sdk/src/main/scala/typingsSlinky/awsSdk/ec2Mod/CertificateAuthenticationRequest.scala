package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateAuthenticationRequest extends js.Object {
  /**
    * The ARN of the client certificate. The certificate must be signed by a certificate authority (CA) and it must be provisioned in AWS Certificate Manager (ACM).
    */
  var ClientRootCertificateChainArn: js.UndefOr[String] = js.native
}

object CertificateAuthenticationRequest {
  @scala.inline
  def apply(): CertificateAuthenticationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateAuthenticationRequest]
  }
  @scala.inline
  implicit class CertificateAuthenticationRequestOps[Self <: CertificateAuthenticationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientRootCertificateChainArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientRootCertificateChainArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientRootCertificateChainArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientRootCertificateChainArn")(js.undefined)
        ret
    }
  }
  
}

