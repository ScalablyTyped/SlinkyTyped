package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PodSpec is a description of a pod.
  */
@js.native
trait PodSpec extends js.Object {
  /**
    * Optional duration in seconds the pod may be active on the node relative to StartTime before
    * the system will actively try to mark it failed and kill associated containers. Value must
    * be a positive integer.
    */
  var activeDeadlineSeconds: js.UndefOr[Input[Double]] = js.native
  /**
    * If specified, the pod's scheduling constraints
    */
  var affinity: js.UndefOr[Input[Affinity]] = js.native
  /**
    * AutomountServiceAccountToken indicates whether a service account token should be
    * automatically mounted.
    */
  var automountServiceAccountToken: js.UndefOr[Input[Boolean]] = js.native
  /**
    * List of containers belonging to the pod. Containers cannot currently be added or removed.
    * There must be at least one container in a Pod. Cannot be updated.
    */
  var containers: Input[js.Array[Input[Container]]] = js.native
  /**
    * Specifies the DNS parameters of a pod. Parameters specified here will be merged to the
    * generated DNS configuration based on DNSPolicy.
    */
  var dnsConfig: js.UndefOr[Input[PodDNSConfig]] = js.native
  /**
    * Set DNS policy for the pod. Defaults to "ClusterFirst". Valid values are
    * 'ClusterFirstWithHostNet', 'ClusterFirst', 'Default' or 'None'. DNS parameters given in
    * DNSConfig will be merged with the policy selected with DNSPolicy. To have DNS options set
    * along with hostNetwork, you have to specify DNS policy explicitly to
    * 'ClusterFirstWithHostNet'.
    */
  var dnsPolicy: js.UndefOr[Input[String]] = js.native
  /**
    * EnableServiceLinks indicates whether information about services should be injected into
    * pod's environment variables, matching the syntax of Docker links. Optional: Defaults to
    * true.
    */
  var enableServiceLinks: js.UndefOr[Input[Boolean]] = js.native
  /**
    * List of ephemeral containers run in this pod. Ephemeral containers may be run in an
    * existing pod to perform user-initiated actions such as debugging. This list cannot be
    * specified when creating a pod, and it cannot be modified by updating the pod spec. In order
    * to add an ephemeral container to an existing pod, use the pod's ephemeralcontainers
    * subresource. This field is alpha-level and is only honored by servers that enable the
    * EphemeralContainers feature.
    */
  var ephemeralContainers: js.UndefOr[Input[js.Array[Input[EphemeralContainer]]]] = js.native
  /**
    * HostAliases is an optional list of hosts and IPs that will be injected into the pod's hosts
    * file if specified. This is only valid for non-hostNetwork pods.
    */
  var hostAliases: js.UndefOr[Input[js.Array[Input[HostAlias]]]] = js.native
  /**
    * Use the host's ipc namespace. Optional: Default to false.
    */
  var hostIPC: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Host networking requested for this pod. Use the host's network namespace. If this option is
    * set, the ports that will be used must be specified. Default to false.
    */
  var hostNetwork: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Use the host's pid namespace. Optional: Default to false.
    */
  var hostPID: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Specifies the hostname of the Pod If not specified, the pod's hostname will be set to a
    * system-defined value.
    */
  var hostname: js.UndefOr[Input[String]] = js.native
  /**
    * ImagePullSecrets is an optional list of references to secrets in the same namespace to use
    * for pulling any of the images used by this PodSpec. If specified, these secrets will be
    * passed to individual puller implementations for them to use. For example, in the case of
    * docker, only DockerConfig type secrets are honored. More info:
    * https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod
    */
  var imagePullSecrets: js.UndefOr[Input[js.Array[Input[LocalObjectReference]]]] = js.native
  /**
    * List of initialization containers belonging to the pod. Init containers are executed in
    * order prior to containers being started. If any init container fails, the pod is considered
    * to have failed and is handled according to its restartPolicy. The name for an init
    * container or normal container must be unique among all containers. Init containers may not
    * have Lifecycle actions, Readiness probes, Liveness probes, or Startup probes. The
    * resourceRequirements of an init container are taken into account during scheduling by
    * finding the highest request/limit for each resource type, and then using the max of of that
    * value or the sum of the normal containers. Limits are applied to init containers in a
    * similar fashion. Init containers cannot currently be added or removed. Cannot be updated.
    * More info: https://kubernetes.io/docs/concepts/workloads/pods/init-containers/
    */
  var initContainers: js.UndefOr[Input[js.Array[Input[Container]]]] = js.native
  /**
    * NodeName is a request to schedule this pod onto a specific node. If it is non-empty, the
    * scheduler simply schedules this pod onto that node, assuming that it fits resource
    * requirements.
    */
  var nodeName: js.UndefOr[Input[String]] = js.native
  /**
    * NodeSelector is a selector which must be true for the pod to fit on a node. Selector which
    * must match a node's labels for the pod to be scheduled on that node. More info:
    * https://kubernetes.io/docs/concepts/configuration/assign-pod-node/
    */
  var nodeSelector: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * Overhead represents the resource overhead associated with running a pod for a given
    * RuntimeClass. This field will be autopopulated at admission time by the RuntimeClass
    * admission controller. If the RuntimeClass admission controller is enabled, overhead must
    * not be set in Pod create requests. The RuntimeClass admission controller will reject Pod
    * create requests which have the overhead already set. If RuntimeClass is configured and
    * selected in the PodSpec, Overhead will be set to the value defined in the corresponding
    * RuntimeClass, otherwise it will remain unset and treated as zero. More info:
    * https://git.k8s.io/enhancements/keps/sig-node/20190226-pod-overhead.md This field is
    * alpha-level as of Kubernetes v1.16, and is only honored by servers that enable the
    * PodOverhead feature.
    */
  var overhead: js.UndefOr[Input[js.Object]] = js.native
  /**
    * PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never,
    * PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is alpha-level
    * and is only honored by servers that enable the NonPreemptingPriority feature.
    */
  var preemptionPolicy: js.UndefOr[Input[String]] = js.native
  /**
    * The priority value. Various system components use this field to find the priority of the
    * pod. When Priority Admission Controller is enabled, it prevents users from setting this
    * field. The admission controller populates this field from PriorityClassName. The higher the
    * value, the higher the priority.
    */
  var priority: js.UndefOr[Input[Double]] = js.native
  /**
    * If specified, indicates the pod's priority. "system-node-critical" and
    * "system-cluster-critical" are two special keywords which indicate the highest priorities
    * with the former being the highest priority. Any other name must be defined by creating a
    * PriorityClass object with that name. If not specified, the pod priority will be default or
    * zero if there is no default.
    */
  var priorityClassName: js.UndefOr[Input[String]] = js.native
  /**
    * If specified, all readiness gates will be evaluated for pod readiness. A pod is ready when
    * all its containers are ready AND all conditions specified in the readiness gates have
    * status equal to "True" More info:
    * https://git.k8s.io/enhancements/keps/sig-network/0007-pod-ready%2B%2B.md
    */
  var readinessGates: js.UndefOr[Input[js.Array[Input[PodReadinessGate]]]] = js.native
  /**
    * Restart policy for all containers within the pod. One of Always, OnFailure, Never. Default
    * to Always. More info:
    * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy
    */
  var restartPolicy: js.UndefOr[Input[String]] = js.native
  /**
    * RuntimeClassName refers to a RuntimeClass object in the node.k8s.io group, which should be
    * used to run this pod.  If no RuntimeClass resource matches the named class, the pod will
    * not be run. If unset or empty, the "legacy" RuntimeClass will be used, which is an implicit
    * class with an empty definition that uses the default runtime handler. More info:
    * https://git.k8s.io/enhancements/keps/sig-node/runtime-class.md This is a beta feature as of
    * Kubernetes v1.14.
    */
  var runtimeClassName: js.UndefOr[Input[String]] = js.native
  /**
    * If specified, the pod will be dispatched by specified scheduler. If not specified, the pod
    * will be dispatched by default scheduler.
    */
  var schedulerName: js.UndefOr[Input[String]] = js.native
  /**
    * SecurityContext holds pod-level security attributes and common container settings.
    * Optional: Defaults to empty.  See type description for default values of each field.
    */
  var securityContext: js.UndefOr[Input[PodSecurityContext]] = js.native
  /**
    * DeprecatedServiceAccount is a depreciated alias for ServiceAccountName. Deprecated: Use
    * serviceAccountName instead.
    */
  var serviceAccount: js.UndefOr[Input[String]] = js.native
  /**
    * ServiceAccountName is the name of the ServiceAccount to use to run this pod. More info:
    * https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/
    */
  var serviceAccountName: js.UndefOr[Input[String]] = js.native
  /**
    * Share a single process namespace between all of the containers in a pod. When this is set
    * containers will be able to view and signal processes from other containers in the same pod,
    * and the first process in each container will not be assigned PID 1. HostPID and
    * ShareProcessNamespace cannot both be set. Optional: Default to false.
    */
  var shareProcessNamespace: js.UndefOr[Input[Boolean]] = js.native
  /**
    * If specified, the fully qualified Pod hostname will be "<hostname>.<subdomain>.<pod
    * namespace>.svc.<cluster domain>". If not specified, the pod will not have a domainname at
    * all.
    */
  var subdomain: js.UndefOr[Input[String]] = js.native
  /**
    * Optional duration in seconds the pod needs to terminate gracefully. May be decreased in
    * delete request. Value must be non-negative integer. The value zero indicates delete
    * immediately. If this value is nil, the default grace period will be used instead. The grace
    * period is the duration in seconds after the processes running in the pod are sent a
    * termination signal and the time when the processes are forcibly halted with a kill signal.
    * Set this value longer than the expected cleanup time for your process. Defaults to 30
    * seconds.
    */
  var terminationGracePeriodSeconds: js.UndefOr[Input[Double]] = js.native
  /**
    * If specified, the pod's tolerations.
    */
  var tolerations: js.UndefOr[Input[js.Array[Input[Toleration]]]] = js.native
  /**
    * TopologySpreadConstraints describes how a group of pods ought to spread across topology
    * domains. Scheduler will schedule pods in a way which abides by the constraints. This field
    * is alpha-level and is only honored by clusters that enables the EvenPodsSpread feature. All
    * topologySpreadConstraints are ANDed.
    */
  var topologySpreadConstraints: js.UndefOr[Input[js.Array[Input[TopologySpreadConstraint]]]] = js.native
  /**
    * List of volumes that can be mounted by containers belonging to the pod. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes
    */
  var volumes: js.UndefOr[Input[js.Array[Input[Volume]]]] = js.native
}

