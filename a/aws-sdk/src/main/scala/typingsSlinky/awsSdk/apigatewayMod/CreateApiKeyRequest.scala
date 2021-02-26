package typingsSlinky.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateApiKeyRequest extends StObject {
  
  /**
    * An AWS Marketplace customer identifier , when integrating with the AWS SaaS Marketplace.
    */
  var customerId: js.UndefOr[String] = js.native
  
  /**
    * The description of the ApiKey.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Specifies whether the ApiKey can be used by callers.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies whether (true) or not (false) the key identifier is distinct from the created API key value. This parameter is deprecated and should not be used.
    */
  var generateDistinctId: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the ApiKey.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API key.
    */
  var stageKeys: js.UndefOr[ListOfStageKeys] = js.native
  
  /**
    * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must not start with aws:. The tag value can be up to 256 characters.
    */
  var tags: js.UndefOr[MapOfStringToString] = js.native
  
  /**
    * Specifies a value of the API key.
    */
  var value: js.UndefOr[String] = js.native
}
object CreateApiKeyRequest {
  
  @scala.inline
  def apply(): CreateApiKeyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateApiKeyRequest]
  }
  
  @scala.inline
  implicit class CreateApiKeyRequestMutableBuilder[Self <: CreateApiKeyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setGenerateDistinctId(value: Boolean): Self = StObject.set(x, "generateDistinctId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerateDistinctIdUndefined: Self = StObject.set(x, "generateDistinctId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setStageKeys(value: ListOfStageKeys): Self = StObject.set(x, "stageKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageKeysUndefined: Self = StObject.set(x, "stageKeys", js.undefined)
    
    @scala.inline
    def setStageKeysVarargs(value: StageKey*): Self = StObject.set(x, "stageKeys", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: MapOfStringToString): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
