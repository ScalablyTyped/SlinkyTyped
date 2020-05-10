package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRouteTableResult extends js.Object {
  /**
    * Information about the route table.
    */
  var RouteTable: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.RouteTable] = js.native
}

object CreateRouteTableResult {
  @scala.inline
  def apply(): CreateRouteTableResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRouteTableResult]
  }
  @scala.inline
  implicit class CreateRouteTableResultOps[Self <: CreateRouteTableResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRouteTable(value: RouteTable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RouteTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRouteTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RouteTable")(js.undefined)
        ret
    }
  }
  
}

