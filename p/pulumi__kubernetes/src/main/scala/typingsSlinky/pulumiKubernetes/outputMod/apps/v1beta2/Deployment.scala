package typingsSlinky.pulumiKubernetes.outputMod.apps.v1beta2

import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.appsSlashv1beta2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Deployment enables declarative updates for Pods and ReplicaSets.
  *
  * This resource waits until its status is ready before registering success
  * for create/update, and populating output properties from the current state of the resource.
  * The following conditions are used to determine whether the resource creation has
  * succeeded or failed:
  *
  * 1. The Deployment has begun to be updated by the Deployment controller. If the current
  *    generation of the Deployment is > 1, then this means that the current generation must
  *    be different from the generation reported by the last outputs.
  * 2. There exists a ReplicaSet whose revision is equal to the current revision of the
  *    Deployment.
  * 3. The Deployment's '.status.conditions' has a status of type 'Available' whose 'status'
  *    member is set to 'True'.
  * 4. If the Deployment has generation > 1, then '.status.conditions' has a status of type
  *    'Progressing', whose 'status' member is set to 'True', and whose 'reason' is
  *    'NewReplicaSetAvailable'. For generation <= 1, this status field does not exist,
  *    because it doesn't do a rollout (i.e., it simply creates the Deployment and
  *    corresponding ReplicaSet), and therefore there is no rollout to mark as 'Progressing'.
  *
  * If the Deployment has not reached a Ready state after 10 minutes, it will
  * time out and mark the resource update as Failed. You can override the default timeout value
  * by setting the 'customTimeouts' option on the resource.
  */
@js.native
trait Deployment extends StObject {
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: appsSlashv1beta2 = js.native
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.Deployment = js.native
  
  /**
    * Standard object metadata.
    */
  var metadata: ObjectMeta = js.native
  
  /**
    * Specification of the desired behavior of the Deployment.
    */
  var spec: DeploymentSpec = js.native
  
  /**
    * Most recently observed status of the Deployment.
    */
  var status: DeploymentStatus = js.native
}
object Deployment {
  
  @scala.inline
  def apply(
    apiVersion: appsSlashv1beta2,
    kind: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.Deployment,
    metadata: ObjectMeta,
    spec: DeploymentSpec,
    status: DeploymentStatus
  ): Deployment = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deployment]
  }
  
  @scala.inline
  implicit class DeploymentMutableBuilder[Self <: Deployment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiVersion(value: appsSlashv1beta2): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.Deployment): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpec(value: DeploymentSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: DeploymentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
