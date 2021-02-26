package typingsSlinky.chrome.global.chrome

import typingsSlinky.chrome.chrome.pageCapture.SaveDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Page Capture
////////////////////
/**
  * Use the chrome.pageCapture API to save a tab as MHTML.
  * Permissions:  "pageCapture"
  * @since Chrome 18.
  */
object pageCapture {
  
  @JSGlobal("chrome.pageCapture.saveAsMHTML")
  @js.native
  def saveAsMHTML(details: SaveDetails, callback: js.Function1[/* mhtmlData */ js.Any, Unit]): Unit = js.native
}
