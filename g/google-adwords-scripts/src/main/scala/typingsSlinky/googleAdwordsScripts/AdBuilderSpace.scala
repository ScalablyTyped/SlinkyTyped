package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdBuilderSpace extends js.Object {
  def expandedTextAdBuilder(): ExpandedTextAdBuilder[ExpandedTextAd] = js.native
  def gmailImageAdBuilder(): GmailImageAdBuilder[GmailImageAd] = js.native
  def gmailMultiProductAdBuilder(): GmailMultiProductAdBuilder[GmailMultiProductAd] = js.native
  def gmailSinglePromotionAdBuilder(): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd] = js.native
  def html5AdBuilder(): Html5AdBuilder[Html5Ad] = js.native
  def imageAdBuilder(): ImageAdBuilder[ImageAd] = js.native
  def responsiveDisplayAdBuilder(): ResponsiveDisplayAdBuilder[ResponsiveDisplayAd] = js.native
}

object AdBuilderSpace {
  @scala.inline
  def apply(
    expandedTextAdBuilder: () => ExpandedTextAdBuilder[ExpandedTextAd],
    gmailImageAdBuilder: () => GmailImageAdBuilder[GmailImageAd],
    gmailMultiProductAdBuilder: () => GmailMultiProductAdBuilder[GmailMultiProductAd],
    gmailSinglePromotionAdBuilder: () => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    html5AdBuilder: () => Html5AdBuilder[Html5Ad],
    imageAdBuilder: () => ImageAdBuilder[ImageAd],
    responsiveDisplayAdBuilder: () => ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]
  ): AdBuilderSpace = {
    val __obj = js.Dynamic.literal(expandedTextAdBuilder = js.Any.fromFunction0(expandedTextAdBuilder), gmailImageAdBuilder = js.Any.fromFunction0(gmailImageAdBuilder), gmailMultiProductAdBuilder = js.Any.fromFunction0(gmailMultiProductAdBuilder), gmailSinglePromotionAdBuilder = js.Any.fromFunction0(gmailSinglePromotionAdBuilder), html5AdBuilder = js.Any.fromFunction0(html5AdBuilder), imageAdBuilder = js.Any.fromFunction0(imageAdBuilder), responsiveDisplayAdBuilder = js.Any.fromFunction0(responsiveDisplayAdBuilder))
    __obj.asInstanceOf[AdBuilderSpace]
  }
  @scala.inline
  implicit class AdBuilderSpaceOps[Self <: AdBuilderSpace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpandedTextAdBuilder(value: () => ExpandedTextAdBuilder[ExpandedTextAd]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedTextAdBuilder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGmailImageAdBuilder(value: () => GmailImageAdBuilder[GmailImageAd]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmailImageAdBuilder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGmailMultiProductAdBuilder(value: () => GmailMultiProductAdBuilder[GmailMultiProductAd]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmailMultiProductAdBuilder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGmailSinglePromotionAdBuilder(value: () => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmailSinglePromotionAdBuilder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHtml5AdBuilder(value: () => Html5AdBuilder[Html5Ad]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html5AdBuilder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withImageAdBuilder(value: () => ImageAdBuilder[ImageAd]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageAdBuilder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResponsiveDisplayAdBuilder(value: () => ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveDisplayAdBuilder")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

