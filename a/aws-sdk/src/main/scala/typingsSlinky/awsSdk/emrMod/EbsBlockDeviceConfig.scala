package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EbsBlockDeviceConfig extends js.Object {
  /**
    * EBS volume specifications such as volume type, IOPS, and size (GiB) that will be requested for the EBS volume attached to an EC2 instance in the cluster.
    */
  var VolumeSpecification: typingsSlinky.awsSdk.emrMod.VolumeSpecification = js.native
  /**
    * Number of EBS volumes with a specific volume configuration that will be associated with every instance in the instance group
    */
  var VolumesPerInstance: js.UndefOr[Integer] = js.native
}

object EbsBlockDeviceConfig {
  @scala.inline
  def apply(VolumeSpecification: VolumeSpecification): EbsBlockDeviceConfig = {
    val __obj = js.Dynamic.literal(VolumeSpecification = VolumeSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[EbsBlockDeviceConfig]
  }
  @scala.inline
  implicit class EbsBlockDeviceConfigOps[Self <: EbsBlockDeviceConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVolumeSpecification(value: VolumeSpecification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeSpecification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVolumesPerInstance(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumesPerInstance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumesPerInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumesPerInstance")(js.undefined)
        ret
    }
  }
  
}

