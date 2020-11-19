package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the ASPxValidationSummary control.
  */
@js.native
trait ASPxClientValidationSummary extends ASPxClientControl {
  
  /**
    * Occurs on the client side when the validation summary's visibility is changed.
    */
  var VisibilityChanged: ASPxClientEvent[
    ASPxClientValidationSummaryVisibilityChangedEventHandler[ASPxClientValidationSummary]
  ] = js.native
}
object ASPxClientValidationSummary {
  
  @scala.inline
  def apply(
    AdjustControl: () => Unit,
    GetClientVisible: () => Boolean,
    GetHeight: () => Double,
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
    VisibilityChanged: ASPxClientEvent[
      ASPxClientValidationSummaryVisibilityChangedEventHandler[ASPxClientValidationSummary]
    ],
    name: String
  ): ASPxClientValidationSummary = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetHeight = js.Any.fromFunction0(GetHeight), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetHeight = js.Any.fromFunction1(SetHeight), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), VisibilityChanged = VisibilityChanged.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientValidationSummary]
  }
  
  @scala.inline
  implicit class ASPxClientValidationSummaryOps[Self <: ASPxClientValidationSummary] (val x: Self) extends AnyVal {
    
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
    def setVisibilityChanged(
      value: ASPxClientEvent[
          ASPxClientValidationSummaryVisibilityChangedEventHandler[ASPxClientValidationSummary]
        ]
    ): Self = this.set("VisibilityChanged", value.asInstanceOf[js.Any])
  }
}
