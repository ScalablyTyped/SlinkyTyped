package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Status of a NAT contained in this router. Next tag: 9
  */
@js.native
trait SchemaRouterStatusNatStatus extends js.Object {
  /**
    * A list of IPs auto-allocated for NAT. Example: [&quot;1.1.1.1&quot;,
    * &quot;129.2.16.89&quot;]
    */
  var autoAllocatedNatIps: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of IPs auto-allocated for NAT that are in drain mode. Example:
    * [&quot;1.1.1.1&quot;, ?179.12.26.133?].
    */
  var drainAutoAllocatedNatIps: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of IPs user-allocated for NAT that are in drain mode. Example:
    * [&quot;1.1.1.1&quot;, ?179.12.26.133?].
    */
  var drainUserAllocatedNatIps: js.UndefOr[js.Array[String]] = js.native
  /**
    * The number of extra IPs to allocate. This will be greater than 0 only if
    * user-specified IPs are NOT enough to allow all configured VMs to use NAT.
    * This value is meaningful only when auto-allocation of NAT IPs is *not*
    * used.
    */
  var minExtraNatIpsNeeded: js.UndefOr[Double] = js.native
  /**
    * Unique name of this NAT.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Number of VM endpoints (i.e., Nics) that can use NAT.
    */
  var numVmEndpointsWithNatMappings: js.UndefOr[Double] = js.native
  /**
    * A list of fully qualified URLs of reserved IP address resources.
    */
  var userAllocatedNatIpResources: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of IPs user-allocated for NAT. They will be raw IP strings like
    * &quot;179.12.26.133&quot;.
    */
  var userAllocatedNatIps: js.UndefOr[js.Array[String]] = js.native
}

object SchemaRouterStatusNatStatus {
  @scala.inline
  def apply(): SchemaRouterStatusNatStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouterStatusNatStatus]
  }
  @scala.inline
  implicit class SchemaRouterStatusNatStatusOps[Self <: SchemaRouterStatusNatStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoAllocatedNatIps(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAllocatedNatIps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoAllocatedNatIps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAllocatedNatIps")(js.undefined)
        ret
    }
    @scala.inline
    def withDrainAutoAllocatedNatIps(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drainAutoAllocatedNatIps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrainAutoAllocatedNatIps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drainAutoAllocatedNatIps")(js.undefined)
        ret
    }
    @scala.inline
    def withDrainUserAllocatedNatIps(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drainUserAllocatedNatIps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrainUserAllocatedNatIps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drainUserAllocatedNatIps")(js.undefined)
        ret
    }
    @scala.inline
    def withMinExtraNatIpsNeeded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minExtraNatIpsNeeded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinExtraNatIpsNeeded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minExtraNatIpsNeeded")(js.undefined)
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
    def withNumVmEndpointsWithNatMappings(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numVmEndpointsWithNatMappings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumVmEndpointsWithNatMappings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numVmEndpointsWithNatMappings")(js.undefined)
        ret
    }
    @scala.inline
    def withUserAllocatedNatIpResources(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAllocatedNatIpResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserAllocatedNatIpResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAllocatedNatIpResources")(js.undefined)
        ret
    }
    @scala.inline
    def withUserAllocatedNatIps(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAllocatedNatIps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserAllocatedNatIps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAllocatedNatIps")(js.undefined)
        ret
    }
  }
  
}

