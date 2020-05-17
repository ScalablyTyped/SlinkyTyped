package typingsSlinky.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostConfig extends js.Object {
  var AutoRemove: js.UndefOr[Boolean] = js.native
  var Binds: js.UndefOr[js.Array[String]] = js.native
  var BlkioDeviceReadBps: js.UndefOr[js.Any] = js.native
  var BlkioDeviceReadIOps: js.UndefOr[js.Any] = js.native
  var BlkioDeviceWriteBps: js.UndefOr[js.Any] = js.native
  var BlkioDeviceWriteIOps: js.UndefOr[js.Any] = js.native
  var BlkioWeight: js.UndefOr[Double] = js.native
  var BlkioWeightDevice: js.UndefOr[js.Any] = js.native
  var CapAdd: js.UndefOr[js.Any] = js.native
  var CapDrop: js.UndefOr[js.Any] = js.native
  var Cgroup: js.UndefOr[String] = js.native
  var CgroupParent: js.UndefOr[String] = js.native
  var ConsoleSize: js.UndefOr[js.Array[Double]] = js.native
  var ContainerIDFile: js.UndefOr[String] = js.native
  var CpuPeriod: js.UndefOr[Double] = js.native
  var CpuQuota: js.UndefOr[Double] = js.native
  var CpuShares: js.UndefOr[Double] = js.native
  var CpusetCpus: js.UndefOr[String] = js.native
  var CpusetMems: js.UndefOr[String] = js.native
  var DeviceCgroupRules: js.UndefOr[js.Array[String]] = js.native
  var DeviceRequests: js.UndefOr[js.Array[DeviceRequest]] = js.native
  var Devices: js.UndefOr[js.Any] = js.native
  var DiskQuota: js.UndefOr[Double] = js.native
  var Dns: js.UndefOr[js.Array[_]] = js.native
  var DnsOptions: js.UndefOr[js.Array[_]] = js.native
  var DnsSearch: js.UndefOr[js.Array[_]] = js.native
  var ExtraHosts: js.UndefOr[js.Any] = js.native
  var GroupAdd: js.UndefOr[js.Array[String]] = js.native
  var IpcMode: js.UndefOr[String] = js.native
  var Isolation: js.UndefOr[String] = js.native
  var KernelMemory: js.UndefOr[Double] = js.native
  var Links: js.UndefOr[js.Any] = js.native
  var LogConfig: js.UndefOr[typingsSlinky.dockerode.anon.Config] = js.native
  var MaskedPaths: js.UndefOr[js.Array[String]] = js.native
  var Memory: js.UndefOr[Double] = js.native
  var MemoryReservation: js.UndefOr[Double] = js.native
  var MemorySwap: js.UndefOr[Double] = js.native
  var MemorySwappiness: js.UndefOr[Double] = js.native
  var Mounts: js.UndefOr[MountConfig] = js.native
  var NetworkMode: js.UndefOr[String] = js.native
  var OomKillDisable: js.UndefOr[Boolean] = js.native
  var OomScoreAdj: js.UndefOr[Double] = js.native
  var PidMode: js.UndefOr[String] = js.native
  var PidsLimit: js.UndefOr[Double] = js.native
  var PortBindings: js.UndefOr[js.Any] = js.native
  var Privileged: js.UndefOr[Boolean] = js.native
  var PublishAllPorts: js.UndefOr[Boolean] = js.native
  var ReadonlyPaths: js.UndefOr[js.Array[String]] = js.native
  var ReadonlyRootfs: js.UndefOr[Boolean] = js.native
  var RestartPolicy: js.UndefOr[typingsSlinky.dockerode.mod.RestartPolicy] = js.native
  var Runtime: js.UndefOr[String] = js.native
  var SecurityOpt: js.UndefOr[js.Any] = js.native
  var ShmSize: js.UndefOr[Double] = js.native
  var StorageOpt: js.UndefOr[StringDictionary[String]] = js.native
  var Sysctls: js.UndefOr[StringDictionary[String]] = js.native
  var Tmpfs: js.UndefOr[StringDictionary[String]] = js.native
  var UTSMode: js.UndefOr[String] = js.native
  var Ulimits: js.UndefOr[js.Any] = js.native
  var UsernsMode: js.UndefOr[String] = js.native
  var VolumeDriver: js.UndefOr[String] = js.native
  var VolumesFrom: js.UndefOr[js.Any] = js.native
}

