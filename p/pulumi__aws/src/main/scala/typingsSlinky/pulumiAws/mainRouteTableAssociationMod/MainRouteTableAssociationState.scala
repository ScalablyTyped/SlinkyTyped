package typingsSlinky.pulumiAws.mainRouteTableAssociationMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MainRouteTableAssociationState extends js.Object {
  /**
    * Used internally, see __Notes__ below
    */
  val originalRouteTableId: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the Route Table to set as the new
    * main route table for the target VPC
    */
  val routeTableId: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the VPC whose main route table should be set
    */
  val vpcId: js.UndefOr[Input[String]] = js.native
}

object MainRouteTableAssociationState {
  @scala.inline
  def apply(): MainRouteTableAssociationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MainRouteTableAssociationState]
  }
  @scala.inline
  implicit class MainRouteTableAssociationStateOps[Self <: MainRouteTableAssociationState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOriginalRouteTableId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalRouteTableId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalRouteTableId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalRouteTableId")(js.undefined)
        ret
    }
    @scala.inline
    def withRouteTableId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeTableId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRouteTableId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeTableId")(js.undefined)
        ret
    }
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
  }
  
}

