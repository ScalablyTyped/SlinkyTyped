package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request of suggest API.
  */
@js.native
trait SchemaSuggestRequest extends StObject {
  
  /**
    * The sources to use for suggestions. If not specified, all data sources
    * from the current search application are used.
    */
  var dataSourceRestrictions: js.UndefOr[js.Array[SchemaDataSourceRestriction]] = js.native
  
  /**
    * Partial query for the completion suggestion.
    */
  var query: js.UndefOr[String] = js.native
  
  /**
    * Request options, such as the search application and user timezone.
    */
  var requestOptions: js.UndefOr[SchemaRequestOptions] = js.native
}
object SchemaSuggestRequest {
  
  @scala.inline
  def apply(): SchemaSuggestRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuggestRequest]
  }
  
  @scala.inline
  implicit class SchemaSuggestRequestMutableBuilder[Self <: SchemaSuggestRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSourceRestrictions(value: js.Array[SchemaDataSourceRestriction]): Self = StObject.set(x, "dataSourceRestrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceRestrictionsUndefined: Self = StObject.set(x, "dataSourceRestrictions", js.undefined)
    
    @scala.inline
    def setDataSourceRestrictionsVarargs(value: SchemaDataSourceRestriction*): Self = StObject.set(x, "dataSourceRestrictions", js.Array(value :_*))
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setRequestOptions(value: SchemaRequestOptions): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
  }
}
