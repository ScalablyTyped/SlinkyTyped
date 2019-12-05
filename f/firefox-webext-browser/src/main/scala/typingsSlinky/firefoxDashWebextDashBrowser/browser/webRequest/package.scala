package typingsSlinky.firefoxDashWebextDashBrowser.browser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webRequest {
  import typingsSlinky.firefoxDashWebextDashBrowser.Anon_BinaryValue
  import typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.cipher
  import typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.requestHeaders
  import typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.responseHeaders

  /**
    * An array of HTTP headers. Each header is represented as a dictionary containing the keys `name` and either
    * `value` or `binaryValue`.
    */
  type HttpHeaders = js.Array[Anon_BinaryValue]
  type OnBeforeRedirectOptions = responseHeaders
  type OnCompletedOptions = responseHeaders
  type OnResponseStartedOptions = responseHeaders
  type OnSendHeadersOptions = requestHeaders
  type TransportWeaknessReasons = cipher
  /** If the request has been classified this is an array of `UrlClassificationFlags`. */
  type UrlClassificationParty = js.Array[UrlClassificationFlags]
}
