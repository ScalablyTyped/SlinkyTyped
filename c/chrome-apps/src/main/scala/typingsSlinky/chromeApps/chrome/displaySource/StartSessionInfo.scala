package typingsSlinky.chromeApps.chrome.displaySource

import typingsSlinky.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartSessionInfo extends js.Object {
  var audioTrack: js.UndefOr[js.Object] = js.native
  var authenticationInfo: js.UndefOr[AuthenticationInfo] = js.native
  var sinkId: integer = js.native
  var videoTrack: js.UndefOr[js.Object] = js.native
}

object StartSessionInfo {
  @scala.inline
  def apply(sinkId: integer): StartSessionInfo = {
    val __obj = js.Dynamic.literal(sinkId = sinkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSessionInfo]
  }
  @scala.inline
  implicit class StartSessionInfoOps[Self <: StartSessionInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSinkId(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sinkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudioTrack(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioTrack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioTrack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioTrack")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthenticationInfo(value: AuthenticationInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticationInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthenticationInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticationInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoTrack(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoTrack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoTrack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoTrack")(js.undefined)
        ret
    }
  }
  
}

