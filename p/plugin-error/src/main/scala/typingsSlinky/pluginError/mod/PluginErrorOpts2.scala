package typingsSlinky.pluginError.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginErrorOpts2 extends PluginErrorOpts {
  /**
    * If you pass an error object as the message the stack will be pulled from that, otherwise one will be created.
    */
  var message: js.UndefOr[String | js.Error] = js.native
}

object PluginErrorOpts2 {
  @scala.inline
  def apply(): PluginErrorOpts2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginErrorOpts2]
  }
  @scala.inline
  implicit class PluginErrorOpts2Ops[Self <: PluginErrorOpts2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessageError(value: js.Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String | js.Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
  }
  
}

