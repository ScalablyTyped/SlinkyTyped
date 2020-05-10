package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PodSecurityContext holds pod-level security attributes and common container settings. Some
  * fields are also present in container.securityContext.  Field values of
  * container.securityContext take precedence over field values of PodSecurityContext.
  */
@js.native
trait PodSecurityContext extends js.Object {
  /**
    * A special supplemental group that applies to all containers in a pod. Some volume types
    * allow the Kubelet to change the ownership of that volume to be owned by the pod:
    *
    * 1. The owning GID will be the FSGroup 2. The setgid bit is set (new files created in the
    * volume will be owned by FSGroup) 3. The permission bits are OR'd with rw-rw----
    *
    * If unset, the Kubelet will not modify the ownership and permissions of any volume.
    */
  var fsGroup: js.UndefOr[Input[Double]] = js.native
  /**
    * The GID to run the entrypoint of the container process. Uses runtime default if unset. May
    * also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the
    * value specified in SecurityContext takes precedence for that container.
    */
  var runAsGroup: js.UndefOr[Input[Double]] = js.native
  /**
    * Indicates that the container must run as a non-root user. If true, the Kubelet will
    * validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to
    * start the container if it does. If unset or false, no such validation will be performed.
    * May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext,
    * the value specified in SecurityContext takes precedence.
    */
  var runAsNonRoot: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The UID to run the entrypoint of the container process. Defaults to user specified in image
    * metadata if unspecified. May also be set in SecurityContext.  If set in both
    * SecurityContext and PodSecurityContext, the value specified in SecurityContext takes
    * precedence for that container.
    */
  var runAsUser: js.UndefOr[Input[Double]] = js.native
  /**
    * The SELinux context to be applied to all containers. If unspecified, the container runtime
    * will allocate a random SELinux context for each container.  May also be set in
    * SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value
    * specified in SecurityContext takes precedence for that container.
    */
  var seLinuxOptions: js.UndefOr[Input[SELinuxOptions]] = js.native
  /**
    * A list of groups applied to the first process run in each container, in addition to the
    * container's primary GID.  If unspecified, no groups will be added to any container.
    */
  var supplementalGroups: js.UndefOr[Input[js.Array[Input[Double]]]] = js.native
  /**
    * Sysctls hold a list of namespaced sysctls used for the pod. Pods with unsupported sysctls
    * (by the container runtime) might fail to launch.
    */
  var sysctls: js.UndefOr[Input[js.Array[Input[Sysctl]]]] = js.native
  /**
    * The Windows specific settings applied to all containers. If unspecified, the options within
    * a container's SecurityContext will be used. If set in both SecurityContext and
    * PodSecurityContext, the value specified in SecurityContext takes precedence.
    */
  var windowsOptions: js.UndefOr[Input[WindowsSecurityContextOptions]] = js.native
}

object PodSecurityContext {
  @scala.inline
  def apply(): PodSecurityContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PodSecurityContext]
  }
  @scala.inline
  implicit class PodSecurityContextOps[Self <: PodSecurityContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFsGroup(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fsGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFsGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fsGroup")(js.undefined)
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
    def withSupplementalGroups(value: Input[js.Array[Input[Double]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supplementalGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupplementalGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supplementalGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withSysctls(value: Input[js.Array[Input[Sysctl]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sysctls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSysctls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sysctls")(js.undefined)
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

