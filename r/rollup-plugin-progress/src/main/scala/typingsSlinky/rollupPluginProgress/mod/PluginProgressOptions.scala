package typingsSlinky.rollupPluginProgress.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginProgressOptions extends js.Object {
  var clearLine: js.UndefOr[Boolean] = js.native
}

object PluginProgressOptions {
  @scala.inline
  def apply(): PluginProgressOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginProgressOptions]
  }
  @scala.inline
  implicit class PluginProgressOptionsOps[Self <: PluginProgressOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearLine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearLine")(js.undefined)
        ret
    }
  }
  
}

