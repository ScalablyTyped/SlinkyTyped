package typingsSlinky.jupyterlabDocumentsearch.interfacesMod

import typingsSlinky.phosphorSignaling.mod.ISignal
import typingsSlinky.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISearchProvider[T /* <: Widget */] extends js.Object {
  /**
    * Signal indicating that something in the search has changed, so the UI should update
    */
  val changed: ISignal[ISearchProvider[T], Unit] = js.native
  /**
    * The current index of the selected match.
    */
  val currentMatchIndex: Double | Null = js.native
  /**
    * Set to true if the widget under search is read-only, false
    * if it is editable.  Will be used to determine whether to show
    * the replace option.
    */
  val isReadOnly: Boolean = js.native
  /**
    * The same list of matches provided by the startQuery promise resoluton
    */
  val matches: js.Array[ISearchMatch] = js.native
  /**
    * Clears state of a search provider to prepare for startQuery to be called
    * in order to start a new query or refresh an existing one.
    *
    * @returns A promise that resolves when the search provider is ready to
    * begin a new search.
    */
  def endQuery(): js.Promise[Unit] = js.native
  /**
    * Resets UI state as it was before the search process began.  Cleans up and
    * disposes of all internal state.
    *
    * @returns A promise that resolves when all state has been cleaned up.
    */
  def endSearch(): js.Promise[Unit] = js.native
  /**
    * Get an initial query value if applicable so that it can be entered
    * into the search box as an initial query
    *
    * @param searchTarget The widget to be searched
    *
    * @returns Initial value used to populate the search box.
    */
  def getInitialQuery(searchTarget: T): js.Any = js.native
  /**
    * Move the current match indicator to the next match.
    *
    * @returns A promise that resolves once the action has completed.
    */
  def highlightNext(): js.Promise[js.UndefOr[ISearchMatch]] = js.native
  /**
    * Move the current match indicator to the previous match.
    *
    * @returns A promise that resolves once the action has completed.
    */
  def highlightPrevious(): js.Promise[js.UndefOr[ISearchMatch]] = js.native
  /**
    * Replace all matches in the notebook with the provided text
    *
    * @returns A promise that resolves with a boolean indicating whether a replace occurred.
    */
  def replaceAllMatches(newText: String): js.Promise[Boolean] = js.native
  /**
    * Replace the currently selected match with the provided text
    *
    * @returns A promise that resolves with a boolean indicating whether a replace occurred.
    */
  def replaceCurrentMatch(newText: String): js.Promise[Boolean] = js.native
  /**
    * Initialize the search using the provided options.  Should update the UI
    * to highlight all matches and "select" whatever the first match should be.
    *
    * @param query A RegExp to be use to perform the search
    * @param searchTarget The widget to be searched
    *
    * @returns A promise that resolves with a list of all matches
    */
  def startQuery(query: js.RegExp, searchTarget: T): js.Promise[js.Array[ISearchMatch]] = js.native
}

object ISearchProvider {
  @scala.inline
  def apply[T](
    changed: ISignal[ISearchProvider[T], Unit],
    endQuery: () => js.Promise[Unit],
    endSearch: () => js.Promise[Unit],
    getInitialQuery: T => js.Any,
    highlightNext: () => js.Promise[js.UndefOr[ISearchMatch]],
    highlightPrevious: () => js.Promise[js.UndefOr[ISearchMatch]],
    isReadOnly: Boolean,
    matches: js.Array[ISearchMatch],
    replaceAllMatches: String => js.Promise[Boolean],
    replaceCurrentMatch: String => js.Promise[Boolean],
    startQuery: (js.RegExp, T) => js.Promise[js.Array[ISearchMatch]]
  ): ISearchProvider[T] = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], endQuery = js.Any.fromFunction0(endQuery), endSearch = js.Any.fromFunction0(endSearch), getInitialQuery = js.Any.fromFunction1(getInitialQuery), highlightNext = js.Any.fromFunction0(highlightNext), highlightPrevious = js.Any.fromFunction0(highlightPrevious), isReadOnly = isReadOnly.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any], replaceAllMatches = js.Any.fromFunction1(replaceAllMatches), replaceCurrentMatch = js.Any.fromFunction1(replaceCurrentMatch), startQuery = js.Any.fromFunction2(startQuery))
    __obj.asInstanceOf[ISearchProvider[T]]
  }
  @scala.inline
  implicit class ISearchProviderOps[Self[t] <: ISearchProvider[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withChanged(value: ISignal[ISearchProvider[T], Unit]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndQuery(value: () => js.Promise[Unit]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endQuery")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEndSearch(value: () => js.Promise[Unit]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endSearch")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetInitialQuery(value: T => js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInitialQuery")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHighlightNext(value: () => js.Promise[js.UndefOr[ISearchMatch]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightNext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHighlightPrevious(value: () => js.Promise[js.UndefOr[ISearchMatch]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightPrevious")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsReadOnly(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReadOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatches(value: js.Array[ISearchMatch]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplaceAllMatches(value: String => js.Promise[Boolean]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceAllMatches")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReplaceCurrentMatch(value: String => js.Promise[Boolean]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceCurrentMatch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStartQuery(value: (js.RegExp, T) => js.Promise[js.Array[ISearchMatch]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startQuery")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCurrentMatchIndex(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentMatchIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentMatchIndexNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentMatchIndex")(null)
        ret
    }
  }
  
}

