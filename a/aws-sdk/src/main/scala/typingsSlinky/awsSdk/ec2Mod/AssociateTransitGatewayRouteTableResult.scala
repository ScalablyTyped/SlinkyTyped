package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateTransitGatewayRouteTableResult extends js.Object {
  /**
    * The ID of the association.
    */
  var Association: js.UndefOr[TransitGatewayAssociation] = js.native
}

object AssociateTransitGatewayRouteTableResult {
  @scala.inline
  def apply(): AssociateTransitGatewayRouteTableResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateTransitGatewayRouteTableResult]
  }
  @scala.inline
  implicit class AssociateTransitGatewayRouteTableResultOps[Self <: AssociateTransitGatewayRouteTableResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociation(value: TransitGatewayAssociation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Association")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Association")(js.undefined)
        ret
    }
  }
  
}

