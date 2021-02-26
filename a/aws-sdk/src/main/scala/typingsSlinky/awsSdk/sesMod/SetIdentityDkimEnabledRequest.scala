package typingsSlinky.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetIdentityDkimEnabledRequest extends StObject {
  
  /**
    * Sets whether DKIM signing is enabled for an identity. Set to true to enable DKIM signing for this identity; false to disable it. 
    */
  var DkimEnabled: Enabled = js.native
  
  /**
    * The identity for which DKIM signing should be enabled or disabled.
    */
  var Identity: typingsSlinky.awsSdk.sesMod.Identity = js.native
}
object SetIdentityDkimEnabledRequest {
  
  @scala.inline
  def apply(DkimEnabled: Enabled, Identity: Identity): SetIdentityDkimEnabledRequest = {
    val __obj = js.Dynamic.literal(DkimEnabled = DkimEnabled.asInstanceOf[js.Any], Identity = Identity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetIdentityDkimEnabledRequest]
  }
  
  @scala.inline
  implicit class SetIdentityDkimEnabledRequestMutableBuilder[Self <: SetIdentityDkimEnabledRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDkimEnabled(value: Enabled): Self = StObject.set(x, "DkimEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentity(value: Identity): Self = StObject.set(x, "Identity", value.asInstanceOf[js.Any])
  }
}
