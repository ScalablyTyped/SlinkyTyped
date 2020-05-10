package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GmailImageAdBuilder[GmailImageAd]
  extends AdWordsBuilder[GmailImageAdBuilder[GmailImageAd]]
     with hasFinalUrlBuilder[GmailImageAdBuilder[GmailImageAd]]
     with hasTrackingTemplateBuilder[GmailImageAdBuilder[GmailImageAd]] {
  def withAdvertiser(advertiser: String): GmailImageAdBuilder[GmailImageAd] = js.native
  def withDescription(description: String): GmailImageAdBuilder[GmailImageAd] = js.native
  def withDisplayUrl(displayUrl: String): GmailImageAdBuilder[GmailImageAd] = js.native
  def withImage(image: Media): GmailImageAdBuilder[GmailImageAd] = js.native
  def withLogo(logo: Media): GmailImageAdBuilder[GmailImageAd] = js.native
  def withName(name: String): GmailImageAdBuilder[GmailImageAd] = js.native
  def withSubject(subject: String): GmailImageAdBuilder[GmailImageAd] = js.native
}

object GmailImageAdBuilder {
  @scala.inline
  def apply[GmailImageAd](
    build: () => AdWordsOperation[GmailImageAdBuilder[GmailImageAd]],
    withAdvertiser: String => GmailImageAdBuilder[GmailImageAd],
    withCustomParameters: js.Object => GmailImageAdBuilder[GmailImageAd],
    withDescription: String => GmailImageAdBuilder[GmailImageAd],
    withDisplayUrl: String => GmailImageAdBuilder[GmailImageAd],
    withFinalUrl: String => GmailImageAdBuilder[GmailImageAd],
    withImage: Media => GmailImageAdBuilder[GmailImageAd],
    withLogo: Media => GmailImageAdBuilder[GmailImageAd],
    withMobileFinalUrl: String => GmailImageAdBuilder[GmailImageAd],
    withName: String => GmailImageAdBuilder[GmailImageAd],
    withSubject: String => GmailImageAdBuilder[GmailImageAd],
    withTrackingTemplate: String => GmailImageAdBuilder[GmailImageAd]
  ): GmailImageAdBuilder[GmailImageAd] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withAdvertiser = js.Any.fromFunction1(withAdvertiser), withCustomParameters = js.Any.fromFunction1(withCustomParameters), withDescription = js.Any.fromFunction1(withDescription), withDisplayUrl = js.Any.fromFunction1(withDisplayUrl), withFinalUrl = js.Any.fromFunction1(withFinalUrl), withImage = js.Any.fromFunction1(withImage), withLogo = js.Any.fromFunction1(withLogo), withMobileFinalUrl = js.Any.fromFunction1(withMobileFinalUrl), withName = js.Any.fromFunction1(withName), withSubject = js.Any.fromFunction1(withSubject), withTrackingTemplate = js.Any.fromFunction1(withTrackingTemplate))
    __obj.asInstanceOf[GmailImageAdBuilder[GmailImageAd]]
  }
  @scala.inline
  implicit class GmailImageAdBuilderOps[Self[gmailimagead] <: GmailImageAdBuilder[gmailimagead], GmailImageAd] (val x: Self[GmailImageAd]) extends AnyVal {
    @scala.inline
    def duplicate: Self[GmailImageAd] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[GmailImageAd]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[GmailImageAd] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[GmailImageAd] with Other]
    @scala.inline
    def withWithAdvertiser(value: String => GmailImageAdBuilder[GmailImageAd]): Self[GmailImageAd] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withAdvertiser")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithDescription(value: String => GmailImageAdBuilder[GmailImageAd]): Self[GmailImageAd] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withDescription")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithDisplayUrl(value: String => GmailImageAdBuilder[GmailImageAd]): Self[GmailImageAd] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withDisplayUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithImage(value: Media => GmailImageAdBuilder[GmailImageAd]): Self[GmailImageAd] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withImage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithLogo(value: Media => GmailImageAdBuilder[GmailImageAd]): Self[GmailImageAd] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withLogo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithName(value: String => GmailImageAdBuilder[GmailImageAd]): Self[GmailImageAd] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithSubject(value: String => GmailImageAdBuilder[GmailImageAd]): Self[GmailImageAd] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withSubject")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

