package typingsSlinky.fmWebsync.fm.websync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait connectFailureArgs extends baseResponseArgs {
  /**
    * The error generated while completing the request.
    */
  var error: String = js.native
  /**
    * Whether the call to client.connect was triggered by a reconnection after network failure.
    */
  var isReconnect: Boolean = js.native
  /**
    * Whether or not to reconnect automatically after this callback has finished execution.
    */
  var reconnect: Boolean = js.native
}

object connectFailureArgs {
  @scala.inline
  def apply(
    client: client,
    clientId: String,
    error: String,
    isReconnect: Boolean,
    meta: js.Any,
    reconnect: Boolean,
    timestamp: js.Date
  ): connectFailureArgs = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], isReconnect = isReconnect.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], reconnect = reconnect.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[connectFailureArgs]
  }
  @scala.inline
  implicit class connectFailureArgsOps[Self <: connectFailureArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsReconnect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReconnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReconnect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnect")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

