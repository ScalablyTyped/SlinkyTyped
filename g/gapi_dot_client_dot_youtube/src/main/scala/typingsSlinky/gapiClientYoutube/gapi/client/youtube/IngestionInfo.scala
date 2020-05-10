package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IngestionInfo extends js.Object {
  /**
    * The backup ingestion URL that you should use to stream video to YouTube. You have the option of simultaneously streaming the content that you are
    * sending to the ingestionAddress to this URL.
    */
  var backupIngestionAddress: js.UndefOr[String] = js.native
  /**
    * The primary ingestion URL that you should use to stream video to YouTube. You must stream video to this URL.
    *
    * Depending on which application or tool you use to encode your video stream, you may need to enter the stream URL and stream name separately or you may
    * need to concatenate them in the following format:
    *
    * STREAM_URL/STREAM_NAME
    */
  var ingestionAddress: js.UndefOr[String] = js.native
  /** The HTTP or RTMP stream name that YouTube assigns to the video stream. */
  var streamName: js.UndefOr[String] = js.native
}

object IngestionInfo {
  @scala.inline
  def apply(): IngestionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IngestionInfo]
  }
  @scala.inline
  implicit class IngestionInfoOps[Self <: IngestionInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackupIngestionAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backupIngestionAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackupIngestionAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backupIngestionAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withIngestionAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ingestionAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIngestionAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ingestionAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamName")(js.undefined)
        ret
    }
  }
  
}

