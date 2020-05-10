package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BannerHiddenEventUIParam extends js.Object {
  /**
  	 * Get the banner object from the banners array.
  	 */
  var banner: js.UndefOr[js.Any] = js.native
  /**
  	 * Get the banner html element in the DOM.
  	 */
  var bannerElement: js.UndefOr[js.Any] = js.native
  /**
  	 * Get the banner index in the banners array.
  	 */
  var index: js.UndefOr[Double] = js.native
}

object BannerHiddenEventUIParam {
  @scala.inline
  def apply(): BannerHiddenEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BannerHiddenEventUIParam]
  }
  @scala.inline
  implicit class BannerHiddenEventUIParamOps[Self <: BannerHiddenEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBanner(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("banner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBanner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("banner")(js.undefined)
        ret
    }
    @scala.inline
    def withBannerElement(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBannerElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerElement")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
  }
  
}

