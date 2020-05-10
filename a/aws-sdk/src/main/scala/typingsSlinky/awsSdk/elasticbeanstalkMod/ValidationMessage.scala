package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationMessage extends js.Object {
  /**
    * A message describing the error or warning.
    */
  var Message: js.UndefOr[ValidationMessageString] = js.native
  /**
    * The namespace to which the option belongs.
    */
  var Namespace: js.UndefOr[OptionNamespace] = js.native
  /**
    * The name of the option.
    */
  var OptionName: js.UndefOr[ConfigurationOptionName] = js.native
  /**
    * An indication of the severity of this message:    error: This message indicates that this is not a valid setting for an option.    warning: This message is providing information you should take into account.  
    */
  var Severity: js.UndefOr[ValidationSeverity] = js.native
}

object ValidationMessage {
  @scala.inline
  def apply(): ValidationMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationMessage]
  }
  @scala.inline
  implicit class ValidationMessageOps[Self <: ValidationMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: ValidationMessageString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespace(value: OptionNamespace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Namespace")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionName(value: ConfigurationOptionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionName")(js.undefined)
        ret
    }
    @scala.inline
    def withSeverity(value: ValidationSeverity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Severity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeverity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Severity")(js.undefined)
        ret
    }
  }
  
}

