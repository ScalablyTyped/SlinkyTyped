package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientVerticalGrid.BatchEditEndEditing event.
  */
@js.native
trait ASPxClientVerticalGridBatchEditEndEditingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets a hashtable that maintains information about editable cells.
    */
  var recordValues: js.Any = js.native
  /**
    * Gets the visible index of the record whose cells have been edited.
    */
  var visibleIndex: Double = js.native
}

object ASPxClientVerticalGridBatchEditEndEditingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, recordValues: js.Any, visibleIndex: Double): ASPxClientVerticalGridBatchEditEndEditingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], recordValues = recordValues.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientVerticalGridBatchEditEndEditingEventArgs]
  }
  @scala.inline
  implicit class ASPxClientVerticalGridBatchEditEndEditingEventArgsOps[Self <: ASPxClientVerticalGridBatchEditEndEditingEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecordValues(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordValues")(value.asInstanceOf[js.Any])
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

