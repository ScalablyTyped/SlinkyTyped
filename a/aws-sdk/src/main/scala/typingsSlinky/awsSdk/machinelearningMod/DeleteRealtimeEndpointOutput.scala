package typingsSlinky.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteRealtimeEndpointOutput extends js.Object {
  
  /**
    * A user-supplied ID that uniquely identifies the MLModel. This value should be identical to the value of the MLModelId in the request.
    */
  var MLModelId: js.UndefOr[EntityId] = js.native
  
  /**
    * The endpoint information of the MLModel 
    */
  var RealtimeEndpointInfo: js.UndefOr[typingsSlinky.awsSdk.machinelearningMod.RealtimeEndpointInfo] = js.native
}
object DeleteRealtimeEndpointOutput {
  
  @scala.inline
  def apply(): DeleteRealtimeEndpointOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteRealtimeEndpointOutput]
  }
  
  @scala.inline
  implicit class DeleteRealtimeEndpointOutputOps[Self <: DeleteRealtimeEndpointOutput] (val x: Self) extends AnyVal {
    
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
    def setMLModelId(value: EntityId): Self = this.set("MLModelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMLModelId: Self = this.set("MLModelId", js.undefined)
    
    @scala.inline
    def setRealtimeEndpointInfo(value: RealtimeEndpointInfo): Self = this.set("RealtimeEndpointInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRealtimeEndpointInfo: Self = this.set("RealtimeEndpointInfo", js.undefined)
  }
}
