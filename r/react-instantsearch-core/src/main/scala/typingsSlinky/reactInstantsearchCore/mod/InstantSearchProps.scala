package typingsSlinky.reactInstantsearchCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstantSearchProps extends js.Object {
  var createURL: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var indexName: String = js.native
  var onSearchParameters: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var onSearchStateChange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var refresh: js.UndefOr[Boolean] = js.native
  var resultsState: js.UndefOr[js.Any] = js.native
  var searchClient: js.Any = js.native
  var searchState: js.UndefOr[js.Any] = js.native
  var stalledSearchDelay: js.UndefOr[Double] = js.native
}

object InstantSearchProps {
  @scala.inline
  def apply(indexName: String, searchClient: js.Any): InstantSearchProps = {
    val __obj = js.Dynamic.literal(indexName = indexName.asInstanceOf[js.Any], searchClient = searchClient.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstantSearchProps]
  }
  @scala.inline
  implicit class InstantSearchPropsOps[Self <: InstantSearchProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndexName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchClient(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchClient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateURL(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createURL")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreateURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createURL")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSearchParameters(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSearchParameters")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSearchParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSearchParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSearchStateChange(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSearchStateChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSearchStateChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSearchStateChange")(js.undefined)
        ret
    }
    @scala.inline
    def withRefresh(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refresh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refresh")(js.undefined)
        ret
    }
    @scala.inline
    def withResultsState(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultsState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultsState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultsState")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchState(value: js.Any): Self = {
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
    def withStalledSearchDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stalledSearchDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStalledSearchDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stalledSearchDelay")(js.undefined)
        ret
    }
  }
  
}

