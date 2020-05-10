package typingsSlinky.pulumiKubernetes.inputMod.extensions.v1beta1

import typingsSlinky.pulumiPulumi.outputMod.Input
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
  var allowPrivilegeEscalation: js.UndefOr[Input[Boolean]] = js.native
  /**
    * AllowedCSIDrivers is a whitelist of inline CSI drivers that must be explicitly set to be
    * embedded within a pod spec. An empty value indicates that any CSI driver can be used for
    * inline ephemeral volumes.
    */
  var allowedCSIDrivers: js.UndefOr[Input[js.Array[Input[AllowedCSIDriver]]]] = js.native
  /**
    * allowedCapabilities is a list of capabilities that can be requested to add to the
    * container. Capabilities in this field may be added at the pod author's discretion. You must
    * not list a capability in both allowedCapabilities and requiredDropCapabilities.
    */
  var allowedCapabilities: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * allowedFlexVolumes is a whitelist of allowed Flexvolumes.  Empty or nil indicates that all
    * Flexvolumes may be used.  This parameter is effective only when the usage of the
    * Flexvolumes is allowed in the "volumes" field.
    */
  var allowedFlexVolumes: js.UndefOr[Input[js.Array[Input[AllowedFlexVolume]]]] = js.native
  /**
    * allowedHostPaths is a white list of allowed host paths. Empty indicates that all host paths
    * may be used.
    */
  var allowedHostPaths: js.UndefOr[Input[js.Array[Input[AllowedHostPath]]]] = js.native
  /**
    * AllowedProcMountTypes is a whitelist of allowed ProcMountTypes. Empty or nil indicates that
    * only the DefaultProcMountType may be used. This requires the ProcMountType feature flag to
    * be enabled.
    */
  var allowedProcMountTypes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * allowedUnsafeSysctls is a list of explicitly allowed unsafe sysctls, defaults to none. Each
    * entry is either a plain sysctl name or ends in "*" in which case it is considered as a
    * prefix of allowed sysctls. Single * means all unsafe sysctls are allowed. Kubelet has to
    * whitelist all allowed unsafe sysctls explicitly to avoid rejection.
    *
    * Examples: e.g. "foo/ *" allows "foo/bar", "foo/baz", etc. e.g. "foo.*" allows "foo.bar",
    * "foo.baz", etc.
    */
  var allowedUnsafeSysctls: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * defaultAddCapabilities is the default set of capabilities that will be added to the
    * container unless the pod spec specifically drops the capability.  You may not list a
    * capability in both defaultAddCapabilities and requiredDropCapabilities. Capabilities added
    * here are implicitly allowed, and need not be included in the allowedCapabilities list.
    */
  var defaultAddCapabilities: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * defaultAllowPrivilegeEscalation controls the default setting for whether a process can gain
    * more privileges than its parent process.
    */
  var defaultAllowPrivilegeEscalation: js.UndefOr[Input[Boolean]] = js.native
  /**
    * forbiddenSysctls is a list of explicitly forbidden sysctls, defaults to none. Each entry is
    * either a plain sysctl name or ends in "*" in which case it is considered as a prefix of
    * forbidden sysctls. Single * means all sysctls are forbidden.
    *
    * Examples: e.g. "foo/ *" forbids "foo/bar", "foo/baz", etc. e.g. "foo.*" forbids "foo.bar",
    * "foo.baz", etc.
    */
  var forbiddenSysctls: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * fsGroup is the strategy that will dictate what fs group is used by the SecurityContext.
    */
  var fsGroup: Input[FSGroupStrategyOptions] = js.native
  /**
    * hostIPC determines if the policy allows the use of HostIPC in the pod spec.
    */
  var hostIPC: js.UndefOr[Input[Boolean]] = js.native
  /**
    * hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.
    */
  var hostNetwork: js.UndefOr[Input[Boolean]] = js.native
  /**
    * hostPID determines if the policy allows the use of HostPID in the pod spec.
    */
  var hostPID: js.UndefOr[Input[Boolean]] = js.native
  /**
    * hostPorts determines which host port ranges are allowed to be exposed.
    */
  var hostPorts: js.UndefOr[Input[js.Array[Input[HostPortRange]]]] = js.native
  /**
    * privileged determines if a pod can request to be run as privileged.
    */
  var privileged: js.UndefOr[Input[Boolean]] = js.native
  /**
    * readOnlyRootFilesystem when set to true will force containers to run with a read only root
    * file system.  If the container specifically requests to run with a non-read only root file
    * system the PSP should deny the pod. If set to false the container may run with a read only
    * root file system if it wishes but it will not be forced to.
    */
  var readOnlyRootFilesystem: js.UndefOr[Input[Boolean]] = js.native
  /**
    * requiredDropCapabilities are the capabilities that will be dropped from the container.
    * These are required to be dropped and cannot be added.
    */
  var requiredDropCapabilities: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * RunAsGroup is the strategy that will dictate the allowable RunAsGroup values that may be
    * set. If this field is omitted, the pod's RunAsGroup can take any value. This field requires
    * the RunAsGroup feature gate to be enabled.
    */
  var runAsGroup: js.UndefOr[Input[RunAsGroupStrategyOptions]] = js.native
  /**
    * runAsUser is the strategy that will dictate the allowable RunAsUser values that may be set.
    */
  var runAsUser: Input[RunAsUserStrategyOptions] = js.native
  /**
    * runtimeClass is the strategy that will dictate the allowable RuntimeClasses for a pod. If
    * this field is omitted, the pod's runtimeClassName field is unrestricted. Enforcement of
    * this field depends on the RuntimeClass feature gate being enabled.
    */
  var runtimeClass: js.UndefOr[Input[RuntimeClassStrategyOptions]] = js.native
  /**
    * seLinux is the strategy that will dictate the allowable labels that may be set.
    */
  var seLinux: Input[SELinuxStrategyOptions] = js.native
  /**
    * supplementalGroups is the strategy that will dictate what supplemental groups are used by
    * the SecurityContext.
    */
  var supplementalGroups: Input[SupplementalGroupsStrategyOptions] = js.native
  /**
    * volumes is a white list of allowed volume plugins. Empty indicates that no volumes may be
    * used. To allow all volumes you may use '*'.
    */
  var volumes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object PodSecurityPolicySpec {
  @scala.inline
  def apply(
    fsGroup: Input[FSGroupStrategyOptions],
    runAsUser: Input[RunAsUserStrategyOptions],
    seLinux: Input[SELinuxStrategyOptions],
    supplementalGroups: Input[SupplementalGroupsStrategyOptions]
  ): PodSecurityPolicySpec = {
    val __obj = js.Dynamic.literal(fsGroup = fsGroup.asInstanceOf[js.Any], runAsUser = runAsUser.asInstanceOf[js.Any], seLinux = seLinux.asInstanceOf[js.Any], supplementalGroups = supplementalGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodSecurityPolicySpec]
  }
  @scala.inline
  implicit class PodSecurityPolicySpecOps[Self <: PodSecurityPolicySpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFsGroup(value: Input[FSGroupStrategyOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fsGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunAsUser(value: Input[RunAsUserStrategyOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runAsUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeLinux(value: Input[SELinuxStrategyOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seLinux")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupplementalGroups(value: Input[SupplementalGroupsStrategyOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supplementalGroups")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withAllowedCSIDrivers(value: Input[js.Array[Input[AllowedCSIDriver]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedCSIDrivers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedCSIDrivers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedCSIDrivers")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowedCapabilities(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedCapabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedCapabilities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedCapabilities")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowedFlexVolumes(value: Input[js.Array[Input[AllowedFlexVolume]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedFlexVolumes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedFlexVolumes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedFlexVolumes")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowedHostPaths(value: Input[js.Array[Input[AllowedHostPath]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedHostPaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedHostPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedHostPaths")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowedProcMountTypes(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedProcMountTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedProcMountTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedProcMountTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowedUnsafeSysctls(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedUnsafeSysctls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedUnsafeSysctls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedUnsafeSysctls")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultAddCapabilities(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultAddCapabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultAddCapabilities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultAddCapabilities")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultAllowPrivilegeEscalation(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultAllowPrivilegeEscalation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultAllowPrivilegeEscalation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultAllowPrivilegeEscalation")(js.undefined)
        ret
    }
    @scala.inline
    def withForbiddenSysctls(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forbiddenSysctls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForbiddenSysctls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forbiddenSysctls")(js.undefined)
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
    def withHostPorts(value: Input[js.Array[Input[HostPortRange]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostPorts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostPorts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostPorts")(js.undefined)
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
    def withRequiredDropCapabilities(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredDropCapabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequiredDropCapabilities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredDropCapabilities")(js.undefined)
        ret
    }
    @scala.inline
    def withRunAsGroup(value: Input[RunAsGroupStrategyOptions]): Self = {
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
    def withRuntimeClass(value: Input[RuntimeClassStrategyOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtimeClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuntimeClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtimeClass")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumes(value: Input[js.Array[Input[String]]]): Self = {
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

