package typingsSlinky.protractorDashBrowserDashLogs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object protractorDashBrowserDashLogsMod {
  import typingsSlinky.seleniumDashWebdriver.seleniumDashWebdriverMod.logging.Entry

  type matchPredicate = String | js.RegExp | matchPredicateFunction
  type matchPredicateFunction = js.Function1[/* entry */ Entry, Boolean]
}
