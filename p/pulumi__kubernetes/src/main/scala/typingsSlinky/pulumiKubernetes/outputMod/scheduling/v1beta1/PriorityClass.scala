package typingsSlinky.pulumiKubernetes.outputMod.scheduling.v1beta1

import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.schedulingDotk8sDotioSlashv1beta1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DEPRECATED - This group version of PriorityClass is deprecated by
  * scheduling.k8s.io/v1/PriorityClass. PriorityClass defines mapping from a priority class name
  * to the priority integer value. The value can be any valid integer.
  */
@js.native
trait PriorityClass extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: schedulingDotk8sDotioSlashv1beta1 = js.native
  /**
    * description is an arbitrary string that usually provides guidelines on when this priority
    * class should be used.
    */
  val description: String = js.native
  /**
    * globalDefault specifies whether this PriorityClass should be considered as the default
    * priority for pods that do not have any priority class. Only one PriorityClass can be marked
    * as `globalDefault`. However, if more than one PriorityClasses exists with their
    * `globalDefault` field set to true, the smallest value of such global default
    * PriorityClasses will be used as the default priority.
    */
  val globalDefault: Boolean = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.PriorityClass = js.native
  /**
    * Standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: ObjectMeta = js.native
  /**
    * PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never,
    * PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is alpha-level
    * and is only honored by servers that enable the NonPreemptingPriority feature.
    */
  val preemptionPolicy: String = js.native
  /**
    * The value of this priority class. This is the actual priority that pods receive when they
    * have the name of this class in their pod spec.
    */
  val value: Double = js.native
}

object PriorityClass {
  @scala.inline
  def apply(
    apiVersion: schedulingDotk8sDotioSlashv1beta1,
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
    def withApiVersion(value: schedulingDotk8sDotioSlashv1beta1): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobalDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.PriorityClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: ObjectMeta): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreemptionPolicy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preemptionPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

