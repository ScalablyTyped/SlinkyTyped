package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvailableCapacity extends js.Object {
  /**
    * The number of instances that can be launched onto the Dedicated Host depending on the host's available capacity. For Dedicated Hosts that support multiple instance types, this parameter represents the number of instances for each instance size that is supported on the host.
    */
  var AvailableInstanceCapacity: js.UndefOr[AvailableInstanceCapacityList] = js.native
  /**
    * The number of vCPUs available for launching instances onto the Dedicated Host.
    */
  var AvailableVCpus: js.UndefOr[Integer] = js.native
}

object AvailableCapacity {
  @scala.inline
  def apply(): AvailableCapacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvailableCapacity]
  }
  @scala.inline
  implicit class AvailableCapacityOps[Self <: AvailableCapacity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailableInstanceCapacity(value: AvailableInstanceCapacityList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailableInstanceCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailableInstanceCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailableInstanceCapacity")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailableVCpus(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailableVCpus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailableVCpus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailableVCpus")(js.undefined)
        ret
    }
  }
  
}

