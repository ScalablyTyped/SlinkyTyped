package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapListBoxEventMap extends BootstrapClientEditEventMap {
  
  var beginCallback: BeginCallbackEventArgs = js.native
  
  var callbackError: CallbackErrorEventArgs = js.native
  
  var customHighlighting: ListEditCustomHighlightingEventArgs = js.native
  
  var endCallback: EndCallbackEventArgs = js.native
  
  var itemDoubleClick: EventArgs = js.native
  
  var itemFiltering: ListEditItemFilteringEventArgs = js.native
  
  var keyDown: EditKeyEventArgs = js.native
  
  var keyPress: EditKeyEventArgs = js.native
  
  var keyUp: EditKeyEventArgs = js.native
  
  var selectedIndexChanged: ProcessingModeEventArgs = js.native
}
object BootstrapListBoxEventMap {
  
  @scala.inline
  def apply(
    beginCallback: BeginCallbackEventArgs,
    callbackError: CallbackErrorEventArgs,
    customHighlighting: ListEditCustomHighlightingEventArgs,
    endCallback: EndCallbackEventArgs,
    gotFocus: EventArgs,
    init: EventArgs,
    itemDoubleClick: EventArgs,
    itemFiltering: ListEditItemFilteringEventArgs,
    keyDown: EditKeyEventArgs,
    keyPress: EditKeyEventArgs,
    keyUp: EditKeyEventArgs,
    lostFocus: EventArgs,
    selectedIndexChanged: ProcessingModeEventArgs,
    validation: EditValidationEventArgs,
    valueChanged: ProcessingModeEventArgs
  ): BootstrapListBoxEventMap = {
    val __obj = js.Dynamic.literal(beginCallback = beginCallback.asInstanceOf[js.Any], callbackError = callbackError.asInstanceOf[js.Any], customHighlighting = customHighlighting.asInstanceOf[js.Any], endCallback = endCallback.asInstanceOf[js.Any], gotFocus = gotFocus.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], itemDoubleClick = itemDoubleClick.asInstanceOf[js.Any], itemFiltering = itemFiltering.asInstanceOf[js.Any], keyDown = keyDown.asInstanceOf[js.Any], keyPress = keyPress.asInstanceOf[js.Any], keyUp = keyUp.asInstanceOf[js.Any], lostFocus = lostFocus.asInstanceOf[js.Any], selectedIndexChanged = selectedIndexChanged.asInstanceOf[js.Any], validation = validation.asInstanceOf[js.Any], valueChanged = valueChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapListBoxEventMap]
  }
  
  @scala.inline
  implicit class BootstrapListBoxEventMapMutableBuilder[Self <: BootstrapListBoxEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeginCallback(value: BeginCallbackEventArgs): Self = StObject.set(x, "beginCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackError(value: CallbackErrorEventArgs): Self = StObject.set(x, "callbackError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomHighlighting(value: ListEditCustomHighlightingEventArgs): Self = StObject.set(x, "customHighlighting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndCallback(value: EndCallbackEventArgs): Self = StObject.set(x, "endCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemDoubleClick(value: EventArgs): Self = StObject.set(x, "itemDoubleClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemFiltering(value: ListEditItemFilteringEventArgs): Self = StObject.set(x, "itemFiltering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyDown(value: EditKeyEventArgs): Self = StObject.set(x, "keyDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPress(value: EditKeyEventArgs): Self = StObject.set(x, "keyPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUp(value: EditKeyEventArgs): Self = StObject.set(x, "keyUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedIndexChanged(value: ProcessingModeEventArgs): Self = StObject.set(x, "selectedIndexChanged", value.asInstanceOf[js.Any])
  }
}
