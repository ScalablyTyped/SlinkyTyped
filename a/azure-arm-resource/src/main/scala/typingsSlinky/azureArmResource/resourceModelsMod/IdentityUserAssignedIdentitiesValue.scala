package typingsSlinky.azureArmResource.resourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentityUserAssignedIdentitiesValue extends StObject {
  
  /**
    * The client id of user assigned identity.
    */
  val clientId: js.UndefOr[String] = js.native
  
  /**
    * The principal id of user assigned identity.
    */
  val principalId: js.UndefOr[String] = js.native
}
object IdentityUserAssignedIdentitiesValue {
  
  @scala.inline
  def apply(): IdentityUserAssignedIdentitiesValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityUserAssignedIdentitiesValue]
  }
  
  @scala.inline
  implicit class IdentityUserAssignedIdentitiesValueMutableBuilder[Self <: IdentityUserAssignedIdentitiesValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    @scala.inline
    def setPrincipalId(value: String): Self = StObject.set(x, "principalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalIdUndefined: Self = StObject.set(x, "principalId", js.undefined)
  }
}
