package typingsSlinky.geolib

import typingsSlinky.geolib.typesMod.GeolibInputLatitude
import typingsSlinky.geolib.typesMod.GeolibLatitudeInputValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLatitudeGeolibLatitudeInputValue extends GeolibInputLatitude {
  var latitude: GeolibLatitudeInputValue = js.native
}

object AnonLatitudeGeolibLatitudeInputValue {
  @scala.inline
  def apply(latitude: GeolibLatitudeInputValue): AnonLatitudeGeolibLatitudeInputValue = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLatitudeGeolibLatitudeInputValue]
  }
  @scala.inline
  implicit class AnonLatitudeGeolibLatitudeInputValueOps[Self <: AnonLatitudeGeolibLatitudeInputValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLatitude(value: GeolibLatitudeInputValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latitude")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

