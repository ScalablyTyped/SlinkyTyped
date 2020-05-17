package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClientCompute.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetVpnGatewaysScopedList extends js.Object {
  /** [Output Only] List of target vpn gateways contained in this scope. */
  var targetVpnGateways: js.UndefOr[js.Array[TargetVpnGateway]] = js.native
  /** [Output Only] Informational warning which replaces the list of addresses when the list is empty. */
  var warning: js.UndefOr[Code] = js.native
}

object TargetVpnGatewaysScopedList {
  @scala.inline
  def apply(): TargetVpnGatewaysScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetVpnGatewaysScopedList]
  }
  @scala.inline
  implicit class TargetVpnGatewaysScopedListOps[Self <: TargetVpnGatewaysScopedList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargetVpnGateways(value: js.Array[TargetVpnGateway]): Self = {
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
    def withWarning(value: Code): Self = {
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

