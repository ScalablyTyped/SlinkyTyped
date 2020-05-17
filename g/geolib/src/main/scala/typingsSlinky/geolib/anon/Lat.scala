package typingsSlinky.geolib.anon

import typingsSlinky.geolib.typesMod.GeolibInputLatitude
import typingsSlinky.geolib.typesMod.GeolibLatitudeInputValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lat extends GeolibInputLatitude {
  var lat: GeolibLatitudeInputValue = js.native
}

object Lat {
  @scala.inline
  def apply(lat: GeolibLatitudeInputValue): Lat = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lat]
  }
  @scala.inline
  implicit class LatOps[Self <: Lat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLat(value: GeolibLatitudeInputValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lat")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

