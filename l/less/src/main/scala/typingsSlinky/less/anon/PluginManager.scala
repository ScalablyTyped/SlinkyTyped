package typingsSlinky.less.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginManager extends js.Object {
  var pluginManager: typingsSlinky.less.Less.PluginManager = js.native
}

object PluginManager {
  @scala.inline
  def apply(pluginManager: typingsSlinky.less.Less.PluginManager): PluginManager = {
    val __obj = js.Dynamic.literal(pluginManager = pluginManager.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginManager]
  }
  @scala.inline
  implicit class PluginManagerOps[Self <: PluginManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPluginManager(value: typingsSlinky.less.Less.PluginManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluginManager")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

