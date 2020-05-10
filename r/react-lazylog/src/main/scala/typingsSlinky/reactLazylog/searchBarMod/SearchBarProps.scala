package typingsSlinky.reactLazylog.searchBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchBarProps extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.native
  var filterActive: js.UndefOr[Boolean] = js.native
  var onClearSearch: js.UndefOr[js.Function0[Unit]] = js.native
  var onFilterLinesWithMatches: js.UndefOr[js.Function1[/* isFiltered */ Boolean, Unit]] = js.native
  var onSearch: js.UndefOr[js.Function1[/* keyword */ String, Unit]] = js.native
  var resultsCount: js.UndefOr[Double] = js.native
}

object SearchBarProps {
  @scala.inline
  def apply(): SearchBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchBarProps]
  }
  @scala.inline
  implicit class SearchBarPropsOps[Self <: SearchBarProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterActive")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClearSearch(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClearSearch")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnClearSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClearSearch")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFilterLinesWithMatches(value: /* isFiltered */ Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFilterLinesWithMatches")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFilterLinesWithMatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFilterLinesWithMatches")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSearch(value: /* keyword */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSearch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSearch")(js.undefined)
        ret
    }
    @scala.inline
    def withResultsCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultsCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultsCount")(js.undefined)
        ret
    }
  }
  
}

