package typingsSlinky.gapiClientLanguage.gapi.client.language

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyzeSentimentResponse extends js.Object {
  /** The overall sentiment of the input document. */
  var documentSentiment: js.UndefOr[Sentiment] = js.native
  /**
    * The language of the text, which will be the same as the language specified
    * in the request or, if not specified, the automatically-detected language.
    * See Document.language field for more details.
    */
  var language: js.UndefOr[String] = js.native
  /** The sentiment for all the sentences in the document. */
  var sentences: js.UndefOr[js.Array[Sentence]] = js.native
}

object AnalyzeSentimentResponse {
  @scala.inline
  def apply(): AnalyzeSentimentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyzeSentimentResponse]
  }
  @scala.inline
  implicit class AnalyzeSentimentResponseOps[Self <: AnalyzeSentimentResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocumentSentiment(value: Sentiment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentSentiment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentSentiment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentSentiment")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withSentences(value: js.Array[Sentence]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSentences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentences")(js.undefined)
        ret
    }
  }
  
}

