package typingsSlinky.pulumiKubernetes.outputMod.extensions.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PodSecurityPolicySpec defines the policy enforced. Deprecated: use PodSecurityPolicySpec from
  * policy API Group instead.
  */
@js.native
trait PodSecurityPolicySpec extends js.Object {
  /**
    * allowPrivilegeEscalation determines if a pod can request to allow privilege escalation. If
    * unspecified, defaults to true.
    */
  val allowPrivilegeEscalation: Boolean = js.native
  /**
    * AllowedCSIDrivers is a whitelist of inline CSI drivers that must be explicitly set to be
    * embedded within a pod spec. An empty value indicates that any CSI driver can be used for
    * inline ephemeral volumes.
    */
  val allowedCSIDrivers: js.Array[AllowedCSIDriver] = js.native
  /**
    * allowedCapabilities is a list of capabilities that can be requested to add to the
    * container. Capabilities in this field may be added at the pod author's discretion. You must
    * not list a capability in both allowedCapabilities and requiredDropCapabilities.
    */
  val allowedCapabilities: js.Array[String] = js.native
  /**
    * allowedFlexVolumes is a whitelist of allowed Flexvolumes.  Empty or nil indicates that all
    * Flexvolumes may be used.  This parameter is effective only when the usage of the
    * Flexvolumes is allowed in the "volumes" field.
    */
  val allowedFlexVolumes: js.Array[AllowedFlexVolume] = js.native
  /**
    * allowedHostPaths is a white list of allowed host paths. Empty indicates that all host paths
    * may be used.
    */
  val allowedHostPaths: js.Array[AllowedHostPath] = js.native
  /**
    * AllowedProcMountTypes is a whitelist of allowed ProcMountTypes. Empty or nil indicates that
    * only the DefaultProcMountType may be used. This requires the ProcMountType feature flag to
    * be enabled.
    */
  val allowedProcMountTypes: js.Array[String] = js.native
  /**
    * allowedUnsafeSysctls is a list of explicitly allowed unsafe sysctls, defaults to none. Each
    * entry is either a plain sysctl name or ends in "*" in which case it is considered as a
    * prefix of allowed sysctls. Single * means all unsafe sysctls are allowed. Kubelet has to
    * whitelist all allowed unsafe sysctls explicitly to avoid rejection.
    *
    * Examples: e.g. "foo/ *" allows "foo/bar", "foo/baz", etc. e.g. "foo.*" allows "foo.bar",
    * "foo.baz", etc.
    */
  val allowedUnsafeSysctls: js.Array[String] = js.native
  /**
    * defaultAddCapabilities is the default set of capabilities that will be added to the
    * container unless the pod spec specifically drops the capability.  You may not list a
    * capability in both defaultAddCapabilities and requiredDropCapabilities. Capabilities added
    * here are implicitly allowed, and need not be included in the allowedCapabilities list.
    */
  val defaultAddCapabilities: js.Array[String] = js.native
  /**
    * defaultAllowPrivilegeEscalation controls the default setting for whether a process can gain
    * more privileges than its parent process.
    */
  val defaultAllowPrivilegeEscalation: Boolean = js.native
  /**
    * forbiddenSysctls is a list of explicitly forbidden sysctls, defaults to none. Each entry is
    * either a plain sysctl name or ends in "*" in which case it is considered as a prefix of
    * forbidden sysctls. Single * means all sysctls are forbidden.
    *
    * Examples: e.g. "foo/ *" forbids "foo/bar", "foo/baz", etc. e.g. "foo.*" forbids "foo.bar",
    * "foo.baz", etc.
    */
  val forbiddenSysctls: js.Array[String] = js.native
  /**
    * fsGroup is the strategy that will dictate what fs group is used by the SecurityContext.
    */
  val fsGroup: FSGroupStrategyOptions = js.native
  /**
    * hostIPC determines if the policy allows the use of HostIPC in the pod spec.
    */
  val hostIPC: Boolean = js.native
  /**
    * hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.
    */
  val hostNetwork: Boolean = js.native
  /**
    * hostPID determines if the policy allows the use of HostPID in the pod spec.
    */
  val hostPID: Boolean = js.native
  /**
    * hostPorts determines which host port ranges are allowed to be exposed.
    */
  val hostPorts: js.Array[HostPortRange] = js.native
  /**
    * privileged determines if a pod can request to be run as privileged.
    */
  val privileged: Boolean = js.native
  /**
    * readOnlyRootFilesystem when set to true will force containers to run with a read only root
    * file system.  If the container specifically requests to run with a non-read only root file
    * system the PSP should deny the pod. If set to false the container may run with a read only
    * root file system if it wishes but it will not be forced to.
    */
  val readOnlyRootFilesystem: Boolean = js.native
  /**
    * requiredDropCapabilities are the capabilities that will be dropped from the container.
    * These are required to be dropped and cannot be added.
    */
  val requiredDropCapabilities: js.Array[String] = js.native
  /**
    * RunAsGroup is the strategy that will dictate the allowable RunAsGroup values that may be
    * set. If this field is omitted, the pod's RunAsGroup can take any value. This field requires
    * the RunAsGroup feature gate to be enabled.
    */
  val runAsGroup: RunAsGroupStrategyOptions = js.native
  /**
    * runAsUser is the strategy that will dictate the allowable RunAsUser values that may be set.
    */
  val runAsUser: RunAsUserStrategyOptions = js.native
  /**
    * runtimeClass is the strategy that will dictate the allowable RuntimeClasses for a pod. If
    * this field is omitted, the pod's runtimeClassName field is unrestricted. Enforcement of
    * this field depends on the RuntimeClass feature gate being enabled.
    */
  val runtimeClass: RuntimeClassStrategyOptions = js.native
  /**
    * seLinux is the strategy that will dictate the allowable labels that may be set.
    */
  val seLinux: SELinuxStrategyOptions = js.native
  /**
    * supplementalGroups is the strategy that will dictate what supplemental groups are used by
    * the SecurityContext.
    */
  val supplementalGroups: SupplementalGroupsStrategyOptions = js.native
  /**
    * volumes is a white list of allowed volume plugins. Empty indicates that no volumes may be
    * used. To allow all volumes you may use '*'.
    */
  val volumes: js.Array[String] = js.native
}

