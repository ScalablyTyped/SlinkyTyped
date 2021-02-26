package typingsSlinky.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenShift extends ChangeTrackedEntity {
  
  // An unpublished open shift.
  var draftOpenShift: js.UndefOr[NullableOption[OpenShiftItem]] = js.native
  
  // ID for the scheduling group that the open shift belongs to.
  var schedulingGroupId: js.UndefOr[NullableOption[String]] = js.native
  
  // A published open shift.
  var sharedOpenShift: js.UndefOr[NullableOption[OpenShiftItem]] = js.native
}
object OpenShift {
  
  @scala.inline
  def apply(): OpenShift = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenShift]
  }
  
  @scala.inline
  implicit class OpenShiftMutableBuilder[Self <: OpenShift] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDraftOpenShift(value: NullableOption[OpenShiftItem]): Self = StObject.set(x, "draftOpenShift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraftOpenShiftNull: Self = StObject.set(x, "draftOpenShift", null)
    
    @scala.inline
    def setDraftOpenShiftUndefined: Self = StObject.set(x, "draftOpenShift", js.undefined)
    
    @scala.inline
    def setSchedulingGroupId(value: NullableOption[String]): Self = StObject.set(x, "schedulingGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchedulingGroupIdNull: Self = StObject.set(x, "schedulingGroupId", null)
    
    @scala.inline
    def setSchedulingGroupIdUndefined: Self = StObject.set(x, "schedulingGroupId", js.undefined)
    
    @scala.inline
    def setSharedOpenShift(value: NullableOption[OpenShiftItem]): Self = StObject.set(x, "sharedOpenShift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedOpenShiftNull: Self = StObject.set(x, "sharedOpenShift", null)
    
    @scala.inline
    def setSharedOpenShiftUndefined: Self = StObject.set(x, "sharedOpenShift", js.undefined)
  }
}
