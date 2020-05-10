package typingsSlinky.pluginError.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginErrorOpts extends js.Object {
  /**
    * Error properties will be included in err.toString(), but may be omitted by including {showProperties: false} in the options
    */
  var showProperties: js.UndefOr[Boolean] = js.native
  /**
    * By default the stack will not be shown. Set options.showStack to true if you think the stack is important for your error.
    */
  var showStack: js.UndefOr[Boolean] = js.native
}

object PluginErrorOpts {
  @scala.inline
  def apply(): PluginErrorOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginErrorOpts]
  }
  @scala.inline
  implicit class PluginErrorOptsOps[Self <: PluginErrorOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShowProperties(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withShowStack(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showStack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowStack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showStack")(js.undefined)
        ret
    }
  }
  
}

