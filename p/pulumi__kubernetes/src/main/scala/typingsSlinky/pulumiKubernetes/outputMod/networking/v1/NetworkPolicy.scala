package typingsSlinky.pulumiKubernetes.outputMod.networking.v1

import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.networkingDotk8sDotioSlashv1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NetworkPolicy describes what network traffic is allowed for a set of Pods
  */
@js.native
trait NetworkPolicy extends StObject {
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: networkingDotk8sDotioSlashv1 = js.native
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.NetworkPolicy = js.native
  
  /**
    * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: ObjectMeta = js.native
  
  /**
    * Specification of the desired behavior for this NetworkPolicy.
    */
  var spec: NetworkPolicySpec = js.native
}
object NetworkPolicy {
  
  @scala.inline
  def apply(
    apiVersion: networkingDotk8sDotioSlashv1,
    kind: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.NetworkPolicy,
    metadata: ObjectMeta,
    spec: NetworkPolicySpec
  ): NetworkPolicy = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkPolicy]
  }
  
  @scala.inline
  implicit class NetworkPolicyMutableBuilder[Self <: NetworkPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiVersion(value: networkingDotk8sDotioSlashv1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.NetworkPolicy): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpec(value: NetworkPolicySpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
  }
}
