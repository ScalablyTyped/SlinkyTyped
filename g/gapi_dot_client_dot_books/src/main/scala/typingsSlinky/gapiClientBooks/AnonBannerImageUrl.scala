package typingsSlinky.gapiClientBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBannerImageUrl extends js.Object {
  var bannerImageUrl: js.UndefOr[String] = js.native
  var imageUrl: js.UndefOr[String] = js.native
  var seriesId: js.UndefOr[String] = js.native
  var seriesType: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
}

object AnonBannerImageUrl {
  @scala.inline
  def apply(): AnonBannerImageUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBannerImageUrl]
  }
  @scala.inline
  implicit class AnonBannerImageUrlOps[Self <: AnonBannerImageUrl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBannerImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBannerImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerImageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeriesId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesId")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeriesType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesType")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

