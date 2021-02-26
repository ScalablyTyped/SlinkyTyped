package typingsSlinky.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDistributionConfigurationRequest extends StObject {
  
  /**
    * The idempotency token of the distribution configuration. 
    */
  var clientToken: ClientToken = js.native
  
  /**
    * The description of the distribution configuration. 
    */
  var description: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the distribution configuration that you want to update. 
    */
  var distributionConfigurationArn: DistributionConfigurationArn = js.native
  
  /**
    * The distributions of the distribution configuration. 
    */
  var distributions: DistributionList = js.native
}
object UpdateDistributionConfigurationRequest {
  
  @scala.inline
  def apply(
    clientToken: ClientToken,
    distributionConfigurationArn: DistributionConfigurationArn,
    distributions: DistributionList
  ): UpdateDistributionConfigurationRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], distributionConfigurationArn = distributionConfigurationArn.asInstanceOf[js.Any], distributions = distributions.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDistributionConfigurationRequest]
  }
  
  @scala.inline
  implicit class UpdateDistributionConfigurationRequestMutableBuilder[Self <: UpdateDistributionConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: NonEmptyString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDistributionConfigurationArn(value: DistributionConfigurationArn): Self = StObject.set(x, "distributionConfigurationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributions(value: DistributionList): Self = StObject.set(x, "distributions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributionsVarargs(value: Distribution*): Self = StObject.set(x, "distributions", js.Array(value :_*))
  }
}
