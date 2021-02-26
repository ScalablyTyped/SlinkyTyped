package typingsSlinky.agoraRtcSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamStream extends StObject {
  
  /**
    * The stream that adds or removes a track:
    * - `video`: boolean, marks whether the stream contains a video track.
    * - `audio`: boolean, marks whether the stream contains an audio track.
    */
  var stream: typingsSlinky.agoraRtcSdk.mod.Stream = js.native
}
object StreamStream {
  
  @scala.inline
  def apply(stream: typingsSlinky.agoraRtcSdk.mod.Stream): StreamStream = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamStream]
  }
  
  @scala.inline
  implicit class StreamStreamMutableBuilder[Self <: StreamStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStream(value: typingsSlinky.agoraRtcSdk.mod.Stream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
  }
}
