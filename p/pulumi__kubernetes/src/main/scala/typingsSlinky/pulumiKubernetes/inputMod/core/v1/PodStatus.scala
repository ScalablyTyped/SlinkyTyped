package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PodStatus represents information about the status of a pod. Status may trail the actual state
  * of a system, especially if the node that hosts the pod cannot contact the control plane.
  */
@js.native
trait PodStatus extends js.Object {
  /**
    * Current service state of pod. More info:
    * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
    */
  var conditions: js.UndefOr[Input[js.Array[Input[PodCondition]]]] = js.native
  /**
    * The list has one entry per container in the manifest. Each entry is currently the output of
    * `docker inspect`. More info:
    * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
    */
  var containerStatuses: js.UndefOr[Input[js.Array[Input[ContainerStatus]]]] = js.native
  /**
    * Status for any ephemeral containers that have run in this pod. This field is alpha-level
    * and is only populated by servers that enable the EphemeralContainers feature.
    */
  var ephemeralContainerStatuses: js.UndefOr[Input[js.Array[Input[ContainerStatus]]]] = js.native
  /**
    * IP address of the host to which the pod is assigned. Empty if not yet scheduled.
    */
  var hostIP: js.UndefOr[Input[String]] = js.native
  /**
    * The list has one entry per init container in the manifest. The most recent successful init
    * container will have ready = true, the most recently started container will have startTime
    * set. More info:
    * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
    */
  var initContainerStatuses: js.UndefOr[Input[js.Array[Input[ContainerStatus]]]] = js.native
  /**
    * A human readable message indicating details about why the pod is in this condition.
    */
  var message: js.UndefOr[Input[String]] = js.native
  /**
    * nominatedNodeName is set only when this pod preempts other pods on the node, but it cannot
    * be scheduled right away as preemption victims receive their graceful termination periods.
    * This field does not guarantee that the pod will be scheduled on this node. Scheduler may
    * decide to place the pod elsewhere if other nodes become available sooner. Scheduler may
    * also decide to give the resources on this node to a higher priority pod that is created
    * after preemption. As a result, this field may be different than PodSpec.nodeName when the
    * pod is scheduled.
    */
  var nominatedNodeName: js.UndefOr[Input[String]] = js.native
  /**
    * The phase of a Pod is a simple, high-level summary of where the Pod is in its lifecycle.
    * The conditions array, the reason and message fields, and the individual container status
    * arrays contain more detail about the pod's status. There are five possible phase values:
    *
    * Pending: The pod has been accepted by the Kubernetes system, but one or more of the
    * container images has not been created. This includes time before being scheduled as well as
    * time spent downloading images over the network, which could take a while. Running: The pod
    * has been bound to a node, and all of the containers have been created. At least one
    * container is still running, or is in the process of starting or restarting. Succeeded: All
    * containers in the pod have terminated in success, and will not be restarted. Failed: All
    * containers in the pod have terminated, and at least one container has terminated in
    * failure. The container either exited with non-zero status or was terminated by the system.
    * Unknown: For some reason the state of the pod could not be obtained, typically due to an
    * error in communicating with the host of the pod.
    *
    * More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-phase
    */
  var phase: js.UndefOr[Input[String]] = js.native
  /**
    * IP address allocated to the pod. Routable at least within the cluster. Empty if not yet
    * allocated.
    */
  var podIP: js.UndefOr[Input[String]] = js.native
  /**
    * podIPs holds the IP addresses allocated to the pod. If this field is specified, the 0th
    * entry must match the podIP field. Pods may be allocated at most 1 value for each of IPv4
    * and IPv6. This list is empty if no IPs have been allocated yet.
    */
  var podIPs: js.UndefOr[Input[js.Array[Input[PodIP]]]] = js.native
  /**
    * The Quality of Service (QOS) classification assigned to the pod based on resource
    * requirements See PodQOSClass type for available QOS classes More info:
    * https://git.k8s.io/community/contributors/design-proposals/node/resource-qos.md
    */
  var qosClass: js.UndefOr[Input[String]] = js.native
  /**
    * A brief CamelCase message indicating details about why the pod is in this state. e.g.
    * 'Evicted'
    */
  var reason: js.UndefOr[Input[String]] = js.native
  /**
    * RFC 3339 date and time at which the object was acknowledged by the Kubelet. This is before
    * the Kubelet pulled the container image(s) for the pod.
    */
  var startTime: js.UndefOr[Input[String]] = js.native
}

object PodStatus {
  @scala.inline
  def apply(): PodStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PodStatus]
  }
  @scala.inline
  implicit class PodStatusOps[Self <: PodStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConditions(value: Input[js.Array[Input[PodCondition]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConditions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerStatuses(value: Input[js.Array[Input[ContainerStatus]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStatuses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerStatuses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStatuses")(js.undefined)
        ret
    }
    @scala.inline
    def withEphemeralContainerStatuses(value: Input[js.Array[Input[ContainerStatus]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ephemeralContainerStatuses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEphemeralContainerStatuses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ephemeralContainerStatuses")(js.undefined)
        ret
    }
    @scala.inline
    def withHostIP(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostIP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostIP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostIP")(js.undefined)
        ret
    }
    @scala.inline
    def withInitContainerStatuses(value: Input[js.Array[Input[ContainerStatus]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initContainerStatuses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitContainerStatuses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initContainerStatuses")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withNominatedNodeName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nominatedNodeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNominatedNodeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nominatedNodeName")(js.undefined)
        ret
    }
    @scala.inline
    def withPhase(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phase")(js.undefined)
        ret
    }
    @scala.inline
    def withPodIP(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("podIP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPodIP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("podIP")(js.undefined)
        ret
    }
    @scala.inline
    def withPodIPs(value: Input[js.Array[Input[PodIP]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("podIPs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPodIPs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("podIPs")(js.undefined)
        ret
    }
    @scala.inline
    def withQosClass(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qosClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQosClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qosClass")(js.undefined)
        ret
    }
    @scala.inline
    def withReason(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
  }
  
}

