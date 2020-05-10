package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Html5AdBuilder[Html5Ad]
  extends AdWordsBuilder[Html5AdBuilder[Html5Ad]]
     with hasFinalUrlBuilder[Html5AdBuilder[Html5Ad]]
     with hasTrackingTemplateBuilder[Html5AdBuilder[Html5Ad]] {
  def withDimensions(dimensions: String): Html5AdBuilder[Html5Ad] = js.native
  def withDisplayUrl(displayUrl: String): Html5AdBuilder[Html5Ad] = js.native
  def withEntryPoint(entryPoint: String): Html5AdBuilder[Html5Ad] = js.native
  def withMediaBundle(mediaBundle: Media): Html5AdBuilder[Html5Ad] = js.native
  def withName(name: String): Html5AdBuilder[Html5Ad] = js.native
}

object Html5AdBuilder {
  @scala.inline
  def apply[Html5Ad](
    build: () => AdWordsOperation[Html5AdBuilder[Html5Ad]],
    withCustomParameters: js.Object => Html5AdBuilder[Html5Ad],
    withDimensions: String => Html5AdBuilder[Html5Ad],
    withDisplayUrl: String => Html5AdBuilder[Html5Ad],
    withEntryPoint: String => Html5AdBuilder[Html5Ad],
    withFinalUrl: String => Html5AdBuilder[Html5Ad],
    withMediaBundle: Media => Html5AdBuilder[Html5Ad],
    withMobileFinalUrl: String => Html5AdBuilder[Html5Ad],
    withName: String => Html5AdBuilder[Html5Ad],
    withTrackingTemplate: String => Html5AdBuilder[Html5Ad]
  ): Html5AdBuilder[Html5Ad] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withCustomParameters = js.Any.fromFunction1(withCustomParameters), withDimensions = js.Any.fromFunction1(withDimensions), withDisplayUrl = js.Any.fromFunction1(withDisplayUrl), withEntryPoint = js.Any.fromFunction1(withEntryPoint), withFinalUrl = js.Any.fromFunction1(withFinalUrl), withMediaBundle = js.Any.fromFunction1(withMediaBundle), withMobileFinalUrl = js.Any.fromFunction1(withMobileFinalUrl), withName = js.Any.fromFunction1(withName), withTrackingTemplate = js.Any.fromFunction1(withTrackingTemplate))
    __obj.asInstanceOf[Html5AdBuilder[Html5Ad]]
  }
  @scala.inline
  implicit class Html5AdBuilderOps[Self[html5ad] <: Html5AdBuilder[html5ad], Html5Ad] (val x: Self[Html5Ad]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Html5Ad] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Html5Ad]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Html5Ad] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Html5Ad] with Other]
    @scala.inline
    def withWithDimensions(value: String => Html5AdBuilder[Html5Ad]): Self[Html5Ad] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withDimensions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithDisplayUrl(value: String => Html5AdBuilder[Html5Ad]): Self[Html5Ad] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withDisplayUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithEntryPoint(value: String => Html5AdBuilder[Html5Ad]): Self[Html5Ad] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withEntryPoint")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithMediaBundle(value: Media => Html5AdBuilder[Html5Ad]): Self[Html5Ad] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withMediaBundle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithName(value: String => Html5AdBuilder[Html5Ad]): Self[Html5Ad] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withName")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

