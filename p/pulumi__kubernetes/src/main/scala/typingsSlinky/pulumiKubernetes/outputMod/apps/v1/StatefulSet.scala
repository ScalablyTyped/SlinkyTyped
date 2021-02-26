package typingsSlinky.pulumiKubernetes.outputMod.apps.v1

import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.appsSlashv1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * StatefulSet represents a set of pods with consistent identities. Identities are defined as:
  *  - Network: A single stable DNS and hostname.
  *  - Storage: As many VolumeClaims as requested.
  * The StatefulSet guarantees that a given network identity will always map to the same storage identity.
  *
  * This resource waits until its status is ready before registering success
  * for create/update, and populating output properties from the current state of the resource.
  * The following conditions are used to determine whether the resource creation has
  * succeeded or failed:
  *
  * 1. The value of 'spec.replicas' matches '.status.replicas', '.status.currentReplicas',
  *    and '.status.readyReplicas'.
  * 2. The value of '.status.updateRevision' matches '.status.currentRevision'.
  *
  * If the StatefulSet has not reached a Ready state after 10 minutes, it will
  * time out and mark the resource update as Failed. You can override the default timeout value
  * by setting the 'customTimeouts' option on the resource.
  */
@js.native
trait StatefulSet extends StObject {
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: appsSlashv1 = js.native
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.StatefulSet = js.native
  
  var metadata: ObjectMeta = js.native
  
  /**
    * Spec defines the desired identities of pods in this set.
    */
  var spec: StatefulSetSpec = js.native
  
  /**
    * Status is the current status of Pods in this StatefulSet. This data may be out of date by some window of time.
    */
  var status: StatefulSetStatus = js.native
}
object StatefulSet {
  
  @scala.inline
  def apply(
    apiVersion: appsSlashv1,
    kind: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.StatefulSet,
    metadata: ObjectMeta,
    spec: StatefulSetSpec,
    status: StatefulSetStatus
  ): StatefulSet = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulSet]
  }
  
  @scala.inline
  implicit class StatefulSetMutableBuilder[Self <: StatefulSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiVersion(value: appsSlashv1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.StatefulSet): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpec(value: StatefulSetSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: StatefulSetStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
