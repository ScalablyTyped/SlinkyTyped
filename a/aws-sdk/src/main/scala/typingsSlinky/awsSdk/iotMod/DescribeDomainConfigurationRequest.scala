package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDomainConfigurationRequest extends StObject {
  
  /**
    * The name of the domain configuration.
    */
  var domainConfigurationName: ReservedDomainConfigurationName = js.native
}
object DescribeDomainConfigurationRequest {
  
  @scala.inline
  def apply(domainConfigurationName: ReservedDomainConfigurationName): DescribeDomainConfigurationRequest = {
    val __obj = js.Dynamic.literal(domainConfigurationName = domainConfigurationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDomainConfigurationRequest]
  }
  
  @scala.inline
  implicit class DescribeDomainConfigurationRequestMutableBuilder[Self <: DescribeDomainConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainConfigurationName(value: ReservedDomainConfigurationName): Self = StObject.set(x, "domainConfigurationName", value.asInstanceOf[js.Any])
  }
}
