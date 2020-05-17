package typingsSlinky.geolib.anon

import typingsSlinky.geolib.typesMod.GeolibInputLatitude
import typingsSlinky.geolib.typesMod.GeolibLatitudeInputValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LatitudeGeolibLatitudeInputValue extends GeolibInputLatitude {
  var latitude: GeolibLatitudeInputValue = js.native
}

object LatitudeGeolibLatitudeInputValue {
  @scala.inline
  def apply(latitude: GeolibLatitudeInputValue): LatitudeGeolibLatitudeInputValue = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[LatitudeGeolibLatitudeInputValue]
  }
  @scala.inline
  implicit class LatitudeGeolibLatitudeInputValueOps[Self <: LatitudeGeolibLatitudeInputValue] (val x: Self) extends AnyVal {
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

