package typingsSlinky.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddCacheOutput extends js.Object {
  var GatewayARN: js.UndefOr[typingsSlinky.awsDashSdk.clientsStoragegatewayMod.GatewayARN] = js.native
}

object AddCacheOutput {
  @scala.inline
  def apply(GatewayARN: GatewayARN = null): AddCacheOutput = {
    val __obj = js.Dynamic.literal()
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCacheOutput]
  }
}

