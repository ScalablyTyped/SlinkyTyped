package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceCapacity extends js.Object {
  /**
    * The number of instances that can be launched onto the Dedicated Host based on the host's available capacity.
    */
  var AvailableCapacity: js.UndefOr[Integer] = js.native
  /**
    * The instance type supported by the Dedicated Host.
    */
  var InstanceType: js.UndefOr[String] = js.native
  /**
    * The total number of instances that can be launched onto the Dedicated Host if there are no instances running on it.
    */
  var TotalCapacity: js.UndefOr[Integer] = js.native
}

object InstanceCapacity {
  @scala.inline
  def apply(): InstanceCapacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceCapacity]
  }
  @scala.inline
  implicit class InstanceCapacityOps[Self <: InstanceCapacity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailableCapacity(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailableCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailableCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailableCapacity")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceType(value: String): Self = {
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
    def withTotalCapacity(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalCapacity")(js.undefined)
        ret
    }
  }
  
}

