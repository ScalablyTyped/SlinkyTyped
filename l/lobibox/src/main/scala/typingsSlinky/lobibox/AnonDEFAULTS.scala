package typingsSlinky.lobibox

import typingsSlinky.lobibox.LobiboxModule.MessageBoxesDefault
import typingsSlinky.lobibox.LobiboxModule.MessageBoxesOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDEFAULTS extends js.Object {
  var DEFAULTS: MessageBoxesDefault = js.native
  var OPTIONS: MessageBoxesOptions = js.native
}

object AnonDEFAULTS {
  @scala.inline
  def apply(DEFAULTS: MessageBoxesDefault, OPTIONS: MessageBoxesOptions): AnonDEFAULTS = {
    val __obj = js.Dynamic.literal(DEFAULTS = DEFAULTS.asInstanceOf[js.Any], OPTIONS = OPTIONS.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDEFAULTS]
  }
  @scala.inline
  implicit class AnonDEFAULTSOps[Self <: AnonDEFAULTS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDEFAULTS(value: MessageBoxesDefault): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DEFAULTS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOPTIONS(value: MessageBoxesOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OPTIONS")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

