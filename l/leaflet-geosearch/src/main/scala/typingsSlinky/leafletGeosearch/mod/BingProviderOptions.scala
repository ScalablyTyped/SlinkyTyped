package typingsSlinky.leafletGeosearch.mod

import typingsSlinky.leafletGeosearch.leafletGeosearchNumbers.`-1`
import typingsSlinky.leafletGeosearch.leafletGeosearchNumbers.`0`
import typingsSlinky.leafletGeosearch.leafletGeosearchNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  key  :string,   adminDistrict ? :string,   includeNeighborhood ? :-1 | 0 | 1,   inclnb ? :-1 | 0 | 1,   include ? :string,   incl ? :string,   maxResults ? :number} & leaflet-geosearch.leaflet-geosearch.BingProviderCultureOptions & leaflet-geosearch.leaflet-geosearch.BingProviderUserContextOptions */
@js.native
trait BingProviderOptions extends js.Object {
  var adminDistrict: js.UndefOr[String] = js.native
  var c: js.UndefOr[String] = js.native
  var culture: js.UndefOr[String] = js.native
  var incl: js.UndefOr[String] = js.native
  var inclnb: js.UndefOr[`-1` | `0` | `1`] = js.native
  var include: js.UndefOr[String] = js.native
  var includeNeighborhood: js.UndefOr[`-1` | `0` | `1`] = js.native
  var key: String = js.native
  var maxResults: js.UndefOr[Double] = js.native
  var ul: js.UndefOr[String] = js.native
  var umv: js.UndefOr[String] = js.native
  var ur: js.UndefOr[String] = js.native
  var userIp: js.UndefOr[String] = js.native
  var userLocation: js.UndefOr[String] = js.native
  var userMapView: js.UndefOr[String] = js.native
  var userRegion: js.UndefOr[String] = js.native
}

object BingProviderOptions {
  @scala.inline
  def apply(key: String): BingProviderOptions = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[BingProviderOptions]
  }
  @scala.inline
  implicit class BingProviderOptionsOps[Self <: BingProviderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdminDistrict(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adminDistrict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdminDistrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adminDistrict")(js.undefined)
        ret
    }
    @scala.inline
    def withC(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("c")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutC: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("c")(js.undefined)
        ret
    }
    @scala.inline
    def withCulture(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("culture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCulture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("culture")(js.undefined)
        ret
    }
    @scala.inline
    def withIncl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incl")(js.undefined)
        ret
    }
    @scala.inline
    def withInclnb(value: `-1` | `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inclnb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclnb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inclnb")(js.undefined)
        ret
    }
    @scala.inline
    def withInclude(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeNeighborhood(value: `-1` | `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeNeighborhood")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeNeighborhood: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeNeighborhood")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withUl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ul")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ul")(js.undefined)
        ret
    }
    @scala.inline
    def withUmv(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("umv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUmv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("umv")(js.undefined)
        ret
    }
    @scala.inline
    def withUr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ur")(js.undefined)
        ret
    }
    @scala.inline
    def withUserIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userIp")(js.undefined)
        ret
    }
    @scala.inline
    def withUserLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withUserMapView(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userMapView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserMapView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userMapView")(js.undefined)
        ret
    }
    @scala.inline
    def withUserRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userRegion")(js.undefined)
        ret
    }
  }
  
}

