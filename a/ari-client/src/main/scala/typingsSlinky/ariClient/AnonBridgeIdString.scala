package typingsSlinky.ariClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBridgeIdString extends js.Object {
  var bridgeId: String = js.native
}

object AnonBridgeIdString {
  @scala.inline
  def apply(bridgeId: String): AnonBridgeIdString = {
    val __obj = js.Dynamic.literal(bridgeId = bridgeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBridgeIdString]
  }
  @scala.inline
  implicit class AnonBridgeIdStringOps[Self <: AnonBridgeIdString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBridgeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bridgeId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

