package typingsSlinky.less

import typingsSlinky.less.Less_.PluginManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPluginManager extends js.Object {
  var pluginManager: PluginManager = js.native
}

object AnonPluginManager {
  @scala.inline
  def apply(pluginManager: PluginManager): AnonPluginManager = {
    val __obj = js.Dynamic.literal(pluginManager = pluginManager.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPluginManager]
  }
  @scala.inline
  implicit class AnonPluginManagerOps[Self <: AnonPluginManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPluginManager(value: PluginManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluginManager")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

