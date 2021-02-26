package typingsSlinky.grpcGrpcJs.loadBalancingConfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LrsLbConfig extends StObject {
  
  var child_policy: js.Array[LoadBalancingConfig] = js.native
  
  var cluster_name: String = js.native
  
  var eds_service_name: String = js.native
  
  var locality: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Locality__Output */ js.Any = js.native
  
  var lrs_load_reporting_server_name: String = js.native
}
object LrsLbConfig {
  
  @scala.inline
  def apply(
    child_policy: js.Array[LoadBalancingConfig],
    cluster_name: String,
    eds_service_name: String,
    locality: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Locality__Output */ js.Any,
    lrs_load_reporting_server_name: String
  ): LrsLbConfig = {
    val __obj = js.Dynamic.literal(child_policy = child_policy.asInstanceOf[js.Any], cluster_name = cluster_name.asInstanceOf[js.Any], eds_service_name = eds_service_name.asInstanceOf[js.Any], locality = locality.asInstanceOf[js.Any], lrs_load_reporting_server_name = lrs_load_reporting_server_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LrsLbConfig]
  }
  
  @scala.inline
  implicit class LrsLbConfigMutableBuilder[Self <: LrsLbConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChild_policy(value: js.Array[LoadBalancingConfig]): Self = StObject.set(x, "child_policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChild_policyVarargs(value: LoadBalancingConfig*): Self = StObject.set(x, "child_policy", js.Array(value :_*))
    
    @scala.inline
    def setCluster_name(value: String): Self = StObject.set(x, "cluster_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEds_service_name(value: String): Self = StObject.set(x, "eds_service_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocality(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Locality__Output */ js.Any
    ): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLrs_load_reporting_server_name(value: String): Self = StObject.set(x, "lrs_load_reporting_server_name", value.asInstanceOf[js.Any])
  }
}
