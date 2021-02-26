package typingsSlinky.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Finding extends StObject {
  
  /**
    * The action in the analyzed policy statement that an external principal has permission to use.
    */
  var action: js.UndefOr[ActionList] = js.native
  
  /**
    * The time at which the resource was analyzed.
    */
  var analyzedAt: js.Date = js.native
  
  /**
    * The condition in the analyzed policy statement that resulted in a finding.
    */
  var condition: ConditionKeyMap = js.native
  
  /**
    * The time at which the finding was generated.
    */
  var createdAt: js.Date = js.native
  
  /**
    * An error.
    */
  var error: js.UndefOr[String] = js.native
  
  /**
    * The ID of the finding.
    */
  var id: FindingId = js.native
  
  /**
    * Indicates whether the policy that generated the finding allows public access to the resource.
    */
  var isPublic: js.UndefOr[Boolean] = js.native
  
  /**
    * The external principal that access to a resource within the zone of trust.
    */
  var principal: js.UndefOr[PrincipalMap] = js.native
  
  /**
    * The resource that an external principal has access to.
    */
  var resource: js.UndefOr[String] = js.native
  
  /**
    * The AWS account ID that owns the resource.
    */
  var resourceOwnerAccount: String = js.native
  
  /**
    * The type of the resource reported in the finding.
    */
  var resourceType: ResourceType = js.native
  
  /**
    * The sources of the finding. This indicates how the access that generated the finding is granted. It is populated for Amazon S3 bucket findings.
    */
  var sources: js.UndefOr[FindingSourceList] = js.native
  
  /**
    * The current status of the finding.
    */
  var status: FindingStatus = js.native
  
  /**
    * The time at which the finding was updated.
    */
  var updatedAt: js.Date = js.native
}
object Finding {
  
  @scala.inline
  def apply(
    analyzedAt: js.Date,
    condition: ConditionKeyMap,
    createdAt: js.Date,
    id: FindingId,
    resourceOwnerAccount: String,
    resourceType: ResourceType,
    status: FindingStatus,
    updatedAt: js.Date
  ): Finding = {
    val __obj = js.Dynamic.literal(analyzedAt = analyzedAt.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceOwnerAccount = resourceOwnerAccount.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Finding]
  }
  
  @scala.inline
  implicit class FindingMutableBuilder[Self <: Finding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: ActionList): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setActionVarargs(value: String*): Self = StObject.set(x, "action", js.Array(value :_*))
    
    @scala.inline
    def setAnalyzedAt(value: js.Date): Self = StObject.set(x, "analyzedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCondition(value: ConditionKeyMap): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setId(value: FindingId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPublic(value: Boolean): Self = StObject.set(x, "isPublic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPublicUndefined: Self = StObject.set(x, "isPublic", js.undefined)
    
    @scala.inline
    def setPrincipal(value: PrincipalMap): Self = StObject.set(x, "principal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalUndefined: Self = StObject.set(x, "principal", js.undefined)
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceOwnerAccount(value: String): Self = StObject.set(x, "resourceOwnerAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    @scala.inline
    def setSources(value: FindingSourceList): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    @scala.inline
    def setSourcesVarargs(value: FindingSource*): Self = StObject.set(x, "sources", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: FindingStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAt(value: js.Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
  }
}
