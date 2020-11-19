package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class GmailImageAdBuilderOps[Self <: GmailImageAdBuilder[_], GmailImageAd] (val x: Self with GmailImageAdBuilder[GmailImageAd]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setWithAdvertiser(value: String => GmailImageAdBuilder[GmailImageAd]): Self = this.set("withAdvertiser", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithDescription(value: String => GmailImageAdBuilder[GmailImageAd]): Self = this.set("withDescription", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithDisplayUrl(value: String => GmailImageAdBuilder[GmailImageAd]): Self = this.set("withDisplayUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithImage(value: Media => GmailImageAdBuilder[GmailImageAd]): Self = this.set("withImage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithLogo(value: Media => GmailImageAdBuilder[GmailImageAd]): Self = this.set("withLogo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithName(value: String => GmailImageAdBuilder[GmailImageAd]): Self = this.set("withName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithSubject(value: String => GmailImageAdBuilder[GmailImageAd]): Self = this.set("withSubject", js.Any.fromFunction1(value))
  }
}
