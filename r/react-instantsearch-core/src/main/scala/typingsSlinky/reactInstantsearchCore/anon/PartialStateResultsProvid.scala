package typingsSlinky.reactInstantsearchCore.anon

import typingsSlinky.reactInstantsearchCore.mod.AlgoliaError
import typingsSlinky.reactInstantsearchCore.mod.AllSearchResults
import typingsSlinky.reactInstantsearchCore.mod.SearchResults
import typingsSlinky.reactInstantsearchCore.mod.SearchState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-instantsearch-core.react-instantsearch-core.StateResultsProvided<any>> */
@js.native
trait PartialStateResultsProvid extends js.Object {
  var allSearchResults: js.UndefOr[AllSearchResults[_]] = js.native
  var error: js.UndefOr[AlgoliaError] = js.native
  var isSearchStalled: js.UndefOr[js.Any] = js.native
  var searchResults: js.UndefOr[SearchResults[_]] = js.native
  var searchState: js.UndefOr[SearchState] = js.native
  var searching: js.UndefOr[Boolean] = js.native
  var searchingForFacetValues: js.UndefOr[js.Any] = js.native
}

object PartialStateResultsProvid {
  @scala.inline
  def apply(): PartialStateResultsProvid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStateResultsProvid]
  }
  @scala.inline
  implicit class PartialStateResultsProvidOps[Self <: PartialStateResultsProvid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllSearchResults(value: AllSearchResults[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allSearchResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllSearchResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allSearchResults")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: AlgoliaError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSearchStalled(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSearchStalled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSearchStalled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSearchStalled")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchResults(value: SearchResults[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchResults")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchState(value: SearchState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchState")(js.undefined)
        ret
    }
    @scala.inline
    def withSearching(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searching")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearching: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searching")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchingForFacetValues(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchingForFacetValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchingForFacetValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchingForFacetValues")(js.undefined)
        ret
    }
  }
  
}

