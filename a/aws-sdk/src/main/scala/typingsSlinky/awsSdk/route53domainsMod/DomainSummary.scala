package typingsSlinky.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainSummary extends js.Object {
  /**
    * Indicates whether the domain is automatically renewed upon expiration.
    */
  var AutoRenew: js.UndefOr[Boolean] = js.native
  /**
    * The name of the domain that the summary information applies to.
    */
  var DomainName: typingsSlinky.awsSdk.route53domainsMod.DomainName = js.native
  /**
    * Expiration date of the domain in Coordinated Universal Time (UTC).
    */
  var Expiry: js.UndefOr[js.Date] = js.native
  /**
    * Indicates whether a domain is locked from unauthorized transfer to another party.
    */
  var TransferLock: js.UndefOr[Boolean] = js.native
}

object DomainSummary {
  @scala.inline
  def apply(DomainName: DomainName): DomainSummary = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainSummary]
  }
  @scala.inline
  implicit class DomainSummaryOps[Self <: DomainSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainName(value: DomainName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoRenew(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoRenew")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoRenew: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoRenew")(js.undefined)
        ret
    }
    @scala.inline
    def withExpiry(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expiry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expiry")(js.undefined)
        ret
    }
    @scala.inline
    def withTransferLock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransferLock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransferLock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransferLock")(js.undefined)
        ret
    }
  }
  
}

