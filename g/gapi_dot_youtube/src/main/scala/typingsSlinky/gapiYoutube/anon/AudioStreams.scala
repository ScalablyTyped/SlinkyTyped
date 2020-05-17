package typingsSlinky.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioStreams extends js.Object {
  /**
    * A list of audio streams contained in the uploaded video file. Each item in the list contains detailed metadata about an audio stream.
    */
  var audioStreams: js.Array[BitrateBps] = js.native
  /**
    * The uploaded video files combined (video and audio) bitrate in bits per second.
    */
  var bitrateBps: Double = js.native
  /**
    * The uploaded video files container format.
    */
  var container: String = js.native
  /**
    * The date and time when the uploaded video file was created. The value is specified in ISO 8601 format. Currently, the following ISO 8601 formats are supported:
    */
  var creationTime: String = js.native
  /**
    * The length of the uploaded video in milliseconds.
    */
  var durationMs: Double = js.native
  /**
    * The uploaded files name. This field is present whether a video file or another type of file was uploaded.
    */
  var fileName: String = js.native
  /**
    * The uploaded files size in bytes. This field is present whether a video file or another type of file was uploaded.
    */
  var fileSize: Double = js.native
  /**
    * The uploaded files type as detected by YouTubes video processing engine. Currently, YouTube only processes video files, but this field is present whether a video file or another type of file was uploaded.
    */
  var fileType: String = js.native
  /**
    * Geographic coordinates that identify the place where the uploaded video was recorded. Coordinates are defined using WGS 84.
    */
  var recordingLocation: Elevation = js.native
  /**
    * A list of video streams contained in the uploaded video file. Each item in the list contains detailed metadata about a video stream.
    */
  var videoStreams: js.Array[AspectRatio] = js.native
}

object AudioStreams {
  @scala.inline
  def apply(
    audioStreams: js.Array[BitrateBps],
    bitrateBps: Double,
    container: String,
    creationTime: String,
    durationMs: Double,
    fileName: String,
    fileSize: Double,
    fileType: String,
    recordingLocation: Elevation,
    videoStreams: js.Array[AspectRatio]
  ): AudioStreams = {
    val __obj = js.Dynamic.literal(audioStreams = audioStreams.asInstanceOf[js.Any], bitrateBps = bitrateBps.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], creationTime = creationTime.asInstanceOf[js.Any], durationMs = durationMs.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], fileType = fileType.asInstanceOf[js.Any], recordingLocation = recordingLocation.asInstanceOf[js.Any], videoStreams = videoStreams.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioStreams]
  }
  @scala.inline
  implicit class AudioStreamsOps[Self <: AudioStreams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioStreams(value: js.Array[BitrateBps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioStreams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBitrateBps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitrateBps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreationTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDurationMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecordingLocation(value: Elevation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordingLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideoStreams(value: js.Array[AspectRatio]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoStreams")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

