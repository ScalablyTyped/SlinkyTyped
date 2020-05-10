package typingsSlinky.pulumiAws.ec2GetRouteTableMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.ec2.GetRouteTableAssociation
import typingsSlinky.pulumiAws.outputMod.ec2.GetRouteTableFilter
import typingsSlinky.pulumiAws.outputMod.ec2.GetRouteTableRoute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRouteTableResult extends js.Object {
  val associations: js.Array[GetRouteTableAssociation] = js.native
  val filters: js.UndefOr[js.Array[GetRouteTableFilter]] = js.native
  /**
    * The Gateway ID. Only set when associated with an Internet Gateway or Virtual Private Gateway.
    */
  val gatewayId: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The ID of the AWS account that owns the route table
    */
  val ownerId: String = js.native
  /**
    * The Route Table ID.
    */
  val routeTableId: String = js.native
  val routes: js.Array[GetRouteTableRoute] = js.native
  /**
    * The Subnet ID. Only set when associated with a Subnet.
    */
  val subnetId: String = js.native
  val tags: StringDictionary[js.Any] = js.native
  val vpcId: String = js.native
}

object GetRouteTableResult {
  @scala.inline
  def apply(
    associations: js.Array[GetRouteTableAssociation],
    gatewayId: String,
    id: String,
    ownerId: String,
    routeTableId: String,
    routes: js.Array[GetRouteTableRoute],
    subnetId: String,
    tags: StringDictionary[js.Any],
    vpcId: String
  ): GetRouteTableResult = {
    val __obj = js.Dynamic.literal(associations = associations.asInstanceOf[js.Any], gatewayId = gatewayId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], routeTableId = routeTableId.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRouteTableResult]
  }
  @scala.inline
  implicit class GetRouteTableResultOps[Self <: GetRouteTableResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociations(value: js.Array[GetRouteTableAssociation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGatewayId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRouteTableId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeTableId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoutes(value: js.Array[GetRouteTableRoute]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubnetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVpcId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilters(value: js.Array[GetRouteTableFilter]): Self = {
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
  }
  
}

