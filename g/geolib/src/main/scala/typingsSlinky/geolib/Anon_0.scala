package typingsSlinky.geolib

import typingsSlinky.geolib.esTypesMod.AltitudeKeys
import typingsSlinky.geolib.geolibNumbers.`0`
import typingsSlinky.geolib.geolibNumbers.`1`
import typingsSlinky.geolib.geolibStrings.lat
import typingsSlinky.geolib.geolibStrings.latitude
import typingsSlinky.geolib.geolibStrings.lng
import typingsSlinky.geolib.geolibStrings.lon
import typingsSlinky.geolib.geolibStrings.longitude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_0 extends js.Object {
  var altitude: AltitudeKeys
  var latitude: js.UndefOr[lat | typingsSlinky.geolib.geolibStrings.latitude | `1`] = js.undefined
  var longitude: js.UndefOr[`0` | lng | lon | typingsSlinky.geolib.geolibStrings.longitude] = js.undefined
}

object Anon_0 {
  @scala.inline
  def apply(
    altitude: AltitudeKeys,
    latitude: lat | latitude | `1` = null,
    longitude: `0` | lng | lon | longitude = null
  ): Anon_0 = {
    val __obj = js.Dynamic.literal(altitude = altitude.asInstanceOf[js.Any])
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_0]
  }
}

