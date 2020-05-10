package typingsSlinky.eggLogger.mod

import typingsSlinky.eggLogger.eggLoggerStrings.duplicate
import typingsSlinky.eggLogger.eggLoggerStrings.ignore
import typingsSlinky.eggLogger.eggLoggerStrings.redirect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EggLoggersOptions extends js.Object {
  var agentLogName: String = js.native
  var appLogName: String = js.native
  var buffer: js.UndefOr[Boolean] = js.native
  // whether write error logger to common-error.log, `duplicate` / `redirect` / `ignore`, default to `duplicate`
  var concentrateError: js.UndefOr[duplicate | redirect | ignore] = js.native
  var consoleLevel: js.UndefOr[LoggerLevel] = js.native
  var coreLogName: String = js.native
  var dir: String = js.native
  var encoding: js.UndefOr[String] = js.native
  var env: js.UndefOr[String] = js.native
  var eol: js.UndefOr[String] = js.native
  var errorLogName: String = js.native
  var level: js.UndefOr[LoggerLevel] = js.native
  var outputJSON: js.UndefOr[Boolean] = js.native
  var `type`: String = js.native
}

object EggLoggersOptions {
  @scala.inline
  def apply(
    agentLogName: String,
    appLogName: String,
    coreLogName: String,
    dir: String,
    errorLogName: String,
    `type`: String
  ): EggLoggersOptions = {
    val __obj = js.Dynamic.literal(agentLogName = agentLogName.asInstanceOf[js.Any], appLogName = appLogName.asInstanceOf[js.Any], coreLogName = coreLogName.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], errorLogName = errorLogName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EggLoggersOptions]
  }
  @scala.inline
  implicit class EggLoggersOptionsOps[Self <: EggLoggersOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgentLogName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentLogName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppLogName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appLogName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCoreLogName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coreLogName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorLogName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorLogName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
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
    def withConcentrateError(value: duplicate | redirect | ignore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concentrateError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConcentrateError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concentrateError")(js.undefined)
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
    def withEnv(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(js.undefined)
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

