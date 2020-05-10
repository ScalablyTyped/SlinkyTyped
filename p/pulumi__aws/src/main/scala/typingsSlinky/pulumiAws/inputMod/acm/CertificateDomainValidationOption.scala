package typingsSlinky.pulumiAws.inputMod.acm

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateDomainValidationOption extends js.Object {
  /**
    * A domain name for which the certificate should be issued
    */
  var domainName: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the DNS record to create to validate the certificate
    */
  var resourceRecordName: js.UndefOr[Input[String]] = js.native
  /**
    * The type of DNS record to create
    */
  var resourceRecordType: js.UndefOr[Input[String]] = js.native
  /**
    * The value the DNS record needs to have
    */
  var resourceRecordValue: js.UndefOr[Input[String]] = js.native
}

object CertificateDomainValidationOption {
  @scala.inline
  def apply(): CertificateDomainValidationOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateDomainValidationOption]
  }
  @scala.inline
  implicit class CertificateDomainValidationOptionOps[Self <: CertificateDomainValidationOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainName")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceRecordName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceRecordName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceRecordName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceRecordName")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceRecordType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceRecordType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceRecordType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceRecordType")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceRecordValue(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceRecordValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceRecordValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceRecordValue")(js.undefined)
        ret
    }
  }
  
}

