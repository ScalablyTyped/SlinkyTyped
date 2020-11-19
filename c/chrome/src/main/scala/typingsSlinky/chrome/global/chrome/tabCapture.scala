package typingsSlinky.chrome.global.chrome

import org.scalajs.dom.experimental.mediastream.MediaStream
import typingsSlinky.chrome.chrome.tabCapture.CaptureInfo
import typingsSlinky.chrome.chrome.tabCapture.CaptureOptions
import typingsSlinky.chrome.chrome.tabCapture.CaptureStatusChangedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// TabCapture
////////////////////
/**
  * Use the chrome.tabCapture API to interact with tab media streams.
  * Permissions:  "tabCapture"
  * @since Chrome 31.
  */
@JSGlobal("chrome.tabCapture")
@js.native
object tabCapture extends js.Object {
  
  def capture(options: CaptureOptions, callback: js.Function1[/* stream */ MediaStream | Null, Unit]): Unit = js.native
  
  def getCapturedTabs(callback: js.Function1[/* result */ js.Array[CaptureInfo], Unit]): Unit = js.native
  
  var onStatusChanged: CaptureStatusChangedEvent = js.native
}
