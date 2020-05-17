package typingsSlinky.geolib.anon

import typingsSlinky.geolib.typesMod.GeolibAltitudeInputValue
import typingsSlinky.geolib.typesMod.GeolibInputAltitude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Elev extends GeolibInputAltitude {
  var elev: js.UndefOr[GeolibAltitudeInputValue] = js.native
}

object Elev {
  @scala.inline
  def apply(): Elev = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Elev]
  }
  @scala.inline
  implicit class ElevOps[Self <: Elev] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElev(value: GeolibAltitudeInputValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elev")(js.undefined)
        ret
    }
  }
  
}

