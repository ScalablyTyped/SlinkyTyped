package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GanttMessages extends js.Object {
  var actions: js.UndefOr[GanttMessagesActions] = js.native
  var cancel: js.UndefOr[String] = js.native
  var deleteDependencyConfirmation: js.UndefOr[String] = js.native
  var deleteDependencyWindowTitle: js.UndefOr[String] = js.native
  var deleteTaskConfirmation: js.UndefOr[String] = js.native
  var deleteTaskWindowTitle: js.UndefOr[String] = js.native
  var destroy: js.UndefOr[String] = js.native
  var editor: js.UndefOr[GanttMessagesEditor] = js.native
  var save: js.UndefOr[String] = js.native
  var views: js.UndefOr[GanttMessagesViews] = js.native
}

object GanttMessages {
  @scala.inline
  def apply(): GanttMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GanttMessages]
  }
  @scala.inline
  implicit class GanttMessagesOps[Self <: GanttMessages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: GanttMessagesActions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(js.undefined)
        ret
    }
    @scala.inline
    def withCancel(value: String): Self = {
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
    def withDeleteDependencyConfirmation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteDependencyConfirmation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteDependencyConfirmation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteDependencyConfirmation")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteDependencyWindowTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteDependencyWindowTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteDependencyWindowTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteDependencyWindowTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteTaskConfirmation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteTaskConfirmation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteTaskConfirmation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteTaskConfirmation")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteTaskWindowTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteTaskWindowTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteTaskWindowTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteTaskWindowTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withEditor(value: GanttMessagesEditor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(js.undefined)
        ret
    }
    @scala.inline
    def withSave(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(js.undefined)
        ret
    }
    @scala.inline
    def withViews(value: GanttMessagesViews): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("views")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViews: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("views")(js.undefined)
        ret
    }
  }
  
}

