package typingsSlinky.maximMazurokGapiClientSecretmanager.gapi.client.secretmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplicationStatus extends StObject {
  
  /** Describes the replication status of a SecretVersion with automatic replication. Only populated if the parent Secret has an automatic replication policy. */
  var automatic: js.UndefOr[AutomaticStatus] = js.native
  
  /** Describes the replication status of a SecretVersion with user-managed replication. Only populated if the parent Secret has a user-managed replication policy. */
  var userManaged: js.UndefOr[UserManagedStatus] = js.native
}
object ReplicationStatus {
  
  @scala.inline
  def apply(): ReplicationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationStatus]
  }
  
  @scala.inline
  implicit class ReplicationStatusMutableBuilder[Self <: ReplicationStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutomatic(value: AutomaticStatus): Self = StObject.set(x, "automatic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomaticUndefined: Self = StObject.set(x, "automatic", js.undefined)
    
    @scala.inline
    def setUserManaged(value: UserManagedStatus): Self = StObject.set(x, "userManaged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserManagedUndefined: Self = StObject.set(x, "userManaged", js.undefined)
  }
}
