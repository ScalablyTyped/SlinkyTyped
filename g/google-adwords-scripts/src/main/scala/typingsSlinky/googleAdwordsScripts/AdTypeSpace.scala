package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdTypeSpace extends js.Object {
  def expandedTextAd(): Boolean = js.native
  def gmailImageAd(): Boolean = js.native
  def gmailMultiProductAd(): Boolean = js.native
  def gmailSinglePromotionAd(): Boolean = js.native
  def html5Ad(): Boolean = js.native
  def imageAd(): Boolean = js.native
  def responsiveDisplayAd(): Boolean = js.native
}

object AdTypeSpace {
  @scala.inline
  def apply(
    expandedTextAd: () => Boolean,
    gmailImageAd: () => Boolean,
    gmailMultiProductAd: () => Boolean,
    gmailSinglePromotionAd: () => Boolean,
    html5Ad: () => Boolean,
    imageAd: () => Boolean,
    responsiveDisplayAd: () => Boolean
  ): AdTypeSpace = {
    val __obj = js.Dynamic.literal(expandedTextAd = js.Any.fromFunction0(expandedTextAd), gmailImageAd = js.Any.fromFunction0(gmailImageAd), gmailMultiProductAd = js.Any.fromFunction0(gmailMultiProductAd), gmailSinglePromotionAd = js.Any.fromFunction0(gmailSinglePromotionAd), html5Ad = js.Any.fromFunction0(html5Ad), imageAd = js.Any.fromFunction0(imageAd), responsiveDisplayAd = js.Any.fromFunction0(responsiveDisplayAd))
    __obj.asInstanceOf[AdTypeSpace]
  }
  @scala.inline
  implicit class AdTypeSpaceOps[Self <: AdTypeSpace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpandedTextAd(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedTextAd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGmailImageAd(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmailImageAd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGmailMultiProductAd(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmailMultiProductAd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGmailSinglePromotionAd(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmailSinglePromotionAd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHtml5Ad(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html5Ad")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withImageAd(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageAd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResponsiveDisplayAd(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveDisplayAd")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

