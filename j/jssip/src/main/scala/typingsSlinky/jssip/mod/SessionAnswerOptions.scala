package typingsSlinky.jssip.mod

import org.scalajs.dom.experimental.mediastream.MediaStream
import org.scalajs.dom.experimental.mediastream.MediaStreamConstraints
import org.scalajs.dom.experimental.webrtc.RTCConfiguration
import org.scalajs.dom.experimental.webrtc.RTCOfferOptions
import typingsSlinky.std.RTCAnswerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionAnswerOptions extends js.Object {
  
  var extraHeaders: js.UndefOr[js.Array[String]] = js.native
  
  var mediaConstraints: js.UndefOr[MediaStreamConstraints] = js.native
  
  var mediaStream: js.UndefOr[MediaStream] = js.native
  
  var pcConfig: js.UndefOr[RTCConfiguration] = js.native
  
  var rtcAnswerConstraints: js.UndefOr[RTCAnswerOptions] = js.native
  
  var rtcConstraints: js.UndefOr[js.Any] = js.native
  
  var rtcOfferConstraints: js.UndefOr[RTCOfferOptions] = js.native
  
  var sessionTimersExpires: js.UndefOr[Double] = js.native
}
object SessionAnswerOptions {
  
  @scala.inline
  def apply(): SessionAnswerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionAnswerOptions]
  }
  
  @scala.inline
  implicit class SessionAnswerOptionsOps[Self <: SessionAnswerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExtraHeadersVarargs(value: String*): Self = this.set("extraHeaders", js.Array(value :_*))
    
    @scala.inline
    def setExtraHeaders(value: js.Array[String]): Self = this.set("extraHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraHeaders: Self = this.set("extraHeaders", js.undefined)
    
    @scala.inline
    def setMediaConstraints(value: MediaStreamConstraints): Self = this.set("mediaConstraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaConstraints: Self = this.set("mediaConstraints", js.undefined)
    
    @scala.inline
    def setMediaStream(value: MediaStream): Self = this.set("mediaStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaStream: Self = this.set("mediaStream", js.undefined)
    
    @scala.inline
    def setPcConfig(value: RTCConfiguration): Self = this.set("pcConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePcConfig: Self = this.set("pcConfig", js.undefined)
    
    @scala.inline
    def setRtcAnswerConstraints(value: RTCAnswerOptions): Self = this.set("rtcAnswerConstraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRtcAnswerConstraints: Self = this.set("rtcAnswerConstraints", js.undefined)
    
    @scala.inline
    def setRtcConstraints(value: js.Any): Self = this.set("rtcConstraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRtcConstraints: Self = this.set("rtcConstraints", js.undefined)
    
    @scala.inline
    def setRtcOfferConstraints(value: RTCOfferOptions): Self = this.set("rtcOfferConstraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRtcOfferConstraints: Self = this.set("rtcOfferConstraints", js.undefined)
    
    @scala.inline
    def setSessionTimersExpires(value: Double): Self = this.set("sessionTimersExpires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionTimersExpires: Self = this.set("sessionTimersExpires", js.undefined)
  }
}
