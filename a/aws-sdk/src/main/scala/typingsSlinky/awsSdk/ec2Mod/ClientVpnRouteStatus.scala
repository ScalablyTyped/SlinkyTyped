package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientVpnRouteStatus extends js.Object {
  /**
    * The state of the Client VPN endpoint route.
    */
  var Code: js.UndefOr[ClientVpnRouteStatusCode] = js.native
  /**
    * A message about the status of the Client VPN endpoint route, if applicable.
    */
  var Message: js.UndefOr[String] = js.native
}

object ClientVpnRouteStatus {
  @scala.inline
  def apply(): ClientVpnRouteStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientVpnRouteStatus]
  }
  @scala.inline
  implicit class ClientVpnRouteStatusOps[Self <: ClientVpnRouteStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: ClientVpnRouteStatusCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Code")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(js.undefined)
        ret
    }
  }
  
}

