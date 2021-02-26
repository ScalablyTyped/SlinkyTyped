package typingsSlinky.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceLastAccessed extends StObject {
  
  /**
    * The date and time, in ISO 8601 date-time format, when an authenticated entity most recently attempted to access the service. AWS does not report unauthenticated requests. This field is null if no IAM entities attempted to access the service within the reporting period.
    */
  var LastAuthenticated: js.UndefOr[js.Date] = js.native
  
  /**
    * The ARN of the authenticated entity (user or role) that last attempted to access the service. AWS does not report unauthenticated requests. This field is null if no IAM entities attempted to access the service within the reporting period.
    */
  var LastAuthenticatedEntity: js.UndefOr[arnType] = js.native
  
  /**
    * The Region from which the authenticated entity (user or role) last attempted to access the service. AWS does not report unauthenticated requests. This field is null if no IAM entities attempted to access the service within the reporting period.
    */
  var LastAuthenticatedRegion: js.UndefOr[stringType] = js.native
  
  /**
    * The name of the service in which access was attempted.
    */
  var ServiceName: serviceNameType = js.native
  
  /**
    * The namespace of the service in which access was attempted. To learn the service namespace of a service, go to Actions, Resources, and Condition Keys for AWS Services in the IAM User Guide. Choose the name of the service to view details for that service. In the first paragraph, find the service prefix. For example, (service prefix: a4b). For more information about service namespaces, see AWS Service Namespaces in the AWS General Reference.
    */
  var ServiceNamespace: serviceNamespaceType = js.native
  
  /**
    * The total number of authenticated principals (root user, IAM users, or IAM roles) that have attempted to access the service. This field is null if no principals attempted to access the service within the reporting period.
    */
  var TotalAuthenticatedEntities: js.UndefOr[integerType] = js.native
  
  /**
    * An object that contains details about the most recent attempt to access a tracked action within the service. This field is null if there no tracked actions or if the principal did not use the tracked actions within the reporting period. This field is also null if the report was generated at the service level and not the action level. For more information, see the Granularity field in GenerateServiceLastAccessedDetails.
    */
  var TrackedActionsLastAccessed: js.UndefOr[typingsSlinky.awsSdk.iamMod.TrackedActionsLastAccessed] = js.native
}
object ServiceLastAccessed {
  
  @scala.inline
  def apply(ServiceName: serviceNameType, ServiceNamespace: serviceNamespaceType): ServiceLastAccessed = {
    val __obj = js.Dynamic.literal(ServiceName = ServiceName.asInstanceOf[js.Any], ServiceNamespace = ServiceNamespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceLastAccessed]
  }
  
  @scala.inline
  implicit class ServiceLastAccessedMutableBuilder[Self <: ServiceLastAccessed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastAuthenticated(value: js.Date): Self = StObject.set(x, "LastAuthenticated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastAuthenticatedEntity(value: arnType): Self = StObject.set(x, "LastAuthenticatedEntity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastAuthenticatedEntityUndefined: Self = StObject.set(x, "LastAuthenticatedEntity", js.undefined)
    
    @scala.inline
    def setLastAuthenticatedRegion(value: stringType): Self = StObject.set(x, "LastAuthenticatedRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastAuthenticatedRegionUndefined: Self = StObject.set(x, "LastAuthenticatedRegion", js.undefined)
    
    @scala.inline
    def setLastAuthenticatedUndefined: Self = StObject.set(x, "LastAuthenticated", js.undefined)
    
    @scala.inline
    def setServiceName(value: serviceNameType): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNamespace(value: serviceNamespaceType): Self = StObject.set(x, "ServiceNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalAuthenticatedEntities(value: integerType): Self = StObject.set(x, "TotalAuthenticatedEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalAuthenticatedEntitiesUndefined: Self = StObject.set(x, "TotalAuthenticatedEntities", js.undefined)
    
    @scala.inline
    def setTrackedActionsLastAccessed(value: TrackedActionsLastAccessed): Self = StObject.set(x, "TrackedActionsLastAccessed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackedActionsLastAccessedUndefined: Self = StObject.set(x, "TrackedActionsLastAccessed", js.undefined)
    
    @scala.inline
    def setTrackedActionsLastAccessedVarargs(value: TrackedActionLastAccessed*): Self = StObject.set(x, "TrackedActionsLastAccessed", js.Array(value :_*))
  }
}
