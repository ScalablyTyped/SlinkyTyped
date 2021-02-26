package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the ASPxRatingControl control.
  */
@js.native
trait ASPxClientRatingControl extends ASPxClientControl {
  
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
  implicit class ASPxClientRatingControlMutableBuilder[Self <: ASPxClientRatingControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetReadOnly(value: () => Boolean): Self = StObject.set(x, "GetReadOnly", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTitle(value: Double => String): Self = StObject.set(x, "GetTitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetValue(value: () => Double): Self = StObject.set(x, "GetValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setItemClick(value: ASPxClientEvent[ASPxClientRatingControlItemClickEventHandler[ASPxClientRatingControl]]): Self = StObject.set(x, "ItemClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemMouseOut(value: ASPxClientEvent[ASPxClientRatingControlItemMouseEventHandler[ASPxClientRatingControl]]): Self = StObject.set(x, "ItemMouseOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemMouseOver(value: ASPxClientEvent[ASPxClientRatingControlItemMouseEventHandler[ASPxClientRatingControl]]): Self = StObject.set(x, "ItemMouseOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetReadOnly(value: Boolean => Unit): Self = StObject.set(x, "SetReadOnly", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValue(value: Double => Unit): Self = StObject.set(x, "SetValue", js.Any.fromFunction1(value))
  }
}
