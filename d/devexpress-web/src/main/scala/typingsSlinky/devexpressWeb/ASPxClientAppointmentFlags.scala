package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Holds the information that determines what action types can be performed for appointments.
  */
@js.native
trait ASPxClientAppointmentFlags extends js.Object {
  /**
    * Gets a value that specifies whether an end-user is allowed to share the schedule time between two or more appointments.
    */
  var allowConflicts: Boolean = js.native
  /**
    * Gets a value that specifies whether an end-user is allowed to copy appointments.
    */
  var allowCopy: Boolean = js.native
  /**
    * Gets a value that specifies whether an end-user is allowed to delete appointments.
    */
  var allowDelete: Boolean = js.native
  /**
    * Gets a value that specifies whether an end-user is allowed to drag and drop appointments to another time slot or date.
    */
  var allowDrag: Boolean = js.native
  /**
    * Gets a value that specifies whether an end-user is allowed to drag and drop appointments between resources.
    */
  var allowDragBetweenResources: Boolean = js.native
  /**
    * Gets a value that specifies whether an end-user is allowed to edit appointments.
    */
  var allowEdit: Boolean = js.native
  /**
    * Gets a value that specifies whether an inplace editor can be activated for an appointment.
    */
  var allowInplaceEditor: Boolean = js.native
  /**
    * Gets a value that specifies whether an end-user is allowed to change the time boundaries of appointments.
    */
  var allowResize: Boolean = js.native
}

object ASPxClientAppointmentFlags {
  @scala.inline
  def apply(
    allowConflicts: Boolean,
    allowCopy: Boolean,
    allowDelete: Boolean,
    allowDrag: Boolean,
    allowDragBetweenResources: Boolean,
    allowEdit: Boolean,
    allowInplaceEditor: Boolean,
    allowResize: Boolean
  ): ASPxClientAppointmentFlags = {
    val __obj = js.Dynamic.literal(allowConflicts = allowConflicts.asInstanceOf[js.Any], allowCopy = allowCopy.asInstanceOf[js.Any], allowDelete = allowDelete.asInstanceOf[js.Any], allowDrag = allowDrag.asInstanceOf[js.Any], allowDragBetweenResources = allowDragBetweenResources.asInstanceOf[js.Any], allowEdit = allowEdit.asInstanceOf[js.Any], allowInplaceEditor = allowInplaceEditor.asInstanceOf[js.Any], allowResize = allowResize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientAppointmentFlags]
  }
  @scala.inline
  implicit class ASPxClientAppointmentFlagsOps[Self <: ASPxClientAppointmentFlags] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowConflicts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowConflicts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowCopy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCopy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowDelete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowDrag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowDragBetweenResources(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDragBetweenResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowEdit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowInplaceEditor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInplaceEditor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowResize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

