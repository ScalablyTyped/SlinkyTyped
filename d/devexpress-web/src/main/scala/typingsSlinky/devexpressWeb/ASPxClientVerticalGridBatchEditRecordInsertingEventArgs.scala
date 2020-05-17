package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientVerticalGrid.BatchEditRecordInserting event.
  */
@js.native
trait ASPxClientVerticalGridBatchEditRecordInsertingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the processed record's visible index.
    */
  var visibleIndex: Double = js.native
}

object ASPxClientVerticalGridBatchEditRecordInsertingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, visibleIndex: Double): ASPxClientVerticalGridBatchEditRecordInsertingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientVerticalGridBatchEditRecordInsertingEventArgs]
  }
  @scala.inline
  implicit class ASPxClientVerticalGridBatchEditRecordInsertingEventArgsOps[Self <: ASPxClientVerticalGridBatchEditRecordInsertingEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVisibleIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

