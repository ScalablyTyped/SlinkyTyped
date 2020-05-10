package typingsSlinky.leafletGeosearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BingProviderUserContextOptions extends js.Object {
  var ul: js.UndefOr[String] = js.native
  var umv: js.UndefOr[String] = js.native
  var ur: js.UndefOr[String] = js.native
  var userIp: js.UndefOr[String] = js.native
  var userLocation: js.UndefOr[String] = js.native
  var userMapView: js.UndefOr[String] = js.native
  var userRegion: js.UndefOr[String] = js.native
}

object BingProviderUserContextOptions {
  @scala.inline
  def apply(): BingProviderUserContextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BingProviderUserContextOptions]
  }
  @scala.inline
  implicit class BingProviderUserContextOptionsOps[Self <: BingProviderUserContextOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

