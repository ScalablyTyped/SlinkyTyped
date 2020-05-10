package typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoRecordingDetails extends js.Object {
  var location: js.UndefOr[GeoPoint] = js.native
  var locationDescription: js.UndefOr[String] = js.native
  var recordingDate: js.UndefOr[String] = js.native
}

object VideoRecordingDetails {
  @scala.inline
  def apply(): VideoRecordingDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoRecordingDetails]
  }
  @scala.inline
  implicit class VideoRecordingDetailsOps[Self <: VideoRecordingDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocation(value: GeoPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordingDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordingDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordingDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordingDate")(js.undefined)
        ret
    }
  }
  
}

