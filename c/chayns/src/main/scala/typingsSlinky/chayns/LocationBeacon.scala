package typingsSlinky.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.getLocationBeacons()
@js.native
trait LocationBeacon extends js.Object {
  var id: Double = js.native
  var latitude: Double = js.native
  var longitude: Double = js.native
  var pushMessage: String = js.native
}

object LocationBeacon {
  @scala.inline
  def apply(id: Double, latitude: Double, longitude: Double, pushMessage: String): LocationBeacon = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], pushMessage = pushMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationBeacon]
  }
  @scala.inline
  implicit class LocationBeaconOps[Self <: LocationBeacon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withLongitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPushMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushMessage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

