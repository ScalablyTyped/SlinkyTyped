package typingsSlinky.reactInstantsearchCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectorSearchResults[TDoc] extends StObject {
  
  var error: js.Any = js.native
  
  var isSearchStalled: Boolean = js.native
  
  var results: AllSearchResults[TDoc] = js.native
  
  var searching: Boolean = js.native
  
  var searchingForFacetValues: Boolean = js.native
}
object ConnectorSearchResults {
  
  @scala.inline
  def apply[TDoc](
    error: js.Any,
    isSearchStalled: Boolean,
    results: AllSearchResults[TDoc],
    searching: Boolean,
    searchingForFacetValues: Boolean
  ): ConnectorSearchResults[TDoc] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], isSearchStalled = isSearchStalled.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], searching = searching.asInstanceOf[js.Any], searchingForFacetValues = searchingForFacetValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectorSearchResults[TDoc]]
  }
  
  @scala.inline
  implicit class ConnectorSearchResultsMutableBuilder[Self <: ConnectorSearchResults[_], TDoc] (val x: Self with ConnectorSearchResults[TDoc]) extends AnyVal {
    
    @scala.inline
    def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSearchStalled(value: Boolean): Self = StObject.set(x, "isSearchStalled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResults(value: AllSearchResults[TDoc]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearching(value: Boolean): Self = StObject.set(x, "searching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchingForFacetValues(value: Boolean): Self = StObject.set(x, "searchingForFacetValues", value.asInstanceOf[js.Any])
  }
}
