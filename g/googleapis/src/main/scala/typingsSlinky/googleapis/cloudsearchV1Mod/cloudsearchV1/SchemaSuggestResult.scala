package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * One suggestion result.
  */
@js.native
trait SchemaSuggestResult extends StObject {
  
  var peopleSuggestion: js.UndefOr[SchemaPeopleSuggestion] = js.native
  
  var querySuggestion: js.UndefOr[SchemaQuerySuggestion] = js.native
  
  /**
    * The source of the suggestion.
    */
  var source: js.UndefOr[SchemaSource] = js.native
  
  /**
    * The suggested query that will be used for search, when the user clicks on
    * the suggestion
    */
  var suggestedQuery: js.UndefOr[String] = js.native
}
object SchemaSuggestResult {
  
  @scala.inline
  def apply(): SchemaSuggestResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuggestResult]
  }
  
  @scala.inline
  implicit class SchemaSuggestResultMutableBuilder[Self <: SchemaSuggestResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPeopleSuggestion(value: SchemaPeopleSuggestion): Self = StObject.set(x, "peopleSuggestion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeopleSuggestionUndefined: Self = StObject.set(x, "peopleSuggestion", js.undefined)
    
    @scala.inline
    def setQuerySuggestion(value: SchemaQuerySuggestion): Self = StObject.set(x, "querySuggestion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuerySuggestionUndefined: Self = StObject.set(x, "querySuggestion", js.undefined)
    
    @scala.inline
    def setSource(value: SchemaSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setSuggestedQuery(value: String): Self = StObject.set(x, "suggestedQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedQueryUndefined: Self = StObject.set(x, "suggestedQuery", js.undefined)
  }
}
