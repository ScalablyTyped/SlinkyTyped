package typingsSlinky.facebookJsSdk.facebook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveDialogResponse extends DialogResponse {
  var id: String = js.native
  var secure_stream_url: String = js.native
  var status: String = js.native
  var stream_url: String = js.native
}

object LiveDialogResponse {
  @scala.inline
  def apply(id: String, secure_stream_url: String, status: String, stream_url: String): LiveDialogResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], secure_stream_url = secure_stream_url.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], stream_url = stream_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveDialogResponse]
  }
  @scala.inline
  implicit class LiveDialogResponseOps[Self <: LiveDialogResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecure_stream_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure_stream_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStream_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream_url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

