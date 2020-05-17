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
  var url: js.UndefOr[String] = js.native
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
    def withGroovyCompatibility(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groovyCompatibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroovyCompatibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groovyCompatibility")(js.undefined)
        ret
    }
    @scala.inline
    def withTransportLibraryRTCPeerConnection(value: RTCPeerConnection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportLibrary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransportLibrary(value: websocket | socketDotio | RTCPeerConnection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportLibrary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransportLibrary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportLibrary")(js.undefined)
        ret
    }
    @scala.inline
    def withTransportOptions(value: RTCDataChannelInit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransportOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

