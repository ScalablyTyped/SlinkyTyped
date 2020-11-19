package typingsSlinky.googleapis.servicebrokerV1beta1Mod.servicebrokerV1beta1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsBrokersInstancesGetlastOperation extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Name must match `projects/[PROJECT_ID]/brokers/[BROKER_ID]/v2/`+
    * `service_instances/[INSTANCE_ID]`.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * If `operation` was returned during mutation operation, this field must be
    * populated with the provided value.
    */
  var operation: js.UndefOr[String] = js.native
  
  /**
    * Plan id.
    */
  var planId: js.UndefOr[String] = js.native
  
  /**
    * Service id.
    */
  var serviceId: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsBrokersInstancesGetlastOperation {
  
  @scala.inline
  def apply(): ParamsResourceProjectsBrokersInstancesGetlastOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsBrokersInstancesGetlastOperation]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsBrokersInstancesGetlastOperationOps[Self <: ParamsResourceProjectsBrokersInstancesGetlastOperation] (val x: Self) extends AnyVal {
    
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOperation(value: String): Self = this.set("operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperation: Self = this.set("operation", js.undefined)
    
    @scala.inline
    def setPlanId(value: String): Self = this.set("planId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlanId: Self = this.set("planId", js.undefined)
    
    @scala.inline
    def setServiceId(value: String): Self = this.set("serviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceId: Self = this.set("serviceId", js.undefined)
  }
}
