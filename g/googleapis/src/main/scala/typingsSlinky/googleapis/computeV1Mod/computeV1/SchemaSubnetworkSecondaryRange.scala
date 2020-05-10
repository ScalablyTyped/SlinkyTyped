package typingsSlinky.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a secondary IP range of a subnetwork.
  */
@js.native
trait SchemaSubnetworkSecondaryRange extends js.Object {
  /**
    * The range of IP addresses belonging to this subnetwork secondary range.
    * Provide this property when you create the subnetwork. Ranges must be
    * unique and non-overlapping with all primary and secondary IP ranges
    * within a network. Only IPv4 is supported.
    */
  var ipCidrRange: js.UndefOr[String] = js.native
  /**
    * The name associated with this subnetwork secondary range, used when
    * adding an alias IP range to a VM instance. The name must be 1-63
    * characters long, and comply with RFC1035. The name must be unique within
    * the subnetwork.
    */
  var rangeName: js.UndefOr[String] = js.native
}

object SchemaSubnetworkSecondaryRange {
  @scala.inline
  def apply(): SchemaSubnetworkSecondaryRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubnetworkSecondaryRange]
  }
  @scala.inline
  implicit class SchemaSubnetworkSecondaryRangeOps[Self <: SchemaSubnetworkSecondaryRange] (val x: Self) extends AnyVal {
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
    def withRangeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeName")(js.undefined)
        ret
    }
  }
  
}

