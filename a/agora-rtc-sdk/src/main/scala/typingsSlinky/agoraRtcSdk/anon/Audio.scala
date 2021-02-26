package typingsSlinky.agoraRtcSdk.anon

import typingsSlinky.agoraRtcSdk.agoraRtcSdkStrings.H264
import typingsSlinky.agoraRtcSdk.agoraRtcSdkStrings.OPUS
import typingsSlinky.agoraRtcSdk.agoraRtcSdkStrings.VP8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Audio extends StObject {
  
  var audio: js.Array[OPUS] = js.native
  
  var video: js.Array[VP8 | H264] = js.native
}
object Audio {
  
  @scala.inline
  def apply(audio: js.Array[OPUS], video: js.Array[VP8 | H264]): Audio = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[Audio]
  }
  
  @scala.inline
  implicit class AudioMutableBuilder[Self <: Audio] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudio(value: js.Array[OPUS]): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioVarargs(value: OPUS*): Self = StObject.set(x, "audio", js.Array(value :_*))
    
    @scala.inline
    def setVideo(value: js.Array[VP8 | H264]): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoVarargs(value: (VP8 | H264)*): Self = StObject.set(x, "video", js.Array(value :_*))
  }
}
