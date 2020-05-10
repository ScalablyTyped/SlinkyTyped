package typingsSlinky.karma.mod

import typingsSlinky.karma.karmaStrings.debug_
import typingsSlinky.karma.karmaStrings.error_
import typingsSlinky.karma.karmaStrings.info_
import typingsSlinky.karma.karmaStrings.log_
import typingsSlinky.karma.karmaStrings.warn_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowserConsoleLogOptions extends js.Object {
  /**
    * The format is a string where `%b`, `%t`, `%T`, and `%m` are replaced with the browser string,
    * log type in lower-case, log type in uppercase, and log message, respectively.
    * This format will only effect the output file
    */
  var format: js.UndefOr[String] = js.native
  /** the desired log-level, where level log always is logged */
  var level: js.UndefOr[log_ | error_ | warn_ | info_ | debug_] = js.native
  /** output-path of the output-file */
  var path: js.UndefOr[String] = js.native
  /** if the log should be written in the terminal, or not */
  var terminal: js.UndefOr[Boolean] = js.native
}

object BrowserConsoleLogOptions {
  @scala.inline
  def apply(): BrowserConsoleLogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserConsoleLogOptions]
  }
  @scala.inline
  implicit class BrowserConsoleLogOptionsOps[Self <: BrowserConsoleLogOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel(value: log_ | error_ | warn_ | info_ | debug_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withTerminal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerminal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminal")(js.undefined)
        ret
    }
  }
  
}

