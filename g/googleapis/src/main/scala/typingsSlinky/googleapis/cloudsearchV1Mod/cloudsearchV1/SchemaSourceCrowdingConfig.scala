package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Set search results crowding limits. Crowding is a situation in which
  * multiple results from the same source or host &quot;crowd out&quot; other
  * results, diminishing the quality of search for users. To foster better
  * search quality and source diversity in search results, you can set a
  * condition to reduce repetitive results by source.
  */
@js.native
trait SchemaSourceCrowdingConfig extends StObject {
  
  /**
    * Use a field to control results crowding. For example, if you want to
    * control overly similar results from Gmail topics, use `thread_id`. For
    * similar pages from Google Sites, you can use `webspace_id`. When matching
    * query results contain the same field value in `GenericMetadata`, crowding
    * limits are set on those records.
    */
  var field: js.UndefOr[String] = js.native
  
  /**
    * Maximum number of results allowed from a source. No limits will be set on
    * results if this value is less than or equal to 0.
    */
  var numResults: js.UndefOr[Double] = js.native
  
  /**
    * Maximum number of suggestions allowed from a source. No limits will be
    * set on results if this value is less than or equal to 0.
    */
  var numSuggestions: js.UndefOr[Double] = js.native
  
  /**
    * Control results by content source. This option limits the total number of
    * results from a given source and ignores field-based crowding control.
    */
  var source: js.UndefOr[Boolean] = js.native
}
object SchemaSourceCrowdingConfig {
  
  @scala.inline
  def apply(): SchemaSourceCrowdingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceCrowdingConfig]
  }
  
  @scala.inline
  implicit class SchemaSourceCrowdingConfigMutableBuilder[Self <: SchemaSourceCrowdingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setNumResults(value: Double): Self = StObject.set(x, "numResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumResultsUndefined: Self = StObject.set(x, "numResults", js.undefined)
    
    @scala.inline
    def setNumSuggestions(value: Double): Self = StObject.set(x, "numSuggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumSuggestionsUndefined: Self = StObject.set(x, "numSuggestions", js.undefined)
    
    @scala.inline
    def setSource(value: Boolean): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