object PodSpec {
  @scala.inline
  def apply(containers: Input[js.Array[Input[Container]]]): PodSpec = {
    val __obj = js.Dynamic.literal(containers = containers.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodSpec]
  }
  @scala.inline
  implicit class PodSpecOps[Self <: PodSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainers(value: Input[js.Array[Input[Container]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveDeadlineSeconds(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeDeadlineSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveDeadlineSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeDeadlineSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withAffinity(value: Input[Affinity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affinity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAffinity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affinity")(js.undefined)
        ret
    }
    @scala.inline
    def withAutomountServiceAccountToken(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automountServiceAccountToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomountServiceAccountToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automountServiceAccountToken")(js.undefined)
        ret
    }
    @scala.inline
    def withDnsConfig(value: Input[PodDNSConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDnsConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withDnsPolicy(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDnsPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableServiceLinks(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableServiceLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableServiceLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableServiceLinks")(js.undefined)
        ret
    }
    @scala.inline
    def withEphemeralContainers(value: Input[js.Array[Input[EphemeralContainer]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ephemeralContainers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEphemeralContainers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ephemeralContainers")(js.undefined)
        ret
    }
    @scala.inline
    def withHostAliases(value: Input[js.Array[Input[HostAlias]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostAliases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostAliases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostAliases")(js.undefined)
        ret
    }
    @scala.inline
    def withHostIPC(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostIPC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostIPC: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostIPC")(js.undefined)
        ret
    }
    @scala.inline
    def withHostNetwork(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostNetwork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostNetwork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostNetwork")(js.undefined)
        ret
    }
    @scala.inline
    def withHostPID(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostPID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostPID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostPID")(js.undefined)
        ret
    }
    @scala.inline
    def withHostname(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(js.undefined)
        ret
    }
    @scala.inline
    def withImagePullSecrets(value: Input[js.Array[Input[LocalObjectReference]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagePullSecrets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImagePullSecrets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagePullSecrets")(js.undefined)
        ret
    }
    @scala.inline
    def withInitContainers(value: Input[js.Array[Input[Container]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initContainers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitContainers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initContainers")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeName")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeSelector(value: Input[StringDictionary[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withOverhead(value: Input[js.Object]): Self = {
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
    @scala.inline
    def withPriority(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
    @scala.inline
    def withPriorityClassName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priorityClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriorityClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priorityClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withReadinessGates(value: Input[js.Array[Input[PodReadinessGate]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readinessGates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadinessGates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readinessGates")(js.undefined)
        ret
    }
    @scala.inline
    def withRestartPolicy(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restartPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestartPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restartPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withRuntimeClassName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtimeClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuntimeClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtimeClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withSchedulerName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedulerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchedulerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedulerName")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityContext(value: Input[PodSecurityContext]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityContext")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceAccount(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccount")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceAccountName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccountName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceAccountName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccountName")(js.undefined)
        ret
    }
    @scala.inline
    def withShareProcessNamespace(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareProcessNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShareProcessNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareProcessNamespace")(js.undefined)
        ret
    }
    @scala.inline
    def withSubdomain(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subdomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubdomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subdomain")(js.undefined)
        ret
    }
    @scala.inline
    def withTerminationGracePeriodSeconds(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminationGracePeriodSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerminationGracePeriodSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminationGracePeriodSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withTolerations(value: Input[js.Array[Input[Toleration]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tolerations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTolerations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tolerations")(js.undefined)
        ret
    }
    @scala.inline
    def withTopologySpreadConstraints(value: Input[js.Array[Input[TopologySpreadConstraint]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topologySpreadConstraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopologySpreadConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topologySpreadConstraints")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumes(value: Input[js.Array[Input[Volume]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumes")(js.undefined)
        ret
    }
  }
  
}

