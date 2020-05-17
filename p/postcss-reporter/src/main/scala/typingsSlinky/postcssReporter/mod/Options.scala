package typingsSlinky.postcssReporter.mod

import typingsSlinky.postcss.mod.ResultMessage
import typingsSlinky.postcssReporter.anon.Messages
import typingsSlinky.postcssReporter.postcssReporterStrings.any
import typingsSlinky.postcssReporter.postcssReporterStrings.first
import typingsSlinky.postcssReporter.postcssReporterStrings.last
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional options
  */
@js.native
trait Options extends DefaultOptions {
  /**
    * If true, not pass any messages into other plugins, or the whatever runner you use, for logging.
    * @default false
    */
  var clearAllMessages: js.UndefOr[Boolean] = js.native
  /**
    * If true, the plugin will clear the result's messages after it logs them.
    * This prevents other plugins, or the whatever runner you use, from logging the same information again and causing confusion.
    * @default false
    */
  var clearReportedMessages: js.UndefOr[Boolean] = js.native
  /**
    * Provide a filter function. It receives the message object and returns a truthy or falsy value,
    * indicating whether that particular message should be reported or not.
    */
  var filter: js.UndefOr[js.Function1[/* message */ ResultMessage, Boolean]] = js.native
  /**
    * By default, this reporter will format the messages for human legibility in the console.
    * To use another formatter, pass a function that
    * - accepts an object containing a messages array and a source string
    * - returns the string to report
    */
  var formatter: js.UndefOr[js.Function1[/* input */ Messages, String]] = js.native
  /**
    * If plugins is empty (as it is by default),
    * the reporter will log messages from every PostCSS plugin.
    * @default []
    */
  var plugins: js.UndefOr[js.Array[String]] = js.native
  /**
    * By default, messages without line/column positions will be grouped at the beginning of the output.
    * To put them at the end, instead, use "last". To not bother sorting these, use "any".
    * @default 'first'
    */
  var positionless: js.UndefOr[first | last | any] = js.native
  /**
    * If true, after the plugin logs your messages it will throw an error if it found any warnings.
    * @default false
    */
  var throwError: js.UndefOr[Boolean] = js.native
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
    def withClearAllMessages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearAllMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearAllMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearAllMessages")(js.undefined)
        ret
    }
    @scala.inline
    def withClearReportedMessages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearReportedMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearReportedMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearReportedMessages")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: /* message */ ResultMessage => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatter(value: /* input */ Messages => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionless(value: first | last | any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionless")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionless: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionless")(js.undefined)
        ret
    }
    @scala.inline
    def withThrowError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throwError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrowError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throwError")(js.undefined)
        ret
    }
  }
  
}

