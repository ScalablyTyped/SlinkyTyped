package typingsSlinky.egg.mod

import typingsSlinky.egg.PartialEggLoggerOptions
import typingsSlinky.egg.eggStrings.duplicate
import typingsSlinky.egg.eggStrings.ignore
import typingsSlinky.egg.eggStrings.redirect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent egg.egg.RemoveSpecProp<egg-logger.egg-logger.EggLoggersOptions, 'type'> */
@js.native
trait EggLoggerConfig extends js.Object {
  var agentLogName: String = js.native
  /** allow debug log at prod, defaults to true */
  var allowDebugAtProd: js.UndefOr[Boolean] = js.native
  var appLogName: String = js.native
  var buffer: js.UndefOr[Boolean] = js.native
  var concentrateError: js.UndefOr[duplicate | redirect | ignore] = js.native
  var consoleLevel: js.UndefOr[typingsSlinky.eggLogger.mod.LoggerLevel] = js.native
  var coreLogName: String = js.native
  /** custom config of coreLogger */
  var coreLogger: js.UndefOr[PartialEggLoggerOptions] = js.native
  var dir: String = js.native
  /** disable logger console after app ready. defaults to `false` on local and unittest env, others is `true`. */
  var disableConsoleAfterReady: js.UndefOr[Boolean] = js.native
  var encoding: js.UndefOr[String] = js.native
  var env: js.UndefOr[String] = js.native
  var eol: js.UndefOr[String] = js.native
  var errorLogName: String = js.native
  var level: js.UndefOr[typingsSlinky.eggLogger.mod.LoggerLevel] = js.native
  var outputJSON: js.UndefOr[Boolean] = js.native
}

object EggLoggerConfig {
  @scala.inline
  def apply(agentLogName: String, appLogName: String, coreLogName: String, dir: String, errorLogName: String): EggLoggerConfig = {
    val __obj = js.Dynamic.literal(agentLogName = agentLogName.asInstanceOf[js.Any], appLogName = appLogName.asInstanceOf[js.Any], coreLogName = coreLogName.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], errorLogName = errorLogName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EggLoggerConfig]
  }
  @scala.inline
  implicit class EggLoggerConfigOps[Self <: EggLoggerConfig] (val x: Self) extends AnyVal {
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
    def withConsoleLevel(value: typingsSlinky.eggLogger.mod.LoggerLevel): Self = {
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
    def withCoreLogger(value: PartialEggLoggerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coreLogger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoreLogger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coreLogger")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableConsoleAfterReady(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableConsoleAfterReady")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableConsoleAfterReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableConsoleAfterReady")(js.undefined)
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
    def withLevel(value: typingsSlinky.eggLogger.mod.LoggerLevel): Self = {
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

