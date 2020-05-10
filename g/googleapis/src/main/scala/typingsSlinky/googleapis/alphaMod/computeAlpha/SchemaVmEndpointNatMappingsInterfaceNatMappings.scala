package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contain information of Nat mapping for an interface of this endpoint.
  */
@js.native
trait SchemaVmEndpointNatMappingsInterfaceNatMappings extends js.Object {
  /**
    * List of all drain IP:port-range mappings assigned to this interface.
    * These ranges are inclusive, that is, both the first and the last ports
    * can be used for NAT. Example: [&quot;2.2.2.2:12345-12355&quot;,
    * &quot;1.1.1.1:2234-2234&quot;].
    */
  var drainNatIpPortRanges: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of all IP:port-range mappings assigned to this interface. These
    * ranges are inclusive, that is, both the first and the last ports can be
    * used for NAT. Example: [&quot;2.2.2.2:12345-12355&quot;,
    * &quot;1.1.1.1:2234-2234&quot;].
    */
  var natIpPortRanges: js.UndefOr[js.Array[String]] = js.native
  /**
    * Total number of drain ports across all NAT IPs allocated to this
    * interface. It equals to the aggregated port number in the field
    * drain_nat_ip_port_ranges.
    */
  var numTotalDrainNatPorts: js.UndefOr[Double] = js.native
  /**
    * Total number of ports across all NAT IPs allocated to this interface. It
    * equals to the aggregated port number in the field nat_ip_port_ranges.
    */
  var numTotalNatPorts: js.UndefOr[Double] = js.native
  /**
    * Alias IP range for this interface endpoint. It will be a private (RFC
    * 1918) IP range. Examples: &quot;10.33.4.55/32&quot;, or
    * &quot;192.168.5.0/24&quot;.
    */
  var sourceAliasIpRange: js.UndefOr[String] = js.native
  /**
    * Primary IP of the VM for this NIC.
    */
  var sourceVirtualIp: js.UndefOr[String] = js.native
}

object SchemaVmEndpointNatMappingsInterfaceNatMappings {
  @scala.inline
  def apply(): SchemaVmEndpointNatMappingsInterfaceNatMappings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVmEndpointNatMappingsInterfaceNatMappings]
  }
  @scala.inline
  implicit class SchemaVmEndpointNatMappingsInterfaceNatMappingsOps[Self <: SchemaVmEndpointNatMappingsInterfaceNatMappings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDrainNatIpPortRanges(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drainNatIpPortRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrainNatIpPortRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drainNatIpPortRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withNatIpPortRanges(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("natIpPortRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNatIpPortRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("natIpPortRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withNumTotalDrainNatPorts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numTotalDrainNatPorts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumTotalDrainNatPorts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numTotalDrainNatPorts")(js.undefined)
        ret
    }
    @scala.inline
    def withNumTotalNatPorts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numTotalNatPorts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumTotalNatPorts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numTotalNatPorts")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceAliasIpRange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceAliasIpRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceAliasIpRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceAliasIpRange")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceVirtualIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceVirtualIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceVirtualIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceVirtualIp")(js.undefined)
        ret
    }
  }
  
}

