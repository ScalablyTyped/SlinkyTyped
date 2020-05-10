package typingsSlinky.pulumiAws.dmsCertificateMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateArgs extends js.Object {
  /**
    * The certificate identifier.
    */
  val certificateId: Input[String] = js.native
  /**
    * The contents of the .pem X.509 certificate file for the certificate. Either `certificatePem` or `certificateWallet` must be set.
    */
  val certificatePem: js.UndefOr[Input[String]] = js.native
  /**
    * The contents of the Oracle Wallet certificate for use with SSL. Either `certificatePem` or `certificateWallet` must be set.
    */
  val certificateWallet: js.UndefOr[Input[String]] = js.native
}

object CertificateArgs {
  @scala.inline
  def apply(certificateId: Input[String]): CertificateArgs = {
    val __obj = js.Dynamic.literal(certificateId = certificateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateArgs]
  }
  @scala.inline
  implicit class CertificateArgsOps[Self <: CertificateArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCertificatePem(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificatePem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificatePem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificatePem")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificateWallet(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateWallet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateWallet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateWallet")(js.undefined)
        ret
    }
  }
  
}

