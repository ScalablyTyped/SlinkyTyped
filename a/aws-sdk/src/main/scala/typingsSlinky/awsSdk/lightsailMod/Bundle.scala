package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bundle extends js.Object {
  /**
    * The bundle ID (e.g., micro_1_0).
    */
  var bundleId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The number of vCPUs included in the bundle (e.g., 2).
    */
  var cpuCount: js.UndefOr[integer] = js.native
  /**
    * The size of the SSD (e.g., 30).
    */
  var diskSizeInGb: js.UndefOr[integer] = js.native
  /**
    * The Amazon EC2 instance type (e.g., t2.micro).
    */
  var instanceType: js.UndefOr[String] = js.native
  /**
    * A Boolean value indicating whether the bundle is active.
    */
  var isActive: js.UndefOr[Boolean] = js.native
  /**
    * A friendly name for the bundle (e.g., Micro).
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A numeric value that represents the power of the bundle (e.g., 500). You can use the bundle's power value in conjunction with a blueprint's minimum power value to determine whether the blueprint will run on the bundle. For example, you need a bundle with a power value of 500 or more to create an instance that uses a blueprint with a minimum power value of 500.
    */
  var power: js.UndefOr[integer] = js.native
  /**
    * The price in US dollars (e.g., 5.0).
    */
  var price: js.UndefOr[float] = js.native
  /**
    * The amount of RAM in GB (e.g., 2.0).
    */
  var ramSizeInGb: js.UndefOr[float] = js.native
  /**
    * The operating system platform (Linux/Unix-based or Windows Server-based) that the bundle supports. You can only launch a WINDOWS bundle on a blueprint that supports the WINDOWS platform. LINUX_UNIX blueprints require a LINUX_UNIX bundle.
    */
  var supportedPlatforms: js.UndefOr[InstancePlatformList] = js.native
  /**
    * The data transfer rate per month in GB (e.g., 2000).
    */
  var transferPerMonthInGb: js.UndefOr[integer] = js.native
}

object Bundle {
  @scala.inline
  def apply(): Bundle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bundle]
  }
  @scala.inline
  implicit class BundleOps[Self <: Bundle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBundleId(value: NonEmptyString): Self = {
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
    def withInstanceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceType")(js.undefined)
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
    def withPower(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("power")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPower: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("power")(js.undefined)
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
    def withSupportedPlatforms(value: InstancePlatformList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedPlatforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedPlatforms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedPlatforms")(js.undefined)
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

