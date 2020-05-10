package typingsSlinky.gapiClientStreetviewpublish.gapi.client.streetviewpublish

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pose extends js.Object {
  /**
    * Altitude of the pose in meters above ground level (as defined by WGS84).
    * NaN indicates an unmeasured quantity.
    */
  var altitude: js.UndefOr[Double] = js.native
  /**
    * Compass heading, measured at the center of the photo in degrees clockwise
    * from North. Value must be >=0 and <360.
    * NaN indicates an unmeasured quantity.
    */
  var heading: js.UndefOr[Double] = js.native
  /**
    * Latitude and longitude pair of the pose, as explained here:
    * https://cloud.google.com/datastore/docs/reference/rest/Shared.Types/LatLng
    * When creating a Photo, if the
    * latitude and longitude pair are not provided here, the geolocation from the
    * exif header will be used. If the latitude and longitude pair is not
    * provided and cannot be found in the exif header, the create photo process
    * will fail.
    */
  var latLngPair: js.UndefOr[LatLng] = js.native
  /** Level (the floor in a building) used to configure vertical navigation. */
  var level: js.UndefOr[Level] = js.native
  /**
    * Pitch, measured at the center of the photo in degrees. Value must be >=-90
    * and <= 90. A value of -90 means looking directly down, and a value of 90
    * means looking directly up.
    * NaN indicates an unmeasured quantity.
    */
  var pitch: js.UndefOr[Double] = js.native
  /**
    * Roll, measured in degrees. Value must be >= 0 and <360. A value of 0
    * means level with the horizon.
    * NaN indicates an unmeasured quantity.
    */
  var roll: js.UndefOr[Double] = js.native
}

object Pose {
  @scala.inline
  def apply(): Pose = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pose]
  }
  @scala.inline
  implicit class PoseOps[Self <: Pose] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAltitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altitude")(js.undefined)
        ret
    }
    @scala.inline
    def withHeading(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heading")(js.undefined)
        ret
    }
    @scala.inline
    def withLatLngPair(value: LatLng): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latLngPair")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatLngPair: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latLngPair")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel(value: Level): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
        ret
    }
    @scala.inline
    def withPitch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPitch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitch")(js.undefined)
        ret
    }
    @scala.inline
    def withRoll(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roll")(js.undefined)
        ret
    }
  }
  
}

