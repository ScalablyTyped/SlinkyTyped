package typingsSlinky.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceStatus extends StObject {
  
  /**
    * The current state of the instance.
    */
  var State: js.UndefOr[InstanceState] = js.native
  
  /**
    * The details of the status change reason for the instance.
    */
  var StateChangeReason: js.UndefOr[InstanceStateChangeReason] = js.native
  
  /**
    * The timeline of the instance status over time.
    */
  var Timeline: js.UndefOr[InstanceTimeline] = js.native
}
object InstanceStatus {
  
  @scala.inline
  def apply(): InstanceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceStatus]
  }
  
  @scala.inline
  implicit class InstanceStatusMutableBuilder[Self <: InstanceStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: InstanceState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateChangeReason(value: InstanceStateChangeReason): Self = StObject.set(x, "StateChangeReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateChangeReasonUndefined: Self = StObject.set(x, "StateChangeReason", js.undefined)
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setTimeline(value: InstanceTimeline): Self = StObject.set(x, "Timeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimelineUndefined: Self = StObject.set(x, "Timeline", js.undefined)
  }
}
