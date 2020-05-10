package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes original video file properties, including technical details about
  * audio and video streams, but also metadata information like content length,
  * digitization time, or geotagging information.
  */
@js.native
trait SchemaVideoFileDetails extends js.Object {
  /**
    * A list of audio streams contained in the uploaded video file. Each item
    * in the list contains detailed metadata about an audio stream.
    */
  var audioStreams: js.UndefOr[js.Array[SchemaVideoFileDetailsAudioStream]] = js.native
  /**
    * The uploaded video file&#39;s combined (video and audio) bitrate in bits
    * per second.
    */
  var bitrateBps: js.UndefOr[String] = js.native
  /**
    * The uploaded video file&#39;s container format.
    */
  var container: js.UndefOr[String] = js.native
  /**
    * The date and time when the uploaded video file was created. The value is
    * specified in ISO 8601 format. Currently, the following ISO 8601 formats
    * are supported:   - Date only: YYYY-MM-DD  - Naive time:
    * YYYY-MM-DDTHH:MM:SS  - Time with timezone: YYYY-MM-DDTHH:MM:SS+HH:MM
    */
  var creationTime: js.UndefOr[String] = js.native
  /**
    * The length of the uploaded video in milliseconds.
    */
  var durationMs: js.UndefOr[String] = js.native
  /**
    * The uploaded file&#39;s name. This field is present whether a video file
    * or another type of file was uploaded.
    */
  var fileName: js.UndefOr[String] = js.native
  /**
    * The uploaded file&#39;s size in bytes. This field is present whether a
    * video file or another type of file was uploaded.
    */
  var fileSize: js.UndefOr[String] = js.native
  /**
    * The uploaded file&#39;s type as detected by YouTube&#39;s video
    * processing engine. Currently, YouTube only processes video files, but
    * this field is present whether a video file or another type of file was
    * uploaded.
    */
  var fileType: js.UndefOr[String] = js.native
  /**
    * A list of video streams contained in the uploaded video file. Each item
    * in the list contains detailed metadata about a video stream.
    */
  var videoStreams: js.UndefOr[js.Array[SchemaVideoFileDetailsVideoStream]] = js.native
}

object SchemaVideoFileDetails {
  @scala.inline
  def apply(): SchemaVideoFileDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoFileDetails]
  }
  @scala.inline
  implicit class SchemaVideoFileDetailsOps[Self <: SchemaVideoFileDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioStreams(value: js.Array[SchemaVideoFileDetailsAudioStream]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioStreams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioStreams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioStreams")(js.undefined)
        ret
    }
    @scala.inline
    def withBitrateBps(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitrateBps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBitrateBps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitrateBps")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDurationMs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationMs")(js.undefined)
        ret
    }
    @scala.inline
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(js.undefined)
        ret
    }
    @scala.inline
    def withFileSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFileType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileType")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoStreams(value: js.Array[SchemaVideoFileDetailsVideoStream]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoStreams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoStreams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoStreams")(js.undefined)
        ret
    }
  }
  
}

