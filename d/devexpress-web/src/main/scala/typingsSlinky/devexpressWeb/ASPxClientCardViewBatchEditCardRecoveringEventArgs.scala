package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientCardView.BatchEditCardRecovering event.
  */
@js.native
trait ASPxClientCardViewBatchEditCardRecoveringEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets a hashtable that maintains information about recovered cells.
    */
  var cardValues: js.Any = js.native
  /**
    * Gets the visible index of the card whose cells has been recovered.
    */
  var visibleIndex: Double = js.native
}

object ASPxClientCardViewBatchEditCardRecoveringEventArgs {
  @scala.inline
  def apply(cancel: Boolean, cardValues: js.Any, visibleIndex: Double): ASPxClientCardViewBatchEditCardRecoveringEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], cardValues = cardValues.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCardViewBatchEditCardRecoveringEventArgs]
  }
  @scala.inline
  implicit class ASPxClientCardViewBatchEditCardRecoveringEventArgsOps[Self <: ASPxClientCardViewBatchEditCardRecoveringEventArgs] (val x: Self) extends AnyVal {
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

