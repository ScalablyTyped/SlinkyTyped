package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegenerateSecurityTokenResponse extends js.Object {
  var Bot: js.UndefOr[typingsSlinky.awsSdk.chimeMod.Bot] = js.native
}

object RegenerateSecurityTokenResponse {
  @scala.inline
  def apply(): RegenerateSecurityTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegenerateSecurityTokenResponse]
  }
  @scala.inline
  implicit class RegenerateSecurityTokenResponseOps[Self <: RegenerateSecurityTokenResponse] (val x: Self) extends AnyVal {
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

