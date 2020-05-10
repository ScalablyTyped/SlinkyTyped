package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EbsConfiguration extends js.Object {
  /**
    * An array of Amazon EBS volume specifications attached to a cluster instance.
    */
  var EbsBlockDeviceConfigs: js.UndefOr[EbsBlockDeviceConfigList] = js.native
  /**
    * Indicates whether an Amazon EBS volume is EBS-optimized.
    */
  var EbsOptimized: js.UndefOr[BooleanObject] = js.native
}

object EbsConfiguration {
  @scala.inline
  def apply(): EbsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EbsConfiguration]
  }
  @scala.inline
  implicit class EbsConfigurationOps[Self <: EbsConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEbsBlockDeviceConfigs(value: EbsBlockDeviceConfigList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EbsBlockDeviceConfigs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEbsBlockDeviceConfigs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EbsBlockDeviceConfigs")(js.undefined)
        ret
    }
    @scala.inline
    def withEbsOptimized(value: BooleanObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EbsOptimized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEbsOptimized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EbsOptimized")(js.undefined)
        ret
    }
  }
  
}

