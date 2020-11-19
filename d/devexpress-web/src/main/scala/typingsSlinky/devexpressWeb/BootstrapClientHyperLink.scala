package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the BootstrapHyperLink control.
  */
@js.native
trait BootstrapClientHyperLink extends ASPxClientHyperLink {
  
  /**
    * Gets the CSS class of the icon displayed within the hyperlink badge.
    */
  def GetBadgeIconCssClass(): String = js.native
  
  /**
    * Gets the text displayed within the hyperlink badge.
    */
  def GetBadgeText(): String = js.native
  
  /**
    * Sets the CSS class of the icon displayed within the hyperlink badge.
    * @param cssClass A string containing the name of a CSS class.
    */
  def SetBadgeIconCssClass(cssClass: String): Unit = js.native
  
  /**
    * Sets the text displayed within the hyperlink badge.
    * @param text A String specifying the badge text.
    */
  def SetBadgeText(text: String): Unit = js.native
}
object BootstrapClientHyperLink {
  
  @scala.inline
  def apply(
    AdjustControl: () => Unit,
    Click: ASPxClientEvent[ASPxClientEditEventHandler[ASPxClientStaticEdit]],
    GetBadgeIconCssClass: () => String,
    GetBadgeText: () => String,
    GetCaption: () => String,
    GetClientVisible: () => Boolean,
    GetEnabled: () => Boolean,
    GetHeight: () => Double,
    GetMainElement: () => js.Any,
    GetNavigateUrl: () => String,
    GetParentControl: () => js.Any,
    GetText: () => String,
    GetValue: () => js.Any,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: String => Unit,
    SetBadgeIconCssClass: String => Unit,
    SetBadgeText: String => Unit,
    SetCaption: String => Unit,
    SetClientVisible: Boolean => Unit,
    SetEnabled: Boolean => Unit,
    SetHeight: Double => Unit,
    SetNavigateUrl: String => Unit,
    SetText: String => Unit,
    SetValue: js.Any => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    name: String
  ): BootstrapClientHyperLink = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), Click = Click.asInstanceOf[js.Any], GetBadgeIconCssClass = js.Any.fromFunction0(GetBadgeIconCssClass), GetBadgeText = js.Any.fromFunction0(GetBadgeText), GetCaption = js.Any.fromFunction0(GetCaption), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetEnabled = js.Any.fromFunction0(GetEnabled), GetHeight = js.Any.fromFunction0(GetHeight), GetMainElement = js.Any.fromFunction0(GetMainElement), GetNavigateUrl = js.Any.fromFunction0(GetNavigateUrl), GetParentControl = js.Any.fromFunction0(GetParentControl), GetText = js.Any.fromFunction0(GetText), GetValue = js.Any.fromFunction0(GetValue), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetBadgeIconCssClass = js.Any.fromFunction1(SetBadgeIconCssClass), SetBadgeText = js.Any.fromFunction1(SetBadgeText), SetCaption = js.Any.fromFunction1(SetCaption), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetEnabled = js.Any.fromFunction1(SetEnabled), SetHeight = js.Any.fromFunction1(SetHeight), SetNavigateUrl = js.Any.fromFunction1(SetNavigateUrl), SetText = js.Any.fromFunction1(SetText), SetValue = js.Any.fromFunction1(SetValue), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientHyperLink]
  }
  
  @scala.inline
  implicit class BootstrapClientHyperLinkOps[Self <: BootstrapClientHyperLink] (val x: Self) extends AnyVal {
    
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
