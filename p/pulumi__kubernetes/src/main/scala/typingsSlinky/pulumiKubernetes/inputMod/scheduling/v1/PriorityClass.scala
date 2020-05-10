package typingsSlinky.pulumiKubernetes.inputMod.scheduling.v1

import typingsSlinky.pulumiKubernetes.inputMod.meta.v1.ObjectMeta
import typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.schedulingDotk8sDotioSlashv1
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PriorityClass defines mapping from a priority class name to the priority integer value. The
  * value can be any valid integer.
  */
@js.native
trait PriorityClass extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[schedulingDotk8sDotioSlashv1]] = js.native
  /**
    * description is an arbitrary string that usually provides guidelines on when this priority
    * class should be used.
    */
  var description: js.UndefOr[Input[String]] = js.native
  /**
    * globalDefault specifies whether this PriorityClass should be considered as the default
    * priority for pods that do not have any priority class. Only one PriorityClass can be marked
    * as `globalDefault`. However, if more than one PriorityClasses exists with their
    * `globalDefault` field set to true, the smallest value of such global default
    * PriorityClasses will be used as the default priority.
    */
  var globalDefault: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.PriorityClass]] = js.native
  /**
    * Standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.native
  /**
    * PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never,
    * PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is alpha-level
    * and is only honored by servers that enable the NonPreemptingPriority feature.
    */
  var preemptionPolicy: js.UndefOr[Input[String]] = js.native
  /**
    * The value of this priority class. This is the actual priority that pods receive when they
    * have the name of this class in their pod spec.
    */
  var value: Input[Double] = js.native
}

object PriorityClass {
  @scala.inline
  def apply(value: Input[Double]): PriorityClass = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriorityClass]
  }
  @scala.inline
  implicit class PriorityClassOps[Self <: PriorityClass] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApiVersion(value: Input[schedulingDotk8sDotioSlashv1]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalDefault(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.PriorityClass]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: Input[ObjectMeta]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withPreemptionPolicy(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preemptionPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreemptionPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preemptionPolicy")(js.undefined)
        ret
    }
  }
  
}

