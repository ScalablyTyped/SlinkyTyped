package typingsSlinky.jestConfig.anon

import typingsSlinky.jestTypes.configMod.GlobalConfig
import typingsSlinky.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configs extends js.Object {
  var configs: js.Array[ProjectConfig] = js.native
  var globalConfig: GlobalConfig = js.native
  var hasDeprecationWarnings: Boolean = js.native
}

object Configs {
  @scala.inline
  def apply(configs: js.Array[ProjectConfig], globalConfig: GlobalConfig, hasDeprecationWarnings: Boolean): Configs = {
    val __obj = js.Dynamic.literal(configs = configs.asInstanceOf[js.Any], globalConfig = globalConfig.asInstanceOf[js.Any], hasDeprecationWarnings = hasDeprecationWarnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configs]
  }
  @scala.inline
  implicit class ConfigsOps[Self <: Configs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigs(value: js.Array[ProjectConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configs")(value.asInstanceOf[js.Any])
        ret
    }
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
  }
  
}

