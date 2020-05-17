package typingsSlinky.netconf.anon

import typingsSlinky.netconf.netconfStrings.`override`
import typingsSlinky.netconf.netconfStrings.merge
import typingsSlinky.netconf.netconfStrings.replace
import typingsSlinky.netconf.netconfStrings.set
import typingsSlinky.netconf.netconfStrings.text
import typingsSlinky.netconf.netconfStrings.update
import typingsSlinky.netconf.netconfStrings.xml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Action extends js.Object {
  var action: js.UndefOr[merge | replace | `override` | update | set] = js.native
  var config: js.Any = js.native
  var format: js.UndefOr[text | xml] = js.native
}

object Action {
  @scala.inline
  def apply(config: js.Any): Action = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  implicit class ActionOps[Self <: Action] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAction(value: merge | replace | `override` | update | set): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: text | xml): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
  }
  
}

