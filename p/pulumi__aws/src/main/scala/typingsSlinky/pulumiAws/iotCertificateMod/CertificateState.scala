package typingsSlinky.pulumiAws.iotCertificateMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateState extends js.Object {
  /**
    * Boolean flag to indicate if the certificate should be active
    */
  val active: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The ARN of the created certificate.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The certificate data, in PEM format.
    */
  val certificatePem: js.UndefOr[Input[String]] = js.native
  /**
    * The certificate signing request. Review
    * [CreateCertificateFromCsr](https://docs.aws.amazon.com/iot/latest/apireference/API_CreateCertificateFromCsr.html)
    * for more information on generating a certificate from a certificate signing request (CSR).
    * If none is specified both the certificate and keys will be generated, review [CreateKeysAndCertificate](https://docs.aws.amazon.com/iot/latest/apireference/API_CreateKeysAndCertificate.html)
    * for more information on generating keys and a certificate.
    */
  val csr: js.UndefOr[Input[String]] = js.native
  /**
    * When no CSR is provided, the private key.
    */
  val privateKey: js.UndefOr[Input[String]] = js.native
  /**
    * When no CSR is provided, the public key.
    */
  val publicKey: js.UndefOr[Input[String]] = js.native
}

object CertificateState {
  @scala.inline
  def apply(): CertificateState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateState]
  }
  @scala.inline
  implicit class CertificateStateOps[Self <: CertificateState] (val x: Self) extends AnyVal {
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
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
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
    @scala.inline
    def withPrivateKey(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKey")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicKey(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicKey")(js.undefined)
        ret
    }
  }
  
}

