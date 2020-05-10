package typingsSlinky.awsSdk.acmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateSummary extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the certificate. This is of the form:  arn:aws:acm:region:123456789012:certificate/12345678-1234-1234-1234-123456789012  For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces. 
    */
  var CertificateArn: js.UndefOr[Arn] = js.native
  /**
    * Fully qualified domain name (FQDN), such as www.example.com or example.com, for the certificate.
    */
  var DomainName: js.UndefOr[DomainNameString] = js.native
}

object CertificateSummary {
  @scala.inline
  def apply(): CertificateSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateSummary]
  }
  @scala.inline
  implicit class CertificateSummaryOps[Self <: CertificateSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateArn")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainName(value: DomainNameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(js.undefined)
        ret
    }
  }
  
}

