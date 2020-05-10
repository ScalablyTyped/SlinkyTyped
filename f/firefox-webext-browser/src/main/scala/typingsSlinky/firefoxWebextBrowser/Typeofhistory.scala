package typingsSlinky.firefoxWebextBrowser

import typingsSlinky.firefoxWebextBrowser.browser.history.HistoryItem
import typingsSlinky.firefoxWebextBrowser.browser.history.VisitItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofhistory extends js.Object {
  /** Fired when the title of a URL is changed in the browser history. */
  val onTitleChanged: WebExtEvent[js.Function1[/* changed */ AnonTitleString, Unit]] = js.native
  /**
    * Fired when one or more URLs are removed from the history service. When all visits have been removed the URL is
    * purged from history.
    */
  val onVisitRemoved: WebExtEvent[js.Function1[/* removed */ AnonAllHistory, Unit]] = js.native
  /* history events */
  /**
    * Fired when a URL is visited, providing the HistoryItem data for that URL. This event fires before the page has
    * loaded.
    */
  val onVisited: WebExtEvent[js.Function1[/* result */ HistoryItem, Unit]] = js.native
  /**
    * Adds a URL to the history with a default visitTime of the current time and a default transition type of "link".
    */
  def addUrl(details: AnonTransition): js.Promise[Unit] = js.native
  /** Deletes all items from the history. */
  def deleteAll(): js.Promise[Unit] = js.native
  /**
    * Removes all items within the specified date range from the history. Pages will not be removed from the history
    * unless all visits fall within the range.
    */
  def deleteRange(range: AnonStartTime): js.Promise[Unit] = js.native
  /** Removes all occurrences of the given URL from the history. */
  def deleteUrl(details: AnonUrlString): js.Promise[Unit] = js.native
  /** Retrieves information about visits to a URL. */
  def getVisits(details: AnonUrlString): js.Promise[js.Array[VisitItem]] = js.native
  /* history functions */
  /** Searches the history for the last visit time of each page matching the query. */
  def search(query: AnonEndTime): js.Promise[js.Array[HistoryItem]] = js.native
}

object Typeofhistory {
  @scala.inline
  def apply(
    addUrl: AnonTransition => js.Promise[Unit],
    deleteAll: () => js.Promise[Unit],
    deleteRange: AnonStartTime => js.Promise[Unit],
    deleteUrl: AnonUrlString => js.Promise[Unit],
    getVisits: AnonUrlString => js.Promise[js.Array[VisitItem]],
    onTitleChanged: WebExtEvent[js.Function1[/* changed */ AnonTitleString, Unit]],
    onVisitRemoved: WebExtEvent[js.Function1[/* removed */ AnonAllHistory, Unit]],
    onVisited: WebExtEvent[js.Function1[/* result */ HistoryItem, Unit]],
    search: AnonEndTime => js.Promise[js.Array[HistoryItem]]
  ): Typeofhistory = {
    val __obj = js.Dynamic.literal(addUrl = js.Any.fromFunction1(addUrl), deleteAll = js.Any.fromFunction0(deleteAll), deleteRange = js.Any.fromFunction1(deleteRange), deleteUrl = js.Any.fromFunction1(deleteUrl), getVisits = js.Any.fromFunction1(getVisits), onTitleChanged = onTitleChanged.asInstanceOf[js.Any], onVisitRemoved = onVisitRemoved.asInstanceOf[js.Any], onVisited = onVisited.asInstanceOf[js.Any], search = js.Any.fromFunction1(search))
    __obj.asInstanceOf[Typeofhistory]
  }
  @scala.inline
  implicit class TypeofhistoryOps[Self <: Typeofhistory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddUrl(value: AnonTransition => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeleteAll(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDeleteRange(value: AnonStartTime => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteRange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeleteUrl(value: AnonUrlString => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetVisits(value: AnonUrlString => js.Promise[js.Array[VisitItem]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVisits")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnTitleChanged(value: WebExtEvent[js.Function1[/* changed */ AnonTitleString, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTitleChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnVisitRemoved(value: WebExtEvent[js.Function1[/* removed */ AnonAllHistory, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVisitRemoved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnVisited(value: WebExtEvent[js.Function1[/* result */ HistoryItem, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVisited")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearch(value: AnonEndTime => js.Promise[js.Array[HistoryItem]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

