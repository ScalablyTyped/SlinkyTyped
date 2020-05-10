package typingsSlinky.jpushReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMessageID extends js.Object {
  var messageID: String = js.native
}

object AnonMessageID {
  @scala.inline
  def apply(messageID: String): AnonMessageID = {
    val __obj = js.Dynamic.literal(messageID = messageID.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMessageID]
  }
  @scala.inline
  implicit class AnonMessageIDOps[Self <: AnonMessageID] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessageID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageID")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

