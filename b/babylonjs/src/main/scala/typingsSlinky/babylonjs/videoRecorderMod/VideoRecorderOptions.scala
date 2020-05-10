package typingsSlinky.babylonjs.videoRecorderMod

import org.scalajs.dom.experimental.mediastream.MediaStreamTrack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoRecorderOptions extends js.Object {
  /** The audio tracks to attach to the recording. */
  var audioTracks: js.UndefOr[js.Array[MediaStreamTrack]] = js.native
  /** Defines the FPS the video should be recorded at. */
  var fps: Double = js.native
  /** Defines the mime type of the video. */
  var mimeType: String = js.native
  /** Defines the chunk size for the recording data. */
  var recordChunckSize: Double = js.native
}

object VideoRecorderOptions {
  @scala.inline
  def apply(fps: Double, mimeType: String, recordChunckSize: Double): VideoRecorderOptions = {
    val __obj = js.Dynamic.literal(fps = fps.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], recordChunckSize = recordChunckSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoRecorderOptions]
  }
  @scala.inline
  implicit class VideoRecorderOptionsOps[Self <: VideoRecorderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMimeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecordChunckSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordChunckSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudioTracks(value: js.Array[MediaStreamTrack]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioTracks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioTracks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioTracks")(js.undefined)
        ret
    }
  }
  
}

