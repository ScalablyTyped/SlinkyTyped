package typingsSlinky.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceDiscovery extends js.Object {
  /**
    * Specifies any AWS Cloud Map information for the virtual node.
    */
  var awsCloudMap: js.UndefOr[AwsCloudMapServiceDiscovery] = js.native
  /**
    * Specifies the DNS information for the virtual node.
    */
  var dns: js.UndefOr[DnsServiceDiscovery] = js.native
}

object ServiceDiscovery {
  @scala.inline
  def apply(): ServiceDiscovery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceDiscovery]
  }
  @scala.inline
  implicit class ServiceDiscoveryOps[Self <: ServiceDiscovery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAwsCloudMap(value: AwsCloudMapServiceDiscovery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsCloudMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsCloudMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsCloudMap")(js.undefined)
        ret
    }
    @scala.inline
    def withDns(value: DnsServiceDiscovery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dns")(js.undefined)
        ret
    }
  }
  
}

