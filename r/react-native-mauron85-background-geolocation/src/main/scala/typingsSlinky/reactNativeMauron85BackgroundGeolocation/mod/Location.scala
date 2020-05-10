package typingsSlinky.reactNativeMauron85BackgroundGeolocation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Location extends js.Object {
  /** Estimated accuracy of this location, in meters. */
  var accuracy: Double = js.native
  /** Altitude if available, in meters above the WGS 84 reference ellipsoid. */
  var altitude: Double = js.native
  /** Bearing, in degrees. */
  var bearing: Double = js.native
  /** ID of location as stored in DB (or null) */
  var id: Double = js.native
  /**
    * True if location was recorded by mock provider. (ANDROID ONLY)
    *
    * Note: this property is not enabled by default!
    * You can enable it "postTemplate" configure option.
    */
  var isFromMockProvider: js.UndefOr[Boolean] = js.native
  /** Latitude, in degrees. */
  var latitude: Double = js.native
  /** Configured location provider. */
  var locationProvider: Double = js.native
  /** Longitude, in degrees. */
  var longitude: Double = js.native
  /**
    * True if device has mock locations enabled. (ANDROID ONLY)
    *
    * Note: this property is not enabled by default!
    * You can enable it "postTemplate" configure option.
    */
  var mockLocationsEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Native provider reponsible for location.
    *
    * Possible values:
    * "gps", "network", "passive" or "fused"
    */
  var provider: NativeProvider = js.native
  /**
    * Speed if it is available, in meters/second over ground.
    *
    * Note: Not all providers are capable of providing speed.
    * Typically network providers are not able to do so.
    */
  var speed: Double = js.native
  /** UTC time of this fix, in milliseconds since January 1, 1970. */
  var time: Double = js.native
}

object Location {
  @scala.inline
  def apply(
    accuracy: Double,
    altitude: Double,
    bearing: Double,
    id: Double,
    latitude: Double,
    locationProvider: Double,
    longitude: Double,
    provider: NativeProvider,
    speed: Double,
    time: Double
  ): Location = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], altitude = altitude.asInstanceOf[js.Any], bearing = bearing.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], locationProvider = locationProvider.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
  @scala.inline
  implicit class LocationOps[Self <: Location] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccuracy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accuracy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAltitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBearing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bearing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocationProvider(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvider(value: NativeProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFromMockProvider(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFromMockProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFromMockProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFromMockProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withMockLocationsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mockLocationsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMockLocationsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mockLocationsEnabled")(js.undefined)
        ret
    }
  }
  
}

