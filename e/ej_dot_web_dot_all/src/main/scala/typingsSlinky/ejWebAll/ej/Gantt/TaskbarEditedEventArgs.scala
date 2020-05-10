package typingsSlinky.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskbarEditedEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** Returns the data of edited record.
    */
  var data: js.UndefOr[js.Any] = js.native
  /** Returns 'true' if taskbar is dragged.
    */
  var dragging: js.UndefOr[Boolean] = js.native
  /** Returns the field values of record being edited.
    */
  var editingFields: js.UndefOr[js.Any] = js.native
  /** Returns 'true' if taskbar is left resized.
    */
  var leftResizing: js.UndefOr[Boolean] = js.native
  /** Returns the Gantt model.
    */
  var model: js.UndefOr[js.Any] = js.native
  /** Returns the previous data value of edited record.
    */
  var previousData: js.UndefOr[js.Any] = js.native
  /** Returns 'true' if taskbar is progress resized.
    */
  var progressResizing: js.UndefOr[Boolean] = js.native
  /** Returns 'true' if taskbar is right resized.
    */
  var rightResizing: js.UndefOr[Boolean] = js.native
}

object TaskbarEditedEventArgs {
  @scala.inline
  def apply(): TaskbarEditedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskbarEditedEventArgs]
  }
  @scala.inline
  implicit class TaskbarEditedEventArgsOps[Self <: TaskbarEditedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDragging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragging")(js.undefined)
        ret
    }
    @scala.inline
    def withEditingFields(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editingFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditingFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editingFields")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftResizing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftResizing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftResizing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftResizing")(js.undefined)
        ret
    }
    @scala.inline
    def withModel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousData")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressResizing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressResizing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressResizing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressResizing")(js.undefined)
        ret
    }
    @scala.inline
    def withRightResizing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightResizing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightResizing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightResizing")(js.undefined)
        ret
    }
  }
  
}

