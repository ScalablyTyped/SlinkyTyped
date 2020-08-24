package typingsSlinky.roslib.anon

import org.scalajs.dom.experimental.webrtc.RTCDataChannelInit
import org.scalajs.dom.experimental.webrtc.RTCPeerConnection
import typingsSlinky.roslib.roslibStrings.socketDotio
import typingsSlinky.roslib.roslibStrings.websocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroovyCompatibility extends js.Object {
  var groovyCompatibility: js.UndefOr[Boolean] = js.native
  var transportLibrary: js.UndefOr[websocket | socketDotio | RTCPeerConnection] = js.native
  var transportOptions: js.UndefOr[RTCDataChannelInit] = js.native
  var url: js.UndefOr[java.lang.String] = js.native
}

object GroovyCompatibility {
  @scala.inline
  def apply(): GroovyCompatibility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroovyCompatibility]
  }
  @scala.inline
  implicit class GroovyCompatibilityOps[Self <: GroovyCompatibility] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGroovyCompatibility(value: Boolean): Self = this.set("groovyCompatibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroovyCompatibility: Self = this.set("groovyCompatibility", js.undefined)
    @scala.inline
    def setTransportLibraryRTCPeerConnection(value: RTCPeerConnection): Self = this.set("transportLibrary", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransportLibrary(value: websocket | socketDotio | RTCPeerConnection): Self = this.set("transportLibrary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransportLibrary: Self = this.set("transportLibrary", js.undefined)
    @scala.inline
    def setTransportOptions(value: RTCDataChannelInit): Self = this.set("transportOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransportOptions: Self = this.set("transportOptions", js.undefined)
    @scala.inline
    def setUrl(value: java.lang.String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

