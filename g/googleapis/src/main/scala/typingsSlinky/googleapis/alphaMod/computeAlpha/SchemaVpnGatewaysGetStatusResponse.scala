package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaVpnGatewaysGetStatusResponse extends js.Object {
  var result: js.UndefOr[SchemaVpnGatewayStatus] = js.native
}

object SchemaVpnGatewaysGetStatusResponse {
  @scala.inline
  def apply(): SchemaVpnGatewaysGetStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVpnGatewaysGetStatusResponse]
  }
  @scala.inline
  implicit class SchemaVpnGatewaysGetStatusResponseOps[Self <: SchemaVpnGatewaysGetStatusResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResult(value: SchemaVpnGatewayStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(js.undefined)
        ret
    }
  }
  
}

