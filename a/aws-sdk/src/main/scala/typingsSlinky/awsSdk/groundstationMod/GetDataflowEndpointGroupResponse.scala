package typingsSlinky.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDataflowEndpointGroupResponse extends js.Object {
  
  /**
    * ARN of a dataflow endpoint group.
    */
  var dataflowEndpointGroupArn: js.UndefOr[DataflowEndpointGroupArn] = js.native
  
  /**
    * UUID of a dataflow endpoint group.
    */
  var dataflowEndpointGroupId: js.UndefOr[String] = js.native
  
  /**
    * Details of a dataflow endpoint.
    */
  var endpointsDetails: js.UndefOr[EndpointDetailsList] = js.native
  
  /**
    * Tags assigned to a dataflow endpoint group.
    */
  var tags: js.UndefOr[TagsMap] = js.native
}
object GetDataflowEndpointGroupResponse {
  
  @scala.inline
  def apply(): GetDataflowEndpointGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDataflowEndpointGroupResponse]
  }
  
  @scala.inline
  implicit class GetDataflowEndpointGroupResponseOps[Self <: GetDataflowEndpointGroupResponse] (val x: Self) extends AnyVal {
    
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
    def setDataflowEndpointGroupArn(value: DataflowEndpointGroupArn): Self = this.set("dataflowEndpointGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataflowEndpointGroupArn: Self = this.set("dataflowEndpointGroupArn", js.undefined)
    
    @scala.inline
    def setDataflowEndpointGroupId(value: String): Self = this.set("dataflowEndpointGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataflowEndpointGroupId: Self = this.set("dataflowEndpointGroupId", js.undefined)
    
    @scala.inline
    def setEndpointsDetailsVarargs(value: EndpointDetails*): Self = this.set("endpointsDetails", js.Array(value :_*))
    
    @scala.inline
    def setEndpointsDetails(value: EndpointDetailsList): Self = this.set("endpointsDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointsDetails: Self = this.set("endpointsDetails", js.undefined)
    
    @scala.inline
    def setTags(value: TagsMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
