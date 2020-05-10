package typingsSlinky.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDirectConnectGatewayResult extends js.Object {
  /**
    * The Direct Connect gateway.
    */
  var directConnectGateway: js.UndefOr[DirectConnectGateway] = js.native
}

object CreateDirectConnectGatewayResult {
  @scala.inline
  def apply(): CreateDirectConnectGatewayResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDirectConnectGatewayResult]
  }
  @scala.inline
  implicit class CreateDirectConnectGatewayResultOps[Self <: CreateDirectConnectGatewayResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectConnectGateway(value: DirectConnectGateway): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directConnectGateway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectConnectGateway: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directConnectGateway")(js.undefined)
        ret
    }
  }
  
}

