package typingsSlinky.firefoxWebextBrowser.browser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object webRequest {
  
  /**
    * An array of HTTP headers. Each header is represented as a dictionary containing the keys `name` and either `value` or `binaryValue`.
    */
  type HttpHeaders = js.Array[typingsSlinky.firefoxWebextBrowser.browser.webRequest._HttpHeaders]
  
  type OnBeforeRedirectOptions = typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.responseHeaders
  
  type OnCompletedOptions = typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.responseHeaders
  
  type OnResponseStartedOptions = typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.responseHeaders
  
  type OnSendHeadersOptions = typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.requestHeaders
  
  type TransportWeaknessReasons = typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.cipher
  
  /** If the request has been classified this is an array of `UrlClassificationFlags`. */
  type UrlClassificationParty = js.Array[typingsSlinky.firefoxWebextBrowser.browser.webRequest.UrlClassificationFlags]
}
