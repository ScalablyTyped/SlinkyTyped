package typingsSlinky.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLocation extends js.Object {
  /**
    * The geolocation information associated with the video.
    */
  var location: AnonElevation = js.native
  /**
    * The text description of the location where the video was recorded.
    */
  var locationDescription: String = js.native
  /**
    * The date and time when the video was recorded. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var recordingDate: String = js.native
}

object AnonLocation {
  @scala.inline
  def apply(location: AnonElevation, locationDescription: String, recordingDate: String): AnonLocation = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], locationDescription = locationDescription.asInstanceOf[js.Any], recordingDate = recordingDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLocation]
  }
  @scala.inline
  implicit class AnonLocationOps[Self <: AnonLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocation(value: AnonElevation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocationDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecordingDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordingDate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

