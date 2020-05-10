package typingsSlinky.geolib

import typingsSlinky.geolib.typesMod.GeolibInputLongitude
import typingsSlinky.geolib.typesMod.GeolibLongitudeInputValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLon extends GeolibInputLongitude {
  var lon: GeolibLongitudeInputValue = js.native
}

object AnonLon {
  @scala.inline
  def apply(lon: GeolibLongitudeInputValue): AnonLon = {
    val __obj = js.Dynamic.literal(lon = lon.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLon]
  }
  @scala.inline
  implicit class AnonLonOps[Self <: AnonLon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLon(value: GeolibLongitudeInputValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lon")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

