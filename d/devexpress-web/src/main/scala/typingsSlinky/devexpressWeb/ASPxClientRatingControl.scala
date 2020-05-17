package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ASPxRatingControl control.
  */
@js.native
trait ASPxClientRatingControl extends ASPxClientControl {
  /**
    * Fires on the server after an item has been clicked.
    */
  var ItemClick: ASPxClientEvent[ASPxClientRatingControlItemClickEventHandler[ASPxClientRatingControl]] = js.native
  /**
    * Occurs on the client side when the mouse cursor moves outside a rating control item.
    */
  var ItemMouseOut: ASPxClientEvent[ASPxClientRatingControlItemMouseEventHandler[ASPxClientRatingControl]] = js.native
  /**
    * Occurs on the client side when the mouse cursor is moved into a rating control item.
    */
  var ItemMouseOver: ASPxClientEvent[ASPxClientRatingControlItemMouseEventHandler[ASPxClientRatingControl]] = js.native
  /**
    * Returns a value indicating whether the control's status is read-only.
    */
  def GetReadOnly(): Boolean = js.native
  /**
    * Gets the item tooltip title specified by the item index. A string that is the specified item tooltip title.
    * @param index An integer value specifying the item index.
    */
  def GetTitle(index: Double): String = js.native
  /**
    * Returns the value of the ASPxRatingControl.
    */
  def GetValue(): Double = js.native
  /**
    * Specifies whether the control's status is read-only.
    * @param value true to make the control read-only; otherwise, false.
    */
  def SetReadOnly(value: Boolean): Unit = js.native
  /**
    * Modifies the value of the ASPxRatingControl on the client side.
    * @param value A decimal value representing the value of the control.
    */
  def SetValue(value: Double): Unit = js.native
}

object ASPxClientRatingControl {
  @scala.inline
  def apply(
    AdjustControl: () => Unit,
    GetClientVisible: () => Boolean,
    GetHeight: () => Double,
    GetMainElement: () => js.Any,
    GetParentControl: () => js.Any,
    GetReadOnly: () => Boolean,
    GetTitle: Double => String,
    GetValue: () => Double,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    ItemClick: ASPxClientEvent[ASPxClientRatingControlItemClickEventHandler[ASPxClientRatingControl]],
    ItemMouseOut: ASPxClientEvent[ASPxClientRatingControlItemMouseEventHandler[ASPxClientRatingControl]],
    ItemMouseOver: ASPxClientEvent[ASPxClientRatingControlItemMouseEventHandler[ASPxClientRatingControl]],
    SendMessageToAssistiveTechnology: String => Unit,
    SetClientVisible: Boolean => Unit,
    SetHeight: Double => Unit,
    SetReadOnly: Boolean => Unit,
    SetValue: Double => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    name: String
  ): ASPxClientRatingControl = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetHeight = js.Any.fromFunction0(GetHeight), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetReadOnly = js.Any.fromFunction0(GetReadOnly), GetTitle = js.Any.fromFunction1(GetTitle), GetValue = js.Any.fromFunction0(GetValue), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], ItemClick = ItemClick.asInstanceOf[js.Any], ItemMouseOut = ItemMouseOut.asInstanceOf[js.Any], ItemMouseOver = ItemMouseOver.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetHeight = js.Any.fromFunction1(SetHeight), SetReadOnly = js.Any.fromFunction1(SetReadOnly), SetValue = js.Any.fromFunction1(SetValue), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRatingControl]
  }
  @scala.inline
  implicit class ASPxClientRatingControlOps[Self <: ASPxClientRatingControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetReadOnly(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetReadOnly")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTitle(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetTitle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetValue(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withItemClick(value: ASPxClientEvent[ASPxClientRatingControlItemClickEventHandler[ASPxClientRatingControl]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ItemClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemMouseOut(value: ASPxClientEvent[ASPxClientRatingControlItemMouseEventHandler[ASPxClientRatingControl]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ItemMouseOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemMouseOver(value: ASPxClientEvent[ASPxClientRatingControlItemMouseEventHandler[ASPxClientRatingControl]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ItemMouseOver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetReadOnly(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetReadOnly")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetValue(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetValue")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

