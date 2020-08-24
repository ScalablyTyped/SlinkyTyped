package typingsSlinky.firefoxWebextBrowser.global.browser

import typingsSlinky.firefoxWebextBrowser.WebExtEvent
import typingsSlinky.firefoxWebextBrowser.anon.AllHistory
import typingsSlinky.firefoxWebextBrowser.anon.EndTime
import typingsSlinky.firefoxWebextBrowser.anon.StartTime
import typingsSlinky.firefoxWebextBrowser.anon.TitleStringUrlString
import typingsSlinky.firefoxWebextBrowser.anon.Transition
import typingsSlinky.firefoxWebextBrowser.anon.UrlString
import typingsSlinky.firefoxWebextBrowser.browser.history.HistoryItem
import typingsSlinky.firefoxWebextBrowser.browser.history.VisitItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Use the `browser.history` API to interact with the browser's record of visited pages. You can add, remove, and query
  * for URLs in the browser's history. To override the history page with your own version, see Override Pages.
  *
  * Permissions: `history`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
@JSGlobal("browser.history")
@js.native
object history extends js.Object {
  /** Fired when the title of a URL is changed in the browser history. */
  val onTitleChanged: WebExtEvent[js.Function1[/* changed */ TitleStringUrlString, Unit]] = js.native
  /**
    * Fired when one or more URLs are removed from the history service. When all visits have been removed the URL is
    * purged from history.
    */
  val onVisitRemoved: WebExtEvent[js.Function1[/* removed */ AllHistory, Unit]] = js.native
  /* history events */
  /**
    * Fired when a URL is visited, providing the HistoryItem data for that URL. This event fires before the page has
    * loaded.
    */
  val onVisited: WebExtEvent[js.Function1[/* result */ HistoryItem, Unit]] = js.native
  /**
    * Adds a URL to the history with a default visitTime of the current time and a default transition type of "link".
    */
  def addUrl(details: Transition): js.Promise[Unit] = js.native
  /** Deletes all items from the history. */
  def deleteAll(): js.Promise[Unit] = js.native
  /**
    * Removes all items within the specified date range from the history. Pages will not be removed from the history
    * unless all visits fall within the range.
    */
  def deleteRange(range: StartTime): js.Promise[Unit] = js.native
  /** Removes all occurrences of the given URL from the history. */
  def deleteUrl(details: UrlString): js.Promise[Unit] = js.native
  /** Retrieves information about visits to a URL. */
  def getVisits(details: UrlString): js.Promise[js.Array[VisitItem]] = js.native
  /* history functions */
  /** Searches the history for the last visit time of each page matching the query. */
  def search(query: EndTime): js.Promise[js.Array[HistoryItem]] = js.native
}

