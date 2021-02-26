package typingsSlinky.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceFleetTimeline extends StObject {
  
  /**
    * The time and date the instance fleet was created.
    */
  var CreationDateTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The time and date the instance fleet terminated.
    */
  var EndDateTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The time and date the instance fleet was ready to run jobs.
    */
  var ReadyDateTime: js.UndefOr[js.Date] = js.native
}
object InstanceFleetTimeline {
  
  @scala.inline
  def apply(): InstanceFleetTimeline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceFleetTimeline]
  }
  
  @scala.inline
  implicit class InstanceFleetTimelineMutableBuilder[Self <: InstanceFleetTimeline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDateTime(value: js.Date): Self = StObject.set(x, "CreationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateTimeUndefined: Self = StObject.set(x, "CreationDateTime", js.undefined)
    
    @scala.inline
    def setEndDateTime(value: js.Date): Self = StObject.set(x, "EndDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateTimeUndefined: Self = StObject.set(x, "EndDateTime", js.undefined)
    
    @scala.inline
    def setReadyDateTime(value: js.Date): Self = StObject.set(x, "ReadyDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadyDateTimeUndefined: Self = StObject.set(x, "ReadyDateTime", js.undefined)
  }
}
