package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchTransitGatewayRoutesResult extends js.Object {
  /**
    * Indicates whether there are additional routes available.
    */
  var AdditionalRoutesAvailable: js.UndefOr[Boolean] = js.native
  /**
    * Information about the routes.
    */
  var Routes: js.UndefOr[TransitGatewayRouteList] = js.native
}

object SearchTransitGatewayRoutesResult {
  @scala.inline
  def apply(): SearchTransitGatewayRoutesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchTransitGatewayRoutesResult]
  }
  @scala.inline
  implicit class SearchTransitGatewayRoutesResultOps[Self <: SearchTransitGatewayRoutesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalRoutesAvailable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdditionalRoutesAvailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalRoutesAvailable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdditionalRoutesAvailable")(js.undefined)
        ret
    }
    @scala.inline
    def withRoutes(value: TransitGatewayRouteList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Routes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Routes")(js.undefined)
        ret
    }
  }
  
}

