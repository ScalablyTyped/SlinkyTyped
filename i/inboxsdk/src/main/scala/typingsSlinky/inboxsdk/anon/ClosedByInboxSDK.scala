package typingsSlinky.inboxsdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClosedByInboxSDK extends js.Object {
  var closedByInboxSDK: Boolean = js.native
  var messageID: String = js.native
}

object ClosedByInboxSDK {
  @scala.inline
  def apply(closedByInboxSDK: Boolean, messageID: String): ClosedByInboxSDK = {
    val __obj = js.Dynamic.literal(closedByInboxSDK = closedByInboxSDK.asInstanceOf[js.Any], messageID = messageID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClosedByInboxSDK]
  }
  @scala.inline
  implicit class ClosedByInboxSDKOps[Self <: ClosedByInboxSDK] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClosedByInboxSDK(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closedByInboxSDK")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageID")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

