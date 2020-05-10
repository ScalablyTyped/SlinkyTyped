package typingsSlinky.pulumiAws.zoneAssociationMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoneAssociationState extends js.Object {
  /**
    * The VPC to associate with the private hosted zone.
    */
  val vpcId: js.UndefOr[Input[String]] = js.native
  /**
    * The VPC's region. Defaults to the region of the AWS provider.
    */
  val vpcRegion: js.UndefOr[Input[String]] = js.native
  /**
    * The private hosted zone to associate.
    */
  val zoneId: js.UndefOr[Input[String]] = js.native
}

object ZoneAssociationState {
  @scala.inline
  def apply(): ZoneAssociationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoneAssociationState]
  }
  @scala.inline
  implicit class ZoneAssociationStateOps[Self <: ZoneAssociationState] (val x: Self) extends AnyVal {
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
    def withoutVpcId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcId")(js.undefined)
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
    @scala.inline
    def withZoneId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoneId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoneId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoneId")(js.undefined)
        ret
    }
  }
  
}

