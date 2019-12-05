package typingsSlinky.firefoxDashWebextDashBrowser.browser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object downloads {
  import typingsSlinky.firefoxDashWebextDashBrowser.browser.extensionTypes.Date

  /**
    * A time specified as a Date object, a number or string representing milliseconds since the epoch, or an ISO 8601
    * string
    */
  type DownloadTime = String | Date
}
