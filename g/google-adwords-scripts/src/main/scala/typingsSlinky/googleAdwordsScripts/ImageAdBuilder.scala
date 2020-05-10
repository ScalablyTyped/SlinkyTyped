package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageAdBuilder[ImageAd]
  extends AdWordsBuilder[ImageAdBuilder[ImageAd]]
     with hasFinalUrlBuilder[ImageAdBuilder[ImageAd]]
     with hasTrackingTemplateBuilder[ImageAdBuilder[ImageAd]] {
  def withDisplayUrl(displayUrl: String): ImageAdBuilder[ImageAd] = js.native
  def withImage(image: Media): ImageAdBuilder[ImageAd] = js.native
  def withName(name: String): ImageAdBuilder[ImageAd] = js.native
}

object ImageAdBuilder {
  @scala.inline
  def apply[ImageAd](
    build: () => AdWordsOperation[ImageAdBuilder[ImageAd]],
    withCustomParameters: js.Object => ImageAdBuilder[ImageAd],
    withDisplayUrl: String => ImageAdBuilder[ImageAd],
    withFinalUrl: String => ImageAdBuilder[ImageAd],
    withImage: Media => ImageAdBuilder[ImageAd],
    withMobileFinalUrl: String => ImageAdBuilder[ImageAd],
    withName: String => ImageAdBuilder[ImageAd],
    withTrackingTemplate: String => ImageAdBuilder[ImageAd]
  ): ImageAdBuilder[ImageAd] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withCustomParameters = js.Any.fromFunction1(withCustomParameters), withDisplayUrl = js.Any.fromFunction1(withDisplayUrl), withFinalUrl = js.Any.fromFunction1(withFinalUrl), withImage = js.Any.fromFunction1(withImage), withMobileFinalUrl = js.Any.fromFunction1(withMobileFinalUrl), withName = js.Any.fromFunction1(withName), withTrackingTemplate = js.Any.fromFunction1(withTrackingTemplate))
    __obj.asInstanceOf[ImageAdBuilder[ImageAd]]
  }
  @scala.inline
  implicit class ImageAdBuilderOps[Self[imagead] <: ImageAdBuilder[imagead], ImageAd] (val x: Self[ImageAd]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ImageAd] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ImageAd]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ImageAd] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ImageAd] with Other]
    @scala.inline
    def withWithDisplayUrl(value: String => ImageAdBuilder[ImageAd]): Self[ImageAd] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withDisplayUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithImage(value: Media => ImageAdBuilder[ImageAd]): Self[ImageAd] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withImage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithName(value: String => ImageAdBuilder[ImageAd]): Self[ImageAd] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withName")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

