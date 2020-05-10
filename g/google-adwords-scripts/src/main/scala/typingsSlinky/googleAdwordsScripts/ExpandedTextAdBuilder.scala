package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpandedTextAdBuilder[ExpandedTextAd]
  extends AdWordsBuilder[ExpandedTextAdBuilder[ExpandedTextAd]]
     with hasFinalUrlBuilder[ExpandedTextAdBuilder[ExpandedTextAd]]
     with hasTrackingTemplateBuilder[ExpandedTextAdBuilder[ExpandedTextAd]] {
  def withDescription(descriptions: String): ExpandedTextAdBuilder[ExpandedTextAd] = js.native
  def withHeadlinePart1(headline1: String): ExpandedTextAdBuilder[ExpandedTextAd] = js.native
  def withHeadlinePart2(headline2: String): ExpandedTextAdBuilder[ExpandedTextAd] = js.native
  def withPath1(path1: String): ExpandedTextAdBuilder[ExpandedTextAd] = js.native
  def withPath2(path2: String): ExpandedTextAdBuilder[ExpandedTextAd] = js.native
}

object ExpandedTextAdBuilder {
  @scala.inline
  def apply[ExpandedTextAd](
    build: () => AdWordsOperation[ExpandedTextAdBuilder[ExpandedTextAd]],
    withCustomParameters: js.Object => ExpandedTextAdBuilder[ExpandedTextAd],
    withDescription: String => ExpandedTextAdBuilder[ExpandedTextAd],
    withFinalUrl: String => ExpandedTextAdBuilder[ExpandedTextAd],
    withHeadlinePart1: String => ExpandedTextAdBuilder[ExpandedTextAd],
    withHeadlinePart2: String => ExpandedTextAdBuilder[ExpandedTextAd],
    withMobileFinalUrl: String => ExpandedTextAdBuilder[ExpandedTextAd],
    withPath1: String => ExpandedTextAdBuilder[ExpandedTextAd],
    withPath2: String => ExpandedTextAdBuilder[ExpandedTextAd],
    withTrackingTemplate: String => ExpandedTextAdBuilder[ExpandedTextAd]
  ): ExpandedTextAdBuilder[ExpandedTextAd] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withCustomParameters = js.Any.fromFunction1(withCustomParameters), withDescription = js.Any.fromFunction1(withDescription), withFinalUrl = js.Any.fromFunction1(withFinalUrl), withHeadlinePart1 = js.Any.fromFunction1(withHeadlinePart1), withHeadlinePart2 = js.Any.fromFunction1(withHeadlinePart2), withMobileFinalUrl = js.Any.fromFunction1(withMobileFinalUrl), withPath1 = js.Any.fromFunction1(withPath1), withPath2 = js.Any.fromFunction1(withPath2), withTrackingTemplate = js.Any.fromFunction1(withTrackingTemplate))
    __obj.asInstanceOf[ExpandedTextAdBuilder[ExpandedTextAd]]
  }
  @scala.inline
  implicit class ExpandedTextAdBuilderOps[Self[expandedtextad] <: ExpandedTextAdBuilder[expandedtextad], ExpandedTextAd] (val x: Self[ExpandedTextAd]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ExpandedTextAd] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ExpandedTextAd]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ExpandedTextAd] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ExpandedTextAd] with Other]
    @scala.inline
    def withWithDescription(value: String => ExpandedTextAdBuilder[ExpandedTextAd]): Self[ExpandedTextAd] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withDescription")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithHeadlinePart1(value: String => ExpandedTextAdBuilder[ExpandedTextAd]): Self[ExpandedTextAd] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withHeadlinePart1")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithHeadlinePart2(value: String => ExpandedTextAdBuilder[ExpandedTextAd]): Self[ExpandedTextAd] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withHeadlinePart2")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithPath1(value: String => ExpandedTextAdBuilder[ExpandedTextAd]): Self[ExpandedTextAd] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withPath1")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithPath2(value: String => ExpandedTextAdBuilder[ExpandedTextAd]): Self[ExpandedTextAd] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withPath2")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

