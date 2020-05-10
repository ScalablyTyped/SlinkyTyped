package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCoipPoolUsageResult extends js.Object {
  /**
    * Information about the address usage.
    */
  var CoipAddressUsages: js.UndefOr[CoipAddressUsageSet] = js.native
  /**
    * The ID of the customer-owned address pool.
    */
  var CoipPoolId: js.UndefOr[String] = js.native
  /**
    * The ID of the local gateway route table.
    */
  var LocalGatewayRouteTableId: js.UndefOr[String] = js.native
}

object GetCoipPoolUsageResult {
  @scala.inline
  def apply(): GetCoipPoolUsageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCoipPoolUsageResult]
  }
  @scala.inline
  implicit class GetCoipPoolUsageResultOps[Self <: GetCoipPoolUsageResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoipAddressUsages(value: CoipAddressUsageSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CoipAddressUsages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoipAddressUsages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CoipAddressUsages")(js.undefined)
        ret
    }
    @scala.inline
    def withCoipPoolId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CoipPoolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoipPoolId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CoipPoolId")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalGatewayRouteTableId(value: String): Self = {
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
  }
  
}

