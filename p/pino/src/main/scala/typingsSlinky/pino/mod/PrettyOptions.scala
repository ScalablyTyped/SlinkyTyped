package typingsSlinky.pino.mod

import typingsSlinky.pino.pinoBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrettyOptions extends js.Object {
  /**
    * If set to true, will add color information to the formatted output message. Default: `false`.
    */
  var colorize: js.UndefOr[Boolean] = js.native
  /**
    * Appends carriage return and line feed, instead of just a line feed, to the formatted log line.
    */
  var crlf: js.UndefOr[Boolean] = js.native
  /**
    * Define the log keys that are associated with error like objects. Default: ["err", "error"]
    */
  var errorLikeObjectKeys: js.UndefOr[js.Array[String]] = js.native
  /**
    *  When formatting an error object, display this list of properties.
    *  The list should be a comma separated list of properties. Default: ''
    */
  var errorProps: js.UndefOr[String] = js.native
  /**
    * Ignore one or several keys. Example: "time,hostname"
    */
  var ignore: js.UndefOr[String] = js.native
  /**
    * If set to true, it will print the name of the log level as the first field in the log line. Default: `false`.
    */
  var levelFirst: js.UndefOr[Boolean] = js.native
  /**
    * Format output of message, e.g. {level} - {pid} will output message: INFO - 1123 Default: `false`.
    */
  var messageFormat: js.UndefOr[`false` | String] = js.native
  /**
    * The key in the JSON object to use as the highlighted message. Default: "msg".
    */
  var messageKey: js.UndefOr[String] = js.native
  /**
    * Specify a search pattern according to {@link http://jmespath.org|jmespath}
    */
  var search: js.UndefOr[String] = js.native
  /**
    * The key in the JSON object to use for timestamp display. Default: "time".
    */
  var timestampKey: js.UndefOr[String] = js.native
  /**
    * Translate the epoch time value into a human readable date and time string.
    * This flag also can set the format string to apply when translating the date to human readable format.
    * The default format is yyyy-mm-dd HH:MM:ss.l o in UTC.
    * For a list of available pattern letters see the {@link https://www.npmjs.com/package/dateformat|dateformat documentation}.
    */
  var translateTime: js.UndefOr[Boolean | String] = js.native
}

object PrettyOptions {
  @scala.inline
  def apply(): PrettyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrettyOptions]
  }
  @scala.inline
  implicit class PrettyOptionsOps[Self <: PrettyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColorize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorize")(js.undefined)
        ret
    }
    @scala.inline
    def withCrlf(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crlf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrlf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crlf")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorLikeObjectKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorLikeObjectKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorLikeObjectKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorLikeObjectKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorProps(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorProps")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(js.undefined)
        ret
    }
    @scala.inline
    def withLevelFirst(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levelFirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevelFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levelFirst")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageFormat(value: `false` | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSearch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestampKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestampKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampKey")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslateTime(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateTime")(js.undefined)
        ret
    }
  }
  
}

