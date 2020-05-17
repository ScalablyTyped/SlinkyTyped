package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGridView.BatchEditRowRecovering event.
  */
@js.native
trait ASPxClientGridViewBatchEditRowRecoveringEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the row's key.
    */
  var key: js.Any = js.native
  /**
    * Gets a hashtable that maintains information about recovered cells.
    */
  var rowValues: js.Any = js.native
  /**
    * Gets the processed row's visible index.
    */
  var visibleIndex: Double = js.native
}

object ASPxClientGridViewBatchEditRowRecoveringEventArgs {
  @scala.inline
  def apply(cancel: Boolean, key: js.Any, rowValues: js.Any, visibleIndex: Double): ASPxClientGridViewBatchEditRowRecoveringEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], rowValues = rowValues.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewBatchEditRowRecoveringEventArgs]
  }
  @scala.inline
  implicit class ASPxClientGridViewBatchEditRowRecoveringEventArgsOps[Self <: ASPxClientGridViewBatchEditRowRecoveringEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

