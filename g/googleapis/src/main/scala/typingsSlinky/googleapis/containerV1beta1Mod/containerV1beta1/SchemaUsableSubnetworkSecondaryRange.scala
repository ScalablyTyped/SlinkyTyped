package typingsSlinky.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Secondary IP range of a usable subnetwork.
  */
@js.native
trait SchemaUsableSubnetworkSecondaryRange extends js.Object {
  /**
    * The range of IP addresses belonging to this subnetwork secondary range.
    */
  var ipCidrRange: js.UndefOr[String] = js.native
  /**
    * The name associated with this subnetwork secondary range, used when
    * adding an alias IP range to a VM instance.
    */
  var rangeName: js.UndefOr[String] = js.native
  /**
    * This field is to determine the status of the secondary range
    * programmably.
    */
  var status: js.UndefOr[String] = js.native
}

object SchemaUsableSubnetworkSecondaryRange {
  @scala.inline
  def apply(): SchemaUsableSubnetworkSecondaryRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUsableSubnetworkSecondaryRange]
  }
  @scala.inline
  implicit class SchemaUsableSubnetworkSecondaryRangeOps[Self <: SchemaUsableSubnetworkSecondaryRange] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

