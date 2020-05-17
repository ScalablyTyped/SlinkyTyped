package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGridView.BatchEditStartEditing event.
  */
@js.native
trait ASPxClientGridViewBatchEditStartEditingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the grid column that owns a cell that is about to be edited.
    */
  var focusedColumn: ASPxClientGridViewColumn = js.native
  /**
    * Gets the row's key.
    */
  var key: js.Any = js.native
  /**
    * Gets a hashtable that maintains information about editable cells.
    */
  var rowValues: js.Any = js.native
  /**
    * Gets the visible index of the row whose cells are about to be edited.
    */
  var visibleIndex: Double = js.native
}

object ASPxClientGridViewBatchEditStartEditingEventArgs {
  @scala.inline
  def apply(
    cancel: Boolean,
    focusedColumn: ASPxClientGridViewColumn,
    key: js.Any,
    rowValues: js.Any,
    visibleIndex: Double
  ): ASPxClientGridViewBatchEditStartEditingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], focusedColumn = focusedColumn.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], rowValues = rowValues.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewBatchEditStartEditingEventArgs]
  }
  @scala.inline
  implicit class ASPxClientGridViewBatchEditStartEditingEventArgsOps[Self <: ASPxClientGridViewBatchEditStartEditingEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFocusedColumn(value: ASPxClientGridViewColumn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusedColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowValues(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisibleIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

