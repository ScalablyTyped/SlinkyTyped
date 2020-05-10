package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SecurityContext holds security configuration that will be applied to a container. Some fields
  * are present in both SecurityContext and PodSecurityContext.  When both are set, the values in
  * SecurityContext take precedence.
  */
@js.native
trait SecurityContext extends js.Object {
  /**
    * AllowPrivilegeEscalation controls whether a process can gain more privileges than its
    * parent process. This bool directly controls if the no_new_privs flag will be set on the
    * container process. AllowPrivilegeEscalation is true always when the container is: 1) run as
    * Privileged 2) has CAP_SYS_ADMIN
    */
  var allowPrivilegeEscalation: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The capabilities to add/drop when running containers. Defaults to the default set of
    * capabilities granted by the container runtime.
    */
  var capabilities: js.UndefOr[Input[Capabilities]] = js.native
  /**
    * Run container in privileged mode. Processes in privileged containers are essentially
    * equivalent to root on the host. Defaults to false.
    */
  var privileged: js.UndefOr[Input[Boolean]] = js.native
  /**
    * procMount denotes the type of proc mount to use for the containers. The default is
    * DefaultProcMount which uses the container runtime defaults for readonly paths and masked
    * paths. This requires the ProcMountType feature flag to be enabled.
    */
  var procMount: js.UndefOr[Input[String]] = js.native
  /**
    * Whether this container has a read-only root filesystem. Default is false.
    */
  var readOnlyRootFilesystem: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The GID to run the entrypoint of the container process. Uses runtime default if unset. May
    * also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext,
    * the value specified in SecurityContext takes precedence.
    */
  var runAsGroup: js.UndefOr[Input[Double]] = js.native
  /**
    * Indicates that the container must run as a non-root user. If true, the Kubelet will
    * validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to
    * start the container if it does. If unset or false, no such validation will be performed.
    * May also be set in PodSecurityContext.  If set in both SecurityContext and
    * PodSecurityContext, the value specified in SecurityContext takes precedence.
    */
  var runAsNonRoot: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The UID to run the entrypoint of the container process. Defaults to user specified in image
    * metadata if unspecified. May also be set in PodSecurityContext.  If set in both
    * SecurityContext and PodSecurityContext, the value specified in SecurityContext takes
    * precedence.
    */
  var runAsUser: js.UndefOr[Input[Double]] = js.native
  /**
    * The SELinux context to be applied to the container. If unspecified, the container runtime
    * will allocate a random SELinux context for each container.  May also be set in
    * PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value
    * specified in SecurityContext takes precedence.
    */
  var seLinuxOptions: js.UndefOr[Input[SELinuxOptions]] = js.native
  /**
    * The Windows specific settings applied to all containers. If unspecified, the options from
    * the PodSecurityContext will be used. If set in both SecurityContext and PodSecurityContext,
    * the value specified in SecurityContext takes precedence.
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
    def withAllowPrivilegeEscalation(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPrivilegeEscalation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowPrivilegeEscalation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPrivilegeEscalation")(js.undefined)
        ret
    }
    @scala.inline
    def withCapabilities(value: Input[Capabilities]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapabilities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capabilities")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivileged(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privileged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivileged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privileged")(js.undefined)
        ret
    }
    @scala.inline
    def withProcMount(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("procMount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcMount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("procMount")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnlyRootFilesystem(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnlyRootFilesystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnlyRootFilesystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnlyRootFilesystem")(js.undefined)
        ret
    }
    @scala.inline
    def withRunAsGroup(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runAsGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunAsGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runAsGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withRunAsNonRoot(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runAsNonRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunAsNonRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runAsNonRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withRunAsUser(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runAsUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunAsUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runAsUser")(js.undefined)
        ret
    }
    @scala.inline
    def withSeLinuxOptions(value: Input[SELinuxOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seLinuxOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeLinuxOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seLinuxOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowsOptions(value: Input[WindowsSecurityContextOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowsOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowsOptions")(js.undefined)
        ret
    }
  }
  
}

