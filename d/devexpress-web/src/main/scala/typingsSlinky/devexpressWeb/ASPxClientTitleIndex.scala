package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the ASPxTitleIndex object.
  */
@js.native
trait ASPxClientTitleIndex extends ASPxClientControl {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientTitleIndex]] = js.native
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientTitleIndex.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientTitleIndex]] = js.native
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientTitleIndex]] = js.native
  /**
    * Fires after an item has been clicked.
    */
  var ItemClick: ASPxClientEvent[ASPxClientTitleIndexItemEventHandler[ASPxClientTitleIndex]] = js.native
}

object ASPxClientTitleIndex {
  @scala.inline
  def apply(
    AdjustControl: () => Unit,
    BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientTitleIndex]],
    CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientTitleIndex]],
    EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientTitleIndex]],
    GetClientVisible: () => Boolean,
    GetHeight: () => Double,
    GetMainElement: () => js.Any,
    GetParentControl: () => js.Any,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    ItemClick: ASPxClientEvent[ASPxClientTitleIndexItemEventHandler[ASPxClientTitleIndex]],
    SendMessageToAssistiveTechnology: String => Unit,
    SetClientVisible: Boolean => Unit,
    SetHeight: Double => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    name: String
  ): ASPxClientTitleIndex = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), BeginCallback = BeginCallback.asInstanceOf[js.Any], CallbackError = CallbackError.asInstanceOf[js.Any], EndCallback = EndCallback.asInstanceOf[js.Any], GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetHeight = js.Any.fromFunction0(GetHeight), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], ItemClick = ItemClick.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetHeight = js.Any.fromFunction1(SetHeight), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTitleIndex]
  }
  @scala.inline
  implicit class ASPxClientTitleIndexOps[Self <: ASPxClientTitleIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeginCallback(value: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientTitleIndex]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BeginCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallbackError(value: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientTitleIndex]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CallbackError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndCallback(value: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientTitleIndex]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemClick(value: ASPxClientEvent[ASPxClientTitleIndexItemEventHandler[ASPxClientTitleIndex]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ItemClick")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

