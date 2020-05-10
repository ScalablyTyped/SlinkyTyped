package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVpcResult extends js.Object {
  /**
    * Information about the VPC.
    */
  var Vpc: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.Vpc] = js.native
}

object CreateVpcResult {
  @scala.inline
  def apply(): CreateVpcResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVpcResult]
  }
  @scala.inline
  implicit class CreateVpcResultOps[Self <: CreateVpcResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVpc(value: Vpc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Vpc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Vpc")(js.undefined)
        ret
    }
  }
  
}

