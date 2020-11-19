package typingsSlinky.frecency.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchResults[T] extends js.Object {
  
  var searchQuery: T = js.native
  
  var searchResults: js.Array[T] = js.native
}
object SearchResults {
  
  @scala.inline
  def apply[T](searchQuery: T, searchResults: js.Array[T]): SearchResults[T] = {
    val __obj = js.Dynamic.literal(searchQuery = searchQuery.asInstanceOf[js.Any], searchResults = searchResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResults[T]]
  }
  
  @scala.inline
  implicit class SearchResultsOps[Self <: SearchResults[_], T] (val x: Self with SearchResults[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSearchQuery(value: T): Self = this.set("searchQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchResultsVarargs(value: T*): Self = this.set("searchResults", js.Array(value :_*))
    
    @scala.inline
    def setSearchResults(value: js.Array[T]): Self = this.set("searchResults", value.asInstanceOf[js.Any])
  }
}
