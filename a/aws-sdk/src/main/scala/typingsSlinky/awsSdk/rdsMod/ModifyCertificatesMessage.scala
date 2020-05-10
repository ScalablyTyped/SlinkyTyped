package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyCertificatesMessage extends js.Object {
  /**
    * The new default certificate identifier to override the current one with. To determine the valid values, use the describe-certificates AWS CLI command or the DescribeCertificates API operation.
    */
  var CertificateIdentifier: js.UndefOr[String] = js.native
  /**
    * A value that indicates whether to remove the override for the default certificate. If the override is removed, the default certificate is the system default.
    */
  var RemoveCustomerOverride: js.UndefOr[BooleanOptional] = js.native
}

object ModifyCertificatesMessage {
  @scala.inline
  def apply(): ModifyCertificatesMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyCertificatesMessage]
  }
  @scala.inline
  implicit class ModifyCertificatesMessageOps[Self <: ModifyCertificatesMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveCustomerOverride(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveCustomerOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveCustomerOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveCustomerOverride")(js.undefined)
        ret
    }
  }
  
}

