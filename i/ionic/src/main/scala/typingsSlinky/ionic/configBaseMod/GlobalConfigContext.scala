package typingsSlinky.ionic.configBaseMod

import typingsSlinky.ionic.definitionsMod.IConfig
import typingsSlinky.ionic.ionicBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalConfigContext
  extends BaseConfigContext
     with ConfigContext {
  var config: IConfig = js.native
  var global: `true` = js.native
}

object GlobalConfigContext {
  @scala.inline
  def apply(config: IConfig, force: Boolean, global: `true`, json: Boolean, root: Boolean): GlobalConfigContext = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalConfigContext]
  }
  @scala.inline
  implicit class GlobalConfigContextOps[Self <: GlobalConfigContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: IConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobal(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("global")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

