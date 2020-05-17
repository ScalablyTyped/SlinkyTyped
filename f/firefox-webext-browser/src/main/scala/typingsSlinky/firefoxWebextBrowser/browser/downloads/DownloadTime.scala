package typingsSlinky.firefoxWebextBrowser.browser.downloads

import typingsSlinky.firefoxWebextBrowser.browser.extensionTypes.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A time specified as a Date object, a number or string representing milliseconds since the epoch, or an ISO 8601
  * string
  */
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.firefoxWebextBrowser.browser.extensionTypes.Date
*/
trait DownloadTime extends js.Object

object DownloadTime {
  @scala.inline
  implicit def apply(value: Date): DownloadTime = value.asInstanceOf[DownloadTime]
  @scala.inline
  implicit def apply(value: String): DownloadTime = value.asInstanceOf[DownloadTime]
}

