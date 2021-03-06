package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single application container that you want to run within a pod.
  */
@js.native
trait Container extends StObject {
  
  /**
    * Arguments to the entrypoint. The docker image's CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
    */
  var args: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * Entrypoint array. Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
    */
  var command: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * List of environment variables to set in the container. Cannot be updated.
    */
  var env: js.UndefOr[Input[js.Array[Input[EnvVar]]]] = js.native
  
  /**
    * List of sources to populate environment variables in the container. The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Cannot be updated.
    */
  var envFrom: js.UndefOr[Input[js.Array[Input[EnvFromSource]]]] = js.native
  
  /**
    * Docker image name. More info: https://kubernetes.io/docs/concepts/containers/images This field is optional to allow higher level config management to default or override container images in workload controllers like Deployments and StatefulSets.
    */
  var image: js.UndefOr[Input[String]] = js.native
  
  /**
    * Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images
    */
  var imagePullPolicy: js.UndefOr[Input[String]] = js.native
  
  /**
    * Actions that the management system should take in response to container lifecycle events. Cannot be updated.
    */
  var lifecycle: js.UndefOr[Input[Lifecycle]] = js.native
  
  /**
    * Periodic probe of container liveness. Container will be restarted if the probe fails. Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    */
  var livenessProbe: js.UndefOr[Input[Probe]] = js.native
  
  /**
    * Name of the container specified as a DNS_LABEL. Each container in a pod must have a unique name (DNS_LABEL). Cannot be updated.
    */
  var name: Input[String] = js.native
  
  /**
    * List of ports to expose from the container. Exposing a port here gives the system additional information about the network connections a container uses, but is primarily informational. Not specifying a port here DOES NOT prevent that port from being exposed. Any port which is listening on the default "0.0.0.0" address inside a container will be accessible from the network. Cannot be updated.
    */
  var ports: js.UndefOr[Input[js.Array[Input[ContainerPort]]]] = js.native
  
  /**
    * Periodic probe of container service readiness. Container will be removed from service endpoints if the probe fails. Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    */
  var readinessProbe: js.UndefOr[Input[Probe]] = js.native
  
  /**
    * Compute Resources required by this container. Cannot be updated. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
    */
  var resources: js.UndefOr[Input[ResourceRequirements]] = js.native
  
  /**
    * Security options the pod should run with. More info: https://kubernetes.io/docs/concepts/policy/security-context/ More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
    */
  var securityContext: js.UndefOr[Input[SecurityContext]] = js.native
  
  /**
    * StartupProbe indicates that the Pod has successfully initialized. If specified, no other probes are executed until this completes successfully. If this probe fails, the Pod will be restarted, just as if the livenessProbe failed. This can be used to provide different probe parameters at the beginning of a Pod's lifecycle, when it might take a long time to load data or warm a cache, than during steady-state operation. This cannot be updated. This is a beta feature enabled by the StartupProbe feature flag. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    */
  var startupProbe: js.UndefOr[Input[Probe]] = js.native
  
  /**
    * Whether this container should allocate a buffer for stdin in the container runtime. If this is not set, reads from stdin in the container will always result in EOF. Default is false.
    */
  var stdin: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Whether the container runtime should close the stdin channel after it has been opened by a single attach. When stdin is true the stdin stream will remain open across multiple attach sessions. If stdinOnce is set to true, stdin is opened on container start, is empty until the first client attaches to stdin, and then remains open and accepts data until the client disconnects, at which time stdin is closed and remains closed until the container is restarted. If this flag is false, a container processes that reads from stdin will never receive an EOF. Default is false
    */
  var stdinOnce: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Optional: Path at which the file to which the container's termination message will be written is mounted into the container's filesystem. Message written is intended to be brief final status, such as an assertion failure message. Will be truncated by the node if greater than 4096 bytes. The total message length across all containers will be limited to 12kb. Defaults to /dev/termination-log. Cannot be updated.
    */
  var terminationMessagePath: js.UndefOr[Input[String]] = js.native
  
  /**
    * Indicate how the termination message should be populated. File will use the contents of terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.
    */
  var terminationMessagePolicy: js.UndefOr[Input[String]] = js.native
  
  /**
    * Whether this container should allocate a TTY for itself, also requires 'stdin' to be true. Default is false.
    */
  var tty: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * volumeDevices is the list of block devices to be used by the container.
    */
  var volumeDevices: js.UndefOr[Input[js.Array[Input[VolumeDevice]]]] = js.native
  
  /**
    * Pod volumes to mount into the container's filesystem. Cannot be updated.
    */
  var volumeMounts: js.UndefOr[Input[js.Array[Input[VolumeMount]]]] = js.native
  
