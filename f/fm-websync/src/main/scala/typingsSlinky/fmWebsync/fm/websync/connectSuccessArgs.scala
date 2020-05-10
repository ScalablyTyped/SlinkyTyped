package typingsSlinky.fmWebsync.fm.websync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait connectSuccessArgs extends baseResponseArgs {
  /**
    * Whether the call to client.connect was triggered by a reconnection after network failure.
    */
  var isReconnect: Boolean = js.native
}

object connectSuccessArgs {
  @scala.inline
  def apply(client: client, clientId: String, isReconnect: Boolean, meta: js.Any, timestamp: js.Date): connectSuccessArgs = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], isReconnect = isReconnect.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[connectSuccessArgs]
  }
  @scala.inline
  implicit class connectSuccessArgsOps[Self <: connectSuccessArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsReconnect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReconnect")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

