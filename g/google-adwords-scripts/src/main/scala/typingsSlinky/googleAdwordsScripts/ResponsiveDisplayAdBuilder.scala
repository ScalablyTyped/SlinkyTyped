package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]
  extends AdWordsBuilder[ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]]
     with hasFinalUrlBuilder[ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]]
     with hasTrackingTemplateBuilder[ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]] {
  def withBusinessName(businessName: String): ResponsiveDisplayAdBuilder[ResponsiveDisplayAd] = js.native
  def withDescription(description: String): ResponsiveDisplayAdBuilder[ResponsiveDisplayAd] = js.native
  def withLogoImage(logo: Media): ResponsiveDisplayAdBuilder[ResponsiveDisplayAd] = js.native
  def withLongHeadline(longHeadline: String): ResponsiveDisplayAdBuilder[ResponsiveDisplayAd] = js.native
  def withMarketingImage(marketingImage: Media): ResponsiveDisplayAdBuilder[ResponsiveDisplayAd] = js.native
  def withShortHeadline(shortHeadline: String): ResponsiveDisplayAdBuilder[ResponsiveDisplayAd] = js.native
}

object ResponsiveDisplayAdBuilder {
  @scala.inline
  def apply[ResponsiveDisplayAd](
    build: () => AdWordsOperation[ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]],
    withBusinessName: String => ResponsiveDisplayAdBuilder[ResponsiveDisplayAd],
    withCustomParameters: js.Object => ResponsiveDisplayAdBuilder[ResponsiveDisplayAd],
    withDescription: String => ResponsiveDisplayAdBuilder[ResponsiveDisplayAd],
    withFinalUrl: String => ResponsiveDisplayAdBuilder[ResponsiveDisplayAd],
    withLogoImage: Media => ResponsiveDisplayAdBuilder[ResponsiveDisplayAd],
    withLongHeadline: String => ResponsiveDisplayAdBuilder[ResponsiveDisplayAd],
    withMarketingImage: Media => ResponsiveDisplayAdBuilder[ResponsiveDisplayAd],
    withMobileFinalUrl: String => ResponsiveDisplayAdBuilder[ResponsiveDisplayAd],
    withShortHeadline: String => ResponsiveDisplayAdBuilder[ResponsiveDisplayAd],
    withTrackingTemplate: String => ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]
  ): ResponsiveDisplayAdBuilder[ResponsiveDisplayAd] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withBusinessName = js.Any.fromFunction1(withBusinessName), withCustomParameters = js.Any.fromFunction1(withCustomParameters), withDescription = js.Any.fromFunction1(withDescription), withFinalUrl = js.Any.fromFunction1(withFinalUrl), withLogoImage = js.Any.fromFunction1(withLogoImage), withLongHeadline = js.Any.fromFunction1(withLongHeadline), withMarketingImage = js.Any.fromFunction1(withMarketingImage), withMobileFinalUrl = js.Any.fromFunction1(withMobileFinalUrl), withShortHeadline = js.Any.fromFunction1(withShortHeadline), withTrackingTemplate = js.Any.fromFunction1(withTrackingTemplate))
    __obj.asInstanceOf[ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]]
  }
  @scala.inline
  implicit class ResponsiveDisplayAdBuilderOps[Self[responsivedisplayad] <: ResponsiveDisplayAdBuilder[responsivedisplayad], ResponsiveDisplayAd] (val x: Self[ResponsiveDisplayAd]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ResponsiveDisplayAd] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ResponsiveDisplayAd]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ResponsiveDisplayAd] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ResponsiveDisplayAd] with Other]
    @scala.inline
    def withWithBusinessName(value: String => ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]): Self[ResponsiveDisplayAd] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withBusinessName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithDescription(value: String => ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]): Self[ResponsiveDisplayAd] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withDescription")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithLogoImage(value: Media => ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]): Self[ResponsiveDisplayAd] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withLogoImage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithLongHeadline(value: String => ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]): Self[ResponsiveDisplayAd] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withLongHeadline")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithMarketingImage(value: Media => ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]): Self[ResponsiveDisplayAd] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withMarketingImage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithShortHeadline(value: String => ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]): Self[ResponsiveDisplayAd] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withShortHeadline")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

