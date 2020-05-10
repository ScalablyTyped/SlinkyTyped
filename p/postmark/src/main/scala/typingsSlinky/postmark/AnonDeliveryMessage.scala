package typingsSlinky.postmark

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDeliveryMessage extends js.Object {
  var DeliveryMessage: String = js.native
  var DestinationIP: String = js.native
  var DestinationServer: String = js.native
}

object AnonDeliveryMessage {
  @scala.inline
  def apply(DeliveryMessage: String, DestinationIP: String, DestinationServer: String): AnonDeliveryMessage = {
    val __obj = js.Dynamic.literal(DeliveryMessage = DeliveryMessage.asInstanceOf[js.Any], DestinationIP = DestinationIP.asInstanceOf[js.Any], DestinationServer = DestinationServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDeliveryMessage]
  }
  @scala.inline
  implicit class AnonDeliveryMessageOps[Self <: AnonDeliveryMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeliveryMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliveryMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestinationIP(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationIP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestinationServer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationServer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

