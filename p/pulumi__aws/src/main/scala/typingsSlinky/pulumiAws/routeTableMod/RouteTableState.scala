package typingsSlinky.pulumiAws.routeTableMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteTableState extends js.Object {
  /**
    * Boolean whether this is the default association route table for the EC2 Transit Gateway.
    */
  val defaultAssociationRouteTable: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Boolean whether this is the default propagation route table for the EC2 Transit Gateway.
    */
  val defaultPropagationRouteTable: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Key-value tags for the EC2 Transit Gateway Route Table.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Identifier of EC2 Transit Gateway.
    */
  val transitGatewayId: js.UndefOr[Input[String]] = js.native
}

object RouteTableState {
  @scala.inline
  def apply(): RouteTableState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteTableState]
  }
  @scala.inline
  implicit class RouteTableStateOps[Self <: RouteTableState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultAssociationRouteTable(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultAssociationRouteTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultAssociationRouteTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultAssociationRouteTable")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultPropagationRouteTable(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPropagationRouteTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultPropagationRouteTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPropagationRouteTable")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
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
    @scala.inline
    def withTransitGatewayId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitGatewayId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitGatewayId")(js.undefined)
        ret
    }
  }
  
}

