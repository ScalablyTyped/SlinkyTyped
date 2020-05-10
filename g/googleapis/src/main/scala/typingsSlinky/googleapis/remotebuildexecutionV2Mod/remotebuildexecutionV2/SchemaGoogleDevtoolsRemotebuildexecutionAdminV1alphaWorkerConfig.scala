package typingsSlinky.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the configuration to be used for a creating workers in the worker
  * pool.
  */
@js.native
trait SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig extends js.Object {
  /**
    * Required. Size of the disk attached to the worker, in GB. See
    * https://cloud.google.com/compute/docs/disks/
    */
  var diskSizeGb: js.UndefOr[String] = js.native
  /**
    * Required. Disk Type to use for the worker. See [Storage
    * options](https://cloud.google.com/compute/docs/disks/#introduction).
    * Currently only `pd-standard` is supported.
    */
  var diskType: js.UndefOr[String] = js.native
  /**
    * Required. Machine type of the worker, such as `n1-standard-2`. See
    * https://cloud.google.com/compute/docs/machine-types for a list of
    * supported machine types. Note that `f1-micro` and `g1-small` are not yet
    * supported.
    */
  var machineType: js.UndefOr[String] = js.native
  /**
    * Minimum CPU platform to use when creating the worker. See [CPU
    * Platforms](https://cloud.google.com/compute/docs/cpu-platforms).
    */
  var minCpuPlatform: js.UndefOr[String] = js.native
  /**
    * Determines whether the worker is reserved (equivalent to a Compute Engine
    * on-demand VM and therefore won&#39;t be preempted). See [Preemptible
    * VMs](https://cloud.google.com/preemptible-vms/) for more details.
    */
  var reserved: js.UndefOr[Boolean] = js.native
}

object SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig {
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig]
  }
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigOps[Self <: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiskSizeGb(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskSizeGb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiskSizeGb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskSizeGb")(js.undefined)
        ret
    }
    @scala.inline
    def withDiskType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiskType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskType")(js.undefined)
        ret
    }
    @scala.inline
    def withMachineType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("machineType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMachineType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("machineType")(js.undefined)
        ret
    }
    @scala.inline
    def withMinCpuPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minCpuPlatform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinCpuPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minCpuPlatform")(js.undefined)
        ret
    }
    @scala.inline
    def withReserved(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reserved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReserved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reserved")(js.undefined)
        ret
    }
  }
  
}

