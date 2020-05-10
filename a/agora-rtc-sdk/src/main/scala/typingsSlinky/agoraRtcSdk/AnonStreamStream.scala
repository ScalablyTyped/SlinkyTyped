package typingsSlinky.agoraRtcSdk

import typingsSlinky.agoraRtcSdk.mod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonStreamStream extends js.Object {
  /**
    * The stream that adds or removes a track:
    * - `video`: boolean, marks whether the stream contains a video track.
    * - `audio`: boolean, marks whether the stream contains an audio track.
    */
  var stream: Stream = js.native
}

object AnonStreamStream {
  @scala.inline
  def apply(stream: Stream): AnonStreamStream = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStreamStream]
  }
  @scala.inline
  implicit class AnonStreamStreamOps[Self <: AnonStreamStream] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStream(value: Stream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

