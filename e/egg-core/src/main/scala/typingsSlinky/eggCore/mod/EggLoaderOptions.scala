package typingsSlinky.eggCore.mod

import typingsSlinky.eggLogger.mod.Logger
import typingsSlinky.eggLogger.mod.LoggerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EggLoaderOptions extends js.Object {
  /** Application instance */
  var app: EggCore[PlainObject[_]] = js.native
  /** the directory of application */
  var baseDir: String = js.native
  /** egg logger */
  var logger: Logger[LoggerOptions] = js.native
  /** custom plugins */
  var plugins: js.UndefOr[Plugins] = js.native
  /** server scope */
  var serverScope: js.UndefOr[String] = js.native
}

object EggLoaderOptions {
  @scala.inline
  def apply(app: EggCore[PlainObject[_]], baseDir: String, logger: Logger[LoggerOptions]): EggLoaderOptions = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], baseDir = baseDir.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any])
    __obj.asInstanceOf[EggLoaderOptions]
  }
  @scala.inline
  implicit class EggLoaderOptionsOps[Self <: EggLoaderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApp(value: EggCore[PlainObject[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogger(value: Logger[LoggerOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlugins(value: Plugins): Self = {
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
    def withServerScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverScope")(js.undefined)
        ret
    }
  }
  
}

