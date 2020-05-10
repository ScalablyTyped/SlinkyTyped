package typingsSlinky.pulumiAws.zoneAssociationMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoneAssociationArgs extends js.Object {
  /**
    * The VPC to associate with the private hosted zone.
    */
  val vpcId: Input[String] = js.native
  /**
    * The VPC's region. Defaults to the region of the AWS provider.
    */
  val vpcRegion: js.UndefOr[Input[String]] = js.native
  /**
    * The private hosted zone to associate.
    */
  val zoneId: Input[String] = js.native
}

object ZoneAssociationArgs {
  @scala.inline
  def apply(vpcId: Input[String], zoneId: Input[String]): ZoneAssociationArgs = {
    val __obj = js.Dynamic.literal(vpcId = vpcId.asInstanceOf[js.Any], zoneId = zoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoneAssociationArgs]
  }
  @scala.inline
  implicit class ZoneAssociationArgsOps[Self <: ZoneAssociationArgs] (val x: Self) extends AnyVal {
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
    def withZoneId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoneId")(value.asInstanceOf[js.Any])
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

