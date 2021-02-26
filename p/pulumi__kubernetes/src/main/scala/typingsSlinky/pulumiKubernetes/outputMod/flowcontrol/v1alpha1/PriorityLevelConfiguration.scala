package typingsSlinky.pulumiKubernetes.outputMod.flowcontrol.v1alpha1

import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.flowcontrolDotapiserverDotk8sDotioSlashv1alpha1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PriorityLevelConfiguration represents the configuration of a priority level.
  */
@js.native
trait PriorityLevelConfiguration extends StObject {
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: flowcontrolDotapiserverDotk8sDotioSlashv1alpha1 = js.native
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.PriorityLevelConfiguration = js.native
  
  /**
    * `metadata` is the standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: ObjectMeta = js.native
  
  /**
    * `spec` is the specification of the desired behavior of a "request-priority". More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
    */
  var spec: PriorityLevelConfigurationSpec = js.native
  
  /**
    * `status` is the current status of a "request-priority". More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
    */
  var status: PriorityLevelConfigurationStatus = js.native
}
object PriorityLevelConfiguration {
  
  @scala.inline
  def apply(
    apiVersion: flowcontrolDotapiserverDotk8sDotioSlashv1alpha1,
    kind: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.PriorityLevelConfiguration,
    metadata: ObjectMeta,
    spec: PriorityLevelConfigurationSpec,
    status: PriorityLevelConfigurationStatus
  ): PriorityLevelConfiguration = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriorityLevelConfiguration]
  }
  
  @scala.inline
  implicit class PriorityLevelConfigurationMutableBuilder[Self <: PriorityLevelConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiVersion(value: flowcontrolDotapiserverDotk8sDotioSlashv1alpha1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.PriorityLevelConfiguration): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpec(value: PriorityLevelConfigurationSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: PriorityLevelConfigurationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
