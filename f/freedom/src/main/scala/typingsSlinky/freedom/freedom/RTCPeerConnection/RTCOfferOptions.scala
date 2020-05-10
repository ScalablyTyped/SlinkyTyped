package typingsSlinky.freedom.freedom.RTCPeerConnection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCOfferOptions extends js.Object {
  var iceRestart: js.UndefOr[Boolean] = js.native
  var offerToReceiveAudio: js.UndefOr[Double] = js.native
  var offerToReceiveVideo: js.UndefOr[Double] = js.native
  var voiceActivityDetection: js.UndefOr[Boolean] = js.native
}

object RTCOfferOptions {
  @scala.inline
  def apply(): RTCOfferOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCOfferOptions]
  }
  @scala.inline
  implicit class RTCOfferOptionsOps[Self <: RTCOfferOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIceRestart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iceRestart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIceRestart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iceRestart")(js.undefined)
        ret
    }
    @scala.inline
    def withOfferToReceiveAudio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offerToReceiveAudio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfferToReceiveAudio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offerToReceiveAudio")(js.undefined)
        ret
    }
    @scala.inline
    def withOfferToReceiveVideo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offerToReceiveVideo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfferToReceiveVideo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offerToReceiveVideo")(js.undefined)
        ret
    }
    @scala.inline
    def withVoiceActivityDetection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voiceActivityDetection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVoiceActivityDetection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voiceActivityDetection")(js.undefined)
        ret
    }
  }
  
}

