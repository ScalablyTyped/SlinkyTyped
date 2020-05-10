package typingsSlinky.instagramPrivateApi.checkpointResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckpointResponseChallenge extends js.Object {
  var api_path: String = js.native
  var hide_webview_header: Boolean = js.native
  var lock: Boolean = js.native
  var logout: Boolean = js.native
  var native_flow: Boolean = js.native
  var url: String = js.native
}

object CheckpointResponseChallenge {
  @scala.inline
  def apply(
    api_path: String,
    hide_webview_header: Boolean,
    lock: Boolean,
    logout: Boolean,
    native_flow: Boolean,
    url: String
  ): CheckpointResponseChallenge = {
    val __obj = js.Dynamic.literal(api_path = api_path.asInstanceOf[js.Any], hide_webview_header = hide_webview_header.asInstanceOf[js.Any], lock = lock.asInstanceOf[js.Any], logout = logout.asInstanceOf[js.Any], native_flow = native_flow.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckpointResponseChallenge]
  }
  @scala.inline
  implicit class CheckpointResponseChallengeOps[Self <: CheckpointResponseChallenge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApi_path(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api_path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHide_webview_header(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide_webview_header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogout(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNative_flow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("native_flow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

