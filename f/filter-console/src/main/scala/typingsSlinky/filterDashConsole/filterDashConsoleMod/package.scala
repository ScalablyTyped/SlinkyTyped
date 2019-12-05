package typingsSlinky.filterDashConsole

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object filterDashConsoleMod {
  import typingsSlinky.filterDashConsole.filterDashConsoleStrings.debug
  import typingsSlinky.filterDashConsole.filterDashConsoleStrings.error
  import typingsSlinky.filterDashConsole.filterDashConsoleStrings.info
  import typingsSlinky.filterDashConsole.filterDashConsoleStrings.log
  import typingsSlinky.filterDashConsole.filterDashConsoleStrings.warn
  import typingsSlinky.std.Record

  type Console = Record[
    log | debug | info | warn | error, 
    js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit]
  ]
}
