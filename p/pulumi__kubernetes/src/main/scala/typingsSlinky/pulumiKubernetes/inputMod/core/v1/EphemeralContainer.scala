package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An EphemeralContainer is a container that may be added temporarily to an existing pod for
  * user-initiated activities such as debugging. Ephemeral containers have no resource or
  * scheduling guarantees, and they will not be restarted when they exit or when a pod is removed
  * or restarted. If an ephemeral container causes a pod to exceed its resource allocation, the
  * pod may be evicted. Ephemeral containers may not be added by directly updating the pod spec.
  * They must be added via the pod's ephemeralcontainers subresource, and they will appear in the
  * pod spec once added. This is an alpha feature enabled by the EphemeralContainers feature
  * flag.
  */
@js.native
trait EphemeralContainer extends js.Object {
  /**
    * Arguments to the entrypoint. The docker image's CMD is used if this is not provided.
    * Variable references $(VAR_NAME) are expanded using the container's environment. If a
    * variable cannot be resolved, the reference in the input string will be unchanged. The
    * $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references
    * will never be expanded, regardless of whether the variable exists or not. Cannot be
    * updated. More info:
    * https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
    */
  var args: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Entrypoint array. Not executed within a shell. The docker image's ENTRYPOINT is used if
    * this is not provided. Variable references $(VAR_NAME) are expanded using the container's
    * environment. If a variable cannot be resolved, the reference in the input string will be
    * unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME).
    * Escaped references will never be expanded, regardless of whether the variable exists or
    * not. Cannot be updated. More info:
    * https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
    */
  var command: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * List of environment variables to set in the container. Cannot be updated.
    */
  var env: js.UndefOr[Input[js.Array[Input[EnvVar]]]] = js.native
  /**
    * List of sources to populate environment variables in the container. The keys defined within
    * a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the
    * container is starting. When a key exists in multiple sources, the value associated with the
    * last source will take precedence. Values defined by an Env with a duplicate key will take
    * precedence. Cannot be updated.
    */
  var envFrom: js.UndefOr[Input[js.Array[Input[EnvFromSource]]]] = js.native
  /**
    * Docker image name. More info: https://kubernetes.io/docs/concepts/containers/images
    */
  var image: js.UndefOr[Input[String]] = js.native
  /**
    * Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is
    * specified, or IfNotPresent otherwise. Cannot be updated. More info:
    * https://kubernetes.io/docs/concepts/containers/images#updating-images
    */
  var imagePullPolicy: js.UndefOr[Input[String]] = js.native
  /**
    * Lifecycle is not allowed for ephemeral containers.
    */
  var lifecycle: js.UndefOr[Input[Lifecycle]] = js.native
  /**
    * Probes are not allowed for ephemeral containers.
    */
  var livenessProbe: js.UndefOr[Input[Probe]] = js.native
  /**
    * Name of the ephemeral container specified as a DNS_LABEL. This name must be unique among
    * all containers, init containers and ephemeral containers.
    */
  var name: Input[String] = js.native
  /**
    * Ports are not allowed for ephemeral containers.
    */
  var ports: js.UndefOr[Input[js.Array[Input[ContainerPort]]]] = js.native
  /**
    * Probes are not allowed for ephemeral containers.
    */
  var readinessProbe: js.UndefOr[Input[Probe]] = js.native
  /**
    * Resources are not allowed for ephemeral containers. Ephemeral containers use spare
    * resources already allocated to the pod.
    */
  var resources: js.UndefOr[Input[ResourceRequirements]] = js.native
  /**
    * SecurityContext is not allowed for ephemeral containers.
    */
  var securityContext: js.UndefOr[Input[SecurityContext]] = js.native
  /**
    * Probes are not allowed for ephemeral containers.
    */
  var startupProbe: js.UndefOr[Input[Probe]] = js.native
  /**
    * Whether this container should allocate a buffer for stdin in the container runtime. If this
    * is not set, reads from stdin in the container will always result in EOF. Default is false.
    */
  var stdin: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Whether the container runtime should close the stdin channel after it has been opened by a
    * single attach. When stdin is true the stdin stream will remain open across multiple attach
    * sessions. If stdinOnce is set to true, stdin is opened on container start, is empty until
    * the first client attaches to stdin, and then remains open and accepts data until the client
    * disconnects, at which time stdin is closed and remains closed until the container is
    * restarted. If this flag is false, a container processes that reads from stdin will never
    * receive an EOF. Default is false
    */
  var stdinOnce: js.UndefOr[Input[Boolean]] = js.native
  /**
    * If set, the name of the container from PodSpec that this ephemeral container targets. The
    * ephemeral container will be run in the namespaces (IPC, PID, etc) of this container. If not
    * set then the ephemeral container is run in whatever namespaces are shared for the pod. Note
    * that the container runtime must support this feature.
    */
  var targetContainerName: js.UndefOr[Input[String]] = js.native
  /**
    * Optional: Path at which the file to which the container's termination message will be
    * written is mounted into the container's filesystem. Message written is intended to be brief
    * final status, such as an assertion failure message. Will be truncated by the node if
    * greater than 4096 bytes. The total message length across all containers will be limited to
    * 12kb. Defaults to /dev/termination-log. Cannot be updated.
    */
  var terminationMessagePath: js.UndefOr[Input[String]] = js.native
  /**
    * Indicate how the termination message should be populated. File will use the contents of
    * terminationMessagePath to populate the container status message on both success and
    * failure. FallbackToLogsOnError will use the last chunk of container log output if the
    * termination message file is empty and the container exited with an error. The log output is
    * limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be
    * updated.
    */
  var terminationMessagePolicy: js.UndefOr[Input[String]] = js.native
  /**
    * Whether this container should allocate a TTY for itself, also requires 'stdin' to be true.
    * Default is false.
    */
  var tty: js.UndefOr[Input[Boolean]] = js.native
  /**
    * volumeDevices is the list of block devices to be used by the container. This is a beta
    * feature.
    */
  var volumeDevices: js.UndefOr[Input[js.Array[Input[VolumeDevice]]]] = js.native
  /**
    * Pod volumes to mount into the container's filesystem. Cannot be updated.
    */
  var volumeMounts: js.UndefOr[Input[js.Array[Input[VolumeMount]]]] = js.native
  /**
    * Container's working directory. If not specified, the container runtime's default will be
    * used, which might be configured in the container image. Cannot be updated.
    */
  var workingDir: js.UndefOr[Input[String]] = js.native
}

