package typingsSlinky.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to create a tenancy unit for a service consumer of a managed
  * service.
  */
@js.native
trait SchemaCreateTenancyUnitRequest extends StObject {
  
  /**
    * Optional service producer-provided identifier of the tenancy unit. Must
    * be no longer than 40 characters and preferably URI friendly. If it
    * isn&#39;t provided, a UID for the tenancy unit is automatically
    * generated. The identifier must be unique across a managed service. If the
    * tenancy unit already exists for the managed service and service consumer
    * pair, calling `CreateTenancyUnit` returns the existing tenancy unit if
    * the provided identifier is identical or empty, otherwise the call fails.
    */
  var tenancyUnitId: js.UndefOr[String] = js.native
}
object SchemaCreateTenancyUnitRequest {
  
  @scala.inline
  def apply(): SchemaCreateTenancyUnitRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateTenancyUnitRequest]
  }
  
  @scala.inline
  implicit class SchemaCreateTenancyUnitRequestMutableBuilder[Self <: SchemaCreateTenancyUnitRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTenancyUnitId(value: String): Self = StObject.set(x, "tenancyUnitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenancyUnitIdUndefined: Self = StObject.set(x, "tenancyUnitId", js.undefined)
  }
}
