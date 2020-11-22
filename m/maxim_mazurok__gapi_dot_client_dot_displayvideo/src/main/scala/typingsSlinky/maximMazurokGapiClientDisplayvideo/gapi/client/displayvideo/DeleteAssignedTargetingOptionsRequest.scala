package typingsSlinky.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteAssignedTargetingOptionsRequest extends js.Object {
  
  /** Required. The assigned targeting option IDs to delete. */
  var assignedTargetingOptionIds: js.UndefOr[js.Array[String]] = js.native
  
  /** Required. Identifies the type of this assigned targeting option. */
  var targetingType: js.UndefOr[String] = js.native
}
object DeleteAssignedTargetingOptionsRequest {
  
  @scala.inline
  def apply(): DeleteAssignedTargetingOptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteAssignedTargetingOptionsRequest]
  }
  
  @scala.inline
  implicit class DeleteAssignedTargetingOptionsRequestOps[Self <: DeleteAssignedTargetingOptionsRequest] (val x: Self) extends AnyVal {
    
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
    def setAssignedTargetingOptionIdsVarargs(value: String*): Self = this.set("assignedTargetingOptionIds", js.Array(value :_*))
    
    @scala.inline
    def setAssignedTargetingOptionIds(value: js.Array[String]): Self = this.set("assignedTargetingOptionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignedTargetingOptionIds: Self = this.set("assignedTargetingOptionIds", js.undefined)
    
    @scala.inline
    def setTargetingType(value: String): Self = this.set("targetingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetingType: Self = this.set("targetingType", js.undefined)
  }
}
