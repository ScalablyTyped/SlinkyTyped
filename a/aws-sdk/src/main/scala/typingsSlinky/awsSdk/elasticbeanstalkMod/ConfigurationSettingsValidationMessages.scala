package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationSettingsValidationMessages extends js.Object {
  /**
    *  A list of ValidationMessage. 
    */
  var Messages: js.UndefOr[ValidationMessagesList] = js.native
}

object ConfigurationSettingsValidationMessages {
  @scala.inline
  def apply(): ConfigurationSettingsValidationMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationSettingsValidationMessages]
  }
  @scala.inline
  implicit class ConfigurationSettingsValidationMessagesOps[Self <: ConfigurationSettingsValidationMessages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessages(value: ValidationMessagesList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Messages")(js.undefined)
        ret
    }
  }
  
}

