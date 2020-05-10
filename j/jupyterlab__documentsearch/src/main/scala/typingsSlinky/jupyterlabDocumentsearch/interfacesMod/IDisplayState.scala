package typingsSlinky.jupyterlabDocumentsearch.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDisplayState extends js.Object {
  /**
    * Should the search be case sensitive?
    */
  var caseSensitive: Boolean = js.native
  /**
    * The index of the currently selected match
    */
  var currentIndex: Double = js.native
  /**
    * An error message (used for bad regex syntax)
    */
  var errorMessage: String = js.native
  /**
    * Should the focus forced into the input on the next render?
    */
  var forceFocus: Boolean = js.native
  /**
    * The query constructed from the text and the case/regex flags
    */
  var query: js.RegExp = js.native
  /**
    * Whether or not the replace entry row is visible
    */
  var replaceEntryShown: Boolean = js.native
  /**
    * Whether or not the replace input is currently focused
    */
  var replaceInputFocused: Boolean = js.native
  /**
    * The text in the replace entry
    */
  var replaceText: String = js.native
  /**
    * Whether or not the search input is currently focused
    */
  var searchInputFocused: Boolean = js.native
  /**
    * The text in the search entry
    */
  var searchText: String = js.native
  /**
    * The total number of matches found in the document
    */
  var totalMatches: Double = js.native
  /**
    * Should the search string be treated as a RegExp?
    */
  var useRegex: Boolean = js.native
}

object IDisplayState {
  @scala.inline
  def apply(
    caseSensitive: Boolean,
    currentIndex: Double,
    errorMessage: String,
    forceFocus: Boolean,
    query: js.RegExp,
    replaceEntryShown: Boolean,
    replaceInputFocused: Boolean,
    replaceText: String,
    searchInputFocused: Boolean,
    searchText: String,
    totalMatches: Double,
    useRegex: Boolean
  ): IDisplayState = {
    val __obj = js.Dynamic.literal(caseSensitive = caseSensitive.asInstanceOf[js.Any], currentIndex = currentIndex.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], forceFocus = forceFocus.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], replaceEntryShown = replaceEntryShown.asInstanceOf[js.Any], replaceInputFocused = replaceInputFocused.asInstanceOf[js.Any], replaceText = replaceText.asInstanceOf[js.Any], searchInputFocused = searchInputFocused.asInstanceOf[js.Any], searchText = searchText.asInstanceOf[js.Any], totalMatches = totalMatches.asInstanceOf[js.Any], useRegex = useRegex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDisplayState]
  }
  @scala.inline
  implicit class IDisplayStateOps[Self <: IDisplayState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaseSensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForceFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplaceEntryShown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceEntryShown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplaceInputFocused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceInputFocused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplaceText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchInputFocused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchInputFocused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalMatches(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalMatches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseRegex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useRegex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

