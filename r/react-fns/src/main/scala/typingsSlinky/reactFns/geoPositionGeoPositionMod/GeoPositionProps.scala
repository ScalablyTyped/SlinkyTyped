package typingsSlinky.reactFns.geoPositionGeoPositionMod

import org.scalajs.dom.raw.PositionError
import typingsSlinky.reactFns.anon.Latitude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoPositionProps extends js.Object {
  var coords: js.UndefOr[Latitude] = js.native
  var error: js.UndefOr[PositionError] = js.native
  var isLoading: Boolean = js.native
}

object GeoPositionProps {
  @scala.inline
  def apply(isLoading: Boolean): GeoPositionProps = {
    val __obj = js.Dynamic.literal(isLoading = isLoading.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoPositionProps]
  }
  @scala.inline
  implicit class GeoPositionPropsOps[Self <: GeoPositionProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsLoading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCoords(value: Latitude): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coords")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: PositionError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
  }
  
}

