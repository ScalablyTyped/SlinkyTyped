package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the BootstrapButton control.
  */
@js.native
trait BootstrapClientButton extends ASPxClientButton {
  
  /**
    * Gets the CSS class of the icon displayed within the button badge.
    */
  def GetBadgeIconCssClass(): String = js.native
  
  /**
    * Gets the text displayed within the button badge.
    */
  def GetBadgeText(): String = js.native
  
  /**
    * Sets the CSS class of the icon displayed within the button badge.
    * @param cssClass A string containing the name of a CSS class.
    */
  def SetBadgeIconCssClass(cssClass: String): Unit = js.native
  
  /**
    * Sets the text displayed within the button badge.
    * @param text A String specifying the badge text.
    */
  def SetBadgeText(text: String): Unit = js.native
}
object BootstrapClientButton {
  
  @scala.inline
  def apply(
    AdjustControl: () => Unit,
    CheckedChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientButton]],
    Click: ASPxClientEvent[ASPxClientButtonClickEventHandler[ASPxClientButton]],
    DoClick: () => Unit,
    Focus: () => Unit,
    GetBadgeIconCssClass: () => String,
    GetBadgeText: () => String,
    GetChecked: () => Boolean,
    GetClientVisible: () => Boolean,
    GetEnabled: () => Boolean,
    GetHeight: () => Double,
    GetImageUrl: () => String,
    GetMainElement: () => js.Any,
    GetParentControl: () => js.Any,
    GetText: () => String,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    GotFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientButton]],
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientButton]],
    SendMessageToAssistiveTechnology: String => Unit,
    SetBadgeIconCssClass: String => Unit,
    SetBadgeText: String => Unit,
    SetChecked: Boolean => Unit,
    SetClientVisible: Boolean => Unit,
    SetEnabled: Boolean => Unit,
    SetHeight: Double => Unit,
    SetImageUrl: String => Unit,
    SetText: String => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    name: String
  ): BootstrapClientButton = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), CheckedChanged = CheckedChanged.asInstanceOf[js.Any], Click = Click.asInstanceOf[js.Any], DoClick = js.Any.fromFunction0(DoClick), Focus = js.Any.fromFunction0(Focus), GetBadgeIconCssClass = js.Any.fromFunction0(GetBadgeIconCssClass), GetBadgeText = js.Any.fromFunction0(GetBadgeText), GetChecked = js.Any.fromFunction0(GetChecked), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetEnabled = js.Any.fromFunction0(GetEnabled), GetHeight = js.Any.fromFunction0(GetHeight), GetImageUrl = js.Any.fromFunction0(GetImageUrl), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetText = js.Any.fromFunction0(GetText), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), GotFocus = GotFocus.asInstanceOf[js.Any], InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], LostFocus = LostFocus.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetBadgeIconCssClass = js.Any.fromFunction1(SetBadgeIconCssClass), SetBadgeText = js.Any.fromFunction1(SetBadgeText), SetChecked = js.Any.fromFunction1(SetChecked), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetEnabled = js.Any.fromFunction1(SetEnabled), SetHeight = js.Any.fromFunction1(SetHeight), SetImageUrl = js.Any.fromFunction1(SetImageUrl), SetText = js.Any.fromFunction1(SetText), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientButton]
  }
  
  @scala.inline
  implicit class BootstrapClientButtonOps[Self <: BootstrapClientButton] (val x: Self) extends AnyVal {
    
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
    def setGetBadgeIconCssClass(value: () => String): Self = this.set("GetBadgeIconCssClass", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBadgeText(value: () => String): Self = this.set("GetBadgeText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetBadgeIconCssClass(value: String => Unit): Self = this.set("SetBadgeIconCssClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetBadgeText(value: String => Unit): Self = this.set("SetBadgeText", js.Any.fromFunction1(value))
  }
}
