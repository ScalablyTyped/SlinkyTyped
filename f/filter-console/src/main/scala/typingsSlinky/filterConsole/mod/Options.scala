package typingsSlinky.filterConsole.mod

import typingsSlinky.filterConsole.filterConsoleStrings.debug
import typingsSlinky.filterConsole.filterConsoleStrings.error
import typingsSlinky.filterConsole.filterConsoleStrings.info
import typingsSlinky.filterConsole.filterConsoleStrings.log
import typingsSlinky.filterConsole.filterConsoleStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
  		Use a custom `console` object. Can be useful for testing or mocking.
  		@default console
  		*/
  val console: js.UndefOr[Console] = js.native
  /**
  		Console methods to filter.
  		@default ['log', 'debug', 'info', 'warn', 'error']
  		*/
  val methods: js.UndefOr[js.Array[log | debug | info | warn | error]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsole(value: Console): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("console")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("console")(js.undefined)
        ret
    }
    @scala.inline
    def withMethods(value: js.Array[log | debug | info | warn | error]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methods")(js.undefined)
        ret
    }
  }
  
}

