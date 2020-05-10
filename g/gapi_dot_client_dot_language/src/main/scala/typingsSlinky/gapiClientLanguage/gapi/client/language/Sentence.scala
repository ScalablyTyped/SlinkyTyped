package typingsSlinky.gapiClientLanguage.gapi.client.language

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sentence extends js.Object {
  /**
    * For calls to AnalyzeSentiment or if
    * AnnotateTextRequest.Features.extract_document_sentiment is set to
    * true, this field will contain the sentiment for the sentence.
    */
  var sentiment: js.UndefOr[Sentiment] = js.native
  /** The sentence text. */
  var text: js.UndefOr[TextSpan] = js.native
}

object Sentence {
  @scala.inline
  def apply(): Sentence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sentence]
  }
  @scala.inline
  implicit class SentenceOps[Self <: Sentence] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSentiment(value: Sentiment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentiment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSentiment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentiment")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: TextSpan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

