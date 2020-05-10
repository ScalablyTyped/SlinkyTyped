package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdViewSpace extends js.Object {
  def expandedTextAd(): ExpandedTextAd = js.native
  def gmailImageAd(): GmailImageAd = js.native
  def gmailMultiProductAd(): GmailMultiProductAd = js.native
  def gmailSinglePromotionAd(): GmailSinglePromotionAd = js.native
  def html5Ad(): Html5Ad = js.native
  def imageAd(): ImageAd = js.native
  def responsiveDisplayAd(): ResponsiveDisplayAd = js.native
}

object AdViewSpace {
  @scala.inline
  def apply(
    expandedTextAd: () => ExpandedTextAd,
    gmailImageAd: () => GmailImageAd,
    gmailMultiProductAd: () => GmailMultiProductAd,
    gmailSinglePromotionAd: () => GmailSinglePromotionAd,
    html5Ad: () => Html5Ad,
    imageAd: () => ImageAd,
    responsiveDisplayAd: () => ResponsiveDisplayAd
  ): AdViewSpace = {
    val __obj = js.Dynamic.literal(expandedTextAd = js.Any.fromFunction0(expandedTextAd), gmailImageAd = js.Any.fromFunction0(gmailImageAd), gmailMultiProductAd = js.Any.fromFunction0(gmailMultiProductAd), gmailSinglePromotionAd = js.Any.fromFunction0(gmailSinglePromotionAd), html5Ad = js.Any.fromFunction0(html5Ad), imageAd = js.Any.fromFunction0(imageAd), responsiveDisplayAd = js.Any.fromFunction0(responsiveDisplayAd))
    __obj.asInstanceOf[AdViewSpace]
  }
  @scala.inline
  implicit class AdViewSpaceOps[Self <: AdViewSpace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpandedTextAd(value: () => ExpandedTextAd): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedTextAd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGmailImageAd(value: () => GmailImageAd): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmailImageAd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGmailMultiProductAd(value: () => GmailMultiProductAd): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmailMultiProductAd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGmailSinglePromotionAd(value: () => GmailSinglePromotionAd): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmailSinglePromotionAd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHtml5Ad(value: () => Html5Ad): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html5Ad")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withImageAd(value: () => ImageAd): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageAd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResponsiveDisplayAd(value: () => ResponsiveDisplayAd): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveDisplayAd")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

