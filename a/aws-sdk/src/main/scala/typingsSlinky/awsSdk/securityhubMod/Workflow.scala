package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Workflow extends js.Object {
  
  /**
    * The status of the investigation into the finding. The allowed values are the following.    NEW - The initial state of a finding, before it is reviewed.    NOTIFIED - Indicates that you notified the resource owner about the security issue. Used when the initial reviewer is not the resource owner, and needs intervention from the resource owner.    SUPPRESSED - The finding will not be reviewed again and will not be acted upon.    RESOLVED - The finding was reviewed and remediated and is now considered resolved.   
    */
  var Status: js.UndefOr[WorkflowStatus] = js.native
}
object Workflow {
  
  @scala.inline
  def apply(): Workflow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Workflow]
  }
  
  @scala.inline
  implicit class WorkflowOps[Self <: Workflow] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: WorkflowStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
