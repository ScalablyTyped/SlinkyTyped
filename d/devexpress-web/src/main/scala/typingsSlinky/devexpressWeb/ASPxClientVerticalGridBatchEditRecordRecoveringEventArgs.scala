package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientVerticalGrid.BatchEditRecordRecovering event.
  */
@js.native
trait ASPxClientVerticalGridBatchEditRecordRecoveringEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets a hashtable that maintains information about recovered cells.
    */
  var recordValues: js.Any = js.native
  /**
    * Gets the processed record's visible index.
    */
  var visibleIndex: Double = js.native
}

object ASPxClientVerticalGridBatchEditRecordRecoveringEventArgs {
  @scala.inline
  def apply(cancel: Boolean, recordValues: js.Any, visibleIndex: Double): ASPxClientVerticalGridBatchEditRecordRecoveringEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], recordValues = recordValues.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientVerticalGridBatchEditRecordRecoveringEventArgs]
  }
  @scala.inline
  implicit class ASPxClientVerticalGridBatchEditRecordRecoveringEventArgsOps[Self <: ASPxClientVerticalGridBatchEditRecordRecoveringEventArgs] (val x: Self) extends AnyVal {
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

