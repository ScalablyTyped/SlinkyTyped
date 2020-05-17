package typingsSlinky.less.Less

import typingsSlinky.less.LessStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Plugin extends js.Object {
  def install(less: LessStatic, pluginManager: PluginManager): Unit = js.native
}

object Plugin {
  @scala.inline
  def apply(install: (LessStatic, PluginManager) => Unit): Plugin = {
    val __obj = js.Dynamic.literal(install = js.Any.fromFunction2(install))
    __obj.asInstanceOf[Plugin]
  }
  @scala.inline
  implicit class PluginOps[Self <: Plugin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstall(value: (LessStatic, PluginManager) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("install")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

