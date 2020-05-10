package typingsSlinky.mapbox.mod._Global_.L.mapbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//////////////////////////////////////////////////////////////////////
//////////////////////////////// CONTROLS ////////////////////////////
//////////////////////////////////////////////////////////////////////
@js.native
trait ControlOptions
  extends typingsSlinky.leaflet.mod.ControlOptions {
  var sanitizer: js.UndefOr[js.Function1[/* template */ String, String]] = js.native
}

object ControlOptions {
  @scala.inline
  def apply(): ControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ControlOptions]
  }
  @scala.inline
  implicit class ControlOptionsOps[Self <: ControlOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSanitizer(value: /* template */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sanitizer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSanitizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sanitizer")(js.undefined)
        ret
    }
  }
  
}

