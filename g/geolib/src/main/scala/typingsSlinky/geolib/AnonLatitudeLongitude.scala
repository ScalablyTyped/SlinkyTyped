package typingsSlinky.geolib

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

@js.native
trait AnonLatitudeLongitude extends js.Object {
  var latitude: js.UndefOr[lat | typingsSlinky.geolib.geolibStrings.latitude | `1`] = js.native
  var longitude: js.UndefOr[`0` | lng | lon | typingsSlinky.geolib.geolibStrings.longitude] = js.native
}

object AnonLatitudeLongitude {
  @scala.inline
  def apply(): AnonLatitudeLongitude = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonLatitudeLongitude]
  }
  @scala.inline
  implicit class AnonLatitudeLongitudeOps[Self <: AnonLatitudeLongitude] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLatitude(value: lat | latitude | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latitude")(js.undefined)
        ret
    }
    @scala.inline
    def withLongitude(value: `0` | lng | lon | longitude): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longitude")(js.undefined)
        ret
    }
  }
  
}

