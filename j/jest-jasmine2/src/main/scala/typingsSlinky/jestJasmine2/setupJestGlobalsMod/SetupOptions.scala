package typingsSlinky.jestJasmine2.setupJestGlobalsMod

import typingsSlinky.jestTypes.configMod.GlobalConfig
import typingsSlinky.jestTypes.configMod.Path
import typingsSlinky.jestTypes.configMod.ProjectConfig
import typingsSlinky.prettyFormat.mod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetupOptions extends js.Object {
  var config: ProjectConfig = js.native
  var globalConfig: GlobalConfig = js.native
  var testPath: Path = js.native
  def localRequire(moduleName: String): Plugin = js.native
}

object SetupOptions {
  @scala.inline
  def apply(config: ProjectConfig, globalConfig: GlobalConfig, localRequire: String => Plugin, testPath: Path): SetupOptions = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], globalConfig = globalConfig.asInstanceOf[js.Any], localRequire = js.Any.fromFunction1(localRequire), testPath = testPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetupOptions]
  }
  @scala.inline
  implicit class SetupOptionsOps[Self <: SetupOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: ProjectConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobalConfig(value: GlobalConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalRequire(value: String => Plugin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localRequire")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTestPath(value: Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testPath")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

