package typingsSlinky.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<auth0.auth0.CreateClientGrant> & {  id :string | undefined} */
@js.native
trait ClientGrant extends StObject {
  
  var audience: js.UndefOr[String] = js.native
  
  var client_id: js.UndefOr[String] = js.native
  
  /**
    * The id of the client grant.
    */
  var id: js.UndefOr[String] = js.native
  
  var scope: js.UndefOr[js.Array[String]] = js.native
}
object ClientGrant {
  
  @scala.inline
  def apply(): ClientGrant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientGrant]
  }
  
  @scala.inline
  implicit class ClientGrantMutableBuilder[Self <: ClientGrant] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
    
    @scala.inline
    def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_idUndefined: Self = StObject.set(x, "client_id", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setScope(value: js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
  }
}
