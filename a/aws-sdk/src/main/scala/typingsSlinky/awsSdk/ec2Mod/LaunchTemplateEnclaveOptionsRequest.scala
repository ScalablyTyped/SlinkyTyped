package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchTemplateEnclaveOptionsRequest extends StObject {
  
  /**
    * To enable the instance for AWS Nitro Enclaves, set this parameter to true.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
}
object LaunchTemplateEnclaveOptionsRequest {
  
  @scala.inline
  def apply(): LaunchTemplateEnclaveOptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateEnclaveOptionsRequest]
  }
  
  @scala.inline
  implicit class LaunchTemplateEnclaveOptionsRequestMutableBuilder[Self <: LaunchTemplateEnclaveOptionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
