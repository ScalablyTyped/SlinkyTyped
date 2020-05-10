package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoipPool extends js.Object {
  /**
    * The ID of the local gateway route table.
    */
  var LocalGatewayRouteTableId: js.UndefOr[LocalGatewayRoutetableId] = js.native
  /**
    * The address ranges of the address pool.
    */
  var PoolCidrs: js.UndefOr[ValueStringList] = js.native
  /**
    * The ID of the address pool.
    */
  var PoolId: js.UndefOr[CoipPoolId] = js.native
  /**
    * The tags.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CoipPool {
  @scala.inline
  def apply(): CoipPool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoipPool]
  }
  @scala.inline
  implicit class CoipPoolOps[Self <: CoipPool] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocalGatewayRouteTableId(value: LocalGatewayRoutetableId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalGatewayRouteTableId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalGatewayRouteTableId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalGatewayRouteTableId")(js.undefined)
        ret
    }
    @scala.inline
    def withPoolCidrs(value: ValueStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PoolCidrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoolCidrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PoolCidrs")(js.undefined)
        ret
    }
    @scala.inline
    def withPoolId(value: CoipPoolId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PoolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoolId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PoolId")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

