package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationCompletedEventArgs extends EventArgs {
  val container: js.Any = js.native
  val firstInvalidControl: Control = js.native
  val firstVisibleInvalidControl: Control = js.native
  val invisibleControlsValidated: Boolean = js.native
  var isValid: Boolean = js.native
  val validationGroup: String = js.native
}

object ValidationCompletedEventArgs {
  @scala.inline
  def apply(
    container: js.Any,
    firstInvalidControl: Control,
    firstVisibleInvalidControl: Control,
    invisibleControlsValidated: Boolean,
    isValid: Boolean,
    sender: Control,
    validationGroup: String
  ): ValidationCompletedEventArgs = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], firstInvalidControl = firstInvalidControl.asInstanceOf[js.Any], firstVisibleInvalidControl = firstVisibleInvalidControl.asInstanceOf[js.Any], invisibleControlsValidated = invisibleControlsValidated.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], validationGroup = validationGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationCompletedEventArgs]
  }
  @scala.inline
  implicit class ValidationCompletedEventArgsOps[Self <: ValidationCompletedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstInvalidControl(value: Control): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstInvalidControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstVisibleInvalidControl(value: Control): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstVisibleInvalidControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvisibleControlsValidated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invisibleControlsValidated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidationGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationGroup")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

