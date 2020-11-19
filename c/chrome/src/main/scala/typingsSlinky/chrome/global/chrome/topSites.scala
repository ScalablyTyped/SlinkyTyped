package typingsSlinky.chrome.global.chrome

import typingsSlinky.chrome.chrome.topSites.MostVisitedURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Top Sites
////////////////////
/**
  * Use the chrome.topSites API to access the top sites that are displayed on the new tab page.
  * Permissions:  "topSites"
  * @since Chrome 19.
  */
@JSGlobal("chrome.topSites")
@js.native
object topSites extends js.Object {
  
  def get(callback: js.Function1[/* data */ js.Array[MostVisitedURL], Unit]): Unit = js.native
}
