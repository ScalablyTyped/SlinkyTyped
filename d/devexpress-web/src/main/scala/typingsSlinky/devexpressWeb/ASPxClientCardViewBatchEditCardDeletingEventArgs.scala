package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientCardView.BatchEditCardDeleting event.
  */
@js.native
trait ASPxClientCardViewBatchEditCardDeletingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets a hashtable that maintains information about deleted cells.
    */
  var cardValues: js.Any = js.native
  /**
    * Gets the processed card visible index.
    */
  var visibleIndex: Double = js.native
}

object ASPxClientCardViewBatchEditCardDeletingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, cardValues: js.Any, visibleIndex: Double): ASPxClientCardViewBatchEditCardDeletingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], cardValues = cardValues.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCardViewBatchEditCardDeletingEventArgs]
  }
  @scala.inline
  implicit class ASPxClientCardViewBatchEditCardDeletingEventArgsOps[Self <: ASPxClientCardViewBatchEditCardDeletingEventArgs] (val x: Self) extends AnyVal {
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
    def withVisibleIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

