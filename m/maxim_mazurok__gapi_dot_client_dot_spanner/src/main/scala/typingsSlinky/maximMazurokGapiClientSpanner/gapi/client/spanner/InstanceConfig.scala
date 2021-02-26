package typingsSlinky.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceConfig extends StObject {
  
  /** The name of this instance configuration as it appears in UIs. */
  var displayName: js.UndefOr[String] = js.native
  
  /** A unique identifier for the instance configuration. Values are of the form `projects//instanceConfigs/a-z*` */
  var name: js.UndefOr[String] = js.native
  
  /** The geographic placement of nodes in this instance configuration and their replication properties. */
  var replicas: js.UndefOr[js.Array[ReplicaInfo]] = js.native
}
object InstanceConfig {
  
  @scala.inline
  def apply(): InstanceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceConfig]
  }
  
  @scala.inline
  implicit class InstanceConfigMutableBuilder[Self <: InstanceConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setReplicas(value: js.Array[ReplicaInfo]): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicasUndefined: Self = StObject.set(x, "replicas", js.undefined)
    
    @scala.inline
    def setReplicasVarargs(value: ReplicaInfo*): Self = StObject.set(x, "replicas", js.Array(value :_*))
  }
}
