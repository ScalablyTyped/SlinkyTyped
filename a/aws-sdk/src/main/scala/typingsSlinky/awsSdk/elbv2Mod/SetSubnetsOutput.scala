package typingsSlinky.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetSubnetsOutput extends js.Object {
  /**
    * Information about the subnet and Availability Zone.
    */
  var AvailabilityZones: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.AvailabilityZones] = js.native
}

object SetSubnetsOutput {
  @scala.inline
  def apply(): SetSubnetsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetSubnetsOutput]
  }
  @scala.inline
  implicit class SetSubnetsOutputOps[Self <: SetSubnetsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailabilityZones(value: AvailabilityZones): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZones: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZones")(js.undefined)
        ret
    }
  }
  
}

