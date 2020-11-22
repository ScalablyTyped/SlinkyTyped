package typingsSlinky.pulumiKubernetes.outputMod.scheduling.v1

import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.schedulingDotk8sDotioSlashv1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PriorityClass defines mapping from a priority class name to the priority integer value. The value can be any valid integer.
  */
@js.native
trait PriorityClass extends js.Object {
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: schedulingDotk8sDotioSlashv1 = js.native
  
  /**
    * description is an arbitrary string that usually provides guidelines on when this priority class should be used.
    */
  var description: String = js.native
  
  /**
    * globalDefault specifies whether this PriorityClass should be considered as the default priority for pods that do not have any priority class. Only one PriorityClass can be marked as `globalDefault`. However, if more than one PriorityClasses exists with their `globalDefault` field set to true, the smallest value of such global default PriorityClasses will be used as the default priority.
    */
  var globalDefault: Boolean = js.native
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.PriorityClass = js.native
  
  /**
    * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: ObjectMeta = js.native
  
  /**
    * PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is beta-level, gated by the NonPreemptingPriority feature-gate.
    */
  var preemptionPolicy: String = js.native
  
  /**
    * The value of this priority class. This is the actual priority that pods receive when they have the name of this class in their pod spec.
    */
  var value: Double = js.native
}
object PriorityClass {
  
  @scala.inline
  def apply(
    apiVersion: schedulingDotk8sDotioSlashv1,
    description: String,
    globalDefault: Boolean,
    kind: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.PriorityClass,
    metadata: ObjectMeta,
    preemptionPolicy: String,
    value: Double
  ): PriorityClass = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], globalDefault = globalDefault.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], preemptionPolicy = preemptionPolicy.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriorityClass]
  }
  
  @scala.inline
  implicit class PriorityClassOps[Self <: PriorityClass] (val x: Self) extends AnyVal {
    
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
    def setApiVersion(value: schedulingDotk8sDotioSlashv1): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalDefault(value: Boolean): Self = this.set("globalDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.PriorityClass): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: ObjectMeta): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreemptionPolicy(value: String): Self = this.set("preemptionPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
