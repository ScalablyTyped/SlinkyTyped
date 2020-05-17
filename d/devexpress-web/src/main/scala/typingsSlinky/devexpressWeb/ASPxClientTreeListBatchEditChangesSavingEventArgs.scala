package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeList.BatchEditChangesSaving event.
  */
@js.native
trait ASPxClientTreeListBatchEditChangesSavingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets a hashtable that maintains information about deleted cells.
    */
  var deletedValues: js.Any = js.native
  /**
    * Gets a hashtable that maintains information about inserted cells.
    */
  var insertedValues: js.Any = js.native
  /**
    * Gets a hashtable that maintains information about updated cells.
    */
  var updatedValues: js.Any = js.native
}

object ASPxClientTreeListBatchEditChangesSavingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, deletedValues: js.Any, insertedValues: js.Any, updatedValues: js.Any): ASPxClientTreeListBatchEditChangesSavingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], deletedValues = deletedValues.asInstanceOf[js.Any], insertedValues = insertedValues.asInstanceOf[js.Any], updatedValues = updatedValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListBatchEditChangesSavingEventArgs]
  }
  @scala.inline
  implicit class ASPxClientTreeListBatchEditChangesSavingEventArgsOps[Self <: ASPxClientTreeListBatchEditChangesSavingEventArgs] (val x: Self) extends AnyVal {
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

