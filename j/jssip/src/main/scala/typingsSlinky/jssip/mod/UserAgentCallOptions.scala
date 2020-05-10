package typingsSlinky.jssip.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.experimental.mediastream.MediaStream
import org.scalajs.dom.experimental.mediastream.MediaStreamConstraints
import org.scalajs.dom.experimental.webrtc.RTCConfiguration
import org.scalajs.dom.experimental.webrtc.RTCOfferOptions
import typingsSlinky.std.RTCAnswerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserAgentCallOptions extends js.Object {
  var anonymous: js.UndefOr[Boolean] = js.native
  var eventHandlers: js.UndefOr[StringDictionary[js.Function1[/* data */ js.Any, Unit]]] = js.native
  var extraHeaders: js.UndefOr[js.Array[String]] = js.native
  var mediaConstraints: js.UndefOr[MediaStreamConstraints] = js.native
  var mediaStream: js.UndefOr[MediaStream] = js.native
  var pcConfig: js.UndefOr[RTCConfiguration] = js.native
  var rtcAnswerConstraints: js.UndefOr[RTCAnswerOptions] = js.native
  var rtcConstraints: js.UndefOr[js.Any] = js.native
  var rtcOfferConstraints: js.UndefOr[RTCOfferOptions] = js.native
  var sessionTimersExpires: js.UndefOr[Double] = js.native
}

object UserAgentCallOptions {
  @scala.inline
  def apply(): UserAgentCallOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserAgentCallOptions]
  }
  @scala.inline
  implicit class UserAgentCallOptionsOps[Self <: UserAgentCallOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnonymous(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anonymous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnonymous: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anonymous")(js.undefined)
        ret
    }
    @scala.inline
    def withEventHandlers(value: StringDictionary[js.Function1[/* data */ js.Any, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventHandlers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventHandlers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventHandlers")(js.undefined)
        ret
    }
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
    def withMediaConstraints(value: MediaStreamConstraints): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaConstraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaConstraints")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaStream(value: MediaStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaStream")(js.undefined)
        ret
    }
    @scala.inline
    def withPcConfig(value: RTCConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pcConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPcConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pcConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withRtcAnswerConstraints(value: RTCAnswerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtcAnswerConstraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRtcAnswerConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtcAnswerConstraints")(js.undefined)
        ret
    }
    @scala.inline
    def withRtcConstraints(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtcConstraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRtcConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtcConstraints")(js.undefined)
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
    def withSessionTimersExpires(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionTimersExpires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionTimersExpires: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionTimersExpires")(js.undefined)
        ret
    }
  }
  
}

