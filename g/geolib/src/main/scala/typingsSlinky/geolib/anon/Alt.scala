package typingsSlinky.geolib.anon

import typingsSlinky.geolib.typesMod.GeolibAltitudeInputValue
import typingsSlinky.geolib.typesMod.GeolibInputAltitude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alt extends GeolibInputAltitude {
  var alt: js.UndefOr[GeolibAltitudeInputValue] = js.native
}

object Alt {
  @scala.inline
  def apply(): Alt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alt]
  }
  @scala.inline
  implicit class AltOps[Self <: Alt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlt(value: GeolibAltitudeInputValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt")(js.undefined)
        ret
    }
  }
  
}

