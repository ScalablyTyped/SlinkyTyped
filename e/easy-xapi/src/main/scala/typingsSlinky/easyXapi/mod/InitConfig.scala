package typingsSlinky.easyXapi.mod

import typingsSlinky.easyXapi.anon.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitConfig extends js.Object {
  var jSend: js.UndefOr[Partial] = js.native
}

object InitConfig {
  @scala.inline
  def apply(): InitConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitConfig]
  }
  @scala.inline
  implicit class InitConfigOps[Self <: InitConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJSend(value: Partial): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jSend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJSend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jSend")(js.undefined)
        ret
    }
  }
  
}

