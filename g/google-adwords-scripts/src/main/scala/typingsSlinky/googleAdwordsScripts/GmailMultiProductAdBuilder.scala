package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GmailMultiProductAdBuilder[GmailMultiProductAd]
  extends AdWordsBuilder[GmailMultiProductAdBuilder[GmailImageAd]]
     with hasFinalUrlBuilder[GmailMultiProductAdBuilder[GmailImageAd]]
     with hasTrackingTemplateBuilder[GmailMultiProductAdBuilder[GmailImageAd]] {
  def withAdvertiser(advertiser: String): GmailMultiProductAdBuilder[GmailMultiProductAd] = js.native
  def withContent(content: String): GmailMultiProductAdBuilder[GmailMultiProductAd] = js.native
  def withDescription(description: String): GmailMultiProductAdBuilder[GmailMultiProductAd] = js.native
  def withHeader(header: Media): GmailMultiProductAdBuilder[GmailMultiProductAd] = js.native
  def withHeadline(headline: String): GmailMultiProductAdBuilder[GmailMultiProductAd] = js.native
  def withHeadlineColor(headlineColor: String): GmailMultiProductAdBuilder[GmailMultiProductAd] = js.native
  def withItemButtonCallsToAction(itemCallsToAction: js.Array[String]): GmailMultiProductAdBuilder[GmailMultiProductAd] = js.native
  def withItemButtonFinalMobileUrls(itemButtonFinalMobileUrls: js.Array[String]): GmailMultiProductAdBuilder[GmailMultiProductAd] = js.native
  def withItemButtonFinalUrls(itemButtonFinalUrls: js.Array[String]): GmailMultiProductAdBuilder[GmailMultiProductAd] = js.native
  def withItemButtonTrackingTemplates(itemButtonTrackingTemplates: js.Array[String]): GmailMultiProductAdBuilder[GmailMultiProductAd] = js.native
  def withItemImages(itemImages: js.Array[Media]): GmailMultiProductAdBuilder[GmailMultiProductAd] = js.native
  def withItemTitle(itemTitles: js.Array[String]): GmailMultiProductAdBuilder[GmailMultiProductAd] = js.native
  def withLogo(logo: Media): GmailMultiProductAdBuilder[GmailMultiProductAd] = js.native
  def withName(name: String): GmailMultiProductAdBuilder[GmailMultiProductAd] = js.native
  def withSubject(subject: String): GmailMultiProductAdBuilder[GmailMultiProductAd] = js.native
}

