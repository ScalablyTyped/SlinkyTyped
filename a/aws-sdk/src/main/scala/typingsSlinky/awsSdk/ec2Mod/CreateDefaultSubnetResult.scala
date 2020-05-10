package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDefaultSubnetResult extends js.Object {
  /**
    * Information about the subnet.
    */
  var Subnet: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.Subnet] = js.native
}

object CreateDefaultSubnetResult {
  @scala.inline
  def apply(): CreateDefaultSubnetResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDefaultSubnetResult]
  }
  @scala.inline
  implicit class CreateDefaultSubnetResultOps[Self <: CreateDefaultSubnetResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubnet(value: Subnet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subnet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subnet")(js.undefined)
        ret
    }
  }
  
}

