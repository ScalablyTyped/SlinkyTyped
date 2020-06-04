package typingsSlinky.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultValidateMessages extends js.Object {
  var defaultValidateMessages: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValidateMessages */ js.Any
}

object DefaultValidateMessages {
  @scala.inline
  def apply(
    defaultValidateMessages: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValidateMessages */ js.Any
  ): DefaultValidateMessages = {
    val __obj = js.Dynamic.literal(defaultValidateMessages = defaultValidateMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultValidateMessages]
  }
  @scala.inline
  implicit class DefaultValidateMessagesOps[Self <: DefaultValidateMessages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDefaultValidateMessages(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValidateMessages */ js.Any
    ): Self = this.set("defaultValidateMessages", value.asInstanceOf[js.Any])
  }
  
}

