package typingsSlinky.maximMazurokGapiClientSecretmanager.gapi.client.secretmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecretVersion extends StObject {
  
  /** Output only. The time at which the SecretVersion was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Output only. The time this SecretVersion was destroyed. Only present if state is DESTROYED. */
  var destroyTime: js.UndefOr[String] = js.native
  
  /**
    * Output only. The resource name of the SecretVersion in the format `projects/∗/secrets/∗/versions/ *`. SecretVersion IDs in a Secret start at 1 and are incremented for each subsequent
    * version of the secret.
    */
  var name: js.UndefOr[String] = js.native
  
  /** The replication status of the SecretVersion. */
  var replicationStatus: js.UndefOr[ReplicationStatus] = js.native
  
  /** Output only. The current state of the SecretVersion. */
  var state: js.UndefOr[String] = js.native
}
object SecretVersion {
  
  @scala.inline
  def apply(): SecretVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecretVersion]
  }
  
  @scala.inline
  implicit class SecretVersionMutableBuilder[Self <: SecretVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDestroyTime(value: String): Self = StObject.set(x, "destroyTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroyTimeUndefined: Self = StObject.set(x, "destroyTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setReplicationStatus(value: ReplicationStatus): Self = StObject.set(x, "replicationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationStatusUndefined: Self = StObject.set(x, "replicationStatus", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
