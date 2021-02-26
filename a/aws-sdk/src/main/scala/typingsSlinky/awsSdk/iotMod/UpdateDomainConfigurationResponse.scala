package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDomainConfigurationResponse extends StObject {
  
  /**
    * The ARN of the domain configuration that was updated.
    */
  var domainConfigurationArn: js.UndefOr[DomainConfigurationArn] = js.native
  
  /**
    * The name of the domain configuration that was updated.
    */
  var domainConfigurationName: js.UndefOr[ReservedDomainConfigurationName] = js.native
}
object UpdateDomainConfigurationResponse {
  
  @scala.inline
  def apply(): UpdateDomainConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDomainConfigurationResponse]
  }
  
  @scala.inline
  implicit class UpdateDomainConfigurationResponseMutableBuilder[Self <: UpdateDomainConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainConfigurationArn(value: DomainConfigurationArn): Self = StObject.set(x, "domainConfigurationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainConfigurationArnUndefined: Self = StObject.set(x, "domainConfigurationArn", js.undefined)
    
    @scala.inline
    def setDomainConfigurationName(value: ReservedDomainConfigurationName): Self = StObject.set(x, "domainConfigurationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainConfigurationNameUndefined: Self = StObject.set(x, "domainConfigurationName", js.undefined)
  }
}
