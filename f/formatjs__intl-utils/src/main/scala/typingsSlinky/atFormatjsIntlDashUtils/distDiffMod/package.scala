package typingsSlinky.atFormatjsIntlDashUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distDiffMod {
  import typingsSlinky.atFormatjsIntlDashUtils.atFormatjsIntlDashUtilsStrings.day
  import typingsSlinky.atFormatjsIntlDashUtils.atFormatjsIntlDashUtilsStrings.hour
  import typingsSlinky.atFormatjsIntlDashUtils.atFormatjsIntlDashUtilsStrings.minute
  import typingsSlinky.atFormatjsIntlDashUtils.atFormatjsIntlDashUtilsStrings.second
  import typingsSlinky.std.Record

  type Thresholds = Record[second | minute | hour | day, Double]
}
