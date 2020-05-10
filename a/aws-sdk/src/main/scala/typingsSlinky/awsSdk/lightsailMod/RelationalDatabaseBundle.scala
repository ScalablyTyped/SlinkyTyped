package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelationalDatabaseBundle extends js.Object {
  /**
    * The ID for the database bundle.
    */
  var bundleId: js.UndefOr[String] = js.native
  /**
    * The number of virtual CPUs (vCPUs) for the database bundle.
    */
  var cpuCount: js.UndefOr[integer] = js.native
  /**
    * The size of the disk for the database bundle.
    */
  var diskSizeInGb: js.UndefOr[integer] = js.native
  /**
    * A Boolean value indicating whether the database bundle is active.
    */
  var isActive: js.UndefOr[Boolean] = js.native
  /**
    * A Boolean value indicating whether the database bundle is encrypted.
    */
  var isEncrypted: js.UndefOr[Boolean] = js.native
  /**
    * The name for the database bundle.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The cost of the database bundle in US currency.
    */
  var price: js.UndefOr[float] = js.native
  /**
    * The amount of RAM in GB (for example, 2.0) for the database bundle.
    */
  var ramSizeInGb: js.UndefOr[float] = js.native
  /**
    * The data transfer rate per month in GB for the database bundle.
    */
  var transferPerMonthInGb: js.UndefOr[integer] = js.native
}

object RelationalDatabaseBundle {
  @scala.inline
  def apply(): RelationalDatabaseBundle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationalDatabaseBundle]
  }
  @scala.inline
  implicit class RelationalDatabaseBundleOps[Self <: RelationalDatabaseBundle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBundleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBundleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleId")(js.undefined)
        ret
    }
    @scala.inline
    def withCpuCount(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpuCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuCount")(js.undefined)
        ret
    }
    @scala.inline
    def withDiskSizeInGb(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskSizeInGb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiskSizeInGb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskSizeInGb")(js.undefined)
        ret
    }
    @scala.inline
    def withIsActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(js.undefined)
        ret
    }
    @scala.inline
    def withIsEncrypted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEncrypted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsEncrypted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEncrypted")(js.undefined)
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
    def withPrice(value: float): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price")(js.undefined)
        ret
    }
    @scala.inline
    def withRamSizeInGb(value: float): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ramSizeInGb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRamSizeInGb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ramSizeInGb")(js.undefined)
        ret
    }
    @scala.inline
    def withTransferPerMonthInGb(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferPerMonthInGb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransferPerMonthInGb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferPerMonthInGb")(js.undefined)
        ret
    }
  }
  
}

