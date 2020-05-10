package typingsSlinky.jestConfig.mod

import typingsSlinky.jestTypes.configMod.GlobalConfig
import typingsSlinky.jestTypes.configMod.Path
import typingsSlinky.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadConfig_ extends js.Object {
  var configPath: js.UndefOr[Path | Null] = js.native
  var globalConfig: GlobalConfig = js.native
  var hasDeprecationWarnings: Boolean = js.native
  var projectConfig: ProjectConfig = js.native
}

object ReadConfig_ {
  @scala.inline
  def apply(globalConfig: GlobalConfig, hasDeprecationWarnings: Boolean, projectConfig: ProjectConfig): ReadConfig_ = {
    val __obj = js.Dynamic.literal(globalConfig = globalConfig.asInstanceOf[js.Any], hasDeprecationWarnings = hasDeprecationWarnings.asInstanceOf[js.Any], projectConfig = projectConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadConfig_]
  }
  @scala.inline
  implicit class ReadConfig_Ops[Self <: ReadConfig_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlobalConfig(value: GlobalConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasDeprecationWarnings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasDeprecationWarnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjectConfig(value: ProjectConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigPath(value: Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configPath")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigPathNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configPath")(null)
        ret
    }
  }
  
}

