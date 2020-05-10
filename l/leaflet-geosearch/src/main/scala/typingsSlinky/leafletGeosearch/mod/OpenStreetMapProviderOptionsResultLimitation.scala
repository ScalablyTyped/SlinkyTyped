package typingsSlinky.leafletGeosearch.mod

import typingsSlinky.leafletGeosearch.leafletGeosearchNumbers.`0`
import typingsSlinky.leafletGeosearch.leafletGeosearchNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenStreetMapProviderOptionsResultLimitation extends js.Object {
  var bounded: js.UndefOr[`0` | `1`] = js.native
  var countrycodes: js.UndefOr[String] = js.native
  var exclude_place_ids: js.UndefOr[String] = js.native
  var limit: js.UndefOr[Double] = js.native
  var viewbox: js.UndefOr[String] = js.native
  var zoom: js.UndefOr[Double] = js.native
}

object OpenStreetMapProviderOptionsResultLimitation {
  @scala.inline
  def apply(): OpenStreetMapProviderOptionsResultLimitation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenStreetMapProviderOptionsResultLimitation]
  }
  @scala.inline
  implicit class OpenStreetMapProviderOptionsResultLimitationOps[Self <: OpenStreetMapProviderOptionsResultLimitation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBounded(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounded")(js.undefined)
        ret
    }
    @scala.inline
    def withCountrycodes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countrycodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountrycodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countrycodes")(js.undefined)
        ret
    }
    @scala.inline
    def withExclude_place_ids(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude_place_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude_place_ids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude_place_ids")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withViewbox(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewbox")(js.undefined)
        ret
    }
    @scala.inline
    def withZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(js.undefined)
        ret
    }
  }
  
}

