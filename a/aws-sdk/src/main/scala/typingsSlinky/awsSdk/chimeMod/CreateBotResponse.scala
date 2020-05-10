package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBotResponse extends js.Object {
  /**
    * The bot details.
    */
  var Bot: js.UndefOr[typingsSlinky.awsSdk.chimeMod.Bot] = js.native
}

object CreateBotResponse {
  @scala.inline
  def apply(): CreateBotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBotResponse]
  }
  @scala.inline
  implicit class CreateBotResponseOps[Self <: CreateBotResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBot(value: Bot): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bot")(js.undefined)
        ret
    }
  }
  
}

