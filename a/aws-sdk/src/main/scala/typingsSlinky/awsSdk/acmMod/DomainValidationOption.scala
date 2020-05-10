package typingsSlinky.awsSdk.acmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainValidationOption extends js.Object {
  /**
    * A fully qualified domain name (FQDN) in the certificate request.
    */
  var DomainName: DomainNameString = js.native
  /**
    * The domain name that you want ACM to use to send you validation emails. This domain name is the suffix of the email addresses that you want ACM to use. This must be the same as the DomainName value or a superdomain of the DomainName value. For example, if you request a certificate for testing.example.com, you can specify example.com for this value. In that case, ACM sends domain validation emails to the following five addresses:   admin@example.com   administrator@example.com   hostmaster@example.com   postmaster@example.com   webmaster@example.com  
    */
  var ValidationDomain: DomainNameString = js.native
}

object DomainValidationOption {
  @scala.inline
  def apply(DomainName: DomainNameString, ValidationDomain: DomainNameString): DomainValidationOption = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], ValidationDomain = ValidationDomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainValidationOption]
  }
  @scala.inline
  implicit class DomainValidationOptionOps[Self <: DomainValidationOption] (val x: Self) extends AnyVal {
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
    def withValidationDomain(value: DomainNameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidationDomain")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

