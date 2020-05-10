package typingsSlinky.googleapis.computeV1Mod.computeV1

import typingsSlinky.googleapis.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTargetVpnGatewaysScopedList extends js.Object {
  /**
    * [Output Only] A list of target VPN gateways contained in this scope.
    */
  var targetVpnGateways: js.UndefOr[js.Array[SchemaTargetVpnGateway]] = js.native
  /**
    * [Output Only] Informational warning which replaces the list of addresses
    * when the list is empty.
    */
  var warning: js.UndefOr[AnonCode] = js.native
}

object SchemaTargetVpnGatewaysScopedList {
  @scala.inline
  def apply(): SchemaTargetVpnGatewaysScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetVpnGatewaysScopedList]
  }
  @scala.inline
  implicit class SchemaTargetVpnGatewaysScopedListOps[Self <: SchemaTargetVpnGatewaysScopedList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargetVpnGateways(value: js.Array[SchemaTargetVpnGateway]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetVpnGateways")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetVpnGateways: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetVpnGateways")(js.undefined)
        ret
    }
    @scala.inline
    def withWarning(value: AnonCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(js.undefined)
        ret
    }
  }
  
}

