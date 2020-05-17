package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGlobalEvents.ValidationCompleted client event that allows you to centrally validate user input within all DevExpress web controls to which validation is applied.
  */
@js.native
trait ASPxClientValidationCompletedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a container object that holds the validated control(s).
    */
  var container: js.Any = js.native
  /**
    * Gets the first control (either visible or invisible) that hasn't passed the validation applied.
    */
  var firstInvalidControl: ASPxClientControl = js.native
  /**
    * Gets the first visible control that hasn't passed the validation applied.
    */
  var firstVisibleInvalidControl: ASPxClientControl = js.native
  /**
    * Gets a value that indicates whether validation has been applied to both visible and invisible controls.
    */
  var invisibleControlsValidated: Boolean = js.native
  /**
    * Gets a value specifying whether the validation has been completed successfully.
    */
  var isValid: Boolean = js.native
  /**
    * Gets the name of the validation group name to which validation has been applied.
    */
  var validationGroup: String = js.native
}

object ASPxClientValidationCompletedEventArgs {
  @scala.inline
  def apply(
    container: js.Any,
    firstInvalidControl: ASPxClientControl,
    firstVisibleInvalidControl: ASPxClientControl,
    invisibleControlsValidated: Boolean,
    isValid: Boolean,
    validationGroup: String
  ): ASPxClientValidationCompletedEventArgs = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], firstInvalidControl = firstInvalidControl.asInstanceOf[js.Any], firstVisibleInvalidControl = firstVisibleInvalidControl.asInstanceOf[js.Any], invisibleControlsValidated = invisibleControlsValidated.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], validationGroup = validationGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientValidationCompletedEventArgs]
  }
  @scala.inline
  implicit class ASPxClientValidationCompletedEventArgsOps[Self <: ASPxClientValidationCompletedEventArgs] (val x: Self) extends AnyVal {
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
    def withFirstInvalidControl(value: ASPxClientControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstInvalidControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstVisibleInvalidControl(value: ASPxClientControl): Self = {
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

