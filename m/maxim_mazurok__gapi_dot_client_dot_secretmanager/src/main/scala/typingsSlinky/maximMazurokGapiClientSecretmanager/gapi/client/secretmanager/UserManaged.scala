package typingsSlinky.maximMazurokGapiClientSecretmanager.gapi.client.secretmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserManaged extends StObject {
  
  /** Required. The list of Replicas for this Secret. Cannot be empty. */
  var replicas: js.UndefOr[js.Array[Replica]] = js.native
}
object UserManaged {
  
  @scala.inline
  def apply(): UserManaged = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserManaged]
  }
  
  @scala.inline
  implicit class UserManagedMutableBuilder[Self <: UserManaged] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplicas(value: js.Array[Replica]): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicasUndefined: Self = StObject.set(x, "replicas", js.undefined)
    
    @scala.inline
    def setReplicasVarargs(value: Replica*): Self = StObject.set(x, "replicas", js.Array(value :_*))
  }
}
