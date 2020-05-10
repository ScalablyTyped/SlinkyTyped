package typingsSlinky.egg

import typingsSlinky.eggLogger.mod.LoggerLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<egg-logger.egg-logger.EggLoggerOptions> */
@js.native
trait PartialEggLoggerOptions extends js.Object {
  var allowDebugAtProd: js.UndefOr[Boolean] = js.native
  var buffer: js.UndefOr[Boolean] = js.native
  var consoleLevel: js.UndefOr[LoggerLevel] = js.native
  var contextFormatter: js.UndefOr[js.Function1[/* meta */ js.UndefOr[js.Object], String]] = js.native
  var encoding: js.UndefOr[String] = js.native
  var eol: js.UndefOr[String] = js.native
  var file: js.UndefOr[String] = js.native
  var formatter: js.UndefOr[js.Function1[/* meta */ js.UndefOr[js.Object], String]] = js.native
  var jsonFile: js.UndefOr[String] = js.native
  var level: js.UndefOr[LoggerLevel] = js.native
  var outputJSON: js.UndefOr[Boolean] = js.native
}

object PartialEggLoggerOptions {
  @scala.inline
  def apply(): PartialEggLoggerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialEggLoggerOptions]
  }
  @scala.inline
  implicit class PartialEggLoggerOptionsOps[Self <: PartialEggLoggerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowDebugAtProd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDebugAtProd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDebugAtProd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDebugAtProd")(js.undefined)
        ret
    }
    @scala.inline
    def withBuffer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(js.undefined)
        ret
    }
    @scala.inline
    def withConsoleLevel(value: LoggerLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consoleLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsoleLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consoleLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withContextFormatter(value: /* meta */ js.UndefOr[js.Object] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextFormatter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutContextFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withEol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eol")(js.undefined)
        ret
    }
    @scala.inline
    def withFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatter(value: /* meta */ js.UndefOr[js.Object] => String): Self = {
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
    def withJsonFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsonFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonFile")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel(value: LoggerLevel): Self = {
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
    def withOutputJSON(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputJSON")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputJSON: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputJSON")(js.undefined)
        ret
    }
  }
  
}

