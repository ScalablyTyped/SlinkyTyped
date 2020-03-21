package typingsSlinky.filterConsole.mod

import typingsSlinky.filterConsole.filterConsoleStrings.debug
import typingsSlinky.filterConsole.filterConsoleStrings.error
import typingsSlinky.filterConsole.filterConsoleStrings.info
import typingsSlinky.filterConsole.filterConsoleStrings.log
import typingsSlinky.filterConsole.filterConsoleStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Use a custom `console` object. Can be useful for testing or mocking.
  		@default console
  		*/
  val console: js.UndefOr[Console] = js.undefined
  /**
  		Console methods to filter.
  		@default ['log', 'debug', 'info', 'warn', 'error']
  		*/
  val methods: js.UndefOr[js.Array[log | debug | info | warn | error]] = js.undefined
}

object Options {
  @scala.inline
  def apply(console: Console = null, methods: js.Array[log | debug | info | warn | error] = null): Options = {
    val __obj = js.Dynamic.literal()
    if (console != null) __obj.updateDynamic("console")(console.asInstanceOf[js.Any])
    if (methods != null) __obj.updateDynamic("methods")(methods.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

