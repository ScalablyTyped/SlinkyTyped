package typingsSlinky.protractorBrowserLogs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type matchPredicate = java.lang.String | js.RegExp | typingsSlinky.protractorBrowserLogs.mod.matchPredicateFunction
  type matchPredicateFunction = js.Function1[/* entry */ typingsSlinky.seleniumWebdriver.mod.logging.Entry, scala.Boolean]
}
