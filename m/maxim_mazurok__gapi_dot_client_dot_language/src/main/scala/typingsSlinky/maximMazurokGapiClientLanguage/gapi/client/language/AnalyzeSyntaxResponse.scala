package typingsSlinky.maximMazurokGapiClientLanguage.gapi.client.language

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyzeSyntaxResponse extends StObject {
  
  /**
    * The language of the text, which will be the same as the language specified in the request or, if not specified, the automatically-detected language. See Document.language field for
    * more details.
    */
  var language: js.UndefOr[String] = js.native
  
  /** Sentences in the input document. */
  var sentences: js.UndefOr[js.Array[Sentence]] = js.native
  
  /** Tokens, along with their syntactic information, in the input document. */
  var tokens: js.UndefOr[js.Array[Token]] = js.native
}
object AnalyzeSyntaxResponse {
  
  @scala.inline
  def apply(): AnalyzeSyntaxResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyzeSyntaxResponse]
  }
  
  @scala.inline
  implicit class AnalyzeSyntaxResponseMutableBuilder[Self <: AnalyzeSyntaxResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setSentences(value: js.Array[Sentence]): Self = StObject.set(x, "sentences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentencesUndefined: Self = StObject.set(x, "sentences", js.undefined)
    
    @scala.inline
    def setSentencesVarargs(value: Sentence*): Self = StObject.set(x, "sentences", js.Array(value :_*))
    
    @scala.inline
    def setTokens(value: js.Array[Token]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
    
    @scala.inline
    def setTokensVarargs(value: Token*): Self = StObject.set(x, "tokens", js.Array(value :_*))
  }
}
