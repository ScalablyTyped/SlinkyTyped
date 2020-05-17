package typingsSlinky.chrome.global.chrome

import typingsSlinky.chrome.chrome.pageCapture.SaveDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////
// Page Capture
////////////////////
/**
  * Use the chrome.pageCapture API to save a tab as MHTML.
  * Permissions:  "pageCapture"
  * @since Chrome 18.
  */
@JSGlobal("chrome.pageCapture")
@js.native
object pageCapture extends js.Object {
  def saveAsMHTML(details: SaveDetails, callback: js.Function1[/* mhtmlData */ js.Any, Unit]): Unit = js.native
}

