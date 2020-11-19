package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenShift extends ChangeTrackedEntity {
  
  // An unpublished open shift.
  var draftOpenShift: js.UndefOr[OpenShiftItem] = js.native
  
  // ID for the scheduling group that the open shift belongs to.
  var schedulingGroupId: js.UndefOr[String] = js.native
  
  // A published open shift.
  var sharedOpenShift: js.UndefOr[OpenShiftItem] = js.native
}
object OpenShift {
  
  @scala.inline
  def apply(): OpenShift = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenShift]
  }
  
  @scala.inline
  implicit class OpenShiftOps[Self <: OpenShift] (val x: Self) extends AnyVal {
    
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
    def setDraftOpenShift(value: OpenShiftItem): Self = this.set("draftOpenShift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraftOpenShift: Self = this.set("draftOpenShift", js.undefined)
    
    @scala.inline
    def setSchedulingGroupId(value: String): Self = this.set("schedulingGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchedulingGroupId: Self = this.set("schedulingGroupId", js.undefined)
    
    @scala.inline
    def setSharedOpenShift(value: OpenShiftItem): Self = this.set("sharedOpenShift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharedOpenShift: Self = this.set("sharedOpenShift", js.undefined)
  }
}
