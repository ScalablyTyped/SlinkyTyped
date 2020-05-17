package typingsSlinky.frecency.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class SearchResultsOps[Self[t] <: SearchResults[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withSearchQuery(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchResults(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchResults")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

