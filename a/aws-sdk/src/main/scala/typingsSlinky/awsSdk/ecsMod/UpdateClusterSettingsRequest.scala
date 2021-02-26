package typingsSlinky.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateClusterSettingsRequest extends StObject {
  
  /**
    * The name of the cluster to modify the settings for.
    */
  var cluster: String = js.native
  
  /**
    * The setting to use by default for a cluster. This parameter is used to enable CloudWatch Container Insights for a cluster. If this value is specified, it will override the containerInsights value set with PutAccountSetting or PutAccountSettingDefault.
    */
  var settings: ClusterSettings = js.native
}
object UpdateClusterSettingsRequest {
  
  @scala.inline
  def apply(cluster: String, settings: ClusterSettings): UpdateClusterSettingsRequest = {
    val __obj = js.Dynamic.literal(cluster = cluster.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateClusterSettingsRequest]
  }
  
  @scala.inline
  implicit class UpdateClusterSettingsRequestMutableBuilder[Self <: UpdateClusterSettingsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettings(value: ClusterSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsVarargs(value: ClusterSetting*): Self = StObject.set(x, "settings", js.Array(value :_*))
  }
}