object PodSecurityPolicySpec {
  @scala.inline
  def apply(
    allowPrivilegeEscalation: Boolean,
    allowedCSIDrivers: js.Array[AllowedCSIDriver],
    allowedCapabilities: js.Array[String],
    allowedFlexVolumes: js.Array[AllowedFlexVolume],
    allowedHostPaths: js.Array[AllowedHostPath],
    allowedProcMountTypes: js.Array[String],
    allowedUnsafeSysctls: js.Array[String],
    defaultAddCapabilities: js.Array[String],
    defaultAllowPrivilegeEscalation: Boolean,
    forbiddenSysctls: js.Array[String],
    fsGroup: FSGroupStrategyOptions,
    hostIPC: Boolean,
    hostNetwork: Boolean,
    hostPID: Boolean,
    hostPorts: js.Array[HostPortRange],
    privileged: Boolean,
    readOnlyRootFilesystem: Boolean,
    requiredDropCapabilities: js.Array[String],
    runAsGroup: RunAsGroupStrategyOptions,
    runAsUser: RunAsUserStrategyOptions,
    runtimeClass: RuntimeClassStrategyOptions,
    seLinux: SELinuxStrategyOptions,
    supplementalGroups: SupplementalGroupsStrategyOptions,
    volumes: js.Array[String]
  ): PodSecurityPolicySpec = {
    val __obj = js.Dynamic.literal(allowPrivilegeEscalation = allowPrivilegeEscalation.asInstanceOf[js.Any], allowedCSIDrivers = allowedCSIDrivers.asInstanceOf[js.Any], allowedCapabilities = allowedCapabilities.asInstanceOf[js.Any], allowedFlexVolumes = allowedFlexVolumes.asInstanceOf[js.Any], allowedHostPaths = allowedHostPaths.asInstanceOf[js.Any], allowedProcMountTypes = allowedProcMountTypes.asInstanceOf[js.Any], allowedUnsafeSysctls = allowedUnsafeSysctls.asInstanceOf[js.Any], defaultAddCapabilities = defaultAddCapabilities.asInstanceOf[js.Any], defaultAllowPrivilegeEscalation = defaultAllowPrivilegeEscalation.asInstanceOf[js.Any], forbiddenSysctls = forbiddenSysctls.asInstanceOf[js.Any], fsGroup = fsGroup.asInstanceOf[js.Any], hostIPC = hostIPC.asInstanceOf[js.Any], hostNetwork = hostNetwork.asInstanceOf[js.Any], hostPID = hostPID.asInstanceOf[js.Any], hostPorts = hostPorts.asInstanceOf[js.Any], privileged = privileged.asInstanceOf[js.Any], readOnlyRootFilesystem = readOnlyRootFilesystem.asInstanceOf[js.Any], requiredDropCapabilities = requiredDropCapabilities.asInstanceOf[js.Any], runAsGroup = runAsGroup.asInstanceOf[js.Any], runAsUser = runAsUser.asInstanceOf[js.Any], runtimeClass = runtimeClass.asInstanceOf[js.Any], seLinux = seLinux.asInstanceOf[js.Any], supplementalGroups = supplementalGroups.asInstanceOf[js.Any], volumes = volumes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodSecurityPolicySpec]
  }
  @scala.inline
  implicit class PodSecurityPolicySpecOps[Self <: PodSecurityPolicySpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowPrivilegeEscalation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPrivilegeEscalation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowedCSIDrivers(value: js.Array[AllowedCSIDriver]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedCSIDrivers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowedCapabilities(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedCapabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowedFlexVolumes(value: js.Array[AllowedFlexVolume]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedFlexVolumes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowedHostPaths(value: js.Array[AllowedHostPath]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedHostPaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowedProcMountTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedProcMountTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowedUnsafeSysctls(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedUnsafeSysctls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultAddCapabilities(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultAddCapabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultAllowPrivilegeEscalation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultAllowPrivilegeEscalation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForbiddenSysctls(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forbiddenSysctls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFsGroup(value: FSGroupStrategyOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fsGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostIPC(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostIPC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostNetwork(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostNetwork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostPID(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostPID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostPorts(value: js.Array[HostPortRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostPorts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivileged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privileged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadOnlyRootFilesystem(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnlyRootFilesystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequiredDropCapabilities(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredDropCapabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunAsGroup(value: RunAsGroupStrategyOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runAsGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunAsUser(value: RunAsUserStrategyOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runAsUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuntimeClass(value: RuntimeClassStrategyOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtimeClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeLinux(value: SELinuxStrategyOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seLinux")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupplementalGroups(value: SupplementalGroupsStrategyOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supplementalGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVolumes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

