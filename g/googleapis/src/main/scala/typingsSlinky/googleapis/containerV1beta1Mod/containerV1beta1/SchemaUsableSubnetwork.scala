package typingsSlinky.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * UsableSubnetwork resource returns the subnetwork name, its associated
  * network and the primary CIDR range.
  */
@js.native
trait SchemaUsableSubnetwork extends js.Object {
  /**
    * The range of internal addresses that are owned by this subnetwork.
    */
  var ipCidrRange: js.UndefOr[String] = js.native
  /**
    * Network Name. Example: projects/my-project/global/networks/my-network
    */
  var network: js.UndefOr[String] = js.native
  /**
    * Secondary IP ranges.
    */
  var secondaryIpRanges: js.UndefOr[js.Array[SchemaUsableSubnetworkSecondaryRange]] = js.native
  /**
    * A human readable status message representing the reasons for cases where
    * the caller cannot use the secondary ranges under the subnet. For example
    * if the secondary_ip_ranges is empty due to a permission issue, an
    * insufficient permission message will be given by status_message.
    */
  var statusMessage: js.UndefOr[String] = js.native
  /**
    * Subnetwork Name. Example:
    * projects/my-project/regions/us-central1/subnetworks/my-subnet
    */
  var subnetwork: js.UndefOr[String] = js.native
}

object SchemaUsableSubnetwork {
  @scala.inline
  def apply(): SchemaUsableSubnetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUsableSubnetwork]
  }
  @scala.inline
  implicit class SchemaUsableSubnetworkOps[Self <: SchemaUsableSubnetwork] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIpCidrRange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipCidrRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpCidrRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipCidrRange")(js.undefined)
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
    def withSecondaryIpRanges(value: js.Array[SchemaUsableSubnetworkSecondaryRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryIpRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondaryIpRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryIpRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetwork(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetwork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetwork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetwork")(js.undefined)
        ret
    }
  }
  
}

