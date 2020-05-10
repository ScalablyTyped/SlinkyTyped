package typingsSlinky.pulumiAws.certificateValidationMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateValidationState extends js.Object {
  /**
    * The ARN of the certificate that is being validated.
    */
  val certificateArn: js.UndefOr[Input[String]] = js.native
  /**
    * List of FQDNs that implement the validation. Only valid for DNS validation method ACM certificates. If this is set, the resource can implement additional sanity checks and has an explicit dependency on the resource that is implementing the validation
    */
  val validationRecordFqdns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object CertificateValidationState {
  @scala.inline
  def apply(): CertificateValidationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateValidationState]
  }
  @scala.inline
  implicit class CertificateValidationStateOps[Self <: CertificateValidationState] (val x: Self) extends AnyVal {
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
    def withoutCertificateArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateArn")(js.undefined)
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

