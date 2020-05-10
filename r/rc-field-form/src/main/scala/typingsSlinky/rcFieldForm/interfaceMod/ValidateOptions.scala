package typingsSlinky.rcFieldForm.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidateOptions extends js.Object {
  var triggerName: js.UndefOr[String] = js.native
  var validateMessages: js.UndefOr[ValidateMessages] = js.native
}

object ValidateOptions {
  @scala.inline
  def apply(): ValidateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateOptions]
  }
  @scala.inline
  implicit class ValidateOptionsOps[Self <: ValidateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTriggerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerName")(js.undefined)
        ret
    }
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

