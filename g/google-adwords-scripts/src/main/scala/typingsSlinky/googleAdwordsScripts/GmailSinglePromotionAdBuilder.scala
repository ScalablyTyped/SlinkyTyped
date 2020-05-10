package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]
  extends AdWordsBuilder[GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]]
     with hasFinalUrlBuilder[GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]]
     with hasTrackingTemplateBuilder[GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]] {
  def withAdvertiser(advertiser: String): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd] = js.native
  def withCallToAction(callToAction: String): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd] = js.native
  def withCallToActionButtonColor(callToActionButtonColor: String): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd] = js.native
  def withCallToActionTextColor(callToActionTextColor: String): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd] = js.native
  def withContent(content: String): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd] = js.native
  def withDescription(description: String): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd] = js.native
  def withDisplayUrl(displayUrl: String): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd] = js.native
  def withHeader(header: Media): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd] = js.native
  def withHeadline(headline: String): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd] = js.native
  def withHeadlineColor(headlineColor: String): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd] = js.native
  def withImage(image: Media): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd] = js.native
  def withLogo(logo: Media): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd] = js.native
  def withName(name: String): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd] = js.native
  def withSubject(subject: String): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd] = js.native
}

object GmailSinglePromotionAdBuilder {
  @scala.inline
  def apply[GmailSinglePromotionAd](
    build: () => AdWordsOperation[GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]],
    withAdvertiser: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withCallToAction: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withCallToActionButtonColor: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withCallToActionTextColor: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withContent: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withCustomParameters: js.Object => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withDescription: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withDisplayUrl: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withFinalUrl: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withHeader: Media => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withHeadline: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withHeadlineColor: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withImage: Media => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withLogo: Media => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withMobileFinalUrl: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withName: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withSubject: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd],
    withTrackingTemplate: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]
  ): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withAdvertiser = js.Any.fromFunction1(withAdvertiser), withCallToAction = js.Any.fromFunction1(withCallToAction), withCallToActionButtonColor = js.Any.fromFunction1(withCallToActionButtonColor), withCallToActionTextColor = js.Any.fromFunction1(withCallToActionTextColor), withContent = js.Any.fromFunction1(withContent), withCustomParameters = js.Any.fromFunction1(withCustomParameters), withDescription = js.Any.fromFunction1(withDescription), withDisplayUrl = js.Any.fromFunction1(withDisplayUrl), withFinalUrl = js.Any.fromFunction1(withFinalUrl), withHeader = js.Any.fromFunction1(withHeader), withHeadline = js.Any.fromFunction1(withHeadline), withHeadlineColor = js.Any.fromFunction1(withHeadlineColor), withImage = js.Any.fromFunction1(withImage), withLogo = js.Any.fromFunction1(withLogo), withMobileFinalUrl = js.Any.fromFunction1(withMobileFinalUrl), withName = js.Any.fromFunction1(withName), withSubject = js.Any.fromFunction1(withSubject), withTrackingTemplate = js.Any.fromFunction1(withTrackingTemplate))
    __obj.asInstanceOf[GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]]
  }
  @scala.inline
  implicit class GmailSinglePromotionAdBuilderOps[Self[gmailsinglepromotionad] <: GmailSinglePromotionAdBuilder[gmailsinglepromotionad], GmailSinglePromotionAd] (val x: Self[GmailSinglePromotionAd]) extends AnyVal {
    @scala.inline
    def duplicate: Self[GmailSinglePromotionAd] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[GmailSinglePromotionAd]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[GmailSinglePromotionAd] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[GmailSinglePromotionAd] with Other]
    @scala.inline
    def withWithAdvertiser(value: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]): Self[GmailSinglePromotionAd] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withAdvertiser")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithCallToAction(value: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]): Self[GmailSinglePromotionAd] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCallToAction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithCallToActionButtonColor(value: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]): Self[GmailSinglePromotionAd] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCallToActionButtonColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithCallToActionTextColor(value: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]): Self[GmailSinglePromotionAd] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCallToActionTextColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithContent(value: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]): Self[GmailSinglePromotionAd] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withContent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithDescription(value: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]): Self[GmailSinglePromotionAd] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withDescription")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithDisplayUrl(value: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]): Self[GmailSinglePromotionAd] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withDisplayUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithHeader(value: Media => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]): Self[GmailSinglePromotionAd] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withHeader")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithHeadline(value: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]): Self[GmailSinglePromotionAd] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withHeadline")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithHeadlineColor(value: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]): Self[GmailSinglePromotionAd] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withHeadlineColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithImage(value: Media => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]): Self[GmailSinglePromotionAd] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withImage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithLogo(value: Media => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]): Self[GmailSinglePromotionAd] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withLogo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithName(value: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]): Self[GmailSinglePromotionAd] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithSubject(value: String => GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]): Self[GmailSinglePromotionAd] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withSubject")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

