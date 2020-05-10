package typingsSlinky.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object or callback function called when performing a search or autocomplete
  * request.
  */
@js.native
trait SearchDelegate extends js.Object {
  /**
    * When an autocomplete request successfully completes, this method returns
    * a data array that is the same as the one passed to the autocomplete
    * callback function.
    */
  var autocompleteDidComplete: js.UndefOr[js.Function1[/* data */ SearchAutocompleteResponse, Unit]] = js.native
  /**
    * Invoked when an autocomplete request fails.
    */
  var autocompleteDidError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.native
  /**
    * Upon successful completion of a search request, this method returns a data
    * object that is the same as the one passed to the search callback function.
    */
  var searchDidComplete: js.UndefOr[js.Function1[/* data */ SearchResponse, Unit]] = js.native
  /**
    * Called when the search request fails.
    */
  var searchDidError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.native
}

object SearchDelegate {
  @scala.inline
  def apply(): SearchDelegate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchDelegate]
  }
  @scala.inline
  implicit class SearchDelegateOps[Self <: SearchDelegate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutocompleteDidComplete(value: /* data */ SearchAutocompleteResponse => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocompleteDidComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAutocompleteDidComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocompleteDidComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withAutocompleteDidError(value: /* error */ js.Error => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocompleteDidError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAutocompleteDidError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocompleteDidError")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchDidComplete(value: /* data */ SearchResponse => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchDidComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSearchDidComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchDidComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchDidError(value: /* error */ js.Error => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchDidError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSearchDidError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchDidError")(js.undefined)
        ret
    }
  }
  
}

