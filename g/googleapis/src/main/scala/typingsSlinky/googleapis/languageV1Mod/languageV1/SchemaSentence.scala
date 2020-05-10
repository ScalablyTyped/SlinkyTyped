package typingsSlinky.googleapis.languageV1Mod.languageV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a sentence in the input document.
  */
@js.native
trait SchemaSentence extends js.Object {
  /**
    * For calls to AnalyzeSentiment or if
    * AnnotateTextRequest.Features.extract_document_sentiment is set to true,
    * this field will contain the sentiment for the sentence.
    */
  var sentiment: js.UndefOr[SchemaSentiment] = js.native
  /**
    * The sentence text.
    */
  var text: js.UndefOr[SchemaTextSpan] = js.native
}

object SchemaSentence {
  @scala.inline
  def apply(): SchemaSentence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSentence]
  }
  @scala.inline
  implicit class SchemaSentenceOps[Self <: SchemaSentence] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSentiment(value: SchemaSentiment): Self = {
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
    def withText(value: SchemaTextSpan): Self = {
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

