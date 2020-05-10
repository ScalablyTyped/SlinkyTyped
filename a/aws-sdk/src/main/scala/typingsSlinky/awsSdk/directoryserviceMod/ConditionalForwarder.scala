package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConditionalForwarder extends js.Object {
  /**
    * The IP addresses of the remote DNS server associated with RemoteDomainName. This is the IP address of the DNS server that your conditional forwarder points to.
    */
  var DnsIpAddrs: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.DnsIpAddrs] = js.native
  /**
    * The fully qualified domain name (FQDN) of the remote domains pointed to by the conditional forwarder.
    */
  var RemoteDomainName: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.RemoteDomainName] = js.native
  /**
    * The replication scope of the conditional forwarder. The only allowed value is Domain, which will replicate the conditional forwarder to all of the domain controllers for your AWS directory.
    */
  var ReplicationScope: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.ReplicationScope] = js.native
}

object ConditionalForwarder {
  @scala.inline
  def apply(): ConditionalForwarder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalForwarder]
  }
  @scala.inline
  implicit class ConditionalForwarderOps[Self <: ConditionalForwarder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDnsIpAddrs(value: DnsIpAddrs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DnsIpAddrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDnsIpAddrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DnsIpAddrs")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoteDomainName(value: RemoteDomainName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoteDomainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteDomainName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoteDomainName")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationScope(value: ReplicationScope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationScope")(js.undefined)
        ret
    }
  }
  
}

