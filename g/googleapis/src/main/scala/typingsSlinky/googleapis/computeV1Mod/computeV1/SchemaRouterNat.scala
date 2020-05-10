package typingsSlinky.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Nat resource. It enables the VMs within the specified
  * subnetworks to access Internet without external IP addresses. It specifies
  * a list of subnetworks (and the ranges within) that want to use NAT.
  * Customers can also provide the external IPs that would be used for NAT. GCP
  * would auto-allocate ephemeral IPs if no external IPs are provided.
  */
@js.native
trait SchemaRouterNat extends js.Object {
  /**
    * Timeout (in seconds) for ICMP connections. Defaults to 30s if not set.
    */
  var icmpIdleTimeoutSec: js.UndefOr[Double] = js.native
  /**
    * Minimum number of ports allocated to a VM from this NAT config. If not
    * set, a default number of ports is allocated to a VM. This gets rounded up
    * to the nearest power of 2. Eg. if the value of this field is 50, at least
    * 64 ports will be allocated to a VM.
    */
  var minPortsPerVm: js.UndefOr[Double] = js.native
  /**
    * Unique name of this Nat service. The name must be 1-63 characters long
    * and comply with RFC1035.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Specify the NatIpAllocateOption. If it is AUTO_ONLY, then nat_ip should
    * be empty.
    */
  var natIpAllocateOption: js.UndefOr[String] = js.native
  /**
    * A list of URLs of the IP resources used for this Nat service. These IPs
    * must be valid static external IP addresses assigned to the project.
    * max_length is subject to change post alpha.
    */
  var natIps: js.UndefOr[js.Array[String]] = js.native
  /**
    * Specify the Nat option. If this field contains
    * ALL_SUBNETWORKS_ALL_IP_RANGES or ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES,
    * then there should not be any other Router.Nat section in any Router for
    * this network in this region.
    */
  var sourceSubnetworkIpRangesToNat: js.UndefOr[String] = js.native
  /**
    * A list of Subnetwork resources whose traffic should be translated by NAT
    * Gateway. It is used only when LIST_OF_SUBNETWORKS is selected for the
    * SubnetworkIpRangeToNatOption above.
    */
  var subnetworks: js.UndefOr[js.Array[SchemaRouterNatSubnetworkToNat]] = js.native
  /**
    * Timeout (in seconds) for TCP established connections. Defaults to 1200s
    * if not set.
    */
  var tcpEstablishedIdleTimeoutSec: js.UndefOr[Double] = js.native
  /**
    * Timeout (in seconds) for TCP transitory connections. Defaults to 30s if
    * not set.
    */
  var tcpTransitoryIdleTimeoutSec: js.UndefOr[Double] = js.native
  /**
    * Timeout (in seconds) for UDP connections. Defaults to 30s if not set.
    */
  var udpIdleTimeoutSec: js.UndefOr[Double] = js.native
}

object SchemaRouterNat {
  @scala.inline
  def apply(): SchemaRouterNat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouterNat]
  }
  @scala.inline
  implicit class SchemaRouterNatOps[Self <: SchemaRouterNat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIcmpIdleTimeoutSec(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icmpIdleTimeoutSec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcmpIdleTimeoutSec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icmpIdleTimeoutSec")(js.undefined)
        ret
    }
    @scala.inline
    def withMinPortsPerVm(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPortsPerVm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinPortsPerVm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPortsPerVm")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
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
    def withNatIpAllocateOption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("natIpAllocateOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNatIpAllocateOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("natIpAllocateOption")(js.undefined)
        ret
    }
    @scala.inline
    def withNatIps(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("natIps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNatIps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("natIps")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceSubnetworkIpRangesToNat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceSubnetworkIpRangesToNat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceSubnetworkIpRangesToNat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceSubnetworkIpRangesToNat")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetworks(value: js.Array[SchemaRouterNatSubnetworkToNat]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetworks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetworks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetworks")(js.undefined)
        ret
    }
    @scala.inline
    def withTcpEstablishedIdleTimeoutSec(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tcpEstablishedIdleTimeoutSec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTcpEstablishedIdleTimeoutSec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tcpEstablishedIdleTimeoutSec")(js.undefined)
        ret
    }
    @scala.inline
    def withTcpTransitoryIdleTimeoutSec(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tcpTransitoryIdleTimeoutSec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTcpTransitoryIdleTimeoutSec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tcpTransitoryIdleTimeoutSec")(js.undefined)
        ret
    }
    @scala.inline
    def withUdpIdleTimeoutSec(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("udpIdleTimeoutSec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUdpIdleTimeoutSec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("udpIdleTimeoutSec")(js.undefined)
        ret
    }
  }
  
}

