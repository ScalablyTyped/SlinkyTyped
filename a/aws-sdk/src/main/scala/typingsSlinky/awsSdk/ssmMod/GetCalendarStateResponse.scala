package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCalendarStateResponse extends StObject {
  
  /**
    * The time, as an ISO 8601 string, that you specified in your command. If you did not specify a time, GetCalendarState uses the current time.
    */
  var AtTime: js.UndefOr[ISO8601String] = js.native
  
  /**
    * The time, as an ISO 8601 string, that the calendar state will change. If the current calendar state is OPEN, NextTransitionTime indicates when the calendar state changes to CLOSED, and vice-versa.
    */
  var NextTransitionTime: js.UndefOr[ISO8601String] = js.native
  
  /**
    * The state of the calendar. An OPEN calendar indicates that actions are allowed to proceed, and a CLOSED calendar indicates that actions are not allowed to proceed.
    */
  var State: js.UndefOr[CalendarState] = js.native
}
object GetCalendarStateResponse {
  
  @scala.inline
  def apply(): GetCalendarStateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCalendarStateResponse]
  }
  
  @scala.inline
  implicit class GetCalendarStateResponseMutableBuilder[Self <: GetCalendarStateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAtTime(value: ISO8601String): Self = StObject.set(x, "AtTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAtTimeUndefined: Self = StObject.set(x, "AtTime", js.undefined)
    
    @scala.inline
    def setNextTransitionTime(value: ISO8601String): Self = StObject.set(x, "NextTransitionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTransitionTimeUndefined: Self = StObject.set(x, "NextTransitionTime", js.undefined)
    
    @scala.inline
    def setState(value: CalendarState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
