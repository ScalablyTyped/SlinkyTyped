package typingsSlinky.geolib

import typingsSlinky.geolib.typesMod.GeolibAltitudeInputValue
import typingsSlinky.geolib.typesMod.GeolibInputAltitude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAltitudeGeolibAltitudeInputValue extends GeolibInputAltitude {
  var altitude: js.UndefOr[GeolibAltitudeInputValue] = js.native
}

object AnonAltitudeGeolibAltitudeInputValue {
  @scala.inline
  def apply(): AnonAltitudeGeolibAltitudeInputValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAltitudeGeolibAltitudeInputValue]
  }
  @scala.inline
  implicit class AnonAltitudeGeolibAltitudeInputValueOps[Self <: AnonAltitudeGeolibAltitudeInputValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAltitude(value: GeolibAltitudeInputValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altitude")(js.undefined)
        ret
    }
  }
  
}

