package typingsSlinky.geolib.anon

import typingsSlinky.geolib.typesMod.GeolibInputLongitude
import typingsSlinky.geolib.typesMod.GeolibLongitudeInputValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LongitudeGeolibLongitudeInputValue extends GeolibInputLongitude {
  var longitude: GeolibLongitudeInputValue = js.native
}

object LongitudeGeolibLongitudeInputValue {
  @scala.inline
  def apply(longitude: GeolibLongitudeInputValue): LongitudeGeolibLongitudeInputValue = {
    val __obj = js.Dynamic.literal(longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongitudeGeolibLongitudeInputValue]
  }
  @scala.inline
  implicit class LongitudeGeolibLongitudeInputValueOps[Self <: LongitudeGeolibLongitudeInputValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLongitude(value: GeolibLongitudeInputValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longitude")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