object GmailMultiProductAdBuilder {
  @scala.inline
  def apply[GmailMultiProductAd](
    build: () => AdWordsOperation[GmailMultiProductAdBuilder[GmailImageAd]],
    withAdvertiser: String => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withContent: String => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withCustomParameters: js.Object => GmailMultiProductAdBuilder[GmailImageAd],
    withDescription: String => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withFinalUrl: String => GmailMultiProductAdBuilder[GmailImageAd],
    withHeader: Media => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withHeadline: String => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withHeadlineColor: String => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withItemButtonCallsToAction: js.Array[String] => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withItemButtonFinalMobileUrls: js.Array[String] => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withItemButtonFinalUrls: js.Array[String] => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withItemButtonTrackingTemplates: js.Array[String] => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withItemImages: js.Array[Media] => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withItemTitle: js.Array[String] => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withLogo: Media => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withMobileFinalUrl: String => GmailMultiProductAdBuilder[GmailImageAd],
    withName: String => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withSubject: String => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withTrackingTemplate: String => GmailMultiProductAdBuilder[GmailImageAd]
  ): GmailMultiProductAdBuilder[GmailMultiProductAd] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withAdvertiser = js.Any.fromFunction1(withAdvertiser), withContent = js.Any.fromFunction1(withContent), withCustomParameters = js.Any.fromFunction1(withCustomParameters), withDescription = js.Any.fromFunction1(withDescription), withFinalUrl = js.Any.fromFunction1(withFinalUrl), withHeader = js.Any.fromFunction1(withHeader), withHeadline = js.Any.fromFunction1(withHeadline), withHeadlineColor = js.Any.fromFunction1(withHeadlineColor), withItemButtonCallsToAction = js.Any.fromFunction1(withItemButtonCallsToAction), withItemButtonFinalMobileUrls = js.Any.fromFunction1(withItemButtonFinalMobileUrls), withItemButtonFinalUrls = js.Any.fromFunction1(withItemButtonFinalUrls), withItemButtonTrackingTemplates = js.Any.fromFunction1(withItemButtonTrackingTemplates), withItemImages = js.Any.fromFunction1(withItemImages), withItemTitle = js.Any.fromFunction1(withItemTitle), withLogo = js.Any.fromFunction1(withLogo), withMobileFinalUrl = js.Any.fromFunction1(withMobileFinalUrl), withName = js.Any.fromFunction1(withName), withSubject = js.Any.fromFunction1(withSubject), withTrackingTemplate = js.Any.fromFunction1(withTrackingTemplate))
    __obj.asInstanceOf[GmailMultiProductAdBuilder[GmailMultiProductAd]]
  }
  @scala.inline
  implicit class GmailMultiProductAdBuilderOps[Self[gmailmultiproductad] <: GmailMultiProductAdBuilder[gmailmultiproductad], GmailMultiProductAd] (val x: Self[GmailMultiProductAd]) extends AnyVal {
    @scala.inline
    def duplicate: Self[GmailMultiProductAd] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[GmailMultiProductAd]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[GmailMultiProductAd] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[GmailMultiProductAd] with Other]
    @scala.inline
    def withWithAdvertiser(value: String => GmailMultiProductAdBuilder[GmailMultiProductAd]): Self[GmailMultiProductAd] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withAdvertiser")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithContent(value: String => GmailMultiProductAdBuilder[GmailMultiProductAd]): Self[GmailMultiProductAd] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withContent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithDescription(value: String => GmailMultiProductAdBuilder[GmailMultiProductAd]): Self[GmailMultiProductAd] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withDescription")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithHeader(value: Media => GmailMultiProductAdBuilder[GmailMultiProductAd]): Self[GmailMultiProductAd] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withHeader")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithHeadline(value: String => GmailMultiProductAdBuilder[GmailMultiProductAd]): Self[GmailMultiProductAd] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withHeadline")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithHeadlineColor(value: String => GmailMultiProductAdBuilder[GmailMultiProductAd]): Self[GmailMultiProductAd] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withHeadlineColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithItemButtonCallsToAction(value: js.Array[String] => GmailMultiProductAdBuilder[GmailMultiProductAd]): Self[GmailMultiProductAd] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withItemButtonCallsToAction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithItemButtonFinalMobileUrls(value: js.Array[String] => GmailMultiProductAdBuilder[GmailMultiProductAd]): Self[GmailMultiProductAd] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withItemButtonFinalMobileUrls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithItemButtonFinalUrls(value: js.Array[String] => GmailMultiProductAdBuilder[GmailMultiProductAd]): Self[GmailMultiProductAd] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withItemButtonFinalUrls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithItemButtonTrackingTemplates(value: js.Array[String] => GmailMultiProductAdBuilder[GmailMultiProductAd]): Self[GmailMultiProductAd] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withItemButtonTrackingTemplates")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithItemImages(value: js.Array[Media] => GmailMultiProductAdBuilder[GmailMultiProductAd]): Self[GmailMultiProductAd] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withItemImages")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithItemTitle(value: js.Array[String] => GmailMultiProductAdBuilder[GmailMultiProductAd]): Self[GmailMultiProductAd] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withItemTitle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithLogo(value: Media => GmailMultiProductAdBuilder[GmailMultiProductAd]): Self[GmailMultiProductAd] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withLogo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithName(value: String => GmailMultiProductAdBuilder[GmailMultiProductAd]): Self[GmailMultiProductAd] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithSubject(value: String => GmailMultiProductAdBuilder[GmailMultiProductAd]): Self[GmailMultiProductAd] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withSubject")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

