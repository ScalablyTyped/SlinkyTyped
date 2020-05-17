package typingsSlinky.reactInstantsearchCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectorSearchResults[TDoc] extends js.Object {
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
  implicit class ConnectorSearchResultsOps[Self[tdoc] <: ConnectorSearchResults[tdoc], TDoc] (val x: Self[TDoc]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TDoc] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TDoc]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TDoc] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TDoc] with Other]
    @scala.inline
    def withError(value: js.Any): Self[TDoc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSearchStalled(value: Boolean): Self[TDoc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSearchStalled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResults(value: AllSearchResults[TDoc]): Self[TDoc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearching(value: Boolean): Self[TDoc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searching")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchingForFacetValues(value: Boolean): Self[TDoc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchingForFacetValues")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

