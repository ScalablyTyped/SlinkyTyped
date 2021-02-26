package typingsSlinky.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalendarSharingMessage extends Message {
  
  var canAccept: js.UndefOr[NullableOption[Boolean]] = js.native
  
  var sharingMessageAction: js.UndefOr[NullableOption[CalendarSharingMessageAction]] = js.native
  
  var sharingMessageActions: js.UndefOr[NullableOption[js.Array[CalendarSharingMessageAction]]] = js.native
  
  var suggestedCalendarName: js.UndefOr[NullableOption[String]] = js.native
}
object CalendarSharingMessage {
  
  @scala.inline
  def apply(): CalendarSharingMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarSharingMessage]
  }
  
  @scala.inline
  implicit class CalendarSharingMessageMutableBuilder[Self <: CalendarSharingMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanAccept(value: NullableOption[Boolean]): Self = StObject.set(x, "canAccept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanAcceptNull: Self = StObject.set(x, "canAccept", null)
    
    @scala.inline
    def setCanAcceptUndefined: Self = StObject.set(x, "canAccept", js.undefined)
    
    @scala.inline
    def setSharingMessageAction(value: NullableOption[CalendarSharingMessageAction]): Self = StObject.set(x, "sharingMessageAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharingMessageActionNull: Self = StObject.set(x, "sharingMessageAction", null)
    
    @scala.inline
    def setSharingMessageActionUndefined: Self = StObject.set(x, "sharingMessageAction", js.undefined)
    
    @scala.inline
    def setSharingMessageActions(value: NullableOption[js.Array[CalendarSharingMessageAction]]): Self = StObject.set(x, "sharingMessageActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharingMessageActionsNull: Self = StObject.set(x, "sharingMessageActions", null)
    
    @scala.inline
    def setSharingMessageActionsUndefined: Self = StObject.set(x, "sharingMessageActions", js.undefined)
    
    @scala.inline
    def setSharingMessageActionsVarargs(value: CalendarSharingMessageAction*): Self = StObject.set(x, "sharingMessageActions", js.Array(value :_*))
    
    @scala.inline
    def setSuggestedCalendarName(value: NullableOption[String]): Self = StObject.set(x, "suggestedCalendarName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedCalendarNameNull: Self = StObject.set(x, "suggestedCalendarName", null)
    
    @scala.inline
    def setSuggestedCalendarNameUndefined: Self = StObject.set(x, "suggestedCalendarName", js.undefined)
  }
}
