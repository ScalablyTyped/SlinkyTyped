package typingsSlinky.maximMazurokGapiClientSecretmanager.gapi.client.secretmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserManagedStatus extends js.Object {
  
  /** Output only. The list of replica statuses for the SecretVersion. */
  var replicas: js.UndefOr[js.Array[ReplicaStatus]] = js.native
}
object UserManagedStatus {
  
  @scala.inline
  def apply(): UserManagedStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserManagedStatus]
  }
  
  @scala.inline
  implicit class UserManagedStatusOps[Self <: UserManagedStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setReplicasVarargs(value: ReplicaStatus*): Self = this.set("replicas", js.Array(value :_*))
    
    @scala.inline
    def setReplicas(value: js.Array[ReplicaStatus]): Self = this.set("replicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicas: Self = this.set("replicas", js.undefined)
  }
}
