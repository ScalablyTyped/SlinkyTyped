package typingsSlinky.postmark.domainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainDetails extends Domain {
  var DKIMHost: String = js.native
  var DKIMPendingHost: String = js.native
  var DKIMPendingTextValue: String = js.native
  var DKIMRevokedHost: String = js.native
  var DKIMRevokedTextValue: String = js.native
  var DKIMTextValue: String = js.native
  var DKIMUpdateStatus: String = js.native
  var ReturnPathDomain: String = js.native
  var ReturnPathDomainCNAMEValue: String = js.native
  var SafeToRemoveRevokedKeyFromDNS: String = js.native
  var SpfHost: String = js.native
  var SpfTextValue: String = js.native
}

object DomainDetails {
  @scala.inline
  def apply(
    DKIMHost: String,
    DKIMPendingHost: String,
    DKIMPendingTextValue: String,
    DKIMRevokedHost: String,
    DKIMRevokedTextValue: String,
    DKIMTextValue: String,
    DKIMUpdateStatus: String,
    DKIMVerified: Boolean,
    ID: Double,
    Name: String,
    ReturnPathDomain: String,
    ReturnPathDomainCNAMEValue: String,
    ReturnPathDomainVerified: Boolean,
    SafeToRemoveRevokedKeyFromDNS: String,
    SpfHost: String,
    SpfTextValue: String,
    SpfVerified: Boolean,
    WeakDKIM: Boolean
  ): DomainDetails = {
    val __obj = js.Dynamic.literal(DKIMHost = DKIMHost.asInstanceOf[js.Any], DKIMPendingHost = DKIMPendingHost.asInstanceOf[js.Any], DKIMPendingTextValue = DKIMPendingTextValue.asInstanceOf[js.Any], DKIMRevokedHost = DKIMRevokedHost.asInstanceOf[js.Any], DKIMRevokedTextValue = DKIMRevokedTextValue.asInstanceOf[js.Any], DKIMTextValue = DKIMTextValue.asInstanceOf[js.Any], DKIMUpdateStatus = DKIMUpdateStatus.asInstanceOf[js.Any], DKIMVerified = DKIMVerified.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ReturnPathDomain = ReturnPathDomain.asInstanceOf[js.Any], ReturnPathDomainCNAMEValue = ReturnPathDomainCNAMEValue.asInstanceOf[js.Any], ReturnPathDomainVerified = ReturnPathDomainVerified.asInstanceOf[js.Any], SafeToRemoveRevokedKeyFromDNS = SafeToRemoveRevokedKeyFromDNS.asInstanceOf[js.Any], SpfHost = SpfHost.asInstanceOf[js.Any], SpfTextValue = SpfTextValue.asInstanceOf[js.Any], SpfVerified = SpfVerified.asInstanceOf[js.Any], WeakDKIM = WeakDKIM.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainDetails]
  }
  @scala.inline
  implicit class DomainDetailsOps[Self <: DomainDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDKIMHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DKIMHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDKIMPendingHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DKIMPendingHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDKIMPendingTextValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DKIMPendingTextValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDKIMRevokedHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DKIMRevokedHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDKIMRevokedTextValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DKIMRevokedTextValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDKIMTextValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DKIMTextValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDKIMUpdateStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DKIMUpdateStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturnPathDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReturnPathDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturnPathDomainCNAMEValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReturnPathDomainCNAMEValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSafeToRemoveRevokedKeyFromDNS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SafeToRemoveRevokedKeyFromDNS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpfHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpfHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpfTextValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpfTextValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