  /**
    * Container's working directory. If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.
    */
  var workingDir: js.UndefOr[Input[String]] = js.native
}
object Container {
  
  @scala.inline
  def apply(name: Input[String]): Container = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
  
  @scala.inline
  implicit class ContainerMutableBuilder[Self <: Container] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setArgsVarargs(value: Input[String]*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setCommand(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    @scala.inline
    def setCommandVarargs(value: Input[String]*): Self = StObject.set(x, "command", js.Array(value :_*))
    
    @scala.inline
    def setEnv(value: Input[js.Array[Input[EnvVar]]]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvFrom(value: Input[js.Array[Input[EnvFromSource]]]): Self = StObject.set(x, "envFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvFromUndefined: Self = StObject.set(x, "envFrom", js.undefined)
    
    @scala.inline
    def setEnvFromVarargs(value: Input[EnvFromSource]*): Self = StObject.set(x, "envFrom", js.Array(value :_*))
    
    @scala.inline
    def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    @scala.inline
    def setEnvVarargs(value: Input[EnvVar]*): Self = StObject.set(x, "env", js.Array(value :_*))
    
    @scala.inline
    def setImage(value: Input[String]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagePullPolicy(value: Input[String]): Self = StObject.set(x, "imagePullPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagePullPolicyUndefined: Self = StObject.set(x, "imagePullPolicy", js.undefined)
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setLifecycle(value: Input[Lifecycle]): Self = StObject.set(x, "lifecycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecycleUndefined: Self = StObject.set(x, "lifecycle", js.undefined)
    
    @scala.inline
    def setLivenessProbe(value: Input[Probe]): Self = StObject.set(x, "livenessProbe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLivenessProbeUndefined: Self = StObject.set(x, "livenessProbe", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPorts(value: Input[js.Array[Input[ContainerPort]]]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
    
    @scala.inline
    def setPortsVarargs(value: Input[ContainerPort]*): Self = StObject.set(x, "ports", js.Array(value :_*))
    
    @scala.inline
    def setReadinessProbe(value: Input[Probe]): Self = StObject.set(x, "readinessProbe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadinessProbeUndefined: Self = StObject.set(x, "readinessProbe", js.undefined)
    
    @scala.inline
    def setResources(value: Input[ResourceRequirements]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    @scala.inline
    def setSecurityContext(value: Input[SecurityContext]): Self = StObject.set(x, "securityContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityContextUndefined: Self = StObject.set(x, "securityContext", js.undefined)
    
    @scala.inline
    def setStartupProbe(value: Input[Probe]): Self = StObject.set(x, "startupProbe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartupProbeUndefined: Self = StObject.set(x, "startupProbe", js.undefined)
    
    @scala.inline
    def setStdin(value: Input[Boolean]): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdinOnce(value: Input[Boolean]): Self = StObject.set(x, "stdinOnce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdinOnceUndefined: Self = StObject.set(x, "stdinOnce", js.undefined)
    
    @scala.inline
    def setStdinUndefined: Self = StObject.set(x, "stdin", js.undefined)
    
    @scala.inline
    def setTerminationMessagePath(value: Input[String]): Self = StObject.set(x, "terminationMessagePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminationMessagePathUndefined: Self = StObject.set(x, "terminationMessagePath", js.undefined)
    
    @scala.inline
    def setTerminationMessagePolicy(value: Input[String]): Self = StObject.set(x, "terminationMessagePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminationMessagePolicyUndefined: Self = StObject.set(x, "terminationMessagePolicy", js.undefined)
    
    @scala.inline
    def setTty(value: Input[Boolean]): Self = StObject.set(x, "tty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTtyUndefined: Self = StObject.set(x, "tty", js.undefined)
    
    @scala.inline
    def setVolumeDevices(value: Input[js.Array[Input[VolumeDevice]]]): Self = StObject.set(x, "volumeDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeDevicesUndefined: Self = StObject.set(x, "volumeDevices", js.undefined)
    
    @scala.inline
    def setVolumeDevicesVarargs(value: Input[VolumeDevice]*): Self = StObject.set(x, "volumeDevices", js.Array(value :_*))
    
    @scala.inline
    def setVolumeMounts(value: Input[js.Array[Input[VolumeMount]]]): Self = StObject.set(x, "volumeMounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeMountsUndefined: Self = StObject.set(x, "volumeMounts", js.undefined)
    
    @scala.inline
    def setVolumeMountsVarargs(value: Input[VolumeMount]*): Self = StObject.set(x, "volumeMounts", js.Array(value :_*))
    
    @scala.inline
    def setWorkingDir(value: Input[String]): Self = StObject.set(x, "workingDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkingDirUndefined: Self = StObject.set(x, "workingDir", js.undefined)
  }
}
