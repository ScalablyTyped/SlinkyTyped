package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceHardware extends js.Object {
  /**
    * The number of vCPUs the instance has.
    */
  var cpuCount: js.UndefOr[integer] = js.native
  /**
    * The disks attached to the instance.
    */
  var disks: js.UndefOr[DiskList] = js.native
  /**
    * The amount of RAM in GB on the instance (e.g., 1.0).
    */
  var ramSizeInGb: js.UndefOr[float] = js.native
}

object InstanceHardware {
  @scala.inline
  def apply(): InstanceHardware = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceHardware]
  }
  @scala.inline
  implicit class InstanceHardwareOps[Self <: InstanceHardware] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withDisks(value: DiskList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disks")(js.undefined)
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
  }
  
}

