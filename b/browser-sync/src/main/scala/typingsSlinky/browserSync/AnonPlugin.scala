package typingsSlinky.browserSync

import typingsSlinky.browserSync.mod.BrowserSyncInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPlugin extends js.Object {
  @JSName("plugin:name")
  var pluginColonname: js.UndefOr[String] = js.native
  def plugin(opts: js.Object, bs: BrowserSyncInstance): js.Any = js.native
}

object AnonPlugin {
  @scala.inline
  def apply(plugin: (js.Object, BrowserSyncInstance) => js.Any): AnonPlugin = {
    val __obj = js.Dynamic.literal(plugin = js.Any.fromFunction2(plugin))
    __obj.asInstanceOf[AnonPlugin]
  }
  @scala.inline
  implicit class AnonPluginOps[Self <: AnonPlugin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlugin(value: (js.Object, BrowserSyncInstance) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugin")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPluginColonname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugin:name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPluginColonname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugin:name")(js.undefined)
        ret
    }
  }
  
}

