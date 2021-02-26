package typingsSlinky.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetachCertificateFromDistributionRequest extends StObject {
  
  /**
    * The name of the distribution from which to detach the certificate. Use the GetDistributions action to get a list of distribution names that you can specify.
    */
  var distributionName: ResourceName = js.native
}
object DetachCertificateFromDistributionRequest {
  
  @scala.inline
  def apply(distributionName: ResourceName): DetachCertificateFromDistributionRequest = {
    val __obj = js.Dynamic.literal(distributionName = distributionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachCertificateFromDistributionRequest]
  }
  
  @scala.inline
  implicit class DetachCertificateFromDistributionRequestMutableBuilder[Self <: DetachCertificateFromDistributionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistributionName(value: ResourceName): Self = StObject.set(x, "distributionName", value.asInstanceOf[js.Any])
  }
}
