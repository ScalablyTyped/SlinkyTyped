package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainEntry extends js.Object {
  /**
    * The ID of the domain recordset entry.
    */
  var id: js.UndefOr[NonEmptyString] = js.native
  /**
    * When true, specifies whether the domain entry is an alias used by the Lightsail load balancer. You can include an alias (A type) record in your request, which points to a load balancer DNS name and routes traffic to your load balancer
    */
  var isAlias: js.UndefOr[Boolean] = js.native
  /**
    * The name of the domain.
    */
  var name: js.UndefOr[DomainName] = js.native
  /**
    * (Deprecated) The options for the domain entry.  In releases prior to November 29, 2017, this parameter was not included in the API response. It is now deprecated. 
    */
  var options: js.UndefOr[DomainEntryOptions] = js.native
  /**
    * The target AWS name server (e.g., ns-111.awsdns-22.com.). For Lightsail load balancers, the value looks like ab1234c56789c6b86aba6fb203d443bc-123456789.us-east-2.elb.amazonaws.com. Be sure to also set isAlias to true when setting up an A record for a load balancer.
    */
  var target: js.UndefOr[String] = js.native
  /**
    * The type of domain entry, such as address (A), canonical name (CNAME), mail exchanger (MX), name server (NS), start of authority (SOA), service locator (SRV), or text (TXT). The following domain entry types can be used:    A     CNAME     MX     NS     SOA     SRV     TXT   
    */
  var `type`: js.UndefOr[DomainEntryType] = js.native
}

object DomainEntry {
  @scala.inline
  def apply(): DomainEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainEntry]
  }
  @scala.inline
  implicit class DomainEntryOps[Self <: DomainEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAlias(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAlias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAlias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAlias")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: DomainName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: DomainEntryOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: DomainEntryType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

