package typingsSlinky.pulumiAws.getVpnGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.ec2.GetVpnGatewayFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVpnGatewayArgs extends js.Object {
  /**
    * The Autonomous System Number (ASN) for the Amazon side of the specific VPN Gateway to retrieve.
    */
  val amazonSideAsn: js.UndefOr[String] = js.native
  /**
    * The ID of a VPC attached to the specific VPN Gateway to retrieve.
    */
  val attachedVpcId: js.UndefOr[String] = js.native
  /**
    * The Availability Zone of the specific VPN Gateway to retrieve.
    */
  val availabilityZone: js.UndefOr[String] = js.native
  /**
    * Custom filter block as described below.
    */
  val filters: js.UndefOr[js.Array[GetVpnGatewayFilter]] = js.native
  /**
    * The ID of the specific VPN Gateway to retrieve.
    */
  val id: js.UndefOr[String] = js.native
  /**
    * The state of the specific VPN Gateway to retrieve.
    */
  val state: js.UndefOr[String] = js.native
  /**
    * A mapping of tags, each pair of which must exactly match
    * a pair on the desired VPN Gateway.
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetVpnGatewayArgs {
  @scala.inline
  def apply(): GetVpnGatewayArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVpnGatewayArgs]
  }
  @scala.inline
  implicit class GetVpnGatewayArgsOps[Self <: GetVpnGatewayArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmazonSideAsn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amazonSideAsn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmazonSideAsn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amazonSideAsn")(js.undefined)
        ret
    }
    @scala.inline
    def withAttachedVpcId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachedVpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachedVpcId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachedVpcId")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailabilityZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZone")(js.undefined)
        ret
    }
    @scala.inline
    def withFilters(value: js.Array[GetVpnGatewayFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

