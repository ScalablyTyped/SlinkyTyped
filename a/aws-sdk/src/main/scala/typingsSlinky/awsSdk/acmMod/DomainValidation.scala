package typingsSlinky.awsSdk.acmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainValidation extends js.Object {
  /**
    * A fully qualified domain name (FQDN) in the certificate. For example, www.example.com or example.com. 
    */
  var DomainName: DomainNameString = js.native
  /**
    * Contains the CNAME record that you add to your DNS database for domain validation. For more information, see Use DNS to Validate Domain Ownership. Note: The CNAME information that you need does not include the name of your domain. If you include&#x2028; your domain name in the DNS database CNAME record, validation fails.&#x2028; For example, if the name is "_a79865eb4cd1a6ab990a45779b4e0b96.yourdomain.com", only "_a79865eb4cd1a6ab990a45779b4e0b96" must be used.
    */
  var ResourceRecord: js.UndefOr[typingsSlinky.awsSdk.acmMod.ResourceRecord] = js.native
  /**
    * The domain name that ACM used to send domain validation emails.
    */
  var ValidationDomain: js.UndefOr[DomainNameString] = js.native
  /**
    * A list of email addresses that ACM used to send domain validation emails.
    */
  var ValidationEmails: js.UndefOr[ValidationEmailList] = js.native
  /**
    * Specifies the domain validation method.
    */
  var ValidationMethod: js.UndefOr[typingsSlinky.awsSdk.acmMod.ValidationMethod] = js.native
  /**
    * The validation status of the domain name. This can be one of the following values:    PENDING_VALIDATION     SUCCESS    FAILED  
    */
  var ValidationStatus: js.UndefOr[DomainStatus] = js.native
}

object DomainValidation {
  @scala.inline
  def apply(DomainName: DomainNameString): DomainValidation = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainValidation]
  }
  @scala.inline
  implicit class DomainValidationOps[Self <: DomainValidation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainName(value: DomainNameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceRecord(value: ResourceRecord): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceRecord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceRecord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceRecord")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationDomain(value: DomainNameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidationDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidationDomain")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationEmails(value: ValidationEmailList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidationEmails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationEmails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidationEmails")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationMethod(value: ValidationMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidationMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidationMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationStatus(value: DomainStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidationStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidationStatus")(js.undefined)
        ret
    }
  }
  
}

