package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridViewBatchEditStartEditingEventArgs extends CancelEventArgs {
  var focusedColumn: BootstrapGridViewColumn = js.native
  val rowValues: js.Any = js.native
  val visibleIndex: Double = js.native
}

object GridViewBatchEditStartEditingEventArgs {
  @scala.inline
  def apply(
    cancel: Boolean,
    focusedColumn: BootstrapGridViewColumn,
    rowValues: js.Any,
    sender: Control,
    visibleIndex: Double
  ): GridViewBatchEditStartEditingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], focusedColumn = focusedColumn.asInstanceOf[js.Any], rowValues = rowValues.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridViewBatchEditStartEditingEventArgs]
  }
  @scala.inline
  implicit class GridViewBatchEditStartEditingEventArgsOps[Self <: GridViewBatchEditStartEditingEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFocusedColumn(value: BootstrapGridViewColumn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusedColumn")(value.asInstanceOf[js.Any])
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

