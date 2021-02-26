package typingsSlinky.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDistributionConfigurationRequest extends StObject {
  
  /**
    *  The idempotency token of the distribution configuration. 
    */
  var clientToken: ClientToken = js.native
  
  /**
    *  The description of the distribution configuration. 
    */
  var description: js.UndefOr[NonEmptyString] = js.native
  
  /**
    *  The distributions of the distribution configuration. 
    */
  var distributions: DistributionList = js.native
  
  /**
    *  The name of the distribution configuration. 
    */
  var name: ResourceName = js.native
  
  /**
    *  The tags of the distribution configuration. 
    */
  var tags: js.UndefOr[TagMap] = js.native
}
object CreateDistributionConfigurationRequest {
  
  @scala.inline
  def apply(clientToken: ClientToken, distributions: DistributionList, name: ResourceName): CreateDistributionConfigurationRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], distributions = distributions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDistributionConfigurationRequest]
  }
  
  @scala.inline
  implicit class CreateDistributionConfigurationRequestMutableBuilder[Self <: CreateDistributionConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: NonEmptyString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDistributions(value: DistributionList): Self = StObject.set(x, "distributions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributionsVarargs(value: Distribution*): Self = StObject.set(x, "distributions", js.Array(value :_*))
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
