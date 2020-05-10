package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardViewBatchEditStartEditingEventArgs extends CancelEventArgs {
  val cardValues: js.Any = js.native
  var focusedColumn: BootstrapCardViewColumn = js.native
  val visibleIndex: Double = js.native
}

object CardViewBatchEditStartEditingEventArgs {
  @scala.inline
  def apply(
    cancel: Boolean,
    cardValues: js.Any,
    focusedColumn: BootstrapCardViewColumn,
    sender: Control,
    visibleIndex: Double
  ): CardViewBatchEditStartEditingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], cardValues = cardValues.asInstanceOf[js.Any], focusedColumn = focusedColumn.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardViewBatchEditStartEditingEventArgs]
  }
  @scala.inline
  implicit class CardViewBatchEditStartEditingEventArgsOps[Self <: CardViewBatchEditStartEditingEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCardValues(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocusedColumn(value: BootstrapCardViewColumn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusedColumn")(value.asInstanceOf[js.Any])
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

