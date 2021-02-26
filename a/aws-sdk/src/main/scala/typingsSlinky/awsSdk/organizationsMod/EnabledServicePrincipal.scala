package typingsSlinky.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnabledServicePrincipal extends StObject {
  
  /**
    * The date that the service principal was enabled for integration with AWS Organizations.
    */
  var DateEnabled: js.UndefOr[js.Date] = js.native
  
  /**
    * The name of the service principal. This is typically in the form of a URL, such as:  servicename.amazonaws.com.
    */
  var ServicePrincipal: js.UndefOr[typingsSlinky.awsSdk.organizationsMod.ServicePrincipal] = js.native
}
object EnabledServicePrincipal {
  
  @scala.inline
  def apply(): EnabledServicePrincipal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnabledServicePrincipal]
  }
  
  @scala.inline
  implicit class EnabledServicePrincipalMutableBuilder[Self <: EnabledServicePrincipal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDateEnabled(value: js.Date): Self = StObject.set(x, "DateEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateEnabledUndefined: Self = StObject.set(x, "DateEnabled", js.undefined)
    
    @scala.inline
    def setServicePrincipal(value: ServicePrincipal): Self = StObject.set(x, "ServicePrincipal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicePrincipalUndefined: Self = StObject.set(x, "ServicePrincipal", js.undefined)
  }
}
