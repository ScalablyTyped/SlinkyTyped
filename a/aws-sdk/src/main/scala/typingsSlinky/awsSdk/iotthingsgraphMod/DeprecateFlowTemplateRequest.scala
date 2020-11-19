package typingsSlinky.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeprecateFlowTemplateRequest extends js.Object {
  
  /**
    * The ID of the workflow to be deleted. The ID should be in the following format.  urn:tdm:REGION/ACCOUNT ID/default:workflow:WORKFLOWNAME 
    */
  var id: Urn = js.native
}
object DeprecateFlowTemplateRequest {
  
  @scala.inline
  def apply(id: Urn): DeprecateFlowTemplateRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeprecateFlowTemplateRequest]
  }
  
  @scala.inline
  implicit class DeprecateFlowTemplateRequestOps[Self <: DeprecateFlowTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setId(value: Urn): Self = this.set("id", value.asInstanceOf[js.Any])
  }
}
