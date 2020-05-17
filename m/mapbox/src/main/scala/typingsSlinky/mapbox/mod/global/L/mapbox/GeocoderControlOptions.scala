package typingsSlinky.mapbox.mod.global.L.mapbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeocoderControlOptions
  extends typingsSlinky.leaflet.mod.ControlOptions {
  var keepOpen: js.UndefOr[Boolean] = js.native
}

object GeocoderControlOptions {
  @scala.inline
  def apply(): GeocoderControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeocoderControlOptions]
  }
  @scala.inline
  implicit class GeocoderControlOptionsOps[Self <: GeocoderControlOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeepOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepOpen")(js.undefined)
        ret
    }
  }
  
}

