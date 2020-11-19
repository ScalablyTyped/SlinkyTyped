package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the ASPxFormLayout object.
  */
@js.native
trait ASPxClientFormLayout extends ASPxClientControl {
  
  /**
    * Allows you not to render the control to perform required operations on the client side until you call the EndUpdate method.
    */
  def BeginUpdate(): Unit = js.native
  
  /**
    * Allows the control to be re-rendered after you call the BeginUpdate method and perform the required operations on the client side. This method also forces an immediate control's re-rendering.
    */
  def EndUpdate(): Unit = js.native
  
  /**
    * Returns an item specified by its name. An ASPxClientLayoutItem object that represents the item with the specified name.
    * @param name A string value specifying the name of the item.
    */
  def GetItemByName(name: String): ASPxClientLayoutItem = js.native
}
object ASPxClientFormLayout {
  
  @scala.inline
  def apply(
    AdjustControl: () => Unit,
    BeginUpdate: () => Unit,
    EndUpdate: () => Unit,
    GetClientVisible: () => Boolean,
    GetHeight: () => Double,
    GetItemByName: String => ASPxClientLayoutItem,
    GetMainElement: () => js.Any,
    GetParentControl: () => js.Any,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: String => Unit,
    SetClientVisible: Boolean => Unit,
    SetHeight: Double => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    name: String
  ): ASPxClientFormLayout = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), BeginUpdate = js.Any.fromFunction0(BeginUpdate), EndUpdate = js.Any.fromFunction0(EndUpdate), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetHeight = js.Any.fromFunction0(GetHeight), GetItemByName = js.Any.fromFunction1(GetItemByName), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetHeight = js.Any.fromFunction1(SetHeight), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFormLayout]
  }
  
  @scala.inline
  implicit class ASPxClientFormLayoutOps[Self <: ASPxClientFormLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBeginUpdate(value: () => Unit): Self = this.set("BeginUpdate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEndUpdate(value: () => Unit): Self = this.set("EndUpdate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItemByName(value: String => ASPxClientLayoutItem): Self = this.set("GetItemByName", js.Any.fromFunction1(value))
  }
}
