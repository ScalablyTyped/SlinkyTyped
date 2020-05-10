package typingsSlinky.pulumiAws.certificateValidationMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateValidationArgs extends js.Object {
  /**
    * The ARN of the certificate that is being validated.
    */
  val certificateArn: Input[String] = js.native
  /**
    * List of FQDNs that implement the validation. Only valid for DNS validation method ACM certificates. If this is set, the resource can implement additional sanity checks and has an explicit dependency on the resource that is implementing the validation
    */
  val validationRecordFqdns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object CertificateValidationArgs {
  @scala.inline
  def apply(certificateArn: Input[String]): CertificateValidationArgs = {
    val __obj = js.Dynamic.literal(certificateArn = certificateArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateValidationArgs]
  }
  @scala.inline
  implicit class CertificateValidationArgsOps[Self <: CertificateValidationArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidationRecordFqdns(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationRecordFqdns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationRecordFqdns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationRecordFqdns")(js.undefined)
        ret
    }
  }
  
}

