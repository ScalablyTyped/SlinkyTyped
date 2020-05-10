package typingsSlinky.pulumiKubernetes.inputMod.node.v1beta1

import typingsSlinky.pulumiKubernetes.inputMod.meta.v1.ObjectMeta
import typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.nodeDotk8sDotioSlashv1beta1
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RuntimeClass defines a class of container runtime supported in the cluster. The RuntimeClass
  * is used to determine which container runtime is used to run all containers in a pod.
  * RuntimeClasses are (currently) manually defined by a user or cluster provisioner, and
  * referenced in the PodSpec. The Kubelet is responsible for resolving the RuntimeClassName
  * reference before running the pod.  For more details, see
  * https://git.k8s.io/enhancements/keps/sig-node/runtime-class.md
  */
@js.native
trait RuntimeClass extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[nodeDotk8sDotioSlashv1beta1]] = js.native
  /**
    * Handler specifies the underlying runtime and configuration that the CRI implementation will
    * use to handle pods of this class. The possible values are specific to the node & CRI
    * configuration.  It is assumed that all handlers are available on every node, and handlers
    * of the same name are equivalent on every node. For example, a handler called "runc" might
    * specify that the runc OCI runtime (using native Linux containers) will be used to run the
    * containers in a pod. The Handler must conform to the DNS Label (RFC 1123) requirements, and
    * is immutable.
    */
  var handler: Input[String] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.RuntimeClass]] = js.native
  /**
    * More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.native
  /**
    * Overhead represents the resource overhead associated with running a pod for a given
    * RuntimeClass. For more details, see
    * https://git.k8s.io/enhancements/keps/sig-node/20190226-pod-overhead.md This field is
    * alpha-level as of Kubernetes v1.15, and is only honored by servers that enable the
    * PodOverhead feature.
    */
  var overhead: js.UndefOr[Input[Overhead]] = js.native
  /**
    * Scheduling holds the scheduling constraints to ensure that pods running with this
    * RuntimeClass are scheduled to nodes that support it. If scheduling is nil, this
    * RuntimeClass is assumed to be supported by all nodes.
    */
  var scheduling: js.UndefOr[Input[Scheduling]] = js.native
}

object RuntimeClass {
  @scala.inline
  def apply(handler: Input[String]): RuntimeClass = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeClass]
  }
  @scala.inline
  implicit class RuntimeClassOps[Self <: RuntimeClass] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandler(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApiVersion(value: Input[nodeDotk8sDotioSlashv1beta1]): Self = {
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
    def withKind(value: Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.RuntimeClass]): Self = {
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
    def withOverhead(value: Input[Overhead]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overhead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverhead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overhead")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduling(value: Input[Scheduling]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduling")(js.undefined)
        ret
    }
  }
  
}

