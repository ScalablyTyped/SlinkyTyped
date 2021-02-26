package typingsSlinky.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentityProviderDetails extends StObject {
  
  /**
    * Provides the type of InvocationRole used to authenticate the user account.
    */
  var InvocationRole: js.UndefOr[Role] = js.native
  
  /**
    * Provides the location of the service endpoint used to authenticate users.
    */
  var Url: js.UndefOr[typingsSlinky.awsSdk.transferMod.Url] = js.native
}
object IdentityProviderDetails {
  
  @scala.inline
  def apply(): IdentityProviderDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityProviderDetails]
  }
  
  @scala.inline
  implicit class IdentityProviderDetailsMutableBuilder[Self <: IdentityProviderDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvocationRole(value: Role): Self = StObject.set(x, "InvocationRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvocationRoleUndefined: Self = StObject.set(x, "InvocationRole", js.undefined)
    
    @scala.inline
    def setUrl(value: Url): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
  }
}
