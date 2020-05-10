package typingsSlinky.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDomainNameserversRequest extends js.Object {
  /**
    * The name of the domain that you want to change name servers for.
    */
  var DomainName: typingsSlinky.awsSdk.route53domainsMod.DomainName = js.native
  /**
    * The authorization key for .fi domains
    */
  var FIAuthKey: js.UndefOr[typingsSlinky.awsSdk.route53domainsMod.FIAuthKey] = js.native
  /**
    * A list of new name servers for the domain.
    */
  var Nameservers: NameserverList = js.native
}

object UpdateDomainNameserversRequest {
  @scala.inline
  def apply(DomainName: DomainName, Nameservers: NameserverList): UpdateDomainNameserversRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], Nameservers = Nameservers.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDomainNameserversRequest]
  }
  @scala.inline
  implicit class UpdateDomainNameserversRequestOps[Self <: UpdateDomainNameserversRequest] (val x: Self) extends AnyVal {
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
    def withNameservers(value: NameserverList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Nameservers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFIAuthKey(value: FIAuthKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FIAuthKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFIAuthKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FIAuthKey")(js.undefined)
        ret
    }
  }
  
}

