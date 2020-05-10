package typingsSlinky.geolib

import typingsSlinky.geolib.typesMod.GeolibInputLongitude
import typingsSlinky.geolib.typesMod.GeolibLongitudeInputValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLng extends GeolibInputLongitude {
  var lng: GeolibLongitudeInputValue = js.native
}

object AnonLng {
  @scala.inline
  def apply(lng: GeolibLongitudeInputValue): AnonLng = {
    val __obj = js.Dynamic.literal(lng = lng.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLng]
  }
  @scala.inline
  implicit class AnonLngOps[Self <: AnonLng] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLng(value: GeolibLongitudeInputValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lng")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

