package typingsSlinky.pulumiAws.iotCertificateMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateArgs extends js.Object {
  /**
    * Boolean flag to indicate if the certificate should be active
    */
  val active: Input[Boolean] = js.native
  /**
    * The certificate signing request. Review
    * [CreateCertificateFromCsr](https://docs.aws.amazon.com/iot/latest/apireference/API_CreateCertificateFromCsr.html)
    * for more information on generating a certificate from a certificate signing request (CSR).
    * If none is specified both the certificate and keys will be generated, review [CreateKeysAndCertificate](https://docs.aws.amazon.com/iot/latest/apireference/API_CreateKeysAndCertificate.html)
    * for more information on generating keys and a certificate.
    */
  val csr: js.UndefOr[Input[String]] = js.native
}

object CertificateArgs {
  @scala.inline
  def apply(active: Input[Boolean]): CertificateArgs = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateArgs]
  }
  @scala.inline
  implicit class CertificateArgsOps[Self <: CertificateArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCsr(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCsr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csr")(js.undefined)
        ret
    }
  }
  
}

