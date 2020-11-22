package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SecurityContext holds security configuration that will be applied to a container. Some fields are present in both SecurityContext and PodSecurityContext.  When both are set, the values in SecurityContext take precedence.
  */
@js.native
trait SecurityContext extends js.Object {
  
  /**
    * AllowPrivilegeEscalation controls whether a process can gain more privileges than its parent process. This bool directly controls if the no_new_privs flag will be set on the container process. AllowPrivilegeEscalation is true always when the container is: 1) run as Privileged 2) has CAP_SYS_ADMIN
    */
  var allowPrivilegeEscalation: Boolean = js.native
  
  /**
    * The capabilities to add/drop when running containers. Defaults to the default set of capabilities granted by the container runtime.
    */
  var capabilities: Capabilities = js.native
  
  /**
    * Run container in privileged mode. Processes in privileged containers are essentially equivalent to root on the host. Defaults to false.
    */
  var privileged: Boolean = js.native
  
  /**
    * procMount denotes the type of proc mount to use for the containers. The default is DefaultProcMount which uses the container runtime defaults for readonly paths and masked paths. This requires the ProcMountType feature flag to be enabled.
    */
  var procMount: String = js.native
  
  /**
    * Whether this container has a read-only root filesystem. Default is false.
    */
  var readOnlyRootFilesystem: Boolean = js.native
  
  /**
    * The GID to run the entrypoint of the container process. Uses runtime default if unset. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
    */
  var runAsGroup: Double = js.native
  
  /**
    * Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
    */
  var runAsNonRoot: Boolean = js.native
  
  /**
    * The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
    */
  var runAsUser: Double = js.native
  
  /**
    * The SELinux context to be applied to the container. If unspecified, the container runtime will allocate a random SELinux context for each container.  May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
    */
  var seLinuxOptions: SELinuxOptions = js.native
  
  /**
    * The seccomp options to use by this container. If seccomp options are provided at both the pod & container level, the container options override the pod options.
    */
  var seccompProfile: SeccompProfile = js.native
  
  /**
    * The Windows specific settings applied to all containers. If unspecified, the options from the PodSecurityContext will be used. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
    */
  var windowsOptions: WindowsSecurityContextOptions = js.native
}
object SecurityContext {
  
  @scala.inline
  def apply(
    allowPrivilegeEscalation: Boolean,
    capabilities: Capabilities,
    privileged: Boolean,
    procMount: String,
    readOnlyRootFilesystem: Boolean,
    runAsGroup: Double,
    runAsNonRoot: Boolean,
    runAsUser: Double,
    seLinuxOptions: SELinuxOptions,
    seccompProfile: SeccompProfile,
    windowsOptions: WindowsSecurityContextOptions
  ): SecurityContext = {
    val __obj = js.Dynamic.literal(allowPrivilegeEscalation = allowPrivilegeEscalation.asInstanceOf[js.Any], capabilities = capabilities.asInstanceOf[js.Any], privileged = privileged.asInstanceOf[js.Any], procMount = procMount.asInstanceOf[js.Any], readOnlyRootFilesystem = readOnlyRootFilesystem.asInstanceOf[js.Any], runAsGroup = runAsGroup.asInstanceOf[js.Any], runAsNonRoot = runAsNonRoot.asInstanceOf[js.Any], runAsUser = runAsUser.asInstanceOf[js.Any], seLinuxOptions = seLinuxOptions.asInstanceOf[js.Any], seccompProfile = seccompProfile.asInstanceOf[js.Any], windowsOptions = windowsOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityContext]
  }
  
  @scala.inline
  implicit class SecurityContextOps[Self <: SecurityContext] (val x: Self) extends AnyVal {
    
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
    def setAllowPrivilegeEscalation(value: Boolean): Self = this.set("allowPrivilegeEscalation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapabilities(value: Capabilities): Self = this.set("capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivileged(value: Boolean): Self = this.set("privileged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcMount(value: String): Self = this.set("procMount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyRootFilesystem(value: Boolean): Self = this.set("readOnlyRootFilesystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunAsGroup(value: Double): Self = this.set("runAsGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunAsNonRoot(value: Boolean): Self = this.set("runAsNonRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunAsUser(value: Double): Self = this.set("runAsUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeLinuxOptions(value: SELinuxOptions): Self = this.set("seLinuxOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeccompProfile(value: SeccompProfile): Self = this.set("seccompProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowsOptions(value: WindowsSecurityContextOptions): Self = this.set("windowsOptions", value.asInstanceOf[js.Any])
  }
}
