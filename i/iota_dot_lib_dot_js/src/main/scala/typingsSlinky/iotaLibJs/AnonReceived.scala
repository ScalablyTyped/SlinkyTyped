package typingsSlinky.iotaLibJs

import typingsSlinky.iotaLibJs.mod.TransactionObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReceived extends js.Object {
  var received: js.Array[TransactionObject] = js.native
  var sent: js.Array[TransactionObject] = js.native
}

object AnonReceived {
  @scala.inline
  def apply(received: js.Array[TransactionObject], sent: js.Array[TransactionObject]): AnonReceived = {
    val __obj = js.Dynamic.literal(received = received.asInstanceOf[js.Any], sent = sent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReceived]
  }
  @scala.inline
  implicit class AnonReceivedOps[Self <: AnonReceived] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReceived(value: js.Array[TransactionObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("received")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSent(value: js.Array[TransactionObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

