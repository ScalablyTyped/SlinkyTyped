package typingsSlinky.firebaseAdmin.admin.messaging

import typingsSlinky.firebaseAdmin.BaseMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MulticastMessage extends BaseMessage {
  var tokens: js.Array[String] = js.native
}

object MulticastMessage {
  @scala.inline
  def apply(tokens: js.Array[String]): MulticastMessage = {
    val __obj = js.Dynamic.literal(tokens = tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[MulticastMessage]
  }
  @scala.inline
  implicit class MulticastMessageOps[Self <: MulticastMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTokens(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokens")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

