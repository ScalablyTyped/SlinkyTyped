package typingsSlinky.jssip.mod

import org.scalajs.dom.experimental.webrtc.RTCOfferOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionRenegotiateOptions extends js.Object {
  var extraHeaders: js.UndefOr[js.Array[String]] = js.native
  var rtcOfferConstraints: js.UndefOr[RTCOfferOptions] = js.native
  var useUpdate: js.UndefOr[Boolean] = js.native
}

object SessionRenegotiateOptions {
  @scala.inline
  def apply(): SessionRenegotiateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionRenegotiateOptions]
  }
  @scala.inline
  implicit class SessionRenegotiateOptionsOps[Self <: SessionRenegotiateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtraHeaders(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withRtcOfferConstraints(value: RTCOfferOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtcOfferConstraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRtcOfferConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtcOfferConstraints")(js.undefined)
        ret
    }
    @scala.inline
    def withUseUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useUpdate")(js.undefined)
        ret
    }
  }
  
}

