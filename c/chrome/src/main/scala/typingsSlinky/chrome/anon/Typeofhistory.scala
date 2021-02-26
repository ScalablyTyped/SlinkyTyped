package typingsSlinky.chrome.anon

import typingsSlinky.chrome.chrome.history.HistoryItem
import typingsSlinky.chrome.chrome.history.HistoryQuery
import typingsSlinky.chrome.chrome.history.HistoryVisitRemovedEvent
import typingsSlinky.chrome.chrome.history.HistoryVisitedEvent
import typingsSlinky.chrome.chrome.history.Range
import typingsSlinky.chrome.chrome.history.Url
import typingsSlinky.chrome.chrome.history.VisitItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofhistory extends StObject {
  
  def addUrl(details: Url): Unit = js.native
  def addUrl(details: Url, callback: js.Function0[Unit]): Unit = js.native
  
  def deleteAll(callback: js.Function0[Unit]): Unit = js.native
  
  def deleteRange(range: Range, callback: js.Function0[Unit]): Unit = js.native
  
  def deleteUrl(details: Url): Unit = js.native
  def deleteUrl(details: Url, callback: js.Function0[Unit]): Unit = js.native
  
  def getVisits(details: Url, callback: js.Function1[/* results */ js.Array[VisitItem], Unit]): Unit = js.native
  
  var onVisitRemoved: HistoryVisitRemovedEvent = js.native
  
  var onVisited: HistoryVisitedEvent = js.native
  
  def search(query: HistoryQuery, callback: js.Function1[/* results */ js.Array[HistoryItem], Unit]): Unit = js.native
}
