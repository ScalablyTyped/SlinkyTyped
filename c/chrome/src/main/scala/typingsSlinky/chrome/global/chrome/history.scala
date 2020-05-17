package typingsSlinky.chrome.global.chrome

import typingsSlinky.chrome.chrome.history.HistoryItem
import typingsSlinky.chrome.chrome.history.HistoryQuery
import typingsSlinky.chrome.chrome.history.HistoryVisitRemovedEvent
import typingsSlinky.chrome.chrome.history.HistoryVisitedEvent
import typingsSlinky.chrome.chrome.history.Range
import typingsSlinky.chrome.chrome.history.Url
import typingsSlinky.chrome.chrome.history.VisitItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////
// History
////////////////////
/**
  * Use the chrome.history API to interact with the browser's record of visited pages. You can add, remove, and query for URLs in the browser's history. To override the history page with your own version, see Override Pages.
  * Availability: Since Chrome 5.
  * Permissions:  "history"
  */
@JSGlobal("chrome.history")
@js.native
object history extends js.Object {
  var onVisitRemoved: HistoryVisitRemovedEvent = js.native
  var onVisited: HistoryVisitedEvent = js.native
  def addUrl(details: Url): Unit = js.native
  def addUrl(details: Url, callback: js.Function0[Unit]): Unit = js.native
  def deleteAll(callback: js.Function0[Unit]): Unit = js.native
  def deleteRange(range: Range, callback: js.Function0[Unit]): Unit = js.native
  def deleteUrl(details: Url): Unit = js.native
  def deleteUrl(details: Url, callback: js.Function0[Unit]): Unit = js.native
  def getVisits(details: Url, callback: js.Function1[/* results */ js.Array[VisitItem], Unit]): Unit = js.native
  def search(query: HistoryQuery, callback: js.Function1[/* results */ js.Array[HistoryItem], Unit]): Unit = js.native
}

