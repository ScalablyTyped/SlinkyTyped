package typingsSlinky.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TenancyUnit extends StObject {
  
  /** Output only. @OutputOnly Cloud resource name of the consumer of this service. For example 'projects/123456'. */
  var consumer: js.UndefOr[String] = js.native
  
  /** Output only. @OutputOnly The time this tenancy unit was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Globally unique identifier of this tenancy unit "services/{service}/{collection id}/{resource id}/tenancyUnits/{unit}" */
  var name: js.UndefOr[String] = js.native
  
  /** Output only. Google Cloud API name of the managed service owning this tenancy unit. For example 'serviceconsumermanagement.googleapis.com'. */
  var service: js.UndefOr[String] = js.native
  
  /** Resources constituting the tenancy unit. There can be at most 512 tenant resources in a tenancy unit. */
  var tenantResources: js.UndefOr[js.Array[TenantResource]] = js.native
}
object TenancyUnit {
  
  @scala.inline
  def apply(): TenancyUnit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TenancyUnit]
  }
  
  @scala.inline
  implicit class TenancyUnitMutableBuilder[Self <: TenancyUnit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsumer(value: String): Self = StObject.set(x, "consumer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumerUndefined: Self = StObject.set(x, "consumer", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    @scala.inline
    def setTenantResources(value: js.Array[TenantResource]): Self = StObject.set(x, "tenantResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenantResourcesUndefined: Self = StObject.set(x, "tenantResources", js.undefined)
    
    @scala.inline
    def setTenantResourcesVarargs(value: TenantResource*): Self = StObject.set(x, "tenantResources", js.Array(value :_*))
  }
}
