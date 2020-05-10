package typingsSlinky.pulumiAws.routeTableMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteTableArgs extends js.Object {
  /**
    * Key-value tags for the EC2 Transit Gateway Route Table.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Identifier of EC2 Transit Gateway.
    */
  val transitGatewayId: Input[String] = js.native
}

object RouteTableArgs {
  @scala.inline
  def apply(transitGatewayId: Input[String]): RouteTableArgs = {
    val __obj = js.Dynamic.literal(transitGatewayId = transitGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteTableArgs]
  }
  @scala.inline
  implicit class RouteTableArgsOps[Self <: RouteTableArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransitGatewayId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitGatewayId")(value.asInstanceOf[js.Any])
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
  }
  
}

