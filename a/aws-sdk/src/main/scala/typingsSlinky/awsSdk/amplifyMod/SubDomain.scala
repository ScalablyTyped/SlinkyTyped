package typingsSlinky.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubDomain extends js.Object {
  /**
    *  DNS record for the Subdomain. 
    */
  var dnsRecord: DNSRecord = js.native
  /**
    *  Setting structure for the Subdomain. 
    */
  var subDomainSetting: SubDomainSetting = js.native
  /**
    *  Verified status of the Subdomain 
    */
  var verified: Verified = js.native
}

object SubDomain {
  @scala.inline
  def apply(dnsRecord: DNSRecord, subDomainSetting: SubDomainSetting, verified: Verified): SubDomain = {
    val __obj = js.Dynamic.literal(dnsRecord = dnsRecord.asInstanceOf[js.Any], subDomainSetting = subDomainSetting.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubDomain]
  }
  @scala.inline
  implicit class SubDomainOps[Self <: SubDomain] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDnsRecord(value: DNSRecord): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsRecord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubDomainSetting(value: SubDomainSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subDomainSetting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerified(value: Verified): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verified")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

