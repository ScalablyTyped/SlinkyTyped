package typingsSlinky.antd

import typingsSlinky.rcFieldForm.interfaceMod.ValidateMessages
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonValidateMessages extends js.Object {
  var validateMessages: js.UndefOr[ValidateMessages] = js.native
}

object AnonValidateMessages {
  @scala.inline
  def apply(): AnonValidateMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonValidateMessages]
  }
  @scala.inline
  implicit class AnonValidateMessagesOps[Self <: AnonValidateMessages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValidateMessages(value: ValidateMessages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidateMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateMessages")(js.undefined)
        ret
    }
  }
  
}

