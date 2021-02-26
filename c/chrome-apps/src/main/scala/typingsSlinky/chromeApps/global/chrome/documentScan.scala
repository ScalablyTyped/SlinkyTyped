package typingsSlinky.chromeApps.global.chrome

import typingsSlinky.chromeApps.chrome.documentScan.DocumentScanCallbackArg
import typingsSlinky.chromeApps.chrome.documentScan.DocumentScanOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.documentScan
///////////////////
// Document Scan //
///////////////////
/**
  * Use the chrome.documentScan API to discover and retrieve
  * images from attached paper document scanners.
  *
  * The Document Scan API is designed to allow apps to view
  * the content of paper documents on an attached document scanner.
  *
  * *Note: This API depends on OS features that may not be available*
  * *depending on the underlying operating system. As of this writing only*
  * *Chrome OS for certain USB-attached devices is known to successfully work.*
  *
  * @since Chrome 44.
  * @requires Permissions: 'documentScan'
  * @requires Important: This API works only on Chrome OS.
  */
object documentScan {
  
  /**
    * Performs a document scan. On success, the PNG data will be sent to the callback.
    * @param options Object containing scan parameters.
    * @param callback Called with the result and data from the scan.
    */
  @JSGlobal("chrome.documentScan.scan")
  @js.native
  def scan(options: DocumentScanOptions, callback: js.Function1[/* result */ DocumentScanCallbackArg, Unit]): Unit = js.native
}
