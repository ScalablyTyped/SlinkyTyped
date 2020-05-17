package typingsSlinky.firefoxWebextBrowser.browser.extensionTypes

import typingsSlinky.firefoxWebextBrowser.browser.downloads.DownloadTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - js.Object
*/
trait Date extends DownloadTime

object Date {
  @scala.inline
  implicit def apply(value: Double): Date = value.asInstanceOf[Date]
  @scala.inline
  implicit def apply(value: js.Object): Date = value.asInstanceOf[Date]
  @scala.inline
  implicit def apply(value: String): Date = value.asInstanceOf[Date]
}

