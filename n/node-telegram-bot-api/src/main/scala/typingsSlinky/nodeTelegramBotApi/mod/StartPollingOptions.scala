package typingsSlinky.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartPollingOptions extends ConstructorOptions {
  var restart: js.UndefOr[Boolean] = js.native
}

object StartPollingOptions {
  @scala.inline
  def apply(): StartPollingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartPollingOptions]
  }
  @scala.inline
  implicit class StartPollingOptionsOps[Self <: StartPollingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRestart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restart")(js.undefined)
        ret
    }
  }
  
}

