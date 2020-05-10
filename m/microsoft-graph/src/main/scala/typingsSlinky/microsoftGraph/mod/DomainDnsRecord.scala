package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainDnsRecord extends Entity {
  /**
    * If false, this record must be configured by the customer at the DNS host for Microsoft Online Services to operate
    * correctly with the domain.
    */
  var isOptional: js.UndefOr[Boolean] = js.native
  // Value used when configuring the name of the DNS record at the DNS host.
  var label: js.UndefOr[String] = js.native
  // Indicates what type of DNS record this entity represents.The value can be one of the following: CName, Mx, Srv, TxtKey
  var recordType: js.UndefOr[String] = js.native
  /**
    * Microsoft Online Service or feature that has a dependency on this DNS record.Can be one of the following values: null,
    * Email, Sharepoint, EmailInternalRelayOnly, OfficeCommunicationsOnline, SharePointDefaultDomain, FullRedelegation,
    * SharePointPublic, OrgIdAuthentication, Yammer, Intune
    */
  var supportedService: js.UndefOr[String] = js.native
  // Value to use when configuring the time-to-live (ttl) property of the DNS record at the DNS host. Not nullable
  var ttl: js.UndefOr[Double] = js.native
}

object DomainDnsRecord {
  @scala.inline
  def apply(): DomainDnsRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainDnsRecord]
  }
  @scala.inline
  implicit class DomainDnsRecordOps[Self <: DomainDnsRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsOptional(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOptional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOptional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOptional")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordType")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportedService(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedService")(js.undefined)
        ret
    }
    @scala.inline
    def withTtl(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(js.undefined)
        ret
    }
  }
  
}