object HostConfig {
  @scala.inline
  def apply(): HostConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostConfig]
  }
  @scala.inline
  implicit class HostConfigOps[Self <: HostConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoRemove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoRemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoRemove")(js.undefined)
        ret
    }
    @scala.inline
    def withBinds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Binds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Binds")(js.undefined)
        ret
    }
    @scala.inline
    def withBlkioDeviceReadBps(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlkioDeviceReadBps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlkioDeviceReadBps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlkioDeviceReadBps")(js.undefined)
        ret
    }
    @scala.inline
    def withBlkioDeviceReadIOps(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlkioDeviceReadIOps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlkioDeviceReadIOps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlkioDeviceReadIOps")(js.undefined)
        ret
    }
    @scala.inline
    def withBlkioDeviceWriteBps(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlkioDeviceWriteBps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlkioDeviceWriteBps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlkioDeviceWriteBps")(js.undefined)
        ret
    }
    @scala.inline
    def withBlkioDeviceWriteIOps(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlkioDeviceWriteIOps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlkioDeviceWriteIOps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlkioDeviceWriteIOps")(js.undefined)
        ret
    }
    @scala.inline
    def withBlkioWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlkioWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlkioWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlkioWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withBlkioWeightDevice(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlkioWeightDevice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlkioWeightDevice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlkioWeightDevice")(js.undefined)
        ret
    }
    @scala.inline
    def withCapAdd(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CapAdd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CapAdd")(js.undefined)
        ret
    }
    @scala.inline
    def withCapDrop(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CapDrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CapDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withCgroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cgroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCgroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cgroup")(js.undefined)
        ret
    }
    @scala.inline
    def withCgroupParent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CgroupParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCgroupParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CgroupParent")(js.undefined)
        ret
    }
    @scala.inline
    def withConsoleSize(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConsoleSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsoleSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConsoleSize")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerIDFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContainerIDFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerIDFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContainerIDFile")(js.undefined)
        ret
    }
    @scala.inline
    def withCpuPeriod(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CpuPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpuPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CpuPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withCpuQuota(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CpuQuota")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpuQuota: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CpuQuota")(js.undefined)
        ret
    }
    @scala.inline
    def withCpuShares(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CpuShares")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpuShares: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CpuShares")(js.undefined)
        ret
    }
    @scala.inline
    def withCpusetCpus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CpusetCpus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpusetCpus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CpusetCpus")(js.undefined)
        ret
    }
    @scala.inline
    def withCpusetMems(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CpusetMems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpusetMems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CpusetMems")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceCgroupRules(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceCgroupRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceCgroupRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceCgroupRules")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceRequests(value: js.Array[DeviceRequest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceRequests")(js.undefined)
        ret
    }
    @scala.inline
    def withDevices(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Devices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Devices")(js.undefined)
        ret
    }
    @scala.inline
    def withDiskQuota(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DiskQuota")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiskQuota: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DiskQuota")(js.undefined)
        ret
    }
    @scala.inline
    def withDns(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dns")(js.undefined)
        ret
    }
    @scala.inline
    def withDnsOptions(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DnsOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDnsOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DnsOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withDnsSearch(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DnsSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDnsSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DnsSearch")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraHosts(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtraHosts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraHosts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtraHosts")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupAdd(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupAdd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupAdd")(js.undefined)
        ret
    }
    @scala.inline
    def withIpcMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpcMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpcMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpcMode")(js.undefined)
        ret
    }
    @scala.inline
    def withIsolation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Isolation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsolation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Isolation")(js.undefined)
        ret
    }
    @scala.inline
    def withKernelMemory(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KernelMemory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKernelMemory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KernelMemory")(js.undefined)
        ret
    }
    @scala.inline
    def withLinks(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Links")(js.undefined)
        ret
    }
    @scala.inline
    def withLogConfig(value: typingsSlinky.dockerode.anon.Config): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskedPaths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaskedPaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskedPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaskedPaths")(js.undefined)
        ret
    }
    @scala.inline
    def withMemory(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Memory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Memory")(js.undefined)
        ret
    }
    @scala.inline
    def withMemoryReservation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemoryReservation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemoryReservation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemoryReservation")(js.undefined)
        ret
    }
    @scala.inline
    def withMemorySwap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemorySwap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemorySwap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemorySwap")(js.undefined)
        ret
    }
    @scala.inline
    def withMemorySwappiness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemorySwappiness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemorySwappiness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemorySwappiness")(js.undefined)
        ret
    }
    @scala.inline
    def withMounts(value: MountConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mounts")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkMode")(js.undefined)
        ret
    }
    @scala.inline
    def withOomKillDisable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OomKillDisable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOomKillDisable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OomKillDisable")(js.undefined)
        ret
    }
    @scala.inline
    def withOomScoreAdj(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OomScoreAdj")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOomScoreAdj: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OomScoreAdj")(js.undefined)
        ret
    }
    @scala.inline
    def withPidMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PidMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPidMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PidMode")(js.undefined)
        ret
    }
    @scala.inline
    def withPidsLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PidsLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPidsLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PidsLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withPortBindings(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PortBindings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortBindings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PortBindings")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivileged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Privileged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivileged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Privileged")(js.undefined)
        ret
    }
    @scala.inline
    def withPublishAllPorts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublishAllPorts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublishAllPorts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublishAllPorts")(js.undefined)
        ret
    }
    @scala.inline
    def withReadonlyPaths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadonlyPaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadonlyPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadonlyPaths")(js.undefined)
        ret
    }
    @scala.inline
    def withReadonlyRootfs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadonlyRootfs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadonlyRootfs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadonlyRootfs")(js.undefined)
        ret
    }
    @scala.inline
    def withRestartPolicy(value: RestartPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestartPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestartPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestartPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withRuntime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Runtime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuntime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Runtime")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityOpt(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityOpt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityOpt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityOpt")(js.undefined)
        ret
    }
    @scala.inline
    def withShmSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShmSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShmSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShmSize")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageOpt(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageOpt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageOpt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageOpt")(js.undefined)
        ret
    }
    @scala.inline
    def withSysctls(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sysctls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSysctls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sysctls")(js.undefined)
        ret
    }
    @scala.inline
    def withTmpfs(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tmpfs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTmpfs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tmpfs")(js.undefined)
        ret
    }
    @scala.inline
    def withUTSMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UTSMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUTSMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UTSMode")(js.undefined)
        ret
    }
    @scala.inline
    def withUlimits(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ulimits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUlimits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ulimits")(js.undefined)
        ret
    }
    @scala.inline
    def withUsernsMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UsernsMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsernsMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UsernsMode")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeDriver(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeDriver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeDriver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeDriver")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumesFrom(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumesFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumesFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumesFrom")(js.undefined)
        ret
    }
  }
  
}

