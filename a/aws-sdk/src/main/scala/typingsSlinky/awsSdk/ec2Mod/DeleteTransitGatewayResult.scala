package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTransitGatewayResult extends js.Object {
  /**
    * Information about the deleted transit gateway.
    */
  var TransitGateway: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.TransitGateway] = js.native
}

object DeleteTransitGatewayResult {
  @scala.inline
  def apply(): DeleteTransitGatewayResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTransitGatewayResult]
  }
  @scala.inline
  implicit class DeleteTransitGatewayResultOps[Self <: DeleteTransitGatewayResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransitGateway(value: TransitGateway): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransitGateway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitGateway: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransitGateway")(js.undefined)
        ret
    }
  }
  
}

