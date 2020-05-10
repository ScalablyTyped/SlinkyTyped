package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EC2ResourceDetails extends js.Object {
  /**
    *  Hourly public On Demand rate for the instance type.
    */
  var HourlyOnDemandRate: js.UndefOr[GenericString] = js.native
  /**
    *  The type of Amazon Web Services instance.
    */
  var InstanceType: js.UndefOr[GenericString] = js.native
  /**
    *  Memory capacity of Amazon Web Services instance.
    */
  var Memory: js.UndefOr[GenericString] = js.native
  /**
    *  Network performance capacity of the Amazon Web Services instance.
    */
  var NetworkPerformance: js.UndefOr[GenericString] = js.native
  /**
    *  The platform of the Amazon Web Services instance. The platform is the specific combination of operating system, license model, and software on an instance.
    */
  var Platform: js.UndefOr[GenericString] = js.native
  /**
    *  The Amazon Web Services Region of the instance.
    */
  var Region: js.UndefOr[GenericString] = js.native
  /**
    *  The SKU of the product.
    */
  var Sku: js.UndefOr[GenericString] = js.native
  /**
    *  The disk storage of the Amazon Web Services instance (Not EBS storage).
    */
  var Storage: js.UndefOr[GenericString] = js.native
  /**
    *  Number of VCPU cores in the Amazon Web Services instance type.
    */
  var Vcpu: js.UndefOr[GenericString] = js.native
}

object EC2ResourceDetails {
  @scala.inline
  def apply(): EC2ResourceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EC2ResourceDetails]
  }
  @scala.inline
  implicit class EC2ResourceDetailsOps[Self <: EC2ResourceDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHourlyOnDemandRate(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HourlyOnDemandRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHourlyOnDemandRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HourlyOnDemandRate")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceType(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(js.undefined)
        ret
    }
    @scala.inline
    def withMemory(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Memory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Memory")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkPerformance(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkPerformance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkPerformance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkPerformance")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatform(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Platform")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Region")(js.undefined)
        ret
    }
    @scala.inline
    def withSku(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sku")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSku: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sku")(js.undefined)
        ret
    }
    @scala.inline
    def withStorage(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Storage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Storage")(js.undefined)
        ret
    }
    @scala.inline
    def withVcpu(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Vcpu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVcpu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Vcpu")(js.undefined)
        ret
    }
  }
  
}

