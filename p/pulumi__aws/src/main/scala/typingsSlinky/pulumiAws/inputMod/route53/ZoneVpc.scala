package typingsSlinky.pulumiAws.inputMod.route53

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoneVpc extends js.Object {
  /**
    * ID of the VPC to associate.
    */
  var vpcId: Input[String] = js.native
  /**
    * Region of the VPC to associate. Defaults to AWS provider region.
    */
  var vpcRegion: js.UndefOr[Input[String]] = js.native
}

object ZoneVpc {
  @scala.inline
  def apply(vpcId: Input[String]): ZoneVpc = {
    val __obj = js.Dynamic.literal(vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoneVpc]
  }
  @scala.inline
  implicit class ZoneVpcOps[Self <: ZoneVpc] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVpcId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVpcRegion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcRegion")(js.undefined)
        ret
    }
  }
  
}

