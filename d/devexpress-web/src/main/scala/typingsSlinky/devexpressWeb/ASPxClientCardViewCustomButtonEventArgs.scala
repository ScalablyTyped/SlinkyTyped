package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientCardView.CustomButtonClick event.
  */
@js.native
trait ASPxClientCardViewCustomButtonEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets the value which identifies the custom button.
    */
  var buttonID: String = js.native
  /**
    * Gets the value which identifies the card whose custom button has been clicked.
    */
  var visibleIndex: Double = js.native
}

object ASPxClientCardViewCustomButtonEventArgs {
  @scala.inline
  def apply(buttonID: String, processOnServer: Boolean, visibleIndex: Double): ASPxClientCardViewCustomButtonEventArgs = {
    val __obj = js.Dynamic.literal(buttonID = buttonID.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCardViewCustomButtonEventArgs]
  }
  @scala.inline
  implicit class ASPxClientCardViewCustomButtonEventArgsOps[Self <: ASPxClientCardViewCustomButtonEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButtonID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonID")(value.asInstanceOf[js.Any])
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

