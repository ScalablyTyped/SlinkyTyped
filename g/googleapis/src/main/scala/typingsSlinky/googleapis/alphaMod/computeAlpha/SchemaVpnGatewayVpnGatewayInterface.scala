package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A VPN gateway interface.
  */
@js.native
trait SchemaVpnGatewayVpnGatewayInterface extends js.Object {
  /**
    * The numeric ID of this VPN gateway interface.
    */
  var id: js.UndefOr[Double] = js.native
  /**
    * The external IP address for this VPN gateway interface.
    */
  var ipAddress: js.UndefOr[String] = js.native
}

object SchemaVpnGatewayVpnGatewayInterface {
  @scala.inline
  def apply(): SchemaVpnGatewayVpnGatewayInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVpnGatewayVpnGatewayInterface]
  }
  @scala.inline
  implicit class SchemaVpnGatewayVpnGatewayInterfaceOps[Self <: SchemaVpnGatewayVpnGatewayInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: Double): Self = {
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
    def withIpAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddress")(js.undefined)
        ret
    }
  }
  
}

