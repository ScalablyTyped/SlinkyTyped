package typingsSlinky.googleapis.languageV1beta1Mod.languageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The text annotations response message.
  */
@js.native
trait SchemaAnnotateTextResponse extends StObject {
  
  /**
    * The overall sentiment for the document. Populated if the user enables
    * AnnotateTextRequest.Features.extract_document_sentiment.
    */
  var documentSentiment: js.UndefOr[SchemaSentiment] = js.native
  
  /**
    * Entities, along with their semantic information, in the input document.
    * Populated if the user enables
    * AnnotateTextRequest.Features.extract_entities.
    */
  var entities: js.UndefOr[js.Array[SchemaEntity]] = js.native
  
  /**
    * The language of the text, which will be the same as the language
    * specified in the request or, if not specified, the automatically-detected
    * language. See Document.language field for more details.
    */
  var language: js.UndefOr[String] = js.native
  
  /**
    * Sentences in the input document. Populated if the user enables
    * AnnotateTextRequest.Features.extract_syntax.
    */
  var sentences: js.UndefOr[js.Array[SchemaSentence]] = js.native
  
  /**
    * Tokens, along with their syntactic information, in the input document.
    * Populated if the user enables
    * AnnotateTextRequest.Features.extract_syntax.
    */
  var tokens: js.UndefOr[js.Array[SchemaToken]] = js.native
}
object SchemaAnnotateTextResponse {
  
  @scala.inline
  def apply(): SchemaAnnotateTextResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnnotateTextResponse]
  }
  
  @scala.inline
  implicit class SchemaAnnotateTextResponseMutableBuilder[Self <: SchemaAnnotateTextResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentSentiment(value: SchemaSentiment): Self = StObject.set(x, "documentSentiment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentSentimentUndefined: Self = StObject.set(x, "documentSentiment", js.undefined)
    
    @scala.inline
    def setEntities(value: js.Array[SchemaEntity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    @scala.inline
    def setEntitiesVarargs(value: SchemaEntity*): Self = StObject.set(x, "entities", js.Array(value :_*))
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setSentences(value: js.Array[SchemaSentence]): Self = StObject.set(x, "sentences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentencesUndefined: Self = StObject.set(x, "sentences", js.undefined)
    
    @scala.inline
    def setSentencesVarargs(value: SchemaSentence*): Self = StObject.set(x, "sentences", js.Array(value :_*))
    
    @scala.inline
    def setTokens(value: js.Array[SchemaToken]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
    
    @scala.inline
    def setTokensVarargs(value: SchemaToken*): Self = StObject.set(x, "tokens", js.Array(value :_*))
  }
}
