package typingsSlinky.googleapis.servicebrokerV1beta1Mod.servicebrokerV1beta1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsDelete extends StandardParameters {
  
  /**
    * See CreateServiceInstanceRequest for details.
    */
  var acceptsIncomplete: js.UndefOr[Boolean] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Name must match `projects/[PROJECT_ID]/brokers/[BROKER_ID]/`
    * `v2/service_instances/[INSTANCE_ID]/service_bindings/[BINDING_ID]` or
    * `projects/[PROJECT_ID]/brokers/[BROKER_ID]/`
    * `/instances/[INSTANCE_ID]/bindings/[BINDING_ID]`.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The plan id of the service instance.
    */
  var planId: js.UndefOr[String] = js.native
  
  /**
    * Additional query parameter hints. The service id of the service instance.
    */
  var serviceId: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsDelete {
  
  @scala.inline
  def apply(): ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsDelete]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsDeleteMutableBuilder[Self <: ParamsResourceProjectsBrokersV2ServiceInstancesServiceBindingsDelete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptsIncomplete(value: Boolean): Self = StObject.set(x, "acceptsIncomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptsIncompleteUndefined: Self = StObject.set(x, "acceptsIncomplete", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPlanId(value: String): Self = StObject.set(x, "planId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanIdUndefined: Self = StObject.set(x, "planId", js.undefined)
    
    @scala.inline
    def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceIdUndefined: Self = StObject.set(x, "serviceId", js.undefined)
  }
}
