package typingsSlinky.pluginError.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginErrorOpts3 extends PluginErrorOpts2 {
  /**
    * The name of the plugin
    */
  var plugin: js.UndefOr[String] = js.native
}

object PluginErrorOpts3 {
  @scala.inline
  def apply(): PluginErrorOpts3 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginErrorOpts3]
  }
  @scala.inline
  implicit class PluginErrorOpts3Ops[Self <: PluginErrorOpts3] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlugin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugin")(js.undefined)
        ret
    }
  }
  
}

