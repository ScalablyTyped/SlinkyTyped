package typingsSlinky.geolib.anon

import typingsSlinky.geolib.typesMod.GeolibAltitudeInputValue
import typingsSlinky.geolib.typesMod.GeolibInputAltitude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Elevation extends GeolibInputAltitude {
  var elevation: js.UndefOr[GeolibAltitudeInputValue] = js.native
}

object Elevation {
  @scala.inline
  def apply(): Elevation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Elevation]
  }
  @scala.inline
  implicit class ElevationOps[Self <: Elevation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElevation(value: GeolibAltitudeInputValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elevation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElevation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elevation")(js.undefined)
        ret
    }
  }
  
}