object EphemeralContainer {
  @scala.inline
  def apply(name: Input[String]): EphemeralContainer = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EphemeralContainer]
  }
  @scala.inline
  implicit class EphemeralContainerOps[Self <: EphemeralContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArgs(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.undefined)
        ret
    }
    @scala.inline
    def withCommand(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(js.undefined)
        ret
    }
    @scala.inline
    def withEnv(value: Input[js.Array[Input[EnvVar]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvFrom(value: Input[js.Array[Input[EnvFromSource]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("envFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("envFrom")(js.undefined)
        ret
    }
    @scala.inline
    def withImage(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withImagePullPolicy(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagePullPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImagePullPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagePullPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withLifecycle(value: Input[Lifecycle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifecycle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLifecycle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifecycle")(js.undefined)
        ret
    }
    @scala.inline
    def withLivenessProbe(value: Input[Probe]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("livenessProbe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLivenessProbe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("livenessProbe")(js.undefined)
        ret
    }
    @scala.inline
    def withPorts(value: Input[js.Array[Input[ContainerPort]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPorts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ports")(js.undefined)
        ret
    }
    @scala.inline
    def withReadinessProbe(value: Input[Probe]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readinessProbe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadinessProbe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readinessProbe")(js.undefined)
        ret
    }
    @scala.inline
    def withResources(value: Input[ResourceRequirements]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityContext(value: Input[SecurityContext]): Self = {
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
    def withStartupProbe(value: Input[Probe]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startupProbe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartupProbe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startupProbe")(js.undefined)
        ret
    }
    @scala.inline
    def withStdin(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStdin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdin")(js.undefined)
        ret
    }
    @scala.inline
    def withStdinOnce(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdinOnce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStdinOnce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdinOnce")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetContainerName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetContainerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetContainerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetContainerName")(js.undefined)
        ret
    }
    @scala.inline
    def withTerminationMessagePath(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminationMessagePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerminationMessagePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminationMessagePath")(js.undefined)
        ret
    }
    @scala.inline
    def withTerminationMessagePolicy(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminationMessagePolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerminationMessagePolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminationMessagePolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withTty(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tty")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeDevices(value: Input[js.Array[Input[VolumeDevice]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeDevices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeDevices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeDevices")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeMounts(value: Input[js.Array[Input[VolumeMount]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeMounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeMounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeMounts")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkingDir(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workingDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkingDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workingDir")(js.undefined)
        ret
    }
  }
  
}

