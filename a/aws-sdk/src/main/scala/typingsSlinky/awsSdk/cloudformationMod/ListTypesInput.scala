package typingsSlinky.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTypesInput extends StObject {
  
  /**
    * The deprecation status of the types that you want to get summary information about. Valid values include:    LIVE: The type is registered for use in CloudFormation operations.    DEPRECATED: The type has been deregistered and can no longer be used in CloudFormation operations.   
    */
  var DeprecatedStatus: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.DeprecatedStatus] = js.native
  
  /**
    * The maximum number of results to be returned with a single call. If the number of available results exceeds this maximum, the response includes a NextToken value that you can assign to the NextToken request parameter to get the next set of results.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.MaxResults] = js.native
  
  /**
    * If the previous paginated request didn't return all of the remaining results, the response object's NextToken parameter value is set to a token. To retrieve the next set of results, call this action again and assign that token to the request object's NextToken parameter. If there are no remaining results, the previous response object's NextToken parameter is set to null.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.NextToken] = js.native
  
  /**
    * The provisioning behavior of the type. AWS CloudFormation determines the provisioning type during registration, based on the types of handlers in the schema handler package submitted. Valid values include:    FULLY_MUTABLE: The type includes an update handler to process updates to the type during stack update operations.    IMMUTABLE: The type does not include an update handler, so the type cannot be updated and must instead be replaced during stack update operations.    NON_PROVISIONABLE: The type does not include create, read, and delete handlers, and therefore cannot actually be provisioned.  
    */
  var ProvisioningType: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.ProvisioningType] = js.native
  
  /**
    * The scope at which the type is visible and usable in CloudFormation operations. Valid values include:    PRIVATE: The type is only visible and usable within the account in which it is registered. Currently, AWS CloudFormation marks any types you create as PRIVATE.    PUBLIC: The type is publically visible and usable within any Amazon account.   The default is PRIVATE.
    */
  var Visibility: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.Visibility] = js.native
}
object ListTypesInput {
  
  @scala.inline
  def apply(): ListTypesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTypesInput]
  }
  
  @scala.inline
  implicit class ListTypesInputMutableBuilder[Self <: ListTypesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeprecatedStatus(value: DeprecatedStatus): Self = StObject.set(x, "DeprecatedStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedStatusUndefined: Self = StObject.set(x, "DeprecatedStatus", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setProvisioningType(value: ProvisioningType): Self = StObject.set(x, "ProvisioningType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioningTypeUndefined: Self = StObject.set(x, "ProvisioningType", js.undefined)
    
    @scala.inline
    def setVisibility(value: Visibility): Self = StObject.set(x, "Visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "Visibility", js.undefined)
  }
}
