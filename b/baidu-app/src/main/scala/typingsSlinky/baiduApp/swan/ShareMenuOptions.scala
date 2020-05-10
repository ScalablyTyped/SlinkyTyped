package typingsSlinky.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShareMenuOptions
  extends BaseOptions[js.Any, js.Any] {
  var withShareTicket: js.UndefOr[Boolean] = js.native
}

object ShareMenuOptions {
  @scala.inline
  def apply(): ShareMenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShareMenuOptions]
  }
  @scala.inline
  implicit class ShareMenuOptionsOps[Self <: ShareMenuOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWithShareTicket(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withShareTicket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithShareTicket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withShareTicket")(js.undefined)
        ret
    }
  }
  
}

