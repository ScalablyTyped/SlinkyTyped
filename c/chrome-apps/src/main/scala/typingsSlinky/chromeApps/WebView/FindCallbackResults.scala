package typingsSlinky.chromeApps.WebView

import typingsSlinky.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains all of the results of the find request. */
@js.native
trait FindCallbackResults extends js.Object {
  /** The ordinal number of the current match. */
  var activeMatchOrdinal: integer = js.native
  /** Indicates whether this find request was canceled. */
  var canceled: Boolean = js.native
  /** The number of times searchText was matched on the page. */
  var numberOfMatches: integer = js.native
  /** Describes a rectangle around the active match in screen coordinates. */
  var selectionRect: SelectionRect = js.native
}

object FindCallbackResults {
  @scala.inline
  def apply(
    activeMatchOrdinal: integer,
    canceled: Boolean,
    numberOfMatches: integer,
    selectionRect: SelectionRect
  ): FindCallbackResults = {
    val __obj = js.Dynamic.literal(activeMatchOrdinal = activeMatchOrdinal.asInstanceOf[js.Any], canceled = canceled.asInstanceOf[js.Any], numberOfMatches = numberOfMatches.asInstanceOf[js.Any], selectionRect = selectionRect.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindCallbackResults]
  }
  @scala.inline
  implicit class FindCallbackResultsOps[Self <: FindCallbackResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveMatchOrdinal(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeMatchOrdinal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanceled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canceled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberOfMatches(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfMatches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionRect(value: SelectionRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionRect")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

