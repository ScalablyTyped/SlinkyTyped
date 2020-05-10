package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DnsServersOptionsModifyStructure extends js.Object {
  /**
    * The IPv4 address range, in CIDR notation, of the DNS servers to be used. You can specify up to two DNS servers. Ensure that the DNS servers can be reached by the clients. The specified values overwrite the existing values.
    */
  var CustomDnsServers: js.UndefOr[ValueStringList] = js.native
  /**
    * Indicates whether DNS servers should be used. Specify False to delete the existing DNS servers.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
}

object DnsServersOptionsModifyStructure {
  @scala.inline
  def apply(): DnsServersOptionsModifyStructure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DnsServersOptionsModifyStructure]
  }
  @scala.inline
  implicit class DnsServersOptionsModifyStructureOps[Self <: DnsServersOptionsModifyStructure] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomDnsServers(value: ValueStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomDnsServers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomDnsServers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomDnsServers")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(js.undefined)
        ret
    }
  }
  
}

