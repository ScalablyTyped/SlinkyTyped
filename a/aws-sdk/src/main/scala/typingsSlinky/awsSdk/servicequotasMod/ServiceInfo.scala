package typingsSlinky.awsSdk.servicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceInfo extends StObject {
  
  /**
    * Specifies the service that you want to use.
    */
  var ServiceCode: js.UndefOr[typingsSlinky.awsSdk.servicequotasMod.ServiceCode] = js.native
  
  /**
    * The name of the AWS service specified in the increase request. 
    */
  var ServiceName: js.UndefOr[typingsSlinky.awsSdk.servicequotasMod.ServiceName] = js.native
}
object ServiceInfo {
  
  @scala.inline
  def apply(): ServiceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceInfo]
  }
  
  @scala.inline
  implicit class ServiceInfoMutableBuilder[Self <: ServiceInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServiceCode(value: ServiceCode): Self = StObject.set(x, "ServiceCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceCodeUndefined: Self = StObject.set(x, "ServiceCode", js.undefined)
    
    @scala.inline
    def setServiceName(value: ServiceName): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNameUndefined: Self = StObject.set(x, "ServiceName", js.undefined)
  }
}
