package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLocalGatewayRouteResult extends js.Object {
  /**
    * Information about the route.
    */
  var Route: js.UndefOr[LocalGatewayRoute] = js.native
}

object CreateLocalGatewayRouteResult {
  @scala.inline
  def apply(): CreateLocalGatewayRouteResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLocalGatewayRouteResult]
  }
  @scala.inline
  implicit class CreateLocalGatewayRouteResultOps[Self <: CreateLocalGatewayRouteResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoute(value: LocalGatewayRoute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Route")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Route")(js.undefined)
        ret
    }
  }
  
}

