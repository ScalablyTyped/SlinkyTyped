package typingsSlinky.peerjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UtilSupportsObj extends js.Object {
  var audioVideo: Boolean = js.native
  var binaryBlob: Boolean = js.native
  var browser: Boolean = js.native
  var data: Boolean = js.native
  var reliable: Boolean = js.native
  var webRTC: Boolean = js.native
}

object UtilSupportsObj {
  @scala.inline
  def apply(
    audioVideo: Boolean,
    binaryBlob: Boolean,
    browser: Boolean,
    data: Boolean,
    reliable: Boolean,
    webRTC: Boolean
  ): UtilSupportsObj = {
    val __obj = js.Dynamic.literal(audioVideo = audioVideo.asInstanceOf[js.Any], binaryBlob = binaryBlob.asInstanceOf[js.Any], browser = browser.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], reliable = reliable.asInstanceOf[js.Any], webRTC = webRTC.asInstanceOf[js.Any])
    __obj.asInstanceOf[UtilSupportsObj]
  }
  @scala.inline
  implicit class UtilSupportsObjOps[Self <: UtilSupportsObj] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioVideo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioVideo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBinaryBlob(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binaryBlob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrowser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReliable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reliable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebRTC(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webRTC")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

