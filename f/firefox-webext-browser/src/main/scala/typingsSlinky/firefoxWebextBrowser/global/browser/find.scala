package typingsSlinky.firefoxWebextBrowser.global.browser

import typingsSlinky.firefoxWebextBrowser.anon.CaseSensitive
import typingsSlinky.firefoxWebextBrowser.anon.Count
import typingsSlinky.firefoxWebextBrowser.anon.NoScroll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `browser.find` API to interact with the browser's `Find` interface.
  *
  * Permissions: `find`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
@JSGlobal("browser.find")
@js.native
object find extends js.Object {
  
  /* find functions */
  /**
    * Search for text in document and store found ranges in array, in document order.
    * @param queryphrase The string to search for.
    * @param [params] Search parameters.
    */
  def find(queryphrase: String): js.Promise[Count] = js.native
  def find(queryphrase: String, params: CaseSensitive): js.Promise[Count] = js.native
  
  /**
    * Highlight a range
    * @param [params] highlightResults parameters
    */
  def highlightResults(): Unit = js.native
  def highlightResults(params: NoScroll): Unit = js.native
  
  /**
    * Remove all highlighting from previous searches.
    * @param [tabId] Tab to highlight. Defaults to the active tab.
    */
  def removeHighlighting(): Unit = js.native
  def removeHighlighting(tabId: Double): Unit = js.native
}
