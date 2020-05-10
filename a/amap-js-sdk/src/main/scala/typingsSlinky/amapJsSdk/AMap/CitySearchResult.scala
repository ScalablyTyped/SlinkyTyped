package typingsSlinky.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CitySearchResult extends js.Object {
  var bounds: Bounds = js.native
  var city: String = js.native
}

object CitySearchResult {
  @scala.inline
  def apply(bounds: Bounds, city: String): CitySearchResult = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any])
    __obj.asInstanceOf[CitySearchResult]
  }
  @scala.inline
  implicit class CitySearchResultOps[Self <: CitySearchResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBounds(value: Bounds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

