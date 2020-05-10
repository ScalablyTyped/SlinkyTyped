package typingsSlinky.fmWebsync.fm.websync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait streamFailureArgs extends baseResponseArgs {
  /**
    * The error generated while completing the request.
    */
  var error: String = js.native
  /**
    * Whether the client will automatically reconnect after the callback returns.
    */
  var willReconnect: Boolean = js.native
}

object streamFailureArgs {
  @scala.inline
  def apply(
    client: client,
    clientId: String,
    error: String,
    meta: js.Any,
    timestamp: js.Date,
    willReconnect: Boolean
  ): streamFailureArgs = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], willReconnect = willReconnect.asInstanceOf[js.Any])
    __obj.asInstanceOf[streamFailureArgs]
  }
  @scala.inline
  implicit class streamFailureArgsOps[Self <: streamFailureArgs] (val x: Self) extends AnyVal {
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
    def withWillReconnect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("willReconnect")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

