package typingsSlinky.googleapis.servicebrokerV1beta1Mod.servicebrokerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for the `UpdateServiceInstance()` method.
  */
@js.native
trait SchemaGoogleCloudServicebrokerV1beta1UpdateServiceInstanceResponse extends js.Object {
  
  /**
    * Used to communicate description of the response. Usually for non-standard
    * error codes.
    * https://github.com/openservicebrokerapi/servicebroker/blob/master/spec.md#service-broker-errors
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * If broker executes operation asynchronously, this is the operation ID
    * that can be polled to check the completion status of said operation.
    */
  var operation: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudServicebrokerV1beta1UpdateServiceInstanceResponse {
  
  @scala.inline
  def apply(): SchemaGoogleCloudServicebrokerV1beta1UpdateServiceInstanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudServicebrokerV1beta1UpdateServiceInstanceResponse]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudServicebrokerV1beta1UpdateServiceInstanceResponseOps[Self <: SchemaGoogleCloudServicebrokerV1beta1UpdateServiceInstanceResponse] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setOperation(value: String): Self = this.set("operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperation: Self = this.set("operation", js.undefined)
  }
}
