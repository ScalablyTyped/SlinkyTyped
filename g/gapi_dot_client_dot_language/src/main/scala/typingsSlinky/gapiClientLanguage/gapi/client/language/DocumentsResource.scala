package typingsSlinky.gapiClientLanguage.gapi.client.language

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientLanguage.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentsResource extends js.Object {
  /**
    * Finds named entities (currently proper names and common nouns) in the text
    * along with entity types, salience, mentions for each entity, and
    * other properties.
    */
  def analyzeEntities(request: AnonAccesstoken): Request_[AnalyzeEntitiesResponse] = js.native
  /**
    * Finds entities, similar to AnalyzeEntities in the text and analyzes
    * sentiment associated with each entity and its mentions.
    */
  def analyzeEntitySentiment(request: AnonAccesstoken): Request_[AnalyzeEntitySentimentResponse] = js.native
  /** Analyzes the sentiment of the provided text. */
  def analyzeSentiment(request: AnonAccesstoken): Request_[AnalyzeSentimentResponse] = js.native
  /**
    * Analyzes the syntax of the text and provides sentence boundaries and
    * tokenization along with part of speech tags, dependency trees, and other
    * properties.
    */
  def analyzeSyntax(request: AnonAccesstoken): Request_[AnalyzeSyntaxResponse] = js.native
  /**
    * A convenience method that provides all the features that analyzeSentiment,
    * analyzeEntities, and analyzeSyntax provide in one call.
    */
  def annotateText(request: AnonAccesstoken): Request_[AnnotateTextResponse] = js.native
}

object DocumentsResource {
  @scala.inline
  def apply(
    analyzeEntities: AnonAccesstoken => Request_[AnalyzeEntitiesResponse],
    analyzeEntitySentiment: AnonAccesstoken => Request_[AnalyzeEntitySentimentResponse],
    analyzeSentiment: AnonAccesstoken => Request_[AnalyzeSentimentResponse],
    analyzeSyntax: AnonAccesstoken => Request_[AnalyzeSyntaxResponse],
    annotateText: AnonAccesstoken => Request_[AnnotateTextResponse]
  ): DocumentsResource = {
    val __obj = js.Dynamic.literal(analyzeEntities = js.Any.fromFunction1(analyzeEntities), analyzeEntitySentiment = js.Any.fromFunction1(analyzeEntitySentiment), analyzeSentiment = js.Any.fromFunction1(analyzeSentiment), analyzeSyntax = js.Any.fromFunction1(analyzeSyntax), annotateText = js.Any.fromFunction1(annotateText))
    __obj.asInstanceOf[DocumentsResource]
  }
  @scala.inline
  implicit class DocumentsResourceOps[Self <: DocumentsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnalyzeEntities(value: AnonAccesstoken => Request_[AnalyzeEntitiesResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyzeEntities")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAnalyzeEntitySentiment(value: AnonAccesstoken => Request_[AnalyzeEntitySentimentResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyzeEntitySentiment")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAnalyzeSentiment(value: AnonAccesstoken => Request_[AnalyzeSentimentResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyzeSentiment")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAnalyzeSyntax(value: AnonAccesstoken => Request_[AnalyzeSyntaxResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyzeSyntax")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAnnotateText(value: AnonAccesstoken => Request_[AnnotateTextResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotateText")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

