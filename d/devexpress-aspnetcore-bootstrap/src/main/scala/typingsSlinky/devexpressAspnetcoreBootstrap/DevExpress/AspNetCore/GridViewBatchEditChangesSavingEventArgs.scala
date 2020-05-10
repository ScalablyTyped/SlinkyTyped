package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridViewBatchEditChangesSavingEventArgs extends CancelEventArgs {
  val deletedValues: js.Any = js.native
  val insertedValues: js.Any = js.native
  val updatedValues: js.Any = js.native
}

object GridViewBatchEditChangesSavingEventArgs {
  @scala.inline
  def apply(
    cancel: Boolean,
    deletedValues: js.Any,
    insertedValues: js.Any,
    sender: Control,
    updatedValues: js.Any
  ): GridViewBatchEditChangesSavingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], deletedValues = deletedValues.asInstanceOf[js.Any], insertedValues = insertedValues.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], updatedValues = updatedValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridViewBatchEditChangesSavingEventArgs]
  }
  @scala.inline
  implicit class GridViewBatchEditChangesSavingEventArgsOps[Self <: GridViewBatchEditChangesSavingEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeletedValues(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertedValues(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertedValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdatedValues(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedValues")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

