package typingsSlinky.googleapis.fileV1Mod.fileV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Network configuration for the instance.
  */
@js.native
trait SchemaNetworkConfig extends js.Object {
  /**
    * Output only. IPv4 addresses in the format {octet 1}.{octet 2}.{octet
    * 3}.{octet 4} or IPv6 addresses in the format {block 1}:{block 2}:{block
    * 3}:{block 4}:{block 5}:{block 6}:{block 7}:{block 8}.
    */
  var ipAddresses: js.UndefOr[js.Array[String]] = js.native
  /**
    * Internet protocol versions for which the instance has IP addresses
    * assigned. For this version, only MODE_IPV4 is supported.
    */
  var modes: js.UndefOr[js.Array[String]] = js.native
  /**
    * The name of the Google Compute Engine [VPC
    * network](/compute/docs/networks-and-firewalls#networks) to which the
    * instance is connected.
    */
  var network: js.UndefOr[String] = js.native
  /**
    * A /29 CIDR block in one of the [internal IP address
    * ranges](https://www.arin.net/knowledge/address_filters.html) that
    * identifies the range of IP addresses reserved for this instance. For
    * example, 10.0.0.0/29 or 192.168.0.0/29. The range you specify can&#39;t
    * overlap with either existing subnets or assigned IP address ranges for
    * other Cloud Filestore instances in the selected VPC network.
    */
  var reservedIpRange: js.UndefOr[String] = js.native
}

object SchemaNetworkConfig {
  @scala.inline
  def apply(): SchemaNetworkConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkConfig]
  }
  @scala.inline
  implicit class SchemaNetworkConfigOps[Self <: SchemaNetworkConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIpAddresses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddresses")(js.undefined)
        ret
    }
    @scala.inline
    def withModes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modes")(js.undefined)
        ret
    }
    @scala.inline
    def withNetwork(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetwork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network")(js.undefined)
        ret
    }
    @scala.inline
    def withReservedIpRange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reservedIpRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservedIpRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reservedIpRange")(js.undefined)
        ret
    }
  }
  
}

