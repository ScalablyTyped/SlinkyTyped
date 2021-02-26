package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WaitTime extends StObject {
  
  /**
    * The amount of time to wait, as a duration in ISO 8601 format, before determining whether the activity's conditions have been met or moving participants to the next activity in the journey.
    */
  var WaitFor: js.UndefOr[string] = js.native
  
  /**
    * The date and time, in ISO 8601 format, when Amazon Pinpoint determines whether the activity's conditions have been met or the activity moves participants to the next activity in the journey.
    */
  var WaitUntil: js.UndefOr[string] = js.native
}
object WaitTime {
  
  @scala.inline
  def apply(): WaitTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaitTime]
  }
  
  @scala.inline
  implicit class WaitTimeMutableBuilder[Self <: WaitTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWaitFor(value: string): Self = StObject.set(x, "WaitFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForUndefined: Self = StObject.set(x, "WaitFor", js.undefined)
    
    @scala.inline
    def setWaitUntil(value: string): Self = StObject.set(x, "WaitUntil", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitUntilUndefined: Self = StObject.set(x, "WaitUntil", js.undefined)
  }
}
