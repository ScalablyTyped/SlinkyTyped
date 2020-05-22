package typingsSlinky.lolex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * Clock object created by calling `install();`.
    *
    * @type TClock   type of base clock (e.g BrowserClock).
    */
  type InstalledClock[TClock /* <: typingsSlinky.lolex.mod.Clock */] = TClock with typingsSlinky.lolex.mod.InstalledMethods
  type TimerId = scala.Double | typingsSlinky.lolex.mod.NodeTimer
}
