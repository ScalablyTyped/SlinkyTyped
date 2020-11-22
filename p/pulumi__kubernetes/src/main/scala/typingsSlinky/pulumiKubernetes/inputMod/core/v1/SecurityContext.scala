package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
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
  var allowPrivilegeEscalation: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The capabilities to add/drop when running containers. Defaults to the default set of capabilities granted by the container runtime.
    */
  var capabilities: js.UndefOr[Input[Capabilities]] = js.native
  
  /**
    * Run container in privileged mode. Processes in privileged containers are essentially equivalent to root on the host. Defaults to false.
    */
  var privileged: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * procMount denotes the type of proc mount to use for the containers. The default is DefaultProcMount which uses the container runtime defaults for readonly paths and masked paths. This requires the ProcMountType feature flag to be enabled.
    */
  var procMount: js.UndefOr[Input[String]] = js.native
  
  /**
    * Whether this container has a read-only root filesystem. Default is false.
    */
  var readOnlyRootFilesystem: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The GID to run the entrypoint of the container process. Uses runtime default if unset. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
    */
  var runAsGroup: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
    */
  var runAsNonRoot: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
    */
  var runAsUser: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The SELinux context to be applied to the container. If unspecified, the container runtime will allocate a random SELinux context for each container.  May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
    */
  var seLinuxOptions: js.UndefOr[Input[SELinuxOptions]] = js.native
  
  /**
    * The seccomp options to use by this container. If seccomp options are provided at both the pod & container level, the container options override the pod options.
    */
  var seccompProfile: js.UndefOr[Input[SeccompProfile]] = js.native
  
  /**
    * The Windows specific settings applied to all containers. If unspecified, the options from the PodSecurityContext will be used. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
    */
  var windowsOptions: js.UndefOr[Input[WindowsSecurityContextOptions]] = js.native
}
object SecurityContext {
  
  @scala.inline
  def apply(): SecurityContext = {
    val __obj = js.Dynamic.literal()
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
    def setAllowPrivilegeEscalation(value: Input[Boolean]): Self = this.set("allowPrivilegeEscalation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowPrivilegeEscalation: Self = this.set("allowPrivilegeEscalation", js.undefined)
    
    @scala.inline
    def setCapabilities(value: Input[Capabilities]): Self = this.set("capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapabilities: Self = this.set("capabilities", js.undefined)
    
    @scala.inline
    def setPrivileged(value: Input[Boolean]): Self = this.set("privileged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivileged: Self = this.set("privileged", js.undefined)
    
    @scala.inline
    def setProcMount(value: Input[String]): Self = this.set("procMount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcMount: Self = this.set("procMount", js.undefined)
    
    @scala.inline
    def setReadOnlyRootFilesystem(value: Input[Boolean]): Self = this.set("readOnlyRootFilesystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnlyRootFilesystem: Self = this.set("readOnlyRootFilesystem", js.undefined)
    
    @scala.inline
    def setRunAsGroup(value: Input[Double]): Self = this.set("runAsGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunAsGroup: Self = this.set("runAsGroup", js.undefined)
    
    @scala.inline
    def setRunAsNonRoot(value: Input[Boolean]): Self = this.set("runAsNonRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunAsNonRoot: Self = this.set("runAsNonRoot", js.undefined)
    
    @scala.inline
    def setRunAsUser(value: Input[Double]): Self = this.set("runAsUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunAsUser: Self = this.set("runAsUser", js.undefined)
    
    @scala.inline
    def setSeLinuxOptions(value: Input[SELinuxOptions]): Self = this.set("seLinuxOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeLinuxOptions: Self = this.set("seLinuxOptions", js.undefined)
    
    @scala.inline
    def setSeccompProfile(value: Input[SeccompProfile]): Self = this.set("seccompProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeccompProfile: Self = this.set("seccompProfile", js.undefined)
    
    @scala.inline
    def setWindowsOptions(value: Input[WindowsSecurityContextOptions]): Self = this.set("windowsOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowsOptions: Self = this.set("windowsOptions", js.undefined)
  }
}
