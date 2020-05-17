package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientCardView.BatchEditCardValidating event.
  */
@js.native
trait ASPxClientCardViewBatchEditCardValidatingEventArgs extends ASPxClientEventArgs {
  /**
    * Provides validation information of a card currently being validated.
    */
  var validationInfo: js.Any = js.native
  /**
    * Gets the processed card's visible index.
    */
  var visibleIndex: Double = js.native
}

object ASPxClientCardViewBatchEditCardValidatingEventArgs {
  @scala.inline
  def apply(validationInfo: js.Any, visibleIndex: Double): ASPxClientCardViewBatchEditCardValidatingEventArgs = {
    val __obj = js.Dynamic.literal(validationInfo = validationInfo.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCardViewBatchEditCardValidatingEventArgs]
  }
  @scala.inline
  implicit class ASPxClientCardViewBatchEditCardValidatingEventArgsOps[Self <: ASPxClientCardViewBatchEditCardValidatingEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValidationInfo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationInfo")(value.asInstanceOf[js.Any])
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

