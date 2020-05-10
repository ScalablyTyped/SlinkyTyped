package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitGatewayRoute extends js.Object {
  /**
    * The CIDR block used for destination matches.
    */
  var DestinationCidrBlock: js.UndefOr[String] = js.native
  /**
    * The state of the route.
    */
  var State: js.UndefOr[TransitGatewayRouteState] = js.native
  /**
    * The attachments.
    */
  var TransitGatewayAttachments: js.UndefOr[TransitGatewayRouteAttachmentList] = js.native
  /**
    * The route type.
    */
  var Type: js.UndefOr[TransitGatewayRouteType] = js.native
}

object TransitGatewayRoute {
  @scala.inline
  def apply(): TransitGatewayRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayRoute]
  }
  @scala.inline
  implicit class TransitGatewayRouteOps[Self <: TransitGatewayRoute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationCidrBlock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationCidrBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationCidrBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationCidrBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: TransitGatewayRouteState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitGatewayAttachments(value: TransitGatewayRouteAttachmentList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransitGatewayAttachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitGatewayAttachments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransitGatewayAttachments")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: TransitGatewayRouteType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
  }
  
}

